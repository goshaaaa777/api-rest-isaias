package com.service.mr.student.api_rest_student_service.mapper;

import com.service.mr.student.api_rest_student_service.model.dto.CategoryResponse;
import com.service.mr.student.api_rest_student_service.model.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryResponse toCategoryReponse(Category category);

}
