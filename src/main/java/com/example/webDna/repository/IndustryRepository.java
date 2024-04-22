package com.example.webDna.repository;

import com.example.webDna.entity.entities.industry.Industry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndustryRepository extends JpaRepository<Industry,Long> {
}
