package com.wipro.flowcontrol;

public class Ex12 {
	static int prime(int n)
	{
		if(n==2)
		{
			return 1;
		}
		else if(n%2==0)
		{
			return 0;
		}
		else
			
		{
			for(int i=3;i*i<=n;i+=2)
			{
				if(n%i==0)
					return 0;
			}
		}
		return 1;
	}
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	if(prime(a)==1)
	{
	System.out.println("Prime");
	}
	else
	{
		System.out.println("Not prime");
	}
}
}
