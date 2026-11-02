package com.guli.mac_base.Repository;

import com.guli.mac_base.Model.TypeDevice;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;

public class TypeDeviceRepository {
    private final EntityManager entityManager;

    public TypeDeviceRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}