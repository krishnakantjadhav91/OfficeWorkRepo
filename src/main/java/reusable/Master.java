package reusable;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import config.OR;

public class Master
{
	public static WebDriver dr;	
	public static File file ;
	public void openBrowser(String browserName, String url)
	{
		switch(browserName)
		{
		case "chrome" :
			System.setProperty("webdriver.chrome.driver", OR.getProperty("chrome")) ;			
			dr = new ChromeDriver() ;
			dr.manage().window().maximize();
			dr.get(url);
			break ;
		case "firefox" :
			System.setProperty("webdriver.firefox.driver", OR.getProperty("firefox")) ;			
			dr = new FirefoxDriver() ;
			dr.manage().window().maximize();
			dr.get(url);
			break;
		case "ie" :
			System.setProperty("webdriver.ie.driver", OR.getProperty("ie")) ;			
			dr = new InternetExplorerDriver() ;
			dr.manage().window().maximize();
			dr.get(url);
			break;
		default:
			System.out.println("Invalid Browser Name....");
			break;
		}		
		
	}
	
	public static void createDir(String path, String folderName)
	{
		file = new File(path+"\\"+folderName) ;
		if (!file.exists()) 
		{
			file.mkdir() ;
		}
	}
	

}
