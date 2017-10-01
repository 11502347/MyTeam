package com.myteam.myteam;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rgee on 30/09/2017.
 */

public class SectionPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();//List of fragments
    private final List<String> fragmentTitleList = new ArrayList<>();//List of fragments' titles

    public void addFragment(Fragment fragment, String title)
    {
        fragmentList.add(fragment);
        fragmentTitleList.add(title);
    }

    public SectionPageAdapter(FragmentManager fm) {
        super(fm);
    }


    /*
    Gets fragment at specified position
     */
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    /*
    Gets number of fragments
     */
    @Override
    public int getCount() {
        return fragmentList.size();
    }

    /*
    Gets title at specified position
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitleList.get(position);
    }
}
