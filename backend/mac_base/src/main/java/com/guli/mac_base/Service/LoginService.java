package com.guli.mac_base.Service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private DeviceServices deviceServices;

    public LoginService(DeviceServices deviceServices) {
        this.deviceServices = deviceServices;
    }
    public void AddTypeLogin() {

    }

    public void DeleteLogin() {

    }
}
