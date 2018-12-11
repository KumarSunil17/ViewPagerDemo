package com.example.kumarsunil.viewpagerdemo;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import com.example.kumarsunil.viewpagerdemo.adapters.ViewPagerAdapter;
import com.example.kumarsunil.viewpagerdemo.fragments.AppleFragment;
import com.example.kumarsunil.viewpagerdemo.fragments.BananaFragment;
import com.example.kumarsunil.viewpagerdemo.fragments.GrapesFragment;
import com.example.kumarsunil.viewpagerdemo.fragments.MangoFragment;
import com.example.kumarsunil.viewpagerdemo.fragments.OrangeFragment;

import java.util.ArrayList;
import java.util.List;

public class ViewPager2 extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons = {
            R.drawable.apple,
            R.drawable.orange,
            R.drawable.grapes,
            R.drawable.banana,
            R.drawable.mango
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page2);


        Toolbar toolbar = findViewById(R.id.toolbar_page_2);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.view_pager_2);
        addTabs(viewPager);

        tabLayout = findViewById(R.id.tabs_page_2);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
    }

    private void addTabs(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new AppleFragment(), "APPLE");
        adapter.addFrag(new OrangeFragment(), "ORANGE");
        adapter.addFrag(new GrapesFragment(), "GRAPES");
        adapter.addFrag(new BananaFragment(), "BANANA");
        adapter.addFrag(new MangoFragment(),"MANGO");
        viewPager.setAdapter(adapter);
    }
}
