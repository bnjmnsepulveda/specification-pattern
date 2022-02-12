package com.benjamin.pattern.objectmother;

import com.benjamin.pattern.example.model.Department;
import com.benjamin.pattern.example.model.Product;
import com.benjamin.pattern.example.model.Store;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import java.util.Arrays;
import java.util.List;

@Data
@Builder
@ToString
public class ProductObjectMother {

    private static Integer sku = 1111;
    private static String description = "Square Pants";
    private static Department department = new Department(1,"Fashion clothing");
    private static Double price = 100.0;
    private static String category = "clothing";
    private static Integer stock = 10;
    private static List<Store> availableStores = Arrays.asList(
            new Store(1, "santiago, Chile"),
            new Store(2, "valdivia, Chile")
    );

    public static Product withSku(Integer value) {
        return Product.builder()
                .sku(value)
                .description(description)
                .department(department)
                .price(price)
                .category(category)
                .stock(stock)
                .availableStores(availableStores)
                .build();
    }

    public static Product withDepartment(Department value) {
        return Product.builder()
                .sku(sku)
                .description(description)
                .department(value)
                .price(price)
                .category(category)
                .stock(stock)
                .availableStores(availableStores)
                .build();
    }

    public static Product withStock(Integer value) {
        return Product.builder()
                .sku(sku)
                .description(description)
                .department(department)
                .price(price)
                .category(category)
                .stock(value)
                .availableStores(availableStores)
                .build();
    }

    public static Product withSkuAndDescription(Integer skuValue, String descriptionValue) {
        return Product.builder()
                .sku(skuValue)
                .description(descriptionValue)
                .department(department)
                .price(price)
                .category(category)
                .stock(stock)
                .availableStores(availableStores)
                .build();
    }

    public static Product withDepartmentAndDescription(Department departmentValue, String descriptionValue) {
        return Product.builder()
                .sku(sku)
                .description(description)
                .department(departmentValue)
                .price(price)
                .category(category)
                .stock(stock)
                .availableStores(availableStores)
                .build();
    }

    public static Product withStockAndDescription(Integer stockValue, String descriptionValue) {
        return Product.builder()
                .sku(sku)
                .description(description)
                .department(department)
                .price(price)
                .category(category)
                .stock(stockValue)
                .availableStores(availableStores)
                .build();
    }


}
