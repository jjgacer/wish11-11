package com.example.wish2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class TextActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wish_layout);

        Button bt = findViewById(R.id.let_me_home);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public static class wishBox extends DialogFragment {
        @Override
        public Dialog onCreateDialog(Bundle savedInstance){
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setView(R.id.wish_input);
            return builder.create();
        }
    }

}
