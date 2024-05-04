package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountThreadPoolSizeTest 
{
	@Test(groups = "Smoke")//(invocationCount = 5, threadPoolSize = 3)
	public void Register() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		System.out.println("register");
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Register smoke");
	}

}
