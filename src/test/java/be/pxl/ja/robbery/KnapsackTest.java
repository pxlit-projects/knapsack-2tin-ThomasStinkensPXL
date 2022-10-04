package be.pxl.ja.robbery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class KnapsackTest {
    @Test
    public void ShouldThrowAnExceptionIfAddGoesOverMaxWeight() {
        Knapsack knapsack = new Knapsack(20);
        Product item1 = new Product("product 1", 10, 10);
        Product item2 = new Product("product 2", 20, 10);
        knapsack.add(item1);

        Assertions.assertThrows(KnapsackFullException.class, () -> {knapsack.add(item2);} );
    }

    @Test
    public void ShouldAddItemIfAddDoesNotGoOverWieghtLimit() {
        Knapsack knapsack = new Knapsack(30);
        Product item1 = new Product("product 1", 10, 10);
        Product item2 = new Product("product 2", 20, 10);
        knapsack.add(item1);
        knapsack.add(item2);

        List<Product> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);

        Assertions.assertEquals(itemsList, knapsack.getItems() );
    }
}
