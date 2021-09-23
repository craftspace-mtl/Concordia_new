package ca.concordia.java.Class_03;

import java.text.NumberFormat;
import java.util.Scanner;

public class class4ex {

    public static void main(String[] args) {

        double gst = 0.05;
        double qst = 0.09975;

        Scanner sc = new Scanner(System.in);
        double totalPrice;
        double subTotal;
        double itemPrice;
        int itemsQuantity;
        String formattedPrice;

        System.out.println("Please enter the price: (double)");
        itemPrice = sc.nextDouble();

        System.out.println("Please enter the quantity of the items purchased: (int)");
        itemsQuantity = sc.nextInt();

        subTotal = itemPrice * itemsQuantity;

        totalPrice = subTotal + (subTotal * gst) + (subTotal * qst);

        formattedPrice = NumberFormat.getNumberInstance().format(totalPrice);


        System.out.println("Thank you, the total is " + formattedPrice);

    }
}
