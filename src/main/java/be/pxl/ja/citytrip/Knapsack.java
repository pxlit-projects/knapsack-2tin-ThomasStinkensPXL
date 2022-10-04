package be.pxl.ja.citytrip;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private double maximumCapacity;
    private List<Attraction> items = new ArrayList<Attraction>();

    public Knapsack(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public double getCurrentWeight(){
        double currentWeight = 0;
        for (Attraction item : items) {
            currentWeight += item.getTime();
        }
        return currentWeight;
    }

    public void add(Attraction attraction) {
        if (getCurrentWeight() + attraction.getTime() > maximumCapacity) {
            throw new KnapsackFullException("Cannot add product [" + attraction.getName() + "]. Item will go over weight limit.");
        } else {
            items.add(attraction);
        }
    }

    public List<Attraction> getItems() {
        return items;
    }
}
