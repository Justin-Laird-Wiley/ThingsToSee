package com.example.justin.thingstosee;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment used to display bird-watching spots
 */
public class BirdFragment extends Fragment {

    //  onCreateView method that loads up the objects, then uses an adapter to display them in view list
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //  Attach rootView to word_list.xml
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //  Create new ArrayList called birdSpots
        final ArrayList<ThingsToSee> birdSpots = new ArrayList<>();

        //  Add ThingsToSee objects to list
        birdSpots.add(new ThingsToSee(getString(R.string.mt_auburn_cemetery), getString(R.string.watertown), getString(R.string.mt_auburn_comment)));
        birdSpots.add(new ThingsToSee(getString(R.string.beaver_brook), getString(R.string.waltham), getString(R.string.beaver_brook_comment)));
        birdSpots.add(new ThingsToSee(getString(R.string.squantum_puddle), getString(R.string.quincy), getString(R.string.squantum_puddle_comment)));
        birdSpots.add(new ThingsToSee(getString(R.string.plum_island), getString(R.string.newburyport), getString(R.string.plum_island_comment)));
        birdSpots.add(new ThingsToSee(getString(R.string.burrage_pond), getString(R.string.hanson), getString(R.string.burrage_pond_comment)));
        birdSpots.add(new ThingsToSee(getString(R.string.mt_wachusetts), getString(R.string.princeton), getString(R.string.mt_wachusetts_comment)));
        birdSpots.add(new ThingsToSee(getString(R.string.cape_ann), getString(R.string.gloucester_rockport), getString(R.string.cape_ann_comment)));

        //  Set up adapter to create list
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), birdSpots, R.color.category_bird_spots);

        //  Attach listView to list.xml
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //  Attach adapter to listView to create list
        listView.setAdapter(locationAdapter);

        //  Return list
        return rootView;
    }
}