package com.service.mr.student.api_rest_student_service.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
/*@JsonInclude(JsonInclude.Include.NON_NULL)  clase de respuesta */
public class ProductResponse {
    private String name;
    private String id;
    private String description;
    private BigDecimal price;
    private CategoryResponse category;
    private String status;
}
