package com.ita.java.threads;

public class OddNumberPrinter extends Thread
{
	@Override
	public void run() {
		System.out.println("Printing odd numbers...");
		for (int i = 1; i <= 100; i++) 
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName() +" ---" +  i);
			i++;
		}
	}
}
