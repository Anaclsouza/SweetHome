package com.example.sweetHome.infra.repository.impl.login;

import com.example.sweetHome.domain.models.login.Login;
import com.example.sweetHome.domain.repository.SweetHomeRepository;
import com.example.sweetHome.infra.entity.LoginEntity;
import com.example.sweetHome.infra.repository.JpaLoginRepository;

import java.util.Optional;


public class LoginRepositoryImpl implements SweetHomeRepository {

    private final JpaLoginRepository jpaLoginRepository;

    public LoginRepositoryImpl(JpaLoginRepository jpaLoginRepository) {
        this.jpaLoginRepository = jpaLoginRepository;
    }

    @Override
    public Login foundUserById(Integer id) {
        Optional<LoginEntity> user = jpaLoginRepository.findById(id);

        return null;
    }
}
