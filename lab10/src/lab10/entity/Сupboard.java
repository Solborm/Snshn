package lab10.entity;

public class Сupboard extends Product{
    
    public double lenght;
    public double volume;

    public Сupboard() {
        
    }

    public Сupboard(double lenght, double volume, Product product) {
        super(product);
        this.lenght = lenght;
        this.volume = volume;
    }

    public Сupboard(double lenght, double volume, String type, double price, String style, String color, String parametr) {
        super(type, price, style, color, parametr);
        this.lenght = lenght;
        this.volume = volume;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString()+"Table{" + "lenght=" + lenght + ", volume=" + volume + '}';
    }
    
    
    
}
