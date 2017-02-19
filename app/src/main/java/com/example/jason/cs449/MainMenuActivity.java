package com.example.jason.cs449;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jason on 2/18/2017.
 */



public class MainMenuActivity extends AppCompatActivity{

    private Button buttonLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        buttonLogout = (Button) findViewById(R.id.logout);

        buttonLogout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenuActivity.this, LoginActivity.class));
            }
        });
    }
}
