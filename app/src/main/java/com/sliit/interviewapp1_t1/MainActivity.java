package com.sliit.interviewapp1_t1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import com.sliit.interviewapp1_t1.Task1.Task1Fragment;
import com.sliit.interviewapp1_t1.Task2.Task2Fragment;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    //initiate bottom navigator
    NavigationBarView navigationView;

    //instantiate fragments
    Fragment fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find view of bottom navigator
        navigationView = (NavigationBarView) findViewById(R.id.bottom_navigation);
        
        //set listener for bottom navigation_view
        navigationView.setOnItemSelectedListener(this);

        //set default view to home fragment
        fragment = new HomeFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flFragment, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.home){
            // set action bar title according to completed app
            setTitle("Home");

            //Implement fragment transitions
            fragment = new HomeFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.flFragment, fragment);
            fragmentTransaction.commit();
        } else if(id == R.id.page_1){
            // set action bar title according to completed app
            setTitle("Task1");

            //Implement fragment transitions
            fragment = new Task1Fragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.flFragment, fragment);
            fragmentTransaction.commit();
        } else if(id == R.id.page_2){
            // set action bar title according to completed app
            setTitle("Task2");

            //Implement fragment transitions
            fragment = new Task2Fragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.flFragment, fragment);
            fragmentTransaction.commit();
        }

        return false;

    }
}