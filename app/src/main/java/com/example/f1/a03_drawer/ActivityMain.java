package com.example.f1.a03_drawer;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set layout for this activity:
        setContentView(R.layout.activity_main);

        // Set my Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setIcon(R.mipmap.ic_launcher);
            actionBar.setTitle(R.string.app_name);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.sec_act_open:
                openSecondActivity();  // open new Activity
                return true;
            case R.id.close_app:
                closeApp();            // close this Activity
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void openSecondActivity() {
        // Start Second Av]ctivity:
        Intent intent = new Intent(ActivityMain.this, ActivitySecond.class);
        startActivity(intent);
    }

    private void closeApp() {
        // This function will close this Activity:
        finish();
    }
}
