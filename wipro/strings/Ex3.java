package com.wipro.strings;
import java.util.*;
public class Ex3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	String b="";
	
	for(int i=0;i<s.length();i++)
	{
		b=b+s.substring(0,2);
	}
	System.out.println(b);
}
}
