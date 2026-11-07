package com.guli.mac_base.Model;

import com.guli.mac_base.Dto.UserDto;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;

    public User() {
    }

    public User(UserDto userDto) {
        this.name = userDto.getName();
        this.password = userDto.getPassword();
        this.role = userDto.getRole();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
