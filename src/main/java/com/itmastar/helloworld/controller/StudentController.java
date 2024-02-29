package com.itmastar.helloworld.controller;

import com.itmastar.helloworld.entity.Student;
import com.itmastar.helloworld.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService service;

    //CRUD operations --> CREATE , READ , UPDATE , DELETE
//CREATE OPERATION
    @PostMapping("/student")
    public String createStudent(@RequestBody Student student){
       service.saveStudent(student);
       return "Student record saved with studentId :: "+student.getId();
    }

    //READ OPERATION
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return service.getAllStudents();
    }

    //GET RECORDS BY ID
    @GetMapping("/studentById/{id}")
    public Optional<Student> getStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }

    //GET RECORDS BY AGE
    @GetMapping("/students/{age}")
    public Student getStudentByAge(@RequestParam(name="age") int age ){
        return service.getStudentByAge(age);
    }

    //GET RECORDS BY STUDENT NAME
    @GetMapping("/students/{studentName}")
    public Student getStudentByName(@RequestParam(name="studentName") String name ){
        return service.getStudentByName(name);
    }
    //UPDATE RECORD
    @PutMapping("/editStudent/{id}")
    public Student  updateStudent(@PathVariable int id, @RequestBody Student studentTobeUpdated ){
        return service.updateStudentByID(id, studentTobeUpdated);
    }

    //DELETE RECORD
    @DeleteMapping("/students")
    public String deleteAllStudent( ){
        return service.deleteAllStudents();
    }

}
