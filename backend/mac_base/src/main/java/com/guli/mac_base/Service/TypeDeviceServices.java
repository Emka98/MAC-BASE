package com.guli.mac_base.Service;

import com.guli.mac_base.Repository.MacAdressRepository;
import org.springframework.stereotype.Service;

@Service
public class TypeDeviceServices {

    private MacAdressRepository macAdressRepository;

    public TypeDeviceServices(MacAdressRepository macAdressRepository) {
        this.macAdressRepository = macAdressRepository;
    }

    public void AddTypeDevice() {

    }

    public void DeleteTypeDevice() {

    }

}
