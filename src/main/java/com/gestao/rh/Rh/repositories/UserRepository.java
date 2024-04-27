package com.gestao.rh.Rh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestao.rh.Rh.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
