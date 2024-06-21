package com.service.mr.student.api_rest_student_service.service;

import com.service.mr.student.api_rest_student_service.model.dto.ProductResponse;
import com.service.mr.student.api_rest_student_service.model.dto.ProductoRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProductoService implements ProductService {
    @Override
    public ProductResponse findById(long id) {
        return null;
    }

    @Override
    public List<ProductResponse> findAll() {
        return null;
    }

    @Override
    public List<ProductResponse> findAllByCategoryId(Long categoryId) {
        return null;
    }

    @Override
    public ProductResponse save(ProductResponse request) {
        return null;
    }

    @Override
    public ProductResponse update(long id, ProductoRequest request) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
