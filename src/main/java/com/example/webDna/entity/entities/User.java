//package com.example.webDna.entity.entities;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.Date;
//
//@Entity
//@Table(name = "user")
//@Getter
//@Setter
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "userId")
//    private Long userId;
//
//    @Column(name = "createdDate")
//    private Date createdDate;
//
//    @Column(name = "email", unique = true)
//    private String email;
//
//    @Column(name = "firstName")
//    private String firstName;
//
//    @Column(name = "isActive")
//    private boolean isActive;
//
//    @Column(name = "lastName")
//    private String lastName;
//
//    @Column(name = "loginName", unique = true)
//    private String loginName;
//
//    @Column(name = "password")
//    private String password;
//
//    @Column(name = "phoneNumber", unique = true)
//    private String phoneNumber;
//
//    @Column(name = "status")
//    private int status;
//
//    @Column(name = "type")
//    private String type;
//
//    @Column(name = "updatedDate")
//    private Date updatedDate;
//
//    @ManyToOne
//    @JoinColumn(name = "createdBy")
//    private User createdBy;
//
//    @ManyToOne
//    @JoinColumn(name = "updatedBy")
//    private User updatedBy;
//
//    @Column(name = "secret")
//    private String secret;
//
//    @Column(name = "customer")
//    private Long customer;
//
//    @Column(name = "customerType")
//    private Long customerType;
//
//    @Column(name = "phoneCode")
//    private String phoneCode;
//
//    // Getters and setters
//}
