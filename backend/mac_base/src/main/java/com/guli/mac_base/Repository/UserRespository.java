package com.guli.mac_base.Repository;

import com.guli.mac_base.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User,Integer> {
}
