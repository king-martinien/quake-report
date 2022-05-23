/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport.controller;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.quakereport.R;
import com.example.android.quakereport.model.Earthquake;

import java.util.ArrayList;
import java.util.List;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        List<Earthquake> earthquakes = new ArrayList<>();

        earthquakes.add(new Earthquake("5.1", "San Francisco", "Feb 2, 2016"));
        earthquakes.add(new Earthquake("4.8", "London", "Jan 28, 2016"));
        earthquakes.add(new Earthquake("5.7", "Tokyo", "Jan 21, 2016"));
        earthquakes.add(new Earthquake("5.8", "Mexico City", "Jan 10, 2016"));
        earthquakes.add(new Earthquake("6.0", "Moscow", "Jan 2, 2016"));
        earthquakes.add(new Earthquake("6.1", "Rio de Janeiro", "Dec 30, 2015"));
        earthquakes.add(new Earthquake("6.5", "Paris", "Dec 28, 2015"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        ArrayAdapter<Earthquake> adapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
