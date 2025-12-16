package com.example.demo.entity;

import jarkata.persistence.Entity;
import jarkata.persistence.GeneratedValue;
import jarkata.persistence.Id;

@Entity
public class Stuentity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private float cgpa;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName()
}