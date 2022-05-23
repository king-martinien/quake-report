package com.example.android.quakereport.model;

public class Earthquake {

    // Magnitude of the earthquake
    private String mMagnitude;

    // Location of the earthquake
    private String mLocation;

    // Date of the earthquake
    private String mDate;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude of the earthquake
     * @param location  is the location of the earthquake
     * @param date      is the date of the earthquake
     */
    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     * Return the magnitude of the earthquake
     *
     * @return magnitude of the earthquake
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * Return the location of the earthquake
     *
     * @return location of the earthquake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Return the date of the earthquake
     *
     * @return date of the earthquake
     */
    public String getDate() {
        return mDate;
    }
}
