package com.example.webDna.repository;

import com.example.webDna.entity.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);
    @Query(value = "SELECT * FROM user WHERE email = :email OR loginName = :loginName OR phoneNumber = :phoneNumber AND isActive=true",nativeQuery = true)
    List<User> getByEmailOrLoginNameOrPhoneNumberOrIsActiveTrue(@Param("email") String email, @Param("loginName") String loginName, @Param("phoneNumber") String phoneNumber);

}
