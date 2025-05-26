package com.example.sweetHome.infra.repository;

import com.example.sweetHome.infra.entity.SchedulingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaSchedulingRepository extends JpaRepository<SchedulingEntity, Integer> {
}
