package com.login.login.dto;

import lombok.Data;

@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public UserDto(){

    }

    public UserDto(String firstName, String lastName, String email, String password) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}
