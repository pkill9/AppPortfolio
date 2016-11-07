package com.example.bcalabri.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton1(View v) {
        String buttonText = ((Button) v).getText().toString();
        Toast.makeText(v.getContext(), "This will launch " + buttonText, Toast.LENGTH_SHORT).show();
    }
}
