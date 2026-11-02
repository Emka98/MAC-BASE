package com.guli.mac_base.Service;

import com.guli.mac_base.Dto.UserDto;
import com.guli.mac_base.Exception.UserNotFoundException;
import com.guli.mac_base.Model.User;
import com.guli.mac_base.Repository.UserRepository;

public class UserServices {

    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(UserDto user){
        userRepository.findByName(user.getName()).orElseThrow(UserNotFoundException::new);




    }


}