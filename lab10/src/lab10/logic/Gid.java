package lab10.logic;


import java.util.ArrayList;
import java.util.Collections;
import lab10.entity.Chinaman;
import lab10.entity.Market;
import lab10.entity.Product;
import lab10.view.Printer;

public class Gid {
    
    
    public static int totalPrice(Chinaman chinaman){
        
        int finalPrice=0;
        
        if(chinaman==null)    
            return finalPrice;
        
        ArrayList<Product> total=chinaman.getCatalog();
        finalPrice=0;
        for(int i=0;i<total.size();i++){
            finalPrice+=(int)total.get(i).getPrice();
        }
        return finalPrice;
    }
    
    public static int maxPrice(Chinaman chinaman){
        
        int max=0;
        
        if(chinaman==null)    
            return max;
        
        ArrayList<Product> total=chinaman.getCatalog();
        max=(int)total.get(0).getPrice();
        for(int i=1;i<total.size();i++){
            if(max<total.get(i).getPrice())
                max=(int)total.get(i).getPrice();
        }
        return max;
    }
    

    
    public static void sortAll(ArrayList catalog){
        Collections.sort(catalog);
    }
    
    public static void searchProduct(String typeProduct, Market market){
        ArrayList ct=market.getCatalogMarket();
        for(int i=0;i<ct.size();i++){
            Chinaman chinaman=market.getSeller(i);
            ArrayList ctChinaman=chinaman.getCatalog();
            for(int j=0;j<ctChinaman.size();j++){
                Product product=chinaman.getSeller(j);
                String type=product.getType();
                if(type.equals(typeProduct))
                    Printer.print(chinaman);
            }
        }
            
    }
    
}

