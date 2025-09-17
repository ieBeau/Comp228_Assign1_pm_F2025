package com.pm.week1.assign1;

import java.util.Scanner;

public class MilesConverter {

    private double conversion = 1.60934;

    public void Convert() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nEnter miles: ");
        int miles = scanner.nextInt();

        double kilometers = miles * conversion;
        System.out.printf("\n%d miles = %.2f kilometers\n", miles, kilometers);

        scanner.close();
    }
}
