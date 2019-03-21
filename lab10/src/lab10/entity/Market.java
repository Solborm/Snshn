package lab10.entity;

import java.util.ArrayList;

public class Market {
    
    private String nameMarkete;
    private ArrayList<Chinaman> catalogMarket;

    public Market() {
        nameMarkete="unknown";
        catalogMarket= new ArrayList();
    }

    public Market(String nameMarkete, ArrayList catalogMarket) {
        this.nameMarkete = nameMarkete;
        this.catalogMarket = catalogMarket;
    }

    

    public Market(Market market) {
        nameMarkete = market.nameMarkete;
        catalogMarket = market.catalogMarket;
    }

    public String getNameMarkete() {
        return nameMarkete;
    }

    public void setNameMarkete(String nameMarkete) {
        this.nameMarkete = nameMarkete;
    }

    public ArrayList getCatalogMarket() {
        return catalogMarket;
    }

    public void setCatalogMarket(ArrayList catalogMarket) {
        this.catalogMarket = catalogMarket;
    }

    
    public void addSeller(){
        Chinaman chinaman=new Chinaman();
        catalogMarket.add(chinaman);
    }
    
    
    public Chinaman getSeller(int number){
        Chinaman chinaman1= catalogMarket.get(number);
        return chinaman1;
    }
    
    public void deleteSeller(int numberOfDeleteElement){
        catalogMarket.remove( numberOfDeleteElement);
    }
    
    
    
    @Override
    public String toString() {
       StringBuilder builder;
       builder = new StringBuilder("\t\t\t\t***Market show " + nameMarkete + "***\nList of available :\n");
       
        for ( int i = 0; i < catalogMarket.size(); i++) {
            
            builder.append(catalogMarket.get(i).toString());
        }
       
       return builder.toString();

    }

   
    
    
    
    
    
}
