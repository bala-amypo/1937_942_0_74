package com.example.demo.Serviceimpl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.StudentService;
import com.example.demo.entity.Stuentity;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    
    public Stuentity saveStudent(Stuentity student){
        return studentRepository.save(student);

    }

}