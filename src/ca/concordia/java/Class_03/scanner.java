package ca.concordia.java.Class_03;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String firstname;
        String lastname;

        System.out.println("Please enter your name ");
        firstname = myScanner.nextLine();

        System.out.println("Please enter your lastname ");
        lastname = myScanner.nextLine();

        System.out.println("Hello, " + firstname + " " + lastname);
    }
}
