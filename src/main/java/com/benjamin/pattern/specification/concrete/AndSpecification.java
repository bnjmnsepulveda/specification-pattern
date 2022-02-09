package com.benjamin.pattern.specification.concrete;

import com.benjamin.pattern.specification.core.ICompositeISpecification;

public class AndSpecification<T> extends CompositeSpecification<T> {

    private ICompositeISpecification<T> left;
    private ICompositeISpecification<T> right;

    public AndSpecification(ICompositeISpecification<T> left, ICompositeISpecification<T> right) {
        super();
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(T candidate) {
        return this.left.isSatisfiedBy(candidate) && this.right.isSatisfiedBy(candidate);
    }
}
