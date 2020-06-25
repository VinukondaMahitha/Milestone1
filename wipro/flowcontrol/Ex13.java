package com.wipro.flowcontrol;

public class Ex13 {
public static void main(String[] args) {
	int c=0;
	for(int i=10;i<=99;i++)
	{
		c=0;
		for(int j=2;j*j<=i;j++)
		{
			if(i%j==0)
			{
				c=c+1;
			}
		}
		if(c==0)
			System.out.println(i+" ");
			
	}
}
}