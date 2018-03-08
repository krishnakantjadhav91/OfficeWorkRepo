package tests;

import org.testng.annotations.*;

import resusable.Master;

public class RunTest extends Master 
{
	@BeforeMethod
	public void lauchBrowser()
	{
		pageLoad();
	}
	
	@Test
	public void testRun() throws InterruptedException
	{
		run() ;
		Thread.sleep(2000);		
	}
	
	@AfterMethod
	public void tearOut()
	{
		dr.quit();
	}

}
