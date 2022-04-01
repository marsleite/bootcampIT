package com.meli.obterdiploma.service;

import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.model.SubjectDTO;
import com.meli.obterdiploma.repository.IStudentDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class ObterDiplomaServiceTest {

  @Mock
  private IStudentDAO studentDAO;

  private ObterDiplomaService diplomaService;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
    diplomaService = new ObterDiplomaService();
    diplomaService.setStudentDAO(studentDAO);
  }

  @Test
  @DisplayName("Analise scores pode ser valido")
  public void testeAnalysisBeValid() {

    // Ensinando o Mockito
    Mockito.when(studentDAO.findById(any())).thenReturn(this.setMockData());

    // Teste unitario
    StudentDTO stu = this.diplomaService.analyzeScores(1L);

    assertNotNull(stu.getStudentName());

  }

  public StudentDTO setMockData(){
    StudentDTO student = new StudentDTO();
    List<SubjectDTO> subjects = new ArrayList<>();

    student.setId(1L);
    student.setStudentName("Marcelo");
    student.setMessage("Mensagem de teste");
    student.setAverageScore(8.5);
    subjects.add(new SubjectDTO("Matematica", 8.5));
    student.setSubjects(subjects);

    return student;
  }

}