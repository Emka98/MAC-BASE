package com.guli.mac_base.Repository;

import com.guli.mac_base.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
