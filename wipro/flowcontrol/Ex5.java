package com.wipro.flowcontrol;

public class Ex5
{
	public static void main(String[] args) {
		char a1='-';
		if((a1>=65 && a1<=90)|| (a1>=97 && a1<=127))
			System.out.println("Alphabet");
		else if (a1>=48 && a1<=57)
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}
}
