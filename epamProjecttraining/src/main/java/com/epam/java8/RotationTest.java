package com.epam.java8;

public class RotationTest {

	public static void main(String[] args) {
		Rotation obj;
		obj = (s1, s2) -> {
			return (s1.length() == s2.length()) && ((s1 + s1).indexOf(s2) != -1);
		};

		System.out.println(obj.AreRotation("AACD", "ACDA"));
	}
	
	interface Rotation{
		public boolean AreRotation(String s1, String s2);
	}

}
