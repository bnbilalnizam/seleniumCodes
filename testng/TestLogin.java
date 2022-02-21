package testng;

import org.testng.annotations.Test;

public class TestLogin {

	@Test
	public void LoginFunction()
	{
		System.out.println("Login");
	}
	
	@Test
	public void MobileLoginFunction()
	{
		System.out.println("Mobile Login");
	}
	
	@Test
	public void MobileCartLoginFunction()
	{
		System.out.println("Mobile Cart Login");
	}
	
	@Test
	public void MobileCheckoutLoginFunction()
	{
		System.out.println("Mobile Checkout Login");
	}
}
