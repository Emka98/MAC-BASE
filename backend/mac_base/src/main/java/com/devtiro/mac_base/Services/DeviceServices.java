package com.devtiro.mac_base.Services;

import com.devtiro.mac_base.Model.Device;
import com.devtiro.mac_base.Model.Range;
import com.devtiro.mac_base.Repository.DeviceRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceServices {

    private final DeviceRepository deviceRepository;

    public DeviceServices(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public List<String> getListAllMacaddress(Device device) {
        List<String> listAllmacaddress = new ArrayList<>();

        Range baseMacAddress = device.getIdOwner();
        long amount = device.getAmountMacaddress();

        for (long i = 0; i < amount; i++) {
            long currentMacaddress = baseMacAddress.getIdOwner() + i;
            String currentMac = String.format("%012X", currentMacaddress);
            currentMac = currentMac.replaceAll("(.{2})(?=.)", "$1:");
            listAllmacaddress.add(currentMac);
        }
        return listAllmacaddress;
    }
}
