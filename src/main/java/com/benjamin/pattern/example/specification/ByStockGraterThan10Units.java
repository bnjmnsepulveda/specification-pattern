package com.benjamin.pattern.example.specification;

import com.benjamin.pattern.example.model.Product;
import com.benjamin.pattern.specification.concrete.CompositeSpecification;

public class ByStockGraterThan10Units extends CompositeSpecification<Product> {
    @Override
    public boolean isSatisfiedBy(Product candidate) {
        return false;
    }
}
