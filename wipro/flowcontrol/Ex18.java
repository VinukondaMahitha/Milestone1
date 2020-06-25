package com.wipro.flowcontrol;

public class Ex18 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	int r,temp,t=0;
	temp=n;
	while(n!=0)
	{
		t=(t*10)+(n%10);
		n=n/10;
	}
	if(temp==t)
	{
		System.out.println(temp+" is a palindrome");
	}
	else
	{
		System.out.println(temp+" is not a palindrome");
	}
}
}