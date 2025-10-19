package com.muriloDev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muriloDev.backend.model.User;

public interface UserRepository extends JpaRepository <User, Long>{

}
