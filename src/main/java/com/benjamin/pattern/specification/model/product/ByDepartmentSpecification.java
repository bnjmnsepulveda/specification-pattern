package com.benjamin.pattern.specification.model.product;

import com.benjamin.pattern.specification.concrete.CompositeSpecification;
import com.benjamin.pattern.specification.model.Department;

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
