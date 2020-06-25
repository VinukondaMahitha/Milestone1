package com.wipro.flowcontrol;

public class Ex15 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	int i;
	for(i=0;n>0;n=n/10)
	{
		i=i+(n%10);
	}
	System.out.println(i);
}
}