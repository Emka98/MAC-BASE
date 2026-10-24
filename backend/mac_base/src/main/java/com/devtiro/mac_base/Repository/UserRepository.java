package com.devtiro.mac_base.Repository;

import com.devtiro.mac_base.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
