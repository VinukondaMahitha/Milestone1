package com.wipro.exception_handling;

class InvalidCountryException  extends Throwable
{
	InvalidCountryException(String s) 
	{
		super();
		System.out.println(s);
	}
}
public class UserRegistration
{
	public static void main(String[] args) throws Exception,InvalidCountryException {
		UserRegistration ur=new UserRegistration();
		ur.registerUser("Mickey","India");
		
	}
	void registerUser(String username,String userCountry) throws Exception, InvalidCountryException
	{
		if(!userCountry.equals("India"))
		{
			throw new InvalidCountryException("User outside India cannot be registered");
		}
		else
		{
			throw new InvalidCountryException("User registration done successfully");
		}
	}
}