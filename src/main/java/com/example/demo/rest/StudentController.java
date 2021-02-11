package com.example.demo.rest;

import com.example.demo.crud.CRUD;
import com.example.demo.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class StudentController {
    private final CRUD crud;
    @Autowired
    public StudentController(@Qualifier("studentIMPL")CRUD crud){
        this.crud = crud;
    }
    @GetMapping("/receiveStudents")
    public List<Object> searchAll(){
        return crud.searchAll();
    }
    @PostMapping("/registerStudent")
    public Student registerStudent(@RequestBody Student student){
        student.setId(0);
        crud.saveUpdate(student);
        return student;
    }
    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        crud.saveUpdate(student);
        return student;
    }
    @DeleteMapping("/deleteStudent/{stu}")
    public String deleteStudent(@PathVariable int stu){

        crud.deleteId(stu);
        return "Dropped the student "+ stu;
    }
}
