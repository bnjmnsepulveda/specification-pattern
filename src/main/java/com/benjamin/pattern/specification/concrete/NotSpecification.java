package com.benjamin.pattern.specification.concrete;

import com.benjamin.pattern.specification.core.ICompositeISpecification;

public class NotSpecification<T> extends CompositeSpecification<T> {

    private ICompositeISpecification<T> spec;

    public NotSpecification(ICompositeISpecification<T> spec) {
        super();
        this.spec = spec;
    }

    @Override
    public boolean isSatisfiedBy(T candidate) {
        return !this.spec.isSatisfiedBy(candidate);
    }
}
