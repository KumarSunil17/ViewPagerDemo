package com.example.kumarsunil.viewpagerdemo;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void view1(View view) {
        startActivity(new Intent(MainActivity.this,ViewPager1.class));

    }

    public void view2(View view) {
        startActivity(new Intent(MainActivity.this,ViewPager2.class));

    }

    public void view3(View view) {
        startActivity(new Intent(MainActivity.this,ViewPager3.class));

    }
}
