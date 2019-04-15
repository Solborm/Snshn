package task5.entity;

public class Product {
    
    private int  weight;
    private double price;

    
    public Product() {
         weight=0;
         price=0;
    }

    public Product(Product product) {
        weight = product.weight;
        price = product.price;
    }
    
    public Product(int weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "weight=" + weight + ", price=" + price + '}';
    }
    
    
    
    
}
