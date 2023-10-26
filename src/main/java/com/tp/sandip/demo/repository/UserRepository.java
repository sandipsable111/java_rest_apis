package com.tp.vikas.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tp.vikas.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
