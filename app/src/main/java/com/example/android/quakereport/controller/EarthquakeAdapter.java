package com.example.android.quakereport.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.android.quakereport.R;
import com.example.android.quakereport.model.Earthquake;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * @param context     is the context
     * @param earthquakes is the list of eartquakes
     */
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View currentearthquakeView = convertView;
        if (currentearthquakeView == null) {
            currentearthquakeView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView with View ID earthquake_textview_magnitude
        TextView magnitude = currentearthquakeView.findViewById(R.id.earthquake_textview_magnitude);
        // Display the magnitude of the current Earthquake in that TextView
        magnitude.setText(currentEarthquake.getMagnitude());

        // find the TextView with View ID earthquake_textview_location
        TextView location = currentearthquakeView.findViewById(R.id.earthquake_textview_location);
        // Display the location of the current Earthquake in that TextView
        location.setText(currentEarthquake.getLocation());

        // Find the TextView with View ID earthquake_textview_date
        TextView date = currentearthquakeView.findViewById(R.id.earthquake_textview_date);

        // Display the date of the current Earthquake in that TextView
        date.setText(currentEarthquake.getDate());

        // retuen the View that is now showing the appropriate earthquake
        return currentearthquakeView;
    }
}
