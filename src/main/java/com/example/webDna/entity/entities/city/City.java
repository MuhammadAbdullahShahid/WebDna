package com.example.webDna.entity.entities.city;

import com.example.webDna.entity.entities.country.Country;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "country",referencedColumnName = "id")
    private Country country;


}
