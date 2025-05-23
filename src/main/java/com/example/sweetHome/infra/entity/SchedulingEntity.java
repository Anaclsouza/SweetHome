package com.example.sweetHome.infra.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "scheduling")
public class SchedulingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "dateTime")
    private Date dateTime;

    @NotNull
    @Column(name = "apartmentId")
    private Integer apartmentId;

    @NotNull
    @Column(name = "loginId")
    private Integer loginId;


}
