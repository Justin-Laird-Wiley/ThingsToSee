package com.example.justin.thingstosee;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Fragment class use to display the many Trader Joe's patronized by the app's creator
 */
public class TraderJoesFragment extends Fragment {

    //  onCreateView method that loads up the objects, then uses an adapter to display them in view list
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //  Attach rootView to word_list.xml
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //  Create new ArrayList called birdSpots
        final ArrayList<ThingsToSee> traderJoes = new ArrayList<>();

        //  Add ThingsToSee objects to list
        traderJoes.add(new ThingsToSee(getString(R.string.alewife), getString(R.string.cambridge), getString(R.string.alewife_comment)));
        traderJoes.add(new ThingsToSee(getString(R.string.mem_drive), getString(R.string.cambridge), getString(R.string.mem_drive_comment)));
        traderJoes.add(new ThingsToSee(getString(R.string.western_ave), getString(R.string.allston), getString(R.string.western_ave_comment)));
        traderJoes.add(new ThingsToSee(getString(R.string.arlington_heights), getString(R.string.arlington), getString(R.string.arlington_heights_comment)));
        traderJoes.add(new ThingsToSee(getString(R.string.west_newton), getString(R.string.newton), getString(R.string.west_newton_comment)));
        traderJoes.add(new ThingsToSee(getString(R.string.coolidge_corner), getString(R.string.brookline), getString(R.string.coolidge_corner_comment)));
        traderJoes.add(new ThingsToSee(getString(R.string.rt_1), getString(R.string.saugus), getString(R.string.rt_1_comment)));
        traderJoes.add(new ThingsToSee(getString(R.string.rt_114), getString(R.string.peabody), getString(R.string.rt_114_comment)));

        //  Set up adapter to create list
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), traderJoes, R.color.category_trader_joes);

        //  Attach listView to list.xml
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //  Attach adapter to listView to create list
        listView.setAdapter(locationAdapter);

        //  Return list
        return rootView;
    }
}