package task5.entity;

import java.util.ArrayList;

public class ChristmasTree {
    
    private double height;
    private String form;
    private String collor;
    private double price;
    private int weight;
    private ArrayList<Product> decorations;
    
    
    public ChristmasTree() {
        height=0;
        form="unknown";
        collor="unknown";
        price=0;
        weight=0;
        decorations= new ArrayList();
    }

    public ChristmasTree(ChristmasTree christmasTree) {
        height = christmasTree.height;
        form = christmasTree.form;
        collor = christmasTree.collor;
        price = christmasTree.price;
        weight=christmasTree.weight;
        decorations=christmasTree.decorations;
    }   
    
    
    public ChristmasTree(double height, String form, String collor, double price,int weight,  ArrayList decorations ) {
        this.height = height;
        this.form = form;
        this.collor = collor;
        this.price = price;
        this.weight= weight;
        this.decorations=decorations;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    

    public ArrayList<Product> getDecorations() {
        return decorations;
    }

    public void setDecorations(ArrayList<Product> decorations) {
        this.decorations = decorations;
    }
    
    public void addProduct(Product product){
        decorations.add(product);
    }

    @Override
    public String toString() {
        return "ChristmasTree{" + "height=" + height + ", form=" + form 
                + ", collor=" + collor + ", price=" + price 
                + ", weight=" + weight + ", decorations=" + decorations + '}';
    }
    
    
    
    
    
}
