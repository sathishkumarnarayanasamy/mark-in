package com.markin.app.monitor.model;

/**
 * Created by salagumalai on 17-04-2016.
 */
public class DeviceLocation {

    private String UserName;
    private double Latitude;
    private double Longitude;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double Latitude) {
        this.Latitude = Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double Longitude) {
        this.Longitude = Longitude;
    }

}
