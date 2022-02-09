package com.benjamin.pattern.specification;

import com.benjamin.pattern.specification.core.ICompositeISpecification;
import com.benjamin.pattern.specification.model.product.ByDepartmentSpecification;
import com.benjamin.pattern.specification.model.product.BySkuSpecification;
import com.benjamin.pattern.specification.model.product.Product;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("patterns example");

        var products = Arrays.asList(
                Product.builder()
                        .sku(1111)
                        .description("Guitar")
                        .department(10)
                        .price(1000.0)
                        .build(),
                Product.builder()
                        .sku(1111)
                        .department(100)
                        .description("Bass")
                        .price(1500.0)
                        .build(),
                Product.builder()
                        .sku(2222)
                        .description("guitar string")
                        .department(10)
                        .price(10.0)
                        .build()
        );
        ICompositeISpecification spec = new ByDepartmentSpecification(100)
                .and(new BySkuSpecification(11118)).not();

        products.stream()
                .filter(p -> spec.isSatisfiedBy(p))
                .forEach(p -> System.out.println(p));



    }
}
