package com.myteam.myteam;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class Main_Menu extends AppCompatActivity {

    private static final String TAG = "Main Menu";

    private SectionPageAdapter sectionPageAdapter;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__menu);
        Log.d(TAG, "onCreate: Starting.");

        sectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());

        //Setup ViewPager with the sections adapter.
        viewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);



    }

    /*
    Adds fragments and their titles into the section page adapter
     */
    private void setupViewPager(ViewPager viewPager)
    {
        rgee_fragment rgee = new rgee_fragment();
        cyrus_fragment cyrus = new cyrus_fragment();
        team_fragment team = new team_fragment();

        SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());
        adapter.addFragment(rgee, rgee.get_Tag());
        adapter.addFragment(cyrus, cyrus.get_Tag());
        adapter.addFragment(team, team.get_Tag());
        viewPager.setAdapter(adapter);
    }



}
