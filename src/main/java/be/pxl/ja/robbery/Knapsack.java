package be.pxl.ja.robbery;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private int maximumCapacity;
    private List<Product> items = new ArrayList<Product>();

    public Knapsack(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public int getCurrentWeight(){
        int currentWeight = 0;
        for (Product item : items) {
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }

    public void add(Product item) {
        if (getCurrentWeight() + item.getWeight() > maximumCapacity) {
            throw new KnapsackFullException("Cannot add product [" + item.getName() + "]. Item will go over weight limit.");
        } else {
            items.add(item);
        }
    }

    public List<Product> getItems() {
        return items;
    }
}
