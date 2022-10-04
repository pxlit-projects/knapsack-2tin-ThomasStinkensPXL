package be.pxl.ja.robbery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {
    private Product lowCostProduct;
    private Product highCostProduct;

    @BeforeEach
    public void init() {
        lowCostProduct = new Product("lowCostProduct", 1, 1);

        highCostProduct = new Product("highCostProduct", 1, 100);
    }


    @Test
    public void returnsNegativeIfProduct2HasLowerPriceThanProduct1() {
        Assertions.assertTrue(highCostProduct.compareTo(lowCostProduct) < 0);
    }

    @Test
    public void returnsPositiveOfProduct2HasHigherPriceThanProduct1() {
        Assertions.assertTrue(lowCostProduct.compareTo(highCostProduct) > 0);
    }

    @Test
    public void returnsZeroIfProduct1IsTheSamePriceAsProduct2() {
        Assertions.assertEquals(0, lowCostProduct.compareTo(lowCostProduct));
    }
}
