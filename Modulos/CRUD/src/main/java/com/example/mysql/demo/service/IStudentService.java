package com.example.mysql.demo.service;

import com.example.mysql.demo.model.Student;

import java.util.List;

public interface IStudentService {

  public List<Student> getStudent ();
  public void saveStudent (Student student);
  public void deleteStudent (Integer id);
  public Student findStudent (Integer id);
}
