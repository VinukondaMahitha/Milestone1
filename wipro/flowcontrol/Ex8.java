package com.wipro.flowcontrol;

public class Ex8 {
public static void main(String[] args) {
	String a=args[0];
	char s=a.charAt(0);
	switch(s)
	{
	case 'R':
		System.out.println("Red");
		break;
	case 'B':
		System.out.println("Blue");
		break;
	case 'G':
		System.out.println("Green");
		break;
	case 'Y':
		System.out.println("Yellow");
		break;
	case 'O':
		System.out.println("Orange");
		break;
	case 'W':
		System.out.println("White");
		break;
	default :
		System.out.println("Invalid Code");
	}
}
}