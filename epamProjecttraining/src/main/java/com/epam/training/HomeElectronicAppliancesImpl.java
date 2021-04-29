package com.epam.training;

public class HomeElectronicAppliancesImpl implements IHomeElectronicAppliances {

	String deviceName;
	int noOfappliances;

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public HomeElectronicAppliancesImpl() {
	}

	public HomeElectronicAppliancesImpl(String deviceName, int noOfappliances) {
		this.deviceName = deviceName;
		this.noOfappliances = noOfappliances;
	}

	@Override
	public int powerConsumption(String applianceName) {
		int applianceConsumption = 0;
		switch (applianceName.toLowerCase()) {
		case "fan":
			applianceConsumption = this.noOfappliances * 1;
			break;
		case "light":
			applianceConsumption = this.noOfappliances * 2;
			break;
		case "tv":
			applianceConsumption = this.noOfappliances * 3;
			break;
		}
		return applianceConsumption;
	}

}
