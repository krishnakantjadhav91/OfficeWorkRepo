package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import resusable.Master;

public class Test2 extends Master
{	
	@BeforeMethod
	public void launchBrowser()
	{
		browserLaunch();		
	}
	
	@Test
	public void T1()
	{			
		WebElement chk = dr.findElement(By.xpath("//*[@id='maincontent']/h1")) ;		
		Assert.assertTrue(chk.isDisplayed());		
		System.out.println("T1 is executed...");			
	}
	
	@Test
	public void T2()
	{			
		WebElement chk = dr.findElement(By.xpath("//*[@id='maincontent']/h1")) ;
		Assert.assertTrue(chk.isDisplayed());
		System.out.println("T2 is executed...");		
	}
	
	@Test
	public void T3()
	{			
		WebElement chk = dr.findElement(By.xpath("//*[@id='maincontent']/h1")) ;
		Assert.assertTrue(chk.isDisplayed());
		System.out.println("T3 is executed...");		
	}
	
	@AfterMethod
	public void tearOut()
	{
		dr.quit();
	}
}
