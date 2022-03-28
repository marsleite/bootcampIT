package com.meli.obterdiploma.controller;

import com.meli.obterdiploma.exception.ObterDiplomaException;
import com.meli.obterdiploma.model.ErroDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DiplomaExceptionController {

  @ExceptionHandler(ObterDiplomaException.class)
  ResponseEntity<ErroDTO> HandleGlobalException(ObterDiplomaException e) {
    e.printStackTrace();
    return new ResponseEntity<>(e.getError(), e.getStatus());
  }
}
