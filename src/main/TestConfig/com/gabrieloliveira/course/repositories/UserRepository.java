package com.gabrieloliveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrieloliveira.course.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
