package be.pxl.ja.robbery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class KnapsackUtilTest {
    @Test
    public void fillTest() {
        Knapsack knapsack = new Knapsack(30);
        Product item1 = new Product("product 1", 10, 10);
        Product item2 = new Product("product 2", 20, 200);
        knapsack.add(item1);
        knapsack.add(item2);

        List<Product> sortedItemsList = new ArrayList<>();
        sortedItemsList.add(item2);
        sortedItemsList.add(item1);

        Shop shop = new Shop();
        shop.add(item1);
        shop.add(item2);

        KnapsackUtil.fill(knapsack, shop);

        Assertions.assertEquals(sortedItemsList, knapsack.getItems() );
    }
}
