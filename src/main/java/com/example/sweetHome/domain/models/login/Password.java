package com.example.sweetHome.domain.models.login;

public record Password(String value) {

    public Password{
        if(value == null || value.isBlank()){
            throw new IllegalArgumentException("Password can't be blank.");
        }
        if(value.length() < 8){
            throw new IllegalArgumentException("The password must be have at least 8 characters.");
        }
        if (!value.matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("The password must contain at least one uppercase letter.");
        }

        if (!value.matches(".*\\d.*")) {
            throw new IllegalArgumentException("The password must contain at least one number.");
        }

        if (!value.matches(".*[!@#$%^&*()].*")) {
            throw new IllegalArgumentException("The password must contain at least one special character.");
        }

    }
}
