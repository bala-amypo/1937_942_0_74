package com.example.demo.entity;

import jarkata.persistence.Entity;
import jarkata.persistence.GeneratedValue;
import jarkata.persistence.Id;

@Entity
public class Stuentity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
}