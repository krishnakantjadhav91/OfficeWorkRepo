package resusable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Master 
{
	public WebDriver dr ;
	
	public void browserLaunch()
	{		
		System.out.println("Testcase1 is running...");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe") ;
		dr = new ChromeDriver() ;		
		dr.manage().window().maximize();
		dr.get("https://mvnrepository.com/");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		
	}
	

}
