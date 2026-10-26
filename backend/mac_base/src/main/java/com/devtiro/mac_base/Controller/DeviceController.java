package com.devtiro.mac_base.Controller;

import com.devtiro.mac_base.Model.Device;
import com.devtiro.mac_base.Repository.DeviceRepository;
import com.devtiro.mac_base.Services.DevicesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device")
public class DeviceController {

    private final DevicesServices devicesServices;

    @Autowired
    public DeviceController(DevicesServices devicesServices) {

        this.devicesServices = devicesServices;
    }

    @PostMapping("/add")
    public String add(@RequestBody Device device) {
        this.devicesServices;
        return "added " + device.toString();
    }

//    @GetMapping("/showAllDevice")
//    public List<Device> showAllDevice(){
//        return deviceRepository.findAll();
//    }
}
