package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethodsTest 
{
	@Test(groups = "Functional")
	public void Register() 
	{
		WebDriver driver = new ChromeDriver();
		System.out.println("register");
		driver.quit();
		System.out.println("Register Functional");
	}
	@Test(groups = "Smoke")//(dependsOnMethods = "Register")
	public void Login() 
	{
		WebDriver driver = new ChromeDriver();
		System.out.println("Login");
		driver.quit();
		System.out.println("Login Smoke");
	}
	@Test(groups = "Smoke")//(dependsOnMethods = "Login")
	public void AddToCart() 
	{
		WebDriver driver = new ChromeDriver();
		System.out.println("Add To Cart");
		driver.quit();	
		System.out.println("Add to cart smoke");
	}
	@Test(groups = "Functional")//(dependsOnMethods = "AddToCart")
	public void Payment() 
	{
		WebDriver driver = new ChromeDriver();
		System.out.println("Payment");
		driver.quit();
		System.out.println("Payment functional");
	}
	@Test(groups = "Smoke")//(dependsOnMethods = "Payment")
	public void ConfirmOrder() 
	{
		WebDriver driver = new ChromeDriver();
		System.out.println("Confirm Order");
		driver.quit();
		System.out.println("Confirm order smoke");
	}
}
