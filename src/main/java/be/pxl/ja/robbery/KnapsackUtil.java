package be.pxl.ja.robbery;

import java.util.Collections;
import java.util.List;

public class KnapsackUtil {
    public static void fill(Knapsack knapsack, Shop shop) {
        Collections.sort(shop.getItems());

        for (Product item : shop.getItems()) {
            try {
                knapsack.add(item);
            }  catch (KnapsackFullException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
