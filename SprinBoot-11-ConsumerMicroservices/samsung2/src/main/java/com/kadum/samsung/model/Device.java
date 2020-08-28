package com.kadum.samsung.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="samsung")
public class Device {

    @Id
    @Column(name="id")
    int deviceId;

    @Column(name="name")
    String name;

    @Column(name = "type")
    String type;

    public Device() {
    }

    public Device(int deviceId, String name, String type) {
        this.deviceId = deviceId;
        this.name = name;
        this.type = type;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceId=" + deviceId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
