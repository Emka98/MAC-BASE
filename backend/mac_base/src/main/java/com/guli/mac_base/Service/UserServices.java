package com.guli.mac_base.Service;

import com.guli.mac_base.Dto.UserDto;
import com.guli.mac_base.Model.User;
import com.guli.mac_base.Repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    public void addUser(UserDto userDto){
        User user = new User();
        user.setName(userDto.getName());
        user.setPassword(userDto.getPassword());
        user.setRole(userDto.getRole());
        userRepository.save(user);
    }
    
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public void deleteUser(String name) {
        userRepository.findByName(name).ifPresent(userRepository::delete);
    }

    public void editUser(String name, String password, UserDto userdto) {
        userRepository.findByName(userdto.getName()).ifPresent(user -> {
            user.setName(name);
            user.setPassword(password);
            userRepository.save(user);
        });
    }

    public Optional<User> findUserByName(String name) {
        return userRepository.findByName(name);
    }
}