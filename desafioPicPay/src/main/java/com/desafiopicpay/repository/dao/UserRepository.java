package com.desafiopicpay.repository.dao;

import com.desafiopicpay.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByDocument(String document);
    Optional<User> findUserByID(Long id);
}
