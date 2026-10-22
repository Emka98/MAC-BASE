package com.guli.mac_base_app.Repository;

import com.guli.mac_base_app.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
