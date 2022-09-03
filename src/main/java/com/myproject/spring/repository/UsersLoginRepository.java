package com.myproject.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.spring.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

}
