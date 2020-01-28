package com.example.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviderKt;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewCount;
    private Button buttonPlus;
    private Button buttonMinus;
    private MainActivityViewModel model ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonPlus = findViewById(R.id.buttonPlus);

        textViewCount = findViewById(R.id.textView);

         model = ViewModelProviders.of


        textViewCount.setText(Integer.toString(score));
    }

    public void onClickPlus(View view) {
        score++;
        textViewCount.setText(Integer.toString(score));
    }

    public void onClickMinus(View view) {
        score--;
        textViewCount.setText(Integer.toString(score));

    }
}
