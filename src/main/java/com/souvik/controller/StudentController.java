package com.souvik.controller;

import com.souvik.model.CheckRequest;
import com.souvik.model.Student;
import com.souvik.service.CheckService;
import com.souvik.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class StudentController {
    private StudentService service;
    private CheckService checkService;
    StudentController(StudentService service,CheckService checkService){
        this.service = service;
        this.checkService = checkService;
    }
    @GetMapping("/")
    public ResponseEntity<String> getGreeting(){
        return new ResponseEntity<>(service.getGreetings(), HttpStatus.OK);
    }
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getListStudent(){
        return new ResponseEntity<>(service.getStudentList(),HttpStatus.OK);
    }
    @PostMapping("/check")
    public ResponseEntity<CheckRequest> check(@RequestBody CheckRequest checkRequest){
        return new ResponseEntity<>(checkService.getStatus(checkRequest), HttpStatus.OK);
    }
}
