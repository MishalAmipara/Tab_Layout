package com.example.tab_layout;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import com.example.tab_layout.ui.main.SectionsPagerAdapter;
import com.example.tab_layout.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ViewPager viewPager;
    ViewPagerAdapter adapter;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
//        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
//        ViewPager viewPager = binding.viewPager;
//        viewPager.setAdapter(sectionsPagerAdapter);
//        TabLayout tabs = binding.tabs;
//        tabs.setupWithViewPager(viewPager);
//        FloatingActionButton fab = binding.fab;
//
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        viewPager = findViewById(R.id.view_pager);
        adapter=new ViewPagerAdapter(MainActivity.this,getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        adapter.addFragment(new Fragment_One(), "Tab 1");
        adapter.addFragment(new Fragment_Two(), "Tab 2");
        adapter.addFragment(new Fragment_Three(), "Tab 3");

       tabLayout=findViewById(R.id.tabs);
       tabLayout.setupWithViewPager(viewPager);
    }
}