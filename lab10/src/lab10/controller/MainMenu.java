package lab10.controller;

import lab10.entity.Chinaman;
import lab10.entity.Market;
import lab10.entity.Product;
import lab10.view.Printer;
import java.util.Scanner;
import org.apache.log4j.Logger;


public class MainMenu {
    private static final Logger LOG;
    
    
    static{
        LOG=Logger.getRootLogger();
    }
    
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        Market Ali= new Market();
        Ali.setNameMarkete("Aliexpress");
        Printer.print(Ali.toString());
        while(true){
            LOG.info("1)Add seller\n"
                    + "2)Add product\n"
                    + "3)Delete seller\n"
                    + "4)Delete Product\n"
                    + "5)Catalog\n"
                    + "6)Exit\n");
            
            int choice=scanner.nextInt();
            
            switch(choice){
                case 1:
                    Ali.addSeller();
                    break;
                case 2:
                    Printer.print(Ali);
                    LOG.info("input name of trader ");
                    int numberOfSellerAdd=scanner.nextInt();
                    Chinaman chinamanAdd=Ali.getSeller(numberOfSellerAdd);
                    chinamanAdd.addProduct();
                    break;
                case 3:
                    Printer.print(Ali);
                    LOG.info("input name of trader ");
                    int numberOfSellerDelete=scanner.nextInt();
                    Ali.deleteSeller(numberOfSellerDelete);
                    break;
                case 4:
                    Printer.print(Ali);
                    LOG.info("input name of trader ");
                    int numberOfSeller=scanner.nextInt();
                    Chinaman chinaman=Ali.getSeller(numberOfSeller);
                    LOG.info("input name of trader ");
                    int numberOfProductDelete=scanner.nextInt();
                    chinaman.deleteProduct(numberOfProductDelete);
                    break;
                case 5:
                    Printer.print(Ali);
                    break;    
                case 6:
                    return;    
                default:
                    LOG.info("Unknown Entry");
                    break;
            }
        }
    }
}
