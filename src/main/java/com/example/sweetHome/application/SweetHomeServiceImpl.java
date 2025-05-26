package com.example.sweetHome.application;

import com.example.sweetHome.domain.models.login.Login;
import com.example.sweetHome.domain.repository.SweetHomeRepository;
import com.example.sweetHome.domain.service.SweetHomeService;

public class SweetHomeServiceImpl implements SweetHomeService {

    private final SweetHomeRepository sweetHomeRepository;

    public SweetHomeServiceImpl(SweetHomeRepository sweetHomeRepository) {
        this.sweetHomeRepository = sweetHomeRepository;
    }

    @Override
    public Login createUser(Login login) {
        return sweetHomeRepository.save(login);
    }
}
