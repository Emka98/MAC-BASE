package com.guli.mac_base_app.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "/users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String userPassword;

    public User() {
    }

    public User(String userName, Integer id, String userPassword) {
        this.userName = userName;
        this.id = id;
        this.userPassword = userPassword;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
