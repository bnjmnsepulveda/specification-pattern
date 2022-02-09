package com.benjamin.pattern.specification.core;

public interface ICompositeISpecification<T> extends ISpecification<T> {
    ICompositeISpecification<T> and(ICompositeISpecification<T> other) ;
    ICompositeISpecification<T> or(ICompositeISpecification<T> other);
    ICompositeISpecification<T> not();
}
