package com.example.e_dhanda;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.e_dhanda.chefFoodPanel.ChefHomeFragment;
import com.example.e_dhanda.chefFoodPanel.ChefOrderFragment;
import com.example.e_dhanda.chefFoodPanel.ChefPendingOrderFragment;
import com.example.e_dhanda.chefFoodPanel.ChefProfileFragment;
import com.example.e_dhanda.customerFoodPanel.CustomerCartFragment;
import com.example.e_dhanda.customerFoodPanel.CustomerHomeFragment;
import com.example.e_dhanda.customerFoodPanel.CustomerOrdersFragment;
import com.example.e_dhanda.customerFoodPanel.CustomerProfileFragment;
import com.example.e_dhanda.customerFoodPanel.CustomerTrackFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CustomerFoodPanel_BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_food_panel__bottom_navigation);
        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(this);
        String name = getIntent().getStringExtra("PAGE");
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (name != null){
            if (name.equalsIgnoreCase("Homepage")){
                loadcustomerfragment(new CustomerHomeFragment());
            }else if (name.equalsIgnoreCase("Preparingpage")){
                loadcustomerfragment(new CustomerTrackFragment());
            }else if (name.equalsIgnoreCase("DeliveryOrderpage")){
                loadcustomerfragment(new CustomerOrdersFragment());
            }else if (name.equalsIgnoreCase("Thankyoupage")){
                loadcustomerfragment(new CustomerHomeFragment());
            }
        }else {
            loadcustomerfragment(new CustomerHomeFragment());
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;
        if (item.getItemId() == R.id.cust_Home) {
            fragment = new CustomerHomeFragment();
        }
        if (item.getItemId() == R.id.cart) {
            fragment = new CustomerCartFragment();
        }
        if (item.getItemId() == R.id.cust_profile) {
            fragment = new CustomerProfileFragment();
        }
        if (item.getItemId() == R.id.Cust_order) {
            fragment = new CustomerOrdersFragment();
        }
        if (item.getItemId() == R.id.track) {
            fragment = new CustomerTrackFragment();
        }
        return loadcustomerfragment(fragment);

    }

    private boolean loadcustomerfragment(Fragment fragment) {

        if(fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
            return true;
        }
        return false;
    }
}