package com.guli.mac_base.Repository;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class MacAdressRepository {
    private final EntityManager entityManager;

    public MacAdressRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}