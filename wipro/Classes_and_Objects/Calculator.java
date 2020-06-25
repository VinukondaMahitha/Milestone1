package com.wipro.Classes_and_Objects;

public class Calculator {
	
	static int powerInt(int num1,int num2)
	{
		return (int)Math.pow(num1, num2);
	}
	static double powerDouble(double num1,double num2)
	{
		return Math.pow(num1, num2);
	}
	public static void main(String[] args) 
	{
		System.out.println(powerInt(12,2));
		System.out.println(powerDouble(12,2));
		
	}
}
