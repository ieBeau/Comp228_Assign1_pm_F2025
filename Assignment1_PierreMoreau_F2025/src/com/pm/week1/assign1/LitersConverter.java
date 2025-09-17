package com.pm.week1.assign1;

import java.util.Scanner;

public class LitersConverter {

    private double conversion = 0.264172;

    public void Convert() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nEnter liters: ");
        int liters = scanner.nextInt();

        double gallons = liters * conversion;
        System.out.printf("\n%d liters = %.2f gallons\n", liters, gallons);

        scanner.close();
    }
}
