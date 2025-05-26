package com.example.sweetHome.infra.repository;

import com.example.sweetHome.infra.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaLoginRepository extends JpaRepository<LoginEntity, Integer> {
}
