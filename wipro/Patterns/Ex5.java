package com.wipro.Patterns;

public class Ex5 {
public static void main(String[] args) {
	int n=5,b;
	for(int i=1;i<=n;i++)
	{
		b=n;
		for(int j=1;j<=i;j++)
		{
			System.out.print(b);
			b--;
		}
		System.out.println();
	}
}
}
