package be.pxl.ja.citytrip;

import be.pxl.ja.robbery.Product;

import java.util.Collections;

public class KnapsackUtil {
    public static void fill(Knapsack knapsack, LondonAttractions londonAttractions) {
        Collections.sort(londonAttractions.getItems());

        for (Attraction attraction : londonAttractions.getItems()) {
            try {
                knapsack.add(attraction);
            }  catch (KnapsackFullException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
