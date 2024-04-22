package com.example.webDna.repository;

import com.example.webDna.entity.entities.terminal.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminalRepository extends JpaRepository<Terminal,Long> {
}
