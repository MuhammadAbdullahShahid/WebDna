package com.example.webDna.repository;

import com.example.webDna.entity.entities.systemParameter.SystemParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemParameterRepository extends JpaRepository<SystemParameter,Long> {
}
