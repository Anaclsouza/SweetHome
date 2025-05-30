package com.example.sweetHome.infra.repository.impl.login.converter;

import com.example.sweetHome.domain.models.login.Login;
import com.example.sweetHome.domain.models.login.Password;
import com.example.sweetHome.domain.models.login.User;
import com.example.sweetHome.infra.entity.LoginEntity;
import lombok.Builder;

public class LoginEntityConverter {

    public static Login converterEntityToDomain(LoginEntity loginEntity) {
        return new Login(loginEntity.getId(), loginEntity.getUser() != null ? new User(loginEntity.getUser()) : null, converterStringToPassword(loginEntity.getPassword()));
    }

    public static LoginEntity converterDomainToEntity(Login login) {
        return new LoginEntity(login.id(), login.user().toString(), login.password().toString());
    }


    public static Password converterStringToPassword(String string) {
        return string != null ? new Password(string) : null;
    }

    public static User converterStringToUser(String string) {
        return string != null ? new User(string) : null;
    }
}