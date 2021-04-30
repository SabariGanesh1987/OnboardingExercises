package com.epam.java8;

public class RunnableExample implements Runnable {

	public static void main(String[] args) {
		RunnableExample r = new RunnableExample();
		Thread t = new Thread(r);
		t.start();

	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}

}
