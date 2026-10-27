package com.guli.mac_base.Repository;

import com.guli.mac_base.Model.User;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User, Integer> {

    void save(User user);
}
