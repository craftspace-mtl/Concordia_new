package ca.concordia.java.Class_03;

import java.text.NumberFormat;
import java.util.Locale;

public class currency {

    public static void main(String[] args) {

        double salary = 2310.11;
        NumberFormat n =  NumberFormat.getCurrencyInstance();

        String formattedSalary = n.format(salary);
        System.out.println(formattedSalary);

        double passingGrade = .6;
        NumberFormat p = NumberFormat.getPercentInstance();
        String formattedPercentage = p.format(passingGrade);
        System.out.println(formattedPercentage);

        double gasVolume = 123456.1234;
        NumberFormat g = NumberFormat.getNumberInstance();
        String formattedNumber = g.format(gasVolume);
        g.setMinimumFractionDigits(3);
        System.out.println(formattedNumber);
    }
}
