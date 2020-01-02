package io.github.nwcafeteria;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import io.github.nwcafeteria.ui.categories_fragment;
import io.github.nwcafeteria.ui.cities_fragment;
import me.ibrahimsn.lib.OnItemReselectedListener;
import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;

public class main extends AppCompatActivity {

    //configuring actionbar
    private ActionBar toolbar;
    //smoothBar
    private SmoothBottomBar smoothBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting up toolbar
        toolbar = getSupportActionBar();
        toolbar.setTitle("Cities");

        //load first fragment
        loadFragment(new cities_fragment());

        smoothBottomBar = findViewById(R.id.c_bottomBar);

        //smoothBar callbacks
        smoothBottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelect(int i) {
                Fragment fragment;

                if (i==0) {
                    toolbar.setTitle("Cities");
                    fragment = new cities_fragment();
                    loadFragment (fragment);
                }
                else  if (i==1) {
                    toolbar.setTitle("Categories");
                    fragment = new categories_fragment();
                    loadFragment (fragment);
                }
                else {
                    Toast.makeText(main.this, "No Action", Toast.LENGTH_SHORT).show();
                }
            }
        });

        smoothBottomBar.setOnItemReselectedListener(new OnItemReselectedListener() {
            @Override
            public void onItemReselect(int i) {
                Toast.makeText(main.this, "Reselected position : " + i, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loadFragment(Fragment fragment) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.c_frame, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
