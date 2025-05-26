package com.example.sweetHome.domain.models.login;

public record User(String value) {

    public User{
        if(value == null || value.isBlank()){
            throw new IllegalArgumentException("User can't be blank");
        }
        if(!value.contains("@")){
            throw new IllegalArgumentException("User must contain '@'");
        }
    }
}
