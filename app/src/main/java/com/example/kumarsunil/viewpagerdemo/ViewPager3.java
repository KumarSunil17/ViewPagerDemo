package com.example.kumarsunil.viewpagerdemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewPager3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager3);

        ViewPager pager = findViewById(R.id.view_pager_3);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int pos) {
            switch (pos) {
                case 0:
                    return FragmentViewPager.newInstance("APPLE", R.drawable.apple);
                case 1:
                    return FragmentViewPager.newInstance("ORANGE", R.drawable.orange);
                case 2:
                    return FragmentViewPager.newInstance("GRAPES", R.drawable.grapes);
                case 3:
                    return FragmentViewPager.newInstance("MANGO", R.drawable.mango);
                case 4:
                    return FragmentViewPager.newInstance("BANANA", R.drawable.banana);
                default:
                    return FragmentViewPager.newInstance("APPLE", R.drawable.apple);
            }
        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}
