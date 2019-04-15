package task5.entity;

public class Garlang extends Product{
    
    public double lenght;
    public String type;
    public double numberOfLight;

    
    public Garlang() {
        lenght=0;
        type="unknown";
        numberOfLight=0;
    }

    public Garlang(double lenght, String type, double numberOfLight, Product product) {
        super(product);
        this.lenght = lenght;
        this.type = type;
        this.numberOfLight = numberOfLight;
    }

    public Garlang(double lenght, String type, double numberOfLight, int weight, double price) {
        super(weight, price);
        this.lenght = lenght;
        this.type = type;
        this.numberOfLight = numberOfLight;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getNumberOfLight() {
        return numberOfLight;
    }

    public void setNumberOfLight(double numberOfLight) {
        this.numberOfLight = numberOfLight;
    }

    @Override
    public String toString() {
        return super.toString()+"Garlang{" + "lenght=" + lenght + ", type=" + type 
                + ", numberOfLight=" + numberOfLight + '}';
    }

    
    
    
   
    
    
}
