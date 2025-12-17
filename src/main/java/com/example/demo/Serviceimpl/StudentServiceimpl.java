package com.example.demo.Serviceimpl;

import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.Stuentity;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
    public final StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    public Stuentity saveStudent(Stuentity student){
        return studentRepository.save(student);

    }

}