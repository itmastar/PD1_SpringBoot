package com.itmastar.helloworld.service;

import com.itmastar.helloworld.entity.Student;
import com.itmastar.helloworld.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public void saveStudent(Student student){
        studentRepo.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(int id ){
        return studentRepo.findById(id);
    }

    public Student getStudentByAge(int age){
        return studentRepo.findByAge(age);
    }

    public Student getStudentByName(String  name){
        return studentRepo.findByName(name);
    }

}
