package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import resusable.Master;

public class Feature1 extends Master
{	
	@BeforeMethod(groups="start")
	public void launchBrowser()
	{
		browserLaunch();		
	}
	
	@Test(groups="smoke")
	public void T1()
	{		
		WebElement chk = dr.findElement(By.xpath("//*[@id='maincontent']/h1")) ;		
		Assert.assertTrue(chk.isDisplayed());		
		System.out.println("T1 is executed...");
	}
	
	@Test(groups="sanity")
	public void T2()
	{		
		WebElement chk = dr.findElement(By.xpath("//*[@id='maincontent']/h1")) ;		
		Assert.assertFalse(chk.isDisplayed());		
		System.out.println("T1 is executed...");
	}
	
	@AfterMethod(groups="end")
	public void tearOut()
	{
		dr.quit();
	}
	

}
