package com.epam.java8;

public class Employee implements IEmployee {

	private String name;
	private String account;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, String account, double salary) {
		super();
		this.name = name;
		this.account = account;
		this.salary = salary;
	}

	@Override
	public Employee getEmployeeDetails(String empName, String empAccount, double salary) {
		return new Employee(empName, empAccount, salary);
	}

	public static void main(String[] args) {
		IEmployee employee = Employee::new;
		Employee e = (Employee) employee.getEmployeeDetails("ABC", "XYZBANK", 50000.00);
		System.out.println(e.getName() + " " + e.getAccount() + " " + e.getSalary());
	}

}
