//package com.example.webDna.entity.entities;
//
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.Date;
//
//@Entity
//@Table(name = "roles")
//@Getter
//@Setter
//public class Role {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
//
//    @Column(name = "code", unique = true)
//    private String code;
//
//    @Column(name = "createdDate")
//    private Date createdDate;
//
//    @Column(name = "name")
//    private String name;
//
//    @Column(name = "status")
//    private int status;
//
//    @Column(name = "updatedDate")
//    private Date updatedDate;
//
//    @ManyToOne
//    @JoinColumn(name = "createdBy",referencedColumnName = "userId")
//    private User createdBy;
//
//    @Column(name = "roleType")
//    private Long roleType;
//
//    @ManyToOne
//    @JoinColumn(name = "updatedBy",referencedColumnName = "userId")
//    private User updatedBy;
//
//    // Getters and setters
//}
