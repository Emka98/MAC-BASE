package com.guli.mac_base.Service;

import com.guli.mac_base.Dto.DeviceDto;
import com.guli.mac_base.Model.Device;
import com.guli.mac_base.Repository.DeviceRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeviceServices {

    private DeviceRepository deviceRepository;

    public DeviceServices(DeviceRepository deviceRepository) {

        this.deviceRepository = deviceRepository;
    }

    public void AddDevice(DeviceDto deviceDto) {
        deviceRepository.save(new Device(deviceDto));
    }

    public List<DeviceDto> FindAllDevice() {
        return deviceRepository.findAll()
                .stream()
                .map(DeviceDto::new)
                .toList();
    }

    public void DeleteDevice() {

    }

}
