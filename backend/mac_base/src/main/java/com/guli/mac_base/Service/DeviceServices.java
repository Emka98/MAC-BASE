package com.guli.mac_base.Service;

import com.guli.mac_base.Dto.DeviceDto;
import com.guli.mac_base.Model.Device;
import com.guli.mac_base.Repository.DeviceRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
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

    @PostMapping("/deleteDevice")
    public void deleteDevice(@RequestParam String name) {

    }
}
