package com.example.sweetHome.domain.service;

import com.example.sweetHome.domain.models.login.Login;

public interface SweetHomeService {
    <Optional> Login foundUserById(Integer id);
    //verificar se é uma boa pratica colocar o mesmo nome do metodo que estamos usando em repository
    // verificar se da para colocar um metodo de interface como static
    // verificar se é uma boa pratica colocar optional em todos os metodos que implementam jpa e se em service é uma boa pratica
}
