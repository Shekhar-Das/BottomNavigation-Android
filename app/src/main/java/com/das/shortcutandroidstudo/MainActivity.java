package com.das.shortcutandroidstudo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.sql.ParameterMetaData;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomBar);
        // bottomNavigationView.setOnNavigationItemReselectedListener();


        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.item0:
                                // int progressBar = ProgressBar.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
                               // showCustomPopupMenu();
                                Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                                startActivity(intent);
                                //return true;


                            case R.id.item1:
                                Intent intent1 = new Intent(getApplicationContext(), LeadActivity.class);
                                startActivity(intent1);
                                return true;

                            case R.id.item2:
                                Intent inten2 = new Intent(getApplicationContext(), StoreActivity.class);
                                startActivity(inten2);
                                return true;

                            case R.id.item3:
                                Intent intent3 = new Intent(getApplicationContext(), ProfileActivity.class);
                                startActivity(intent3);
                                return true;

                        }
                        return true;
                    }
                });


    }

//    private void showCustomPopupMenu() {
//        WindowManager windowManager2 = (WindowManager) getSystemService(WINDOW_SERVICE);
//        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View view = layoutInflater.inflate(R.layout.support_simple_spinner_dropdown_item, null);
//
//
//    }
}






