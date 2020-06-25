package com.wipro.flowcontrol;

public class Ex14 {

public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	boolean c=true;
	if(n==2)
	{
		 System.out.println("Prime");
	}
	else if(n==0 || n==1)
	{
		System.out.println(n+"is neither prime nor composite");
	}
	else if(n%2==0)
	{
		System.out.println("Not Prime");
	}
	else
	{
		for(int i=3;i*i<=n;i+=2)
		{
			if(n%i==0)
				c=false;
		}
		if(c==false)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
	}
}
}