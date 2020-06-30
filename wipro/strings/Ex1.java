package com.wipro.strings;
import java.util.*;


public class Ex1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	StringBuffer sb=new StringBuffer(s);
	String b=(sb.reverse()).toString();
	if(b.equals(s))
		System.out.println("palindrome");
	else
		System.out.println("Not plaindrome");
	
	
}
}
