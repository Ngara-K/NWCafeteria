package io.github.nwcafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import me.ibrahimsn.lib.OnItemReselectedListener;
import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;

public class main extends AppCompatActivity {

    //smoothBar
    SmoothBottomBar smoothBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smoothBottomBar = findViewById(R.id.c_bottomBar);

        //smoothBar callbacks
        smoothBottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelect(int i) {
                Toast.makeText(main.this, "Selected position : " + i, Toast.LENGTH_SHORT).show();
            }
        });

        smoothBottomBar.setOnItemReselectedListener(new OnItemReselectedListener() {
            @Override
            public void onItemReselect(int i) {
                Toast.makeText(main.this, "Reselected position : " + i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
