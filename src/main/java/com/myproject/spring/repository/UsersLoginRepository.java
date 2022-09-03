package com.myproject.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.spring.entity.UsersLogin;

@Repository
public interface UsersLoginRepository extends JpaRepository<UsersLogin, Long>{

}
