package com.kadum.apple.model;

import java.util.List;

public class Devices{
    List<Device> devices;
    String brandName = "Apple";

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Devices() {
    }

    public Devices(List<Device> devices) {
        this.devices = devices;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "devices=" + devices +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
