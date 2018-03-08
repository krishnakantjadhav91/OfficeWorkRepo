package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Test2 
{
	WebDriver dr ;
	@Test
	public void T1()
	{		
		System.out.println("Testcase1 is running...");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe") ;
		dr = new ChromeDriver() ;
		dr.get("https://mvnrepository.com/");
		WebElement chk = dr.findElement(By.xpath("//*[@id='maincontent']/h1")) ;
		Assert.assertTrue(chk.isDisplayed());
		System.out.println("T1 is executed...");
		
	}
	
	@Test
	public void T2()
	{
		System.out.println("Testcase2 is running...");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe") ;
		dr = new ChromeDriver() ;
		dr.get("https://mvnrepository.com/");
		WebElement chk = dr.findElement(By.xpath("//*[@id='maincontent']/h1")) ;
		Assert.assertTrue(chk.isDisplayed());
		System.out.println("T2 is executed...");		
	}
	
	@AfterMethod
	public void tearOut()
	{
		dr.quit();
	}
}
