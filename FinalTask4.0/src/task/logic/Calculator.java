package task.logic;

import task.model.Matrix;

public class Calculator {
    public static boolean simmetry(Matrix matrix){
        
        boolean check;
        int massage=0;
        int rows = matrix.getCountRows();
        int columns = matrix.getCountColumns();
        
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < columns;j++){
                if(matrix.getElement(i, j)==matrix.getElement(j, i)){
                    massage+=1;
            }
    
        }
        }
        if(massage==rows*columns){
            check=true;
        }
        else check=false;
    
        return check;
}
}