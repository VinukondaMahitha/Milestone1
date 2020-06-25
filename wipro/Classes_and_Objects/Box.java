package com.wipro.Classes_and_Objects;

public class Box {
	double width,height,depth;
	Box(double width,double height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;	
	}
	double volume()
	{
		return width*height*depth;
	}
	public static void main(String[] args)
	{
		Box b= new Box(1,2,3);
		System.out.println(b.volume());
		
	}
}
