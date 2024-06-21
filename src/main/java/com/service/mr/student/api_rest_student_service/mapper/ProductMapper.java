package com.service.mr.student.api_rest_student_service.mapper;

import com.service.mr.student.api_rest_student_service.model.dto.ProductResponse;
import com.service.mr.student.api_rest_student_service.model.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = CategoryMapper.class)
public interface ProductMapper {

    @Mapping(target = "status", expression = "java(mapStatus(product))")
    ProductResponse toProductResponse(Product product);
    default String mapStatus(Product product){
        return product.getStatus() ? "ACTIVE" : "INACTIVE";
    }


}
