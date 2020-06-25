package com.wipro.Patterns;

public class Ex4 {
public static void main(String[] args) {
	int n=5,b=n;;
	for(int i=1;i<=n;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(b);
			
		}
		System.out.println();
		b--;
	}
}
}
