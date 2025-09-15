package com.pm.week1.assign1.Driver;

import java.util.Scanner;

import com.pm.week1.assign1.GradeCalculation;
import com.pm.week1.assign1.MilesConverter;
import com.pm.week1.assign1.LitersConverter;
import com.pm.week1.assign1.CurrencyConverter;

public class DriverMain {

	public static void main(String[] args) {

		GradeCalculation gc = new GradeCalculation();
		
		MilesConverter mc = new MilesConverter();

		LitersConverter lc = new LitersConverter();

		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.println("\nList of Operations:\n1) Grade Calculation\n2) Miles to Kilometers\n3) Liters to Gallons\n4) Currency Conversion");
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("\nEnter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
				case 1:
					System.out.println("\n┌──────────────────────────────┐");
					System.out.println(  "│      Grade Calculation       │");
					System.out.println(  "└──────────────────────────────┘");

					gc.Calculate();
					break;
				case 2:
					System.out.println("\n┌──────────────────────────────┐");
					System.out.println(  "│   Converting Miles to Kms    │");
					System.out.println(  "└──────────────────────────────┘");

					mc.Convert();
					break;
				case 3:
					System.out.println("\n┌──────────────────────────────┐");
					System.out.println(  "│ Converting Liters to Gallons │");
					System.out.println(  "└──────────────────────────────┘");

					lc.Convert();
					break;
				case 4:
					System.out.println("\n┌──────────────────────────────┐");
					System.out.println(  "│    Converting CAD to USD     │");
					System.out.println(  "└──────────────────────────────┘");

					cc.Convert();
					break;
				default:
					System.out.println("\nInvalid choice! Please select a valid option.");
					break;
			}
			
			scanner.close();

		} catch (Exception e) {
			System.out.println("\nError: " + e.getMessage());
		}
	}
}
