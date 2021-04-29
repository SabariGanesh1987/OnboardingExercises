package com.epam.training;

public class FlowerImpl implements Flower {

	String flowerName;
	int units;
	double unitprice;

	public String getFlowerName() {
		return flowerName;
	}

	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public FlowerImpl(String flowerName, int units) {
		super();
		this.flowerName = flowerName;
		this.units = units;
	}

	@Override
	public double getFlowerPrice(String flowerName) {
		return getFlowerCost(flowerName);
	}
	
	public double getFlowerCost(String flowerName) {
		double flowerCost = 0;
		switch(flowerName.toLowerCase()) {
		case "rose": 
			flowerCost =this.units*1;
			break;
		case "lilly":
			flowerCost = this.units*3;
			break;
		case "jasmine":
			flowerCost = this.units*2;
			break;
		}
		
		return flowerCost;
		
	}
	

}
