package testScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objectRepository.BooksPage;
import objectRepository.WelcomePage;

public class AssertionTest 
{
	@Test
	public void Books_001()  
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage Welcome = new WelcomePage(driver);
		BooksPage books = new BooksPage(driver);
		
		//click on books link
		Welcome.BooksLink.click();
		String ActialRes = books.BooksTitle.getText();
		
		//HardAssert
		//Assert.assertEquals(ActialRes, "Book");
		
		//SoftAssert
		SoftAssert Soft = new SoftAssert();
		//Soft.assertEquals(ActialRes, "Book");
		
		//AssertTrue and fail
		Soft.fail();
		Soft.assertTrue(books.BooksTitle.isDisplayed());
		
		//AssertFalse
		//Soft.assertFalse(books.BooksTitle.isDisplayed());
		driver.quit();
		System.out.println("Test case completed");
		Soft.assertAll();
	}

}
