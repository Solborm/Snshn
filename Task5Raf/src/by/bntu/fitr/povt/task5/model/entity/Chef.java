package by.bntu.fitr.povt.task5.model.entity;

import java.util.Arrays;

public class Chef {
    private String name;
    private Product[] salt;

    public Chef() {
        name="unknown";
        salt=new Product[0];
    }
    
    public Chef(String name, Product[] salt) {
        this.name = name;
        this.salt = salt;
    }
    
    public Chef(Chef chif) {
        name = chif.name;
        salt=Arrays.copyOf(chif.salt, chif.salt.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getSalt() {
        return salt;
    }

    public void setSalt(Product[] salt) {
        this.salt = salt;
    }
    
    public Product get(int index){
        return salt[index];
    }
    
    public void add(Product product){ 
        salt = Arrays.copyOf(salt, salt.length + 1);
        salt[salt.length - 1] = product;
    }
    
    public int size(){
        return salt.length;
    }
    
    @Override
    public String toString() {
        StringBuilder builder;
        builder = new StringBuilder(name + "\n");
       
        for (Product ingredient : salt) {
            builder.append(ingredient.toString()).append("\n");
        }
       
       return builder.toString();
    }
    
    
    
}
