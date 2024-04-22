package com.example.webDna.entity.entities.agency;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "agency")
public class Agency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phoneNo")
    private String phoneNo;

    @Column(name = "isActive")
    private Boolean isActive;


}
