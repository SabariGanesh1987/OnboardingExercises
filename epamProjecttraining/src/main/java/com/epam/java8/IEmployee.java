package com.epam.java8;

@FunctionalInterface
public interface IEmployee {
	
	Employee getEmployeeDetails(String empName, String empAccount, double salary);

}
