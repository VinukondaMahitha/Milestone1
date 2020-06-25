package com.wipro.flowcontrol;

public class Ex1B {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
		System.out.println(a%10==7 && b%10==7);
}
}