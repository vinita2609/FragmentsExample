package com.example.viiniimevada.fragmentsapp;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentExampleActivity extends AppCompatActivity {

    Button btnFirst, btnSecond, btnThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_example);


        btnFirst = findViewById(R.id.btnFirst);
        btnSecond = findViewById(R.id.btnSecond);
        btnThird = findViewById(R.id.btnThird);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        final BlankFragment fragment = new BlankFragment();
        transaction.replace(R.id.Container,fragment);

        transaction.commit();

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                BlankFragment fragment = new BlankFragment();
                transaction.replace(R.id.Container, fragment);
                // transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                SecondFragment fragment = new SecondFragment();
                transaction.replace(R.id.Container, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                ThirdFragment fragment = new ThirdFragment();
                transaction.replace(R.id.Container, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

    }
}
