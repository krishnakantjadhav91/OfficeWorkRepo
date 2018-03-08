package resusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Master 
{
	public WebDriver dr ;
	public void pageLoad()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe") ;
		dr = new ChromeDriver() ;
		dr.manage().window().maximize();
		dr.get("https://mvnrepository.com/");
	}
	public void run()
	{
		WebElement act = dr.findElement(By.xpath("//*[@id='maincontent']/h1")) ;
		Assert.assertEquals("What's New in Maven", act.getText());		
	}

}
