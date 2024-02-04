package com.example.chat_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.chat_app.Adapters.FragmentAdapter;
import com.example.chat_app.databinding.ActivityMainBinding;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

   ActivityMainBinding binding;
   FirebaseAuth mAuth;

    // Define constants for the menu items
    private static final int SETTINGS_MENU_ITEM = R.id.settings;
    private static final int LOCATION_MENU_ITEM = R.id.location;
    private static final int DASHBOARD_MENU_ITEM = R.id.dashboard;
    private static final int LOGOUT_MENU_ITEM = R.id.logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mAuth = FirebaseAuth.getInstance();

        binding.viewPager.setAdapter(new FragmentAdapter(getSupportFragmentManager()));
        binding.tabLayout.setupWithViewPager(binding.viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == SETTINGS_MENU_ITEM) {
            // Handle the settings menu item selection
            Toast.makeText(this, "Setting is clicked", Toast.LENGTH_SHORT).show();

            Intent intent2 = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent2);
            return true;
        } else if (itemId == LOCATION_MENU_ITEM) {
            // Handle the location menu item selection
            Toast.makeText(this, "Location is Started", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == DASHBOARD_MENU_ITEM) {
            // Handle the donate menu item selection
            Intent intent1 = new Intent(MainActivity.this, Dashboard.class);
            startActivity(intent1);

            Toast.makeText(this, "Dashboard is Initiated", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == LOGOUT_MENU_ITEM) {
            // Handle the logout menu item selection
            mAuth.signOut();
            Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
            startActivity(intent);
             return true;
        }

        return super.onOptionsItemSelected(item);
        }
    }
