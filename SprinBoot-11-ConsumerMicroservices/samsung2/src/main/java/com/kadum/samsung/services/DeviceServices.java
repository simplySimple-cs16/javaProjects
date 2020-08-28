package com.kadum.samsung.services;

import com.kadum.samsung.exception.GlobalExceptionHandler;
import com.kadum.samsung.model.Device;
import com.kadum.samsung.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceServices {

    @Autowired
    private DeviceRepository repo;

    public List<Device> getDevices(){
        List<Device> list = new ArrayList<>();
        for(Device device: repo.findAll()) {
            list.add(device);
        }
        return list;
    }

    public Device getDevice(int id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Data with id NOT FOUND"));
    }

    public void addDevice(Device listElement) {
        repo.save(listElement);

    }
    public void updateDevice(Device device) {
        repo.save(device);
    }

    public void deleteDevice(int id) {
        repo.deleteById(id);
    }

}
