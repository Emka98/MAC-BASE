package com.guli.mac_base.Repository;

import com.guli.mac_base.Model.Device;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;

public class DeviceRepository {

    private final EntityManager entityManager;

    public DeviceRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
