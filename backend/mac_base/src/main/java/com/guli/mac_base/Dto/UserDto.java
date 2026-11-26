package com.guli.mac_base.Dto;

import com.guli.mac_base.Model.Role;
import com.guli.mac_base.Model.User;

public class UserDto {

    private String name;
    private String password;
    private Role role;

    public UserDto() {
    }

    public UserDto(User user) {
        name = user.getName();
        password = user.getPassword();
        role = user.getRole();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
