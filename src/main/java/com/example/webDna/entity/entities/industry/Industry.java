package com.example.webDna.entity.entities.industry;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "industry")
public class Industry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;


}
