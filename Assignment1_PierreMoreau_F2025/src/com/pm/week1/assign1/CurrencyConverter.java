package com.pm.week1.assign1;

import java.util.Scanner;

public class CurrencyConverter {

    private double exchangeRate = 0.72; // Exchange rate from CAD to USD as of 2025-09-10

    public void Convert() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nEnter CAD amount: $");
        double cad = scanner.nextDouble();

        double usd = cad * exchangeRate;
        System.out.printf("\n$%.2f CAD is converted to $%.2f USD.\n", cad, usd);

        scanner.close();
    }
}
