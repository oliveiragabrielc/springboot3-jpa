package com.gabrieloliveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrieloliveira.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
