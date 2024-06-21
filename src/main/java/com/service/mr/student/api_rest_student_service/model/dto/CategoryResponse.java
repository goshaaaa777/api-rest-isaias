package com.service.mr.student.api_rest_student_service.model.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CategoryResponse {

    private  Long id;
    private String name;

}
