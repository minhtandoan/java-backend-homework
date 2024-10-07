package com.testexam.tan.exception;

import com.testexam.tan.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralExceptionHandler {

  @ExceptionHandler(ConflictException.class)
  @ResponseStatus(HttpStatus.CONFLICT)
  public ErrorResponse handleConflictException(ConflictException ex) {
    // do some stuff to handle conflict exception

    // return error message with HTTP status code 409
    return new ErrorResponse(ex.getReturnCode(), ex.getReturnDesc());
  }
}
