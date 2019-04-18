
package by.bntu.fitr.povt.task5.model.entity;

public class Potato extends Product{
    
    private int age;

    public Potato() {
        age =0;
    }

    public Potato(int age, int weight, int calories) {
        super(weight, calories);
        this.age = age;
    }

    public Potato(int age, Product product) {
        super(product);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Potato{" + "age=" + age + '}';
    }
    
    
}
