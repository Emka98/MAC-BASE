package com.guli.mac_base.Repository;

import com.guli.mac_base.Model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeviceRepository extends JpaRepository<Device, Integer> {
    Optional<Device> findByName(String name);
}
