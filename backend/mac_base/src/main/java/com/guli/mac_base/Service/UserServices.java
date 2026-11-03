package com.guli.mac_base.Service;

import com.guli.mac_base.Dto.UserDto;
import com.guli.mac_base.Model.User;
import com.guli.mac_base.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {

    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(UserDto user){
        if(user.getPassword() != null & user.getName() != null) {
            userRepository.save(new User(user.getName(), user.getPassword()));
        }
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public void deleteUser(UserDto user){
        userRepository.findByName(user.getName());
        userRepository.delete(user);
    }
}