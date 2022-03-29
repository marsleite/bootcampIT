package com.meli.obterdiploma.service;

import com.meli.obterdiploma.exception.StudentNotFoundException;
import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.model.SubjectDTO;
import com.meli.obterdiploma.repository.IStudentDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Arrays;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ObterDiplomaServiceTest {
  @Mock
  private IStudentDAO studentDAO;

  private ObterDiplomaService obterDiplomaService;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this);
    obterDiplomaService = new ObterDiplomaService();
  }
  @Test
  @DisplayName("Shoul fail when student is not found")
  public void shouldFailWhenStudentIsNotFound() {

    // Setup
    SubjectDTO subject1 = new SubjectDTO("Matematica", 10.0);
    SubjectDTO subject2 = new SubjectDTO("Portugues", 8.0);
    SubjectDTO subject3 = new SubjectDTO("Historia", 9.0);
    StudentDTO student = new StudentDTO(1L, "Joao", "testando", null, Arrays.asList(subject1, subject2, subject3));
    long id = 2L;

    // Mock
    Mockito.when(studentDAO.findById(any())).thenThrow(new StudentNotFoundException("Student not found"));
  }
}