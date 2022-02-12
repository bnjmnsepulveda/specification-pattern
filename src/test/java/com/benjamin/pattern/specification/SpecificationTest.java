package com.benjamin.pattern.specification;

import com.benjamin.pattern.example.specification.ByStockGreaterThan10Units;
import com.benjamin.pattern.objectmother.ProductObjectMother;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpecificationTest {

    @Test
    void ByStockGreaterThan10UnitsTest() {

        var spec = new ByStockGreaterThan10Units();
        var productWithStock100  = ProductObjectMother.withStock(100);
        var result = spec.isSatisfiedBy(productWithStock100);
        assertEquals(result, true);

        var productWithStock5  = ProductObjectMother.withStock(5);
        result = spec.isSatisfiedBy(productWithStock5);
        assertEquals(result, false);

    }

}
