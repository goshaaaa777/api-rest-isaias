package com.service.mr.student.api_rest_student_service.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;

    @ManyToMany
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(columnDefinition = "BIT(1) default: 0")
    private Boolean status;
}
