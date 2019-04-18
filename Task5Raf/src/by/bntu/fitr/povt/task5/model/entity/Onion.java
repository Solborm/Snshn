
package by.bntu.fitr.povt.task5.model.entity;

public class Onion extends Product{
    
    private String color;

    public Onion() {
        color="unknown";
    }

    public Onion(String color, int weight, int calories) {
        super(weight, calories);
        this.color = color;
    }

    public Onion(String color, Product product) {
        super(product);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Onion{" + "color=" + color + '}';
    }
    
    
}
