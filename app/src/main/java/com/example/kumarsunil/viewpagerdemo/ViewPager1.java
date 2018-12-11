package com.example.kumarsunil.viewpagerdemo;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kumarsunil.viewpagerdemo.adapters.ViewPagerAdapter;
import com.example.kumarsunil.viewpagerdemo.fragments.AppleFragment;
import com.example.kumarsunil.viewpagerdemo.fragments.BananaFragment;
import com.example.kumarsunil.viewpagerdemo.fragments.GrapesFragment;
import com.example.kumarsunil.viewpagerdemo.fragments.MangoFragment;
import com.example.kumarsunil.viewpagerdemo.fragments.OrangeFragment;

public class ViewPager1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager1);

        ViewPager viewPager = findViewById(R.id.view_pager_1);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new AppleFragment(), "APPLE");
        adapter.addFrag(new OrangeFragment(), "ORANGE");
        adapter.addFrag(new GrapesFragment(), "GRAPES");
        adapter.addFrag(new BananaFragment(), "BANANA");
        adapter.addFrag(new MangoFragment(),"MANGO");
        viewPager.setAdapter(adapter);
    }
}
