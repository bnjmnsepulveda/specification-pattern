package com.benjamin.pattern.specification;

import com.benjamin.pattern.example.model.Department;
import com.benjamin.pattern.example.model.Product;
import com.benjamin.pattern.example.service.ProductService;
import com.benjamin.pattern.objectmother.ProductObjectMother;
import com.benjamin.pattern.specification.core.ICompositeISpecification;
import com.benjamin.pattern.example.specification.ByDepartmentSpecification;
import com.benjamin.pattern.example.specification.BySkuSpecification;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("patterns example");

        var products = Arrays.asList(
            ProductObjectMother.withSku(1111),
            ProductObjectMother.withSku(2222)
        );
        var productsService = new ProductService(products);


        ICompositeISpecification<Product> spec = new ByDepartmentSpecification(new Department(1,"clothing"))
                .and(new BySkuSpecification(11118)).not();

       productsService
               .findSatisfiedBy(spec)
               .forEach(System.out::println);



    }
}
