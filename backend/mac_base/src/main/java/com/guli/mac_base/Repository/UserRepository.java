package com.guli.mac_base.Repository;

import com.guli.mac_base.Model.User;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public class UserRepository {
    private final EntityManager entityManager;

    public UserRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(User user){
        entityManager.persist(user);
    }

    public Optional<User> findById(Long id){
        return Optional.ofNullable(entityManager.find(User.class, id));
    }

    public Optional<User> findByName(String name){
        return Optional.ofNullable(entityManager.find(User.class, name));
    }

    public void deleteById(Long id){
        findById(id).ifPresent(entityManager::remove);
    }
}
