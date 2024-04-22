package com.example.webDna.repository;

import com.example.webDna.entity.entities.user.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByCode(String code);
}
