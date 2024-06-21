package com.service.mr.student.api_rest_student_service.service;

import com.service.mr.student.api_rest_student_service.model.dto.ProductResponse;
import com.service.mr.student.api_rest_student_service.model.dto.ProductoRequest;

import java.util.List;

public interface ProductService {
    ProductResponse findById(long id);
    List<ProductResponse> findAll();

    List<ProductResponse> findAllByCategoryId(Long categoryId);
    ProductResponse save(ProductResponse request);
    ProductResponse update  (long id, ProductoRequest request);
    void deleteById(Long id);

}
