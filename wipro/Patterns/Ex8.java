package com.wipro.Patterns;

public class Ex8 {
public static void main(String[] args) {
	int n=5,c;
	for(int i=1;i<=n;i++)
	{
		c=n;
		for(int j=n;j>=i;j--)
		{
			System.out.print(c);
			c--;
		}
		System.out.println();
	}
}
}
