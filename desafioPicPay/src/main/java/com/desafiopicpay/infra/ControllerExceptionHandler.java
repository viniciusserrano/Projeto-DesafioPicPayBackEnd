package com.desafiopicpay.infra;

import com.desafiopicpay.repository.dto.ExcepctionDto;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity threatDupicateEntry(DataIntegrityViolationException exception) {
        ExcepctionDto excepctionDto = new ExcepctionDto("Usuário já Cadastrado ", "400");
        return ResponseEntity.badRequest().body(excepctionDto);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity threat404(EntityNotFoundException exception) {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity threatGeneralException(Exception exception) {
        ExcepctionDto excepctionDto = new ExcepctionDto(exception.getMessage(), "500");
        return ResponseEntity.internalServerError().body(excepctionDto);
    }
}
