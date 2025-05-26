package com.example.sweetHome.domain.repository;

import com.example.sweetHome.domain.models.login.Login;

public interface SweetHomeRepository {
    Login save(Login login);

}
