package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter @Setter
public class StudentDTO {
    @NotBlank(message = "O nome do aluno não pode ficar vazio")
    @Pattern(regexp = "[A-Z]", message = "O nome deve começar com a letra maiúscula")
    @Size(max = 50, message = "O nome deve ter no máximo 50 caracters")

    String studentName;
    String message;
    Double averageScore;
    @NotEmpty(message = "A lista não pode ser vazia")
    List<SubjectDTO> subjects;
}
