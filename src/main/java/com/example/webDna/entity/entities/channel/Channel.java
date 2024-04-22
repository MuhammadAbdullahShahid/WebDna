package com.example.webDna.entity.entities.channel;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "channelType")
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;


}
