package com.service.mr.student.api_rest_student_service.repository;

import com.service.mr.student.api_rest_student_service.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
