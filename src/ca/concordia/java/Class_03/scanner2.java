package ca.concordia.java.Class_03;

import java.util.Scanner;

public class scanner2 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.println("Please enter the first number ");
        firstNumber = myScanner.nextInt();

        System.out.println("Please enter the second number ");
        secondNumber = myScanner.nextInt();

        System.out.println("Hello, the sum is " + (firstNumber + secondNumber));
    }
}
