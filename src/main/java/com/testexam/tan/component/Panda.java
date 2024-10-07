package com.testexam.tan.component;

import org.springframework.stereotype.Component;

@Component
public class Panda implements Animal {
  @Override
  public void eat() {
    System.out.println("Panda eat bamboo.");
  }
}
