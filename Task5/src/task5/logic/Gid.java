package task5.logic;

import task5.entity.ChristmasTree;
import task5.entity.Flashlights;
import task5.entity.Garlang;
import task5.entity.Product;
import task5.entity.Toys;
import java.util.ArrayList;

public class Gid {
    
    public static int totalWeight(ChristmasTree christmasTree){
        int finalWeight=0;
        
        if(christmasTree==null)    
            return finalWeight;
        
        ArrayList<Product> total=christmasTree.getDecorations();
        finalWeight=(int) christmasTree.getWeight();
        for(int i=0;i<total.size();i++){
            finalWeight+=total.get(i).getWeight();
        }
        return finalWeight;
    }
    
    public static int totalPrice(ChristmasTree christmasTree){
        
        int finalPrice=0;
        
        if(christmasTree==null)    
            return finalPrice;
        
        ArrayList<Product> total=christmasTree.getDecorations();
        finalPrice=(int)christmasTree.getPrice();
        for(int i=0;i<total.size();i++){
            finalPrice+=total.get(i).getPrice();
        }
        return finalPrice;
    }
    
    public static int maxPrice(ChristmasTree christmasTree){
        
        int max=0;
        
        if(christmasTree==null)    
            return max;
        
        ArrayList<Product> total=christmasTree.getDecorations();
        max=(int)total.get(0).getPrice();
        for(int i=1;i<total.size();i++){
            if(max<total.get(i).getPrice())
                max=(int)total.get(i).getPrice();
        }
        return max;
    }
    
}
