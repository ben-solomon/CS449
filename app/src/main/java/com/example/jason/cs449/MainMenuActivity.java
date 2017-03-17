package com.example.jason.cs449;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Jason on 2/18/2017.
 */
// I will sign each of my comments BS (Ben Solomon)


public class MainMenuActivity extends AppCompatActivity{
// nice descriptive button names -BS
    private Button buttonLogout, buttonCalendar;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        buttonLogout = (Button) findViewById(R.id.logout);
        buttonCalendar = (Button) findViewById(R.id.calendar);

        buttonLogout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(MainMenuActivity.this, LoginActivity.class));
            }
        });

        buttonCalendar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainMenuActivity.this, CalendarActivity.class));
            }
        });
    }
// whats the purpose of the boolean return val? Won't this always return true? -BS
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.

        switch (item.getItemId()) {
            case R.id.event:
// why have the cases if blank? -BS
            case R.id.status:

            case R.id.settings:
                //Intent intent = new Inten(this, ProfileSettingActivity.class);
                startActivity(new Intent(this, ProfileSettingActivity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
// some general comments would be nice, clean code looks good -BS
