package com.epam.training;

import java.util.Scanner;

public class CalulatePowerConsumption {

	public static void main(String[] args) {
		IHomeElectronicAppliances homeElectronicAppliances;
		int totalLoad = 0;
		
		for (ListOfDevices appliance : ListOfDevices.values()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter No of "+appliance.getApplianceName() +" 's in Home:::");
			int noofAppliances = sc.nextInt();
			homeElectronicAppliances = new HomeElectronicAppliancesImpl(appliance.getApplianceName(), noofAppliances);
			totalLoad = totalLoad + homeElectronicAppliances.powerConsumption(appliance.getApplianceName());
		}
		
		System.out.println(totalLoad);
		

	}
}

