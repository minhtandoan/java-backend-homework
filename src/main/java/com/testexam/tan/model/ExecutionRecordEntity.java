package com.testexam.tan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "execution_record")
public class ExecutionRecordEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "serno", nullable = false)
  private Integer serno;

  @Column(name = "serviceName", nullable = false)
  private String serviceName;

  @Column(name = "msgid", nullable = false)
  private String msgid;

  @Column(name = "requestPayload", nullable = false)
  private String requestPayload;

  @Column(name = "request_timestamp", nullable = false)
  private Timestamp requestTimestamp;
}
