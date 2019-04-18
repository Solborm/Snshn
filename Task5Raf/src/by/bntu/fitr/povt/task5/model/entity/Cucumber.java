
package by.bntu.fitr.povt.task5.model.entity;

public class Cucumber extends Product{
    
    private int size;

    public Cucumber() {
        size =0;
    }

    public Cucumber(int size, int weight, int calories) {
        super(weight, calories);
        this.size = size;
    }

    public Cucumber(int size, Product product) {
        super(product);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cucumber{" + "size=" + size + '}';
    }
    
    
}
