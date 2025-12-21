package com.financemanagerapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financemanagerapp.entity.User;

// JpaRepository gives CRUD methods without writing SQL.

public interface UserRepository extends JpaRepository<User, Long> {

}
