package com.wipro.strings;
import java.util.*;
class Test7
{
	String method(String s1)
	{
		if(s1.charAt(0)=='x' && s1.charAt(s1.length()-1)=='x')
		{
			return(s1.substring(1,s1.length()-1));
		}
		else
			return(s1);
	}
}
public class Ex7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	Test7 t=new Test7();
	System.out.println(t.method(s1));
		
}
}
