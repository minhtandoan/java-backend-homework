package com.testexam.tan.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
  private Animal tiger;
  private Animal zebra;

  @Autowired
  public Zoo(Giraffe giraffe, Panda panda) {
    tiger = giraffe;
    zebra = panda;
    tiger.eat();
    zebra.eat();
  }
}
