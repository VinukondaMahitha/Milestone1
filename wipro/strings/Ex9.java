package com.wipro.strings;
import java.util.*;
public class Ex9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	String s3="";
	if(s1.length()>s2.length())
	{
	for(int i=0;i<s2.length();i++)
	{
		s3=s3+s1.charAt(i)+s2.charAt(i);
	}
		s3=s3+s1.substring(s2.length());
	}
	else
	{
		for(int i=0;i<s1.length();i++)
		{
			s3=s3+s1.charAt(i)+s2.charAt(i);
		}
			s3=s3+s2.substring(s1.length());
	}
	System.out.println(s3);
		
}
}
