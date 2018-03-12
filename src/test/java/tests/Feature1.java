package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import config.OR;
import reusable.Master;
import utility.KTakeScreenshot;

public class Feature1 extends Master
{		
	@BeforeMethod(groups="start")
	public void launchBrowser()
	{
		openBrowser("chrome", OR.getProperty("url"));			
	}
	
	@Test(groups="smoke")
	public void T1() throws Exception
	{			
		WebElement chk = dr.findElement(By.xpath(OR.getProperty("textVerify"))) ;
		JavascriptExecutor jse = (JavascriptExecutor)dr;
		jse.executeScript("scroll(0, 50);");		
		Assert.assertTrue(chk.isDisplayed());	
		KTakeScreenshot.capture("Actual Text1", "MortageCalculator1");
		System.out.println("T1 is executed...");
	}
	
	@Test(groups="sanity",enabled = true)
	public void T2() throws InterruptedException
	{			
		WebElement chk = dr.findElement(By.xpath(OR.getProperty("textVerify"))) ;
		JavascriptExecutor jse = (JavascriptExecutor)dr;
		jse.executeScript("scroll(0, 50);");		
		Assert.assertTrue(chk.isDisplayed());	
		KTakeScreenshot.capture("Actual Text2", "MortageCalculator1");
		System.out.println("T2 is executed...");
	}
	
	@AfterMethod(groups="end")
	public void tearOut()
	{
		dr.quit();
	}
	

}
