package com.benjamin.pattern.specification.concrete;

import com.benjamin.pattern.specification.core.ICompositeISpecification;

public abstract class CompositeSpecification<T> implements ICompositeISpecification<T> {

    @Override
    public ICompositeISpecification<T> and(ICompositeISpecification<T> other) {
        return new AndSpecification<T>(this, other);
    }

    @Override
    public ICompositeISpecification<T> or(ICompositeISpecification<T> other) {
        return new OrSpecification<T>(this, other);
    }

    @Override
    public ICompositeISpecification<T> not() {
        return new NotSpecification<T>(this);
    }

}
