package com.benjamin.pattern.specification.model.product;

import com.benjamin.pattern.specification.concrete.CompositeSpecification;

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
