package com.example.engineerakash.menudesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater myMenuInflater = getMenuInflater();
        myMenuInflater.inflate(R.menu.application_menu_two, menu);
        return true;
    }

    public void dispalyProfile(MenuItem item) {
        Toast.makeText(SecondActivity.this, "User profile", Toast.LENGTH_SHORT).show();
    }

    public void displayFriends(MenuItem item) {
        Toast.makeText(SecondActivity.this, "Friend list", Toast.LENGTH_SHORT).show();
    }

    public void displaySearch(MenuItem item) {
        Toast.makeText(SecondActivity.this, "Search friend", Toast.LENGTH_SHORT).show();
    }
}
