package com.testexam.tan.service;

import com.testexam.tan.dao.ExecutionRecordDAO;
import com.testexam.tan.model.ExecutionRecordEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExecutionRecordServiceImpl implements ExecutionRecordService {
  private final ExecutionRecordDAO executionRecordDAO;

  @Override
  public List<ExecutionRecordEntity> getAllRecords() {
    return executionRecordDAO.findAll();
  }

  @Override
  public Optional<ExecutionRecordEntity> getRecordById(Integer id) {
    return executionRecordDAO.findById(id);
  }

  @Override
  public ExecutionRecordEntity createOrUpdateRecord(ExecutionRecordEntity record) {
    return executionRecordDAO.save(record);
  }

  @Override
  public void deleteRecord(Integer id) {
    executionRecordDAO.deleteById(id);
  }
}
