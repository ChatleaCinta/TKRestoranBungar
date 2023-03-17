/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restoranbungar;

/**
 *
 * @author Windows 10
 */
import java.io.IOException;
import java.util.Scanner;

public class RestoranBungar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numofpeeps;
        String name = null;
        double price_food1 = 9999.99,
               price_food2 = 12345.67,
               price_food3 = 21108.40,
               price_food4 = 13579.13,
               price_food5 = 98765.43;
        
        System.out.println("Welcome to Bungar Restaurant");
        //add person
        System.out.print("Number of people: ");
        numofpeeps = input.nextInt();
        System.out.print("Order on behalf of: ");
        name = input.next();
        
        //list of menu
        System.out.println("Today's Special Menu");
        System.out.println("====================");
        System.out.println("1. Special Fried Rice       @ IDR " + price_food1);
        System.out.println("2. Special Grilled Chicken  @ IDR " + price_food2);
        System.out.println("3. Special Sirloin Steak    @ IDR " + price_food3);
        System.out.println("4. Special Poured Kwetiau   @ IDR " + price_food4);
        System.out.println("5. Special Grilled Goat     @ IDR " + price_food5);
        System.out.println("");
        
        //add order
        System.out.println("Your Order [order limit 0-10 PO]");
        System.out.print("Special Fried Rice        = ");
        int a = input.nextInt();
        System.out.print("Special Grilled Chicken   = ");
        int b = input.nextInt();
        System.out.print("Special Sirloin Steak     = ");
        int c = input.nextInt();
        System.out.print("Special Poured Kwetiau    = ");
        int d = input.nextInt();
        System.out.print("Special Grilled Goat      = ");
        int e = input.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("Enjoy your meal...");
        System.out.println("");
        
        //processing order
        double M1 = (a * price_food1);
        double M2 = (b * price_food2);
        double M3 = (c * price_food3);
        double M4 = (d * price_food4);
        double M5 = (e * price_food5);
        double total = M1 + M2 + M3 + M4 + M5;
        double discon = total*10/(float)100;
        double pay = total - discon;
        double purchase = pay/numofpeeps;
        
        //purchase and count
        System.out.println("Purchase: ");
        System.out.printf("\n1. Special Fried Rice          %d Portion * 9999.99    = IDR " + M1,a);
        System.out.printf("\n2. Special Grilled Chicken     %d Portion * 12345.67   = IDR " + M2,b);
        System.out.printf("\n3. Special Sirloin Steak       %d Portion * 21108.40   = IDR " + M3,c);
        System.out.printf("\n4. Special Poured Kwetiau      %d Portion * 13579.13   = IDR " + M4,d);
        System.out.printf("\n5. Special Grilled Goat        %d Portion * 98765.43   = IDR " + M5,e);
        System.out.println("\t+");
        System.out.println("===========================================================================");
        System.out.println("Purchase Total                                        = IDR " + total);
        System.out.println("Disc 10 x (Promotion Period)                          = IDR " + discon + "\t-");
        System.out.println("===========================================================================");
        System.out.println("Purchase Total after Discon 10 x                      = IDR " + pay + "\t-");
        System.out.println("Purchase per person                                   = IDR " + purchase + "\t-");
        System.out.println("                  Thank you for your visit                 ");
        System.out.println("                  Click ENTER to exit                      ");
        System.exit(0);
        //return;
    }
    
}
