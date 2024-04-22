package com.example.webDna.repository;

import com.example.webDna.entity.entities.fee.Fee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeeRepository extends JpaRepository<Fee,Long> {
}
