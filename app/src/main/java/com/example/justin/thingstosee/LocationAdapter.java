package com.example.justin.thingstosee;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Adapter class used to pull information from ThingsToSee objects and assemble it in
 * a view using list_item.xml
 */
public class LocationAdapter extends ArrayAdapter<ThingsToSee> {

    private int mColor;

    //  Constructor; uses super constructor from ArrayAdapter, and passes in 0 because resource is not used
    public LocationAdapter(Activity context, ArrayList<ThingsToSee> locations, int activityColor) {
        super(context, 0, locations);
        mColor = activityColor;
    }

    //  Method to either create or reuse a view and fill it with information from ThingsToSee objects
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //  set listItemView to convertView passed in
        View listItemView = convertView;

        //  If the view is empty, create a new view
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,
                    false);
        }

        //  Set place object to
        ThingsToSee place = getItem(position);

        //  Attach location to location view
        TextView location = (TextView) listItemView.findViewById(R.id.location);

        //  Set location to place.location
        location.setText(place.getLocation());

        //  Attach town to town view
        TextView town = (TextView) listItemView.findViewById(R.id.town);

        //  Set town to town from place.town
        town.setText(place.getTown());

        //  Attach comment to comment view
        TextView comment = (TextView) listItemView.findViewById(R.id.comment);

        //  Set comment to place.comment
        comment.setText(place.getComment());

        //  Attach image to view location_image
        ImageView image = (ImageView) listItemView.findViewById(R.id.location_image);

        //  If the place object has an image, set image to place.image using resource ID
        if (place.hasImage()) {
            image.setImageResource(place.getImageId());
            image.setVisibility(View.VISIBLE);
            //  ...else do not use the view
        } else {
            image.setVisibility(View.GONE);
        }

        //  Attach linearLayout to text_container view
        View linearLayout = listItemView.findViewById(R.id.text_container);

        //  Set the background color using the color resource ID passed in with the object
        linearLayout.setBackgroundColor(listItemView.getResources().getColor(mColor));

        //  Return the view to be displayed in the list
        return listItemView;
    }
}
