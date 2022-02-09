package com.benjamin.pattern.specification.core;

public interface ISpecification<T>{
    boolean isSatisfiedBy(T candidate);
}
