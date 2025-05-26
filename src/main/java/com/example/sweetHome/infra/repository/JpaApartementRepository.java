package com.example.sweetHome.infra.repository;

import com.example.sweetHome.infra.entity.ApartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaApartementRepository extends JpaRepository<ApartmentEntity,Integer> {
}
