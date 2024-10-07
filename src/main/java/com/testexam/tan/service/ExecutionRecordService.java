package com.testexam.tan.service;

import com.testexam.tan.model.ExecutionRecordEntity;

import java.util.List;
import java.util.Optional;

public interface ExecutionRecordService {
  List<ExecutionRecordEntity> getAllRecords();
  Optional<ExecutionRecordEntity> getRecordById(Integer id);
  ExecutionRecordEntity createOrUpdateRecord(ExecutionRecordEntity record);
  void deleteRecord(Integer id);
}
