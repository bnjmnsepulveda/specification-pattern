package com.benjamin.pattern.example.specification;

import com.benjamin.pattern.example.model.Product;
import com.benjamin.pattern.specification.concrete.CompositeSpecification;

import java.util.List;

public class ByInCategories extends CompositeSpecification<Product> {

    private List<String> categories;

    public ByInCategories(List<String> categories) {
        this.categories = categories;
    }

    @Override
    public boolean isSatisfiedBy(Product candidate) {
        return categories.contains(candidate.getCategory());
    }
}
