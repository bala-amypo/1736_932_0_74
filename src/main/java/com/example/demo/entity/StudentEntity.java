package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.id;

@Entity
public class StudentEntity{

     @Id
     @GeneratedValue(strategy=GeneratedValue)
    private Long id;
    private String name;
    private String email;
    private float cgpa;

}