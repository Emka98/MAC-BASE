package com.guli.mac_base.Service;

import com.guli.mac_base.Dto.UserDto;
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

    public void AddUser(UserDto userDto){
        userRepository.save(new User(userDto));
    }

    public List<UserDto> FindAllUser(){
        return userRepository.findAll().stream()
                .map(UserDto::new)
                .toList();
    }
}
