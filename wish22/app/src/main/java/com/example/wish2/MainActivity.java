package com.example.wish2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.LocalTime;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // SharedPreferences sharedPreferences

        Button button = (Button)findViewById(R.id.wish_button);
        button.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(MainActivity.this, TextActivity.class);
            @Override
            public void onClick(View view) {
                startActivity(intent);
//                DialogFragment fragment = new TextActivity.wishBox();
//                fragment.show(getSupportFragmentManager(), "wish_tag");
            }
        });
    }



}