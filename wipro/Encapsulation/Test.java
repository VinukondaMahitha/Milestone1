package com.wipro.Encapsulation;

class Author {
String name,email;
char gender;
Author(String name,String email,char gender)
{
	this.name=name;
	this.email=email;
	this.gender=gender;
}
}
class Book
{
	String name;
	double price;
	int qtyInStock;
	Author a;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setprice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	public void setqtyInStock(int qtyInStock)
	{
		this.qtyInStock=qtyInStock;
	}
	public int getqtyInStock()
	{
		return qtyInStock;
	}
	public void setAuthor(Author a)
	{
		this.a=a;
	}
	public String getAuthor()
	{
		String g="Details of Author:\nName: "+a.name+"\nEmail: "+a.email+"\nGender: "+a.gender;
		return g;
	}
}
	public class Test
	{
		public static void main(String[] args)
		{
			Book b=new Book();
			Author a=new Author("hf","dg@yshg",'f');
			b.setName("okiuj");
			b.setprice(925630);
			b.setqtyInStock(52);
			b.setAuthor(a);
			System.out.println("Details of book:\nName: "+b.getName()+"\nPrice: "+b.getPrice()+"\nQantity in stock: "+b.getqtyInStock()+"\n"+b.getAuthor());
			
			
		}
	
}
