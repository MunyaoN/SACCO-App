package com.example.polytechsacco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.zip.Inflater;
//extends AppCompatActivity
public class MainActivity{

    public static void main(String[] args) {
        sys.out.println("Polytech SACCO up and running");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // getSupportFragmentManager().beginTransaction()
            //    .replace(R.id.fragmentContainerView,).commit();

      BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigationView);
      bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
          @Override
          public boolean onNavigationItemSelected(@NonNull MenuItem item) {
              Fragment selectedfragment=null;
               switch (item.getItemId()){
                   case R.id.item1:
                       selectedfragment=new HomeFragment();
                       break;
                   case R.id.item2:
                       selectedfragment=new com.example.polytechsacco.TransactFragment();
                       break;
                   case R.id.item3:
                       selectedfragment=new com.example.polytechsacco.LoanFragment();
                       break;
                   case R.id.item4:
                       selectedfragment=new MyAccountsFragment();
                       break;


               }
              getSupportFragmentManager().beginTransaction()
                      .replace(R.id.fragmentContainerView,selectedfragment).commit();
               return true;

          }
      });
    }




}