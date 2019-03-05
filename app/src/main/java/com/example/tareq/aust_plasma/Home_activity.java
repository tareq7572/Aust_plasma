package com.example.tareq.aust_plasma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class Home_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activity);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);

        return super.onCreateOptionsMenu(menu);
    }

    /*@Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.about_us)
        {

        }
        if(item.getItemId()==R.id.share)
        {

        }
        if(item.getItemId()==R.id.rating)
        {

        }
        if(item.getItemId()==R.id.edit_profile)
        {

        }
        if(item.getItemId()==R.id.Sign_out)
        {

        }
        return super.onOptionsItemSelected(item);
    }
}
