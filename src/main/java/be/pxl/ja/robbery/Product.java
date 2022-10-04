package be.pxl.ja.robbery;

public class Product implements Comparable<Product>{
    private String name;
    private int weight;
    private int price;

    public Product(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeigt(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weigt=" + weight +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product product){
        if (this.price > product.getPrice()) {
            return -1;
        } else if (this.price < product.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }
}
