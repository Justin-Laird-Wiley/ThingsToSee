package com.example.justin.thingstosee;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Adapter used display fragements in pager layout
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    //  Array to store tab headings
    private String tabTitles[] = new String[]{"Night Walking", "Trader Joe's", "Birding Spots", "Closed RR Stations"};

    //  Constructor
    public CategoryAdapter(FragmentManager adapter) {
        super(adapter);
    }

    /**
     * Method that returns number of fragments in viewer
     *
     * @return int -- number of fragments
     */
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * Method that returns fragment currently being viewed
     *
     * @param position - position in viewer of fragment to be displayed
     * @return Fragment - fragment to be displayed
     */
    @Override
    public Fragment getItem(int position) {

        //  Switch statement that selects fragment
        switch (position) {
            case 0:
                return new WalkingAtNightFragment();
            case 1:
                return new TraderJoesFragment();
            case 2:
                return new BirdFragment();
            case 3:
                return new TrainStationFragment();
            default:
                return null;
        }
    }

    /**
     * Method to set up the tab labels for the viewer
     *
     * @param position - integer passed in as the index of the array tabTitles
     * @return CharSequence tab title
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return tabTitles[position];
    }
}
