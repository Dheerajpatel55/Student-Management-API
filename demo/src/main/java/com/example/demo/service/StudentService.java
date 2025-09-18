package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository sr;
    //create or update student 
    public Student saveStudent(Student student){
        return sr.save(student);
    }

    //getAll
    public List<Student> getAllStudent(){
        return sr.findAll();
    }
    //get by id
    public Optional<Student> getStudentById(Long id){
        return sr.findById(id);
    }
    //get by email
    public Optional<Student> getStudentByEmail(String email){
        return sr.findByEmail(email);
    }

    public void deleteStudentById(Long id){
        sr.deleteById(id);
    }
}
