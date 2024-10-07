package com.testexam.tan.component;

import java.util.concurrent.locks.ReentrantLock;

import com.testexam.tan.dao.QueryDAO;
import org.springframework.core.env.Environment;

public class Calculation {
  private static Calculation uniqueInstance;
  private static final ReentrantLock lock = new ReentrantLock();

  private Environment env;
  private QueryDAO dao;

  private Calculation(QueryDAO dao, Environment env) {
    this.env = env;
    this.dao = dao;
  }

  // Double-checked locking technique
  public static Calculation getInstance(QueryDAO dao, Environment env) {
    if (uniqueInstance == null) {
      lock.lock();
      try {
        if (uniqueInstance == null) {
          uniqueInstance = new Calculation(dao, env);
        }
      } finally {
        lock.unlock();
      }
    }
    return uniqueInstance;
  }
}
