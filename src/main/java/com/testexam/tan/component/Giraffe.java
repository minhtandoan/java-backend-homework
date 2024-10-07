package com.testexam.tan.component;

import org.springframework.stereotype.Component;

@Component
public class Giraffe implements Animal {
  @Override
  public void eat() {
    System.out.println("Giraffe eat grass.");
  }
}
