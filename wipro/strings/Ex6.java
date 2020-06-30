package com.wipro.strings;
import java.util.*;
class Test
{
	String method(String s1,String s2)
	{
		if(s1.length()>s2.length())
		{
			return(s2+s1+s2);
		}
		else
		{
			return(s1+s2+s1);
		}
	}
}
public class Ex6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		Test t=new Test();
		System.out.println(t.method(s1, s2));
	}

}
