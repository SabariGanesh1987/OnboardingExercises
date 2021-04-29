package com.epam.training;

public enum ListOfDevices {

	FAN("fan", 1), LIGHT("light", 2), TV("tv", 3);

	private final String applianceName;
	private final int unitConsumption;

	ListOfDevices(String applianceName, int unitConsumption) {
		this.applianceName = applianceName;
		this.unitConsumption = unitConsumption;
	}

	public String getApplianceName() {
		return this.applianceName;
	}

	public int getUnitConsumption() {
		return this.unitConsumption;
	}

}
