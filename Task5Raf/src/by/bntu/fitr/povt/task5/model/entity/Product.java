
package by.bntu.fitr.povt.task5.model.entity;

public class Product {
    
    private int weight;
    private int calories;

    //дефалтный конструтор
    public Product() {
        weight=0;
        calories=0;
    }
    
    public Product(int weight, int calories) {
        this.weight = weight;
        this.calories = calories;
    }
    
    //конструктор копировния
    public Product(Product product) {
        weight = product.weight;
        calories = product.calories;
    }
   
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Product{" + "weight=" + weight + ", calories=" + calories + '}';
    }
    
    
    
    
}
