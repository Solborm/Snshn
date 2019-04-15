package lab10.entity;

public class Table extends Product {
    
    private int weight;
    private String material;

    public Table() {
        weight=0;
        material="unknown";
    }

    public Table(int weight, String material, Product product) {
        super(product);
        this.weight = weight;
        this.material = material;
    }

    public Table(int weight, String material, String type, double price, String style, String color, String parametr) {
        super(type, price, style, color, parametr);
        this.weight = weight;
        this.material = material;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString()+"Table{" + "weight=" + weight 
                + ", material=" + material + '}';
    }
    
    
    
    
    
}
