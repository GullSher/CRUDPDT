package com.dectwntytwo.decembertwo.repository;

import com.dectwntytwo.decembertwo.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
