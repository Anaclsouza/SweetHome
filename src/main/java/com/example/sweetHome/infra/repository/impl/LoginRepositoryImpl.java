package com.example.sweetHome.infra.repository.impl;

import com.example.sweetHome.domain.models.login.Login;
import com.example.sweetHome.domain.repository.SweetHomeRepository;
import com.example.sweetHome.infra.entity.LoginEntity;
import com.example.sweetHome.infra.repository.JpaLoginRepository;


public class LoginRepositoryImpl implements SweetHomeRepository {

    private final JpaLoginRepository jpaLoginRepository;

    public LoginRepositoryImpl(JpaLoginRepository jpaLoginRepository) {
        this.jpaLoginRepository = jpaLoginRepository;
    }

    @Override
    public Login save(Login login) {
        //logica
        return null;
    }
}
