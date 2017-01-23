package com.example.engineerakash.menudesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.application_menu, menu);
        return true;
    }

    public void aboutDeveloper(MenuItem item) {
        String about = "Application: MenuDesign\n Developer: akash kuamr basak\n Company: A computer system";
        Toast.makeText(MainActivity.this, about, Toast.LENGTH_SHORT).show();
    }

    public void applicationSettings(MenuItem item) {
        Toast.makeText(MainActivity.this, "application settings", Toast.LENGTH_SHORT).show();
    }

    public void helpLine(MenuItem item) {
        Toast.makeText(MainActivity.this, "What king of help you need?", Toast.LENGTH_SHORT).show();
    }

    public void goToNextActivity(View view) {
        Intent goToSecondActivity = new Intent(getBaseContext(), SecondActivity.class);
        startActivity(goToSecondActivity);
    }
}
