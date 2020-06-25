package com.wipro.flowcontrol;

public class Ex2 
{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if((a & 1) == 0) {
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}