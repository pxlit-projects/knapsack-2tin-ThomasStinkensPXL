package be.pxl.ja.citytrip;

public class Attraction implements Comparable {
    private String name;
    private double time;
    private int rating;

    public Attraction(String name, double weight, int price) {
        this.name = name;
        this.time = weight;
        this.rating = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", rating=" + rating +
                '}';
    }
    
    @Override
    public int compareTo(Object attraction) {
        if (this.rating > ((Attraction)attraction).getRating()) {
            return -1;
        } else if (this.rating < ((Attraction)attraction).getRating()) {
            return 1;
        } else {
            return 0;
        }
    }
}
