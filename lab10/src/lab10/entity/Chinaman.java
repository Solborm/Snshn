package lab10.entity;

import java.util.ArrayList;

public class Chinaman {

    private String name;
    private String godOfBirth;
    private String sex;
    private String comment;
    private ArrayList<Product> catalog;

    
    public Chinaman(){
        name="no name";
        godOfBirth="unknown";
        sex="unknown";
        comment="no comment";
        catalog= new ArrayList();
    }

    public Chinaman(String name, String godOfBirth, String sex, String comment, ArrayList catalog) {
        this.name = name;
        this.godOfBirth = godOfBirth;
        this.sex = sex;
        this.comment = comment;
        this.catalog = catalog;
    }
    
    
    
    
    public Chinaman(Chinaman chinaman){
        name=chinaman.name;
        godOfBirth=chinaman.godOfBirth;
        sex=chinaman.sex;
        comment=chinaman.comment;
        catalog=chinaman.catalog;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGodOfBirth() {
        return godOfBirth;
    }

    public void setGodOfBirth(String godOfBirth) {
        this.godOfBirth = godOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ArrayList getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList catalog) {
        this.catalog = catalog;
    }

    public void addProduct(){
        Product product=new Product();
        catalog.add(product);
    }
    
    public void deleteProduct(int numberOfDeleteElement){
        catalog.remove( numberOfDeleteElement);
    }
    
    
    public Product getSeller(int number){
        Product product= catalog.get(number);
        return product;
    }
    
    @Override
    public String toString() {
       StringBuilder builder;
       builder = new StringBuilder("\t\t\t\t***Seller " + name);
       
        for ( int i = 0; i < catalog.size(); i++) {
            
            builder.append(catalog.get(i).toString());
        }
       
       return builder.toString();
    }
    
    
    
}
