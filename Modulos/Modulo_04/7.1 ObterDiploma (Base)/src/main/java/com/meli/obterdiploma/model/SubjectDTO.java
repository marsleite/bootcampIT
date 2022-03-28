package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter @Setter
public class SubjectDTO {
    @NotEmpty(message = "O nome não pode ser vazio")
    @Pattern(regexp = "[A-Z]", message = "O assunto tem que começar com a letra maiuscula")
    @Size(max = 30, message = "Não pode ter mais que 30 caracteres")
    String name;
    Double score;
}
