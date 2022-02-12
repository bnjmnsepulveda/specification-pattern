package com.benjamin.pattern.example.service;

import com.benjamin.pattern.example.model.Product;
import com.benjamin.pattern.specification.core.ISpecification;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class ProductService {

    private List<Product> products;

    public List<Product> findSatisfiedBy(ISpecification<Product> spec) {
        return products
                .stream()
                .filter(spec::isSatisfiedBy)
                .collect(Collectors.toList());
    }
}
