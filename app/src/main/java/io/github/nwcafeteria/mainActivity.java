package io.github.nwcafeteria;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import io.github.nwcafeteria.ui.categoriesFragment;
import io.github.nwcafeteria.ui.citiesFragment;
import me.ibrahimsn.lib.OnItemReselectedListener;
import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;

public class mainActivity extends AppCompatActivity {

    //configuring actionbar
    private ActionBar toolbar;
    //smoothBar
    private SmoothBottomBar smoothBottomBar;

    //initializing fragments
    final Fragment citiesFm = new citiesFragment();
    final Fragment categoriesFm = new categoriesFragment();
    final FragmentManager fragmentManager = getSupportFragmentManager();
    Fragment activeFm = citiesFm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting up toolbar
        toolbar = getSupportActionBar();

        //initializing views
        smoothBottomBar = findViewById(R.id.c_bottomBar);

        //load first fragment
        fragmentManager.beginTransaction().add(R.id.c_frame, categoriesFm, "2").hide(categoriesFm).commit();
        fragmentManager.beginTransaction().add(R.id.c_frame, citiesFm, "1").commit();
        toolbar.setTitle("Cafeteria | Cities");

        //smoothBar callbacks
        smoothBottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelect(int position) {

                if (position==0 || activeFm == categoriesFm) {
                    toolbar.setTitle("Cafeteria | Cities");
                    fragmentManager.beginTransaction().hide(activeFm).show(citiesFm).commit();
                    activeFm = citiesFm;
                }
                else  if (position==1 || activeFm == citiesFm) {
                    toolbar.setTitle("Cafeteria | Categories");
                    fragmentManager.beginTransaction().hide(activeFm).show(categoriesFm).commit();
                    activeFm = categoriesFm;
                }
                else {
                    Toast.makeText(mainActivity.this, "No Action", Toast.LENGTH_SHORT).show();
                }
            }
        });

        smoothBottomBar.setOnItemReselectedListener(new OnItemReselectedListener() {
            @Override
            public void onItemReselect(int i) {
                //Reselected_No_Action
            }
        });
    }
}
