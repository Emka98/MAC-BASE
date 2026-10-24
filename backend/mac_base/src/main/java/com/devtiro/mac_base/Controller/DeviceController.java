package com.devtiro.mac_base.Controller;

import com.devtiro.mac_base.Model.Device;
import com.devtiro.mac_base.Repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device")
public class DeviceController {

    private final DeviceRepository deviceRepository;

    @Autowired
    public DeviceController(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @PostMapping("/add")
    public String add(@RequestBody Device device) {
        this.deviceRepository.save(device);
        return "added " + device.toString();
    }

    @GetMapping("/showAllDevice")
    public List<Device> showAllDevice(){
        return deviceRepository.findAll();
    }
}
