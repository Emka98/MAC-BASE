package com.guli.mac_base.Controller.Action;

import com.guli.mac_base.Dto.DeviceDto;
import com.guli.mac_base.Model.User;
import com.guli.mac_base.Service.DeviceServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/device")
public class DeviceController {

    private DeviceServices deviceServices;

    public DeviceController(DeviceServices deviceServices) {
        this.deviceServices = deviceServices;
    }

    @PostMapping("/addDevice")
    public void addDevice(DeviceDto device){


    }

    @GetMapping("/findDevice")
    public List<User> findDevice(){

    }

    @GetMapping("/findDeviceAll")
    public List<User> findDeviceAll(){

    }

    @PostMapping("/deleteDevice")
    public void deleteDevice(@RequestParam String name) {

    }
}
