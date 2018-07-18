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
 * Fragment used to display the closed train stations on the Fitchburg commuter line
 */
public class TrainStationFragment extends Fragment {

    //  onCreateView method that loads up the objects, then uses an adapter to display them in view list
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //  Attach rootView to word_list.xml
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //  Create new ArrayList called birdSpots
        final ArrayList<ThingsToSee> trainStations = new ArrayList<>();

        //  Add ThingsToSee objects to list
        trainStations.add(new ThingsToSee(getString(R.string.clematis_brook), getString(R.string.waltham), getString(R.string.clematis_brook_comment)));
        trainStations.add(new ThingsToSee(getString(R.string.beaver_brook_sta), getString(R.string.waltham), getString(R.string.beaver_brook_sta_comment)));
        trainStations.add(new ThingsToSee(getString(R.string.river_view), getString(R.string.waltham), getString(R.string.river_view_comment)));
        trainStations.add(new ThingsToSee(getString(R.string.west_acton), getString(R.string.acton), getString(R.string.west_acton_comment)));
        trainStations.add(new ThingsToSee(getString(R.string.west_littleton), getString(R.string.littleton), getString(R.string.west_littleton_comment)));
        trainStations.add(new ThingsToSee(getString(R.string.willows), getString(R.string.ayer), getString(R.string.willows_comment)));
        trainStations.add(new ThingsToSee(getString(R.string.gardner_stop), getString(R.string.gardner), getString(R.string.gardner_stop_comment)));

        //  Set up adapter to create list
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), trainStations, R.color.category_train_stations);

        //  Attach listView to list.xml
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //  Attach adapter to listView to create list
        listView.setAdapter(locationAdapter);

        //  Return list
        return rootView;
    }
}
