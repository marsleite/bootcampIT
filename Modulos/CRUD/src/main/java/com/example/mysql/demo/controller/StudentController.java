package com.example.mysql.demo.controller;

import com.example.mysql.demo.model.Student;
import com.example.mysql.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Integer.parseInt;

@RestController
@RequestMapping
public class StudentController {

  @Autowired
  private IStudentService stuServ;

  @PostMapping("/create")
  public String createStu(@RequestBody Student student) {
    stuServ.saveStudent(student);
    return "Student created";
  }

  @GetMapping("/students")
  public List<Student> getAllStudent() {
    return stuServ.getStudent();
  }

  @GetMapping("/student/{id}")
  public Student getStudentById(@PathVariable String id) {
    Integer ID = parseInt(id);
    return stuServ.findStudent(ID);
  }
}
