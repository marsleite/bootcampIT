package com.example.mysql.demo.service;

import com.example.mysql.demo.model.Student;
import com.example.mysql.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class StudentService implements IStudentService {

  private final StudentRepository stuRepo;

  public StudentService (StudentRepository stuRepo) {
    this.stuRepo = stuRepo;
  }

  @Override
  @Transactional(readOnly = true)
  public List<Student> getStudent() {
    return stuRepo.findAll();
  }

  @Override
  @Transactional
  public void saveStudent(Student student) {
    stuRepo.save(student);
  }

  @Override
  @Transactional
  public void deleteStudent(Integer id) {
    stuRepo.deleteById(id);
  }

  @Override
  @Transactional (readOnly = true)
  public Student findStudent(Integer id) {
    return stuRepo.getById(id);
  }
}
