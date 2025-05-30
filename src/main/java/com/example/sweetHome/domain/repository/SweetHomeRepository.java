package com.example.sweetHome.domain.repository;

import com.example.sweetHome.domain.models.login.Login;

public interface SweetHomeRepository {
    <Optional> Login foundUserById(Integer id);

}
