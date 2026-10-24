package com.devtiro.mac_base.Controller;

import com.devtiro.mac_base.Model.Device;
import com.devtiro.mac_base.Repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    DeviceRepository deviceRepository;

    public IndexController(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @GetMapping("")
    public String showindex(Model model){
        List<Device> deviceList = this.deviceRepository.findAll();
        model.addAttribute("deviceList",deviceList);
        return "index";
    }
}
