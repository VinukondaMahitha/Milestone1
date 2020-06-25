package com.wipro.Patterns;

public class Ex10 {
public static void main(String[] args) {
	int n=4,c;
	for(int i=1;i<=n;i++)
	{
		c=n;
		for(int s=(n-1);s>=i;s--)
			System.out.print("  ");
		for(int j=1;j<=i;j++)
		{
			System.out.print(c+" ");
			c--;
		}
	System.out.println();
	}
}
}
