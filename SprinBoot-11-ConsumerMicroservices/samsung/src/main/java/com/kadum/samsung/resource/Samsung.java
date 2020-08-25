package com.kadum.samsung.resource;

import com.kadum.samsung.model.Device;
import com.kadum.samsung.model.Devices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/samsung")
public class Samsung {
    @RequestMapping("/devices")
    public Devices getDevices(){

        List<Device> devices = new ArrayList<>();
        devices.add(new Device("Note 9","Smartphone"));
        devices.add(new Device("S10","Smartphone"));

        Devices devicesList = new Devices(devices);
        return  devicesList;
    }
}
