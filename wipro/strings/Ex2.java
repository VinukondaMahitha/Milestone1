package com.wipro.strings;
import java.util.*;
public class Ex2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	int l1=s1.length();
	if(s1.charAt(l1-2)==s2.charAt(0))
	{
		System.out.println(s1.toLowerCase()+s2.substring(1).toLowerCase());
	}
	else
	{
		System.out.println(s1.toLowerCase()+" "+s2.toLowerCase());
	}
	
}
}
