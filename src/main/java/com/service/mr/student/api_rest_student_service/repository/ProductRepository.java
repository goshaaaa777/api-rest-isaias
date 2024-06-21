package com.service.mr.student.api_rest_student_service.repository;

import com.service.mr.student.api_rest_student_service.model.entity.Category;
import com.service.mr.student.api_rest_student_service.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, long> {

    List<Product> findAllByCategory(Category category);

}
