package com.example.justin.thingstosee;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * MainActivity class of app
 */
public class MainActivity extends AppCompatActivity {

    /**
     * onCreate method is used to set up the pager method and set it running
     *
     * @param savedInstanceState - Bundle object of instance variables
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the pager_main.xml layout file
        setContentView(R.layout.pager_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        //  Attach tabLayout to tab_layout view
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        //  Start of the tab pager to display the fragments
        tabLayout.setupWithViewPager(viewPager);
    }
}
