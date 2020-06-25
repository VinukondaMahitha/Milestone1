package com.wipro.flowcontrol;

public class Ex19 
{
	public static void main(String[] args) 
	{
		int c=0;
		for(int i=2;i<200;i++)
		{
			if(i%2==0 && i%3==0 && i%5==0)
			{
				System.out.println(i);
				c=c+1;
				if(c==5)
				{
					break;
				}
			}
		}
	}
}