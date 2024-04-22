package com.example.webDna.repository;

import com.example.webDna.entity.entities.transaction.TransactionLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TransactionLogRepository extends JpaRepository<TransactionLog,Long>, JpaSpecificationExecutor<TransactionLog> {
}
