package com.guli.mac_base.Service;

import com.guli.mac_base.Dto.DeviceDto;
import com.guli.mac_base.Model.Device;
import com.guli.mac_base.Model.User;
import com.guli.mac_base.Repository.DeviceRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DeviceServices {

    private final DeviceRepository deviceRepository;

    public DeviceServices(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @PostMapping("/addDevice")
    public void addDevice(DeviceDto device){
        Device deviceNew = new Device();
        deviceRepository.save(deviceNew);
    }

    @GetMapping("/findDevice")
    public Optional<Device> findDevice(String name){
        return deviceRepository.findByName(name);
    }

    @GetMapping("/findDeviceAll")
    public List<User> findDeviceAll(){

    }

    @PostMapping("/deleteDevice")
    public void deleteDevice(@RequestParam String name) {

    }
}
