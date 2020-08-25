package com.kadum.apple.resource;

import com.kadum.apple.model.Device;
import com.kadum.apple.model.Devices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apple")
public class Apple {
    @RequestMapping("/devices")
    public Devices getDevices(){

        List<Device> devices = new ArrayList<>();
        devices.add(new Device("Ipad 2019","Tablet"));
        devices.add(new Device("Iphone X","Smartphone"));

        Devices devicesList = new Devices(devices);
        return  devicesList;
    }
}
