package com.kadum.samsung.resource;

import com.kadum.samsung.model.Devices;
import com.kadum.samsung.services.DeviceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kadum.samsung.model.Device;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/samsung")
public class Samsung {

    @Autowired
    private DeviceServices service;

/*    @RequestMapping("/devices")
    public Devices getDevices(){

        List<Device> devices = new ArrayList<>();
        devices.add(new Device(1,"Note 9","Smartphone"));
        devices.add(new Device(2,"S10","Smartphone"));

        Devices devicesList = new Devices(devices);
        return  devicesList;
    }*/

    @RequestMapping("/devices")
    public Devices getDevices(){
        List<Device> devices = new ArrayList<Device>();
        devices = service.getDevices();
        Devices deviceList = new Devices(devices);
        return deviceList;
    }

    @RequestMapping("/devices/{id}")
    public Device getDevice(@PathVariable int id) {
        return this.service.getDevice(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/devices")
    public void addDevice(@RequestBody Device newDevice) {
        service.addDevice(newDevice);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/devices/{id}")
    public void updateDevice(@RequestBody Device device) {
        service.updateDevice(device);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/devices/{id}")
    public void deleteDevice(@PathVariable int id) {
        service.deleteDevice(id);
    }


}
