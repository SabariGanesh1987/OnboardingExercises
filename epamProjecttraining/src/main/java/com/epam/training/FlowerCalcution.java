package com.epam.training;

import java.util.Scanner;

public class FlowerCalcution {

	public static void main(String[] args) {

		String[] flowers = { "rose", "lilly", "jasmine" };
		FlowerImpl flowercalculator;
		double totalCost = 0;

		for (String flower : flowers) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter No of units for the " + flower + " flower ::");
			int units = sc.nextInt();
			flowercalculator = new FlowerImpl(flower, units);
			totalCost += flowercalculator.getFlowerPrice(flower);
		}

		System.out.println("Total Cost:::" + totalCost);

	}

}
 