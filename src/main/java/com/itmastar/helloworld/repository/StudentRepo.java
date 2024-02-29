package com.itmastar.helloworld.repository;

import com.itmastar.helloworld.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    Student findByAge(int age );

    Student findByName(String name);


}
