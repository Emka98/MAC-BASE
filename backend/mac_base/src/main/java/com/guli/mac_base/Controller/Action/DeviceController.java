package com.guli.mac_base.Controller.Action;

import com.guli.mac_base.Dto.DeviceDto;
import com.guli.mac_base.Dto.UserDto;
import com.guli.mac_base.Model.Device;
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

    @PostMapping("/add")
    public void AddDevice(@RequestBody DeviceDto deviceDto) {

        deviceServices.AddDevice(deviceDto);
    }

    @PostMapping("/delete")
    public void DeleteUser() {

    }

    @PostMapping("/findAll")
    public List<DeviceDto> FindAllUser() {
        return deviceServices.FindAllDevice();
    }

}
