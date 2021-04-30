package com.epam.java8;

import java.util.List;

@FunctionalInterface
public interface ICalculateCostofProducts {
	public double calculate(List<Product> prodList);
}
