package com.testexam.tan.dao;

import com.testexam.tan.model.ExecutionRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutionRecordDAO extends JpaRepository<ExecutionRecordEntity, Integer> {
}
