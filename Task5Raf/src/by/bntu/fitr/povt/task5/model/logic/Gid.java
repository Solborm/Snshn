
package by.bntu.fitr.povt.task5.model.logic;

import by.bntu.fitr.povt.task5.model.entity.Chef;
import by.bntu.fitr.povt.task5.model.entity.Cucumber;
import by.bntu.fitr.povt.task5.model.entity.Onion;
import by.bntu.fitr.povt.task5.model.entity.Potato;
import by.bntu.fitr.povt.task5.model.entity.Product;
import by.bntu.fitr.povt.task5.model.entity.Tomato;

public class Gid {
    
    public static int totalWeightSalt(Chef chef){
        int finalWeight=0;
        
        if(chef==null)    
            return finalWeight;
        
        Product[] total=chef.getSalt();
        for(int i=0;i<total.length;i++){
            finalWeight+=total[i].getWeight();
        }
        return finalWeight;
    }
    
    public static int totalCaloriesSalt(Chef chef){
        int finalCalories=0;
        
        if(chef==null)    
            return finalCalories;
        
        Product[] total=chef.getSalt();
        for(int i=0;i<total.length;i++){
            finalCalories+=total[i].getCalories();
        }
        return finalCalories;
    }
}
