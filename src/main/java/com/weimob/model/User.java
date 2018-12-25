package com.weimob.model;

import lombok.Data;

@Data
public class User {

    private String id;
    private String userName;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
