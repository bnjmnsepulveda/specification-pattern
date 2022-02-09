package com.benjamin.pattern.example.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@Builder
public class Product {
    private Integer sku;
    private String description;
    private Department department;
    private Double price;
    private String category;
    private String[] labels;
    private Integer stock;
    private List<Store> availableStores;

}
