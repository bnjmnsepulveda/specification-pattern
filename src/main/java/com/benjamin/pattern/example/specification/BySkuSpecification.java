package com.benjamin.pattern.example.specification;

import com.benjamin.pattern.specification.concrete.CompositeSpecification;
import com.benjamin.pattern.example.model.Product;

public class BySkuSpecification extends CompositeSpecification<Product> {

    private Integer sku;

    public BySkuSpecification(Integer sku) {
        this.sku = sku;
    }

    @Override
    public boolean isSatisfiedBy(Product candidate) {
        return candidate.getSku().equals(this.sku);
    }
}
