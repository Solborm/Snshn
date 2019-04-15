package task5.entity;

public class Toys extends Product{
    
    private String type;
    private String material;

    public Toys() {
        type="unknown";
        material="unknown";
    }

    public Toys(String type, String material, Product product) {
        super(product);
        this.type = type;
        this.material = material;
    }

    public Toys(String type, String material, int weight, double price) {
        super(weight, price);
        this.type = type;
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString()+"Toys{" + "type=" + type 
                + ", material=" + material + '}';
    }
    
    
    
}
