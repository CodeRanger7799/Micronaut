package com.souvik.service;

import com.souvik.model.CheckRequest;
import com.souvik.model.Student;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

   static List<Student> listStudent;
    static{
        listStudent = new ArrayList<>();
        listStudent.add(new Student("Souvik",21));
        listStudent.add(new Student("Rhea",23));
        listStudent.add(new Student("Ajay",44));
        listStudent.add(new Student("Rahul",33));
    }

    public String getGreetings(){
        return "Hello from Micronaut Service";
    }

    public List<Student> getStudentList(){
        return listStudent;
    }

}
