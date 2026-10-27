package com.devtiro.mac_base.Services;

import com.devtiro.mac_base.Model.Device;
import com.devtiro.mac_base.Model.RangeMac;
import com.devtiro.mac_base.Repository.DeviceRepository;
import com.devtiro.mac_base.Repository.MacAddressRepository;
import org.springframework.stereotype.Service;

@Service
public class DevicesServices {

    private MacAddressRepository macAddressRepository;
    private DeviceRepository deviceRepository;

    public boolean addNewDevice(Integer serialNumber, String name, RangeMac rangeMac, int amount){

        Device device = new Device();

        device.setSerialnumber(serialNumber);
        device.setName(name);
        device.setRangeMac(rangeMac);
        device.setAmount(amount);



        return true;
    }
}
