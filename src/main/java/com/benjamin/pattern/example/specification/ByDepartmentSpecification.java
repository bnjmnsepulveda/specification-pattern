package com.benjamin.pattern.example.specification;

import com.benjamin.pattern.specification.concrete.CompositeSpecification;
import com.benjamin.pattern.example.model.Department;
import com.benjamin.pattern.example.model.Product;

public class ByDepartmentSpecification extends CompositeSpecification<Product> {

    private Department department;

    @Override
    public boolean isSatisfiedBy(Product candidate) {
        return candidate
                .getDepartment()
                .getId()
                .equals(this.department.getId());
    }
}
