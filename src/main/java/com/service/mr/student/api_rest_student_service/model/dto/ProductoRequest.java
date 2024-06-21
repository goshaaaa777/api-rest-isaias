package com.service.mr.student.api_rest_student_service.model.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class ProductoRequest {

    @NotEmpty(message ="El nombre no puede ser nulo")
    private String name;

    private String description;

    @NotNull(message ="El precio no puede ser nulo")
    private BigDecimal price;

    @NotNull(message ="La categoria no puede ser nulo")
    private Long categoryId;

}
