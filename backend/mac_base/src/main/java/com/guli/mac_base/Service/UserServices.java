package com.guli.mac_base.Service;

import com.guli.mac_base.Model.User;
import com.guli.mac_base.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        this.userRepository.save(user);
    }

    public void deleteUser(User user){
        this.userRepository.delete(user);
    }

    public List<User> findAllUser(){
        return this.userRepository.findAll();
    }

    public void editUser(){}
}