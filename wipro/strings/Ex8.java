package com.wipro.strings;
import java.util.*;
class Test8
{
	int j=0;
	String method(String s1)
	{
		for(int i=0;i<s1.length()-1;i++)
		{
			if(i==0 && s1.charAt(0)=='*')
			{
				s1=s1.substring(2);
			}
			else
			{
				j=s1.indexOf('*');
				s1=s1.substring(0,j-2)+s1.substring(j+2);
			}
		}
		return s1;
	}
}
public class Ex8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	Test8 t=new Test8();
	System.out.println(t.method(s));
}
}
