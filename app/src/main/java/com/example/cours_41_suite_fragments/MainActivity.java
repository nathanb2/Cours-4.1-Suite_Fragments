package com.example.cours_41_suite_fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intFragmentA();

        findViewById(R.id.AM_plus_btn).setOnClickListener(view -> {
            intFragmentB(++counter);
        });
    }

    private void intFragmentA() {
        FragmentA fragmentA = FragmentA.newInstance();
        getSupportFragmentManager().beginTransaction().add(R.id.AM_container, fragmentA, FragmentA.TAG).addToBackStack(FragmentA.TAG).commit();
    }

    private void intFragmentB(int counter) {
        FragmentB fragmentB = FragmentB.newInstance(counter);
        getSupportFragmentManager().beginTransaction().replace(R.id.AM_container, fragmentB, FragmentB.TAG).addToBackStack(FragmentB.TAG).commit();
    }
}