package com.guli.mac_base_app.Controller;


import com.guli.mac_base_app.Model.Device;
import com.guli.mac_base_app.Repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/devices")
public class DeviceController {

    @Autowired
    private DeviceRepository deviceRepository;

    public DeviceController() {
        this.deviceRepository = deviceRepository;
    }

    @GetMapping("/showall")
    public List<Device> findall(){
        return deviceRepository.findAll();
    }

    @PostMapping("/add")
    public Device save(@RequestBody Device device){
        return deviceRepository.save(device);
    }

}
