package lab10.controller;

import lab10.entity.Chinaman;
import lab10.entity.Market;
import lab10.entity.Product;
import lab10.view.Printer;
import java.util.Scanner;


public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Market Ali= new Market();
        Ali.setNameMarkete("Aliexpress");
        Printer.print(Ali.toString());
        while(true){
            System.out.print("1)Add seller"
                    + "2)Add product"
                    + "3)Delete seller"
                    + "4)Delete Product"
                    + "5)Catalog"
                    + "6)Exit");
            
            int choice=scanner.nextInt();
            
            switch(choice){
                case 1:
                    Ali.addSeller();
                    break;
                case 2:
                    Printer.print(Ali);
                    System.out.print("Введите номер продовца ");
                    int numberOfSellerAdd=scanner.nextInt();
                    Chinaman chinamanAdd=Ali.getSeller(numberOfSellerAdd);
                    chinamanAdd.addProduct();
                    break;
                case 3:
                    Printer.print(Ali);
                    System.out.print("Введите номер продовца ");
                    int numberOfSellerDelete=scanner.nextInt();
                    Ali.deleteSeller(numberOfSellerDelete);
                    break;
                case 4:
                    Printer.print(Ali);
                    System.out.print("Введите номер продовца ");
                    int numberOfSeller=scanner.nextInt();
                    Chinaman chinaman=Ali.getSeller(numberOfSeller);
                    System.out.print("Введите номер продукта ");
                    int numberOfProductDelete=scanner.nextInt();
                    chinaman.deleteProduct(numberOfProductDelete);
                    break;
                case 5:
                    Printer.print(Ali);
                    break;    
                case 6:
                    return;    
                default:
                    System.out.println("Unknown Entry");
                    break;
            }
        }
    }
}
