package com.example.sweetHome.infra.entity;

import com.example.sweetHome.domain.models.login.Password;
import com.example.sweetHome.domain.models.login.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "login")
public class LoginEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "id")
    private Integer id;

    @Column(name = "user")
    @NotNull
    private String user;

    @Column(name = "password")
    @NotNull
    private String password;


    public LoginEntity() {

    }
}
