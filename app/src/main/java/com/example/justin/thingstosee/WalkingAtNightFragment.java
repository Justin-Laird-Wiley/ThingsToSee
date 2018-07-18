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
 * Fragment used to display the favorite night-walking places of the app's creator
 */
public class WalkingAtNightFragment extends Fragment {

    //  onCreateView method that loads up the objects, then uses an adapter to display them in view list
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //  Attach rootView to word_list.xml
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //  Create new ArrayList called birdSpots
        final ArrayList<ThingsToSee> nightSpots = new ArrayList<>();

        //  Add ThingsToSee objects to list; this list also adds images
        nightSpots.add(new ThingsToSee(getString(R.string.pequosette_park), getString(R.string.waltham),
                getString(R.string.pequosette_park_comment), R.drawable.pequosette));
        nightSpots.add(new ThingsToSee(getString(R.string.fernald), getString(R.string.waltham),
                getString(R.string.fernald_comment), R.drawable.fernald));
        nightSpots.add(new ThingsToSee(getString(R.string.train_signal), getString(R.string.waltham),
                getString(R.string.train_signal_comment), R.drawable.train_signal));
        nightSpots.add(new ThingsToSee(getString(R.string.waverley), getString(R.string.belmont),
                getString(R.string.waverley_comment), R.drawable.waverley));
        nightSpots.add(new ThingsToSee(getString(R.string.st_pats_cemetery), getString(R.string.belmont),
                getString(R.string.st_pats_cemetery_comment), R.drawable.st_patricks));
        nightSpots.add(new ThingsToSee(getString(R.string.beaver_brook_res), getString(R.string.waltham),
                getString(R.string.beaver_brook_res_comment)));
        nightSpots.add(new ThingsToSee(getString(R.string.harvard_athletic), getString(R.string.allston),
                getString(R.string.harvard_athletic_comment), R.drawable.harvard_athletic));

        //  Set up adapter to create list
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), nightSpots, R.color.category_night);

        //  Attach listView to list.xml
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //  Attach adapter to listView to create list
        listView.setAdapter(locationAdapter);

        //  Return list
        return rootView;
    }
}