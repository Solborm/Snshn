package task5.entity;

public class Flashlights extends Product {
    
    private double power;
    private double collor;

    public Flashlights() {
        power=0;
        collor=0;
    }

    public Flashlights(double power, double collor, Product product) {
        super(product);
        this.power = power;
        this.collor = collor;
    }

    public Flashlights(double power, double collor, int weight, double price) {
        super(weight, price);
        this.power = power;
        this.collor = collor;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getCollor() {
        return collor;
    }

    public void setCollor(double collor) {
        this.collor = collor;
    }

    @Override
    public String toString() {
        return super.toString()+"Flashlights{" + "power=" + power 
                + ", collor=" + collor + '}';
    }
    
    
    
    
    
}
