package com.wipro.flowcontrol;

public class Ex6 
{
	public static void main(String[] args)
	{
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		if(gender.equals("Female") && age>1 && age<58)
		{
			System.out.println("percentage of interest is 8.2%");
		}
		else if(gender.equals("Female") && age>59 && age<100)
		{
			System.out.println("percentage of interest is 9.2%");
		}
		else if(gender.equals("Male") && age>1 && age<58)
		{
			System.out.println("percentage of interest is 8.4%");
		}
		else if(gender.equals("Male") && age>59 && age<100)
		{
			System.out.println("percentage of interest is 10.5%");
		}
	}
}