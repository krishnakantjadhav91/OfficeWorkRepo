package keywords;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import reusable.Master;

public class Keywords extends Master 
{
	public void click(String locator, String value)
	{
		switch(locator)
		{
		case "id" :
			dr.findElement(By.id(value)).click();
			break ;
		case "xpath" :
			dr.findElement(By.xpath(value)).click();
			break ;
		case "className" :
			dr.findElement(By.className(value)).click();
			break ;
		case "name" :
			dr.findElement(By.name(value)).click();
			break ;
		case "linkText" :
			dr.findElement(By.linkText(value)).click();
			break ;
		case "partialLinkText" :
			dr.findElement(By.partialLinkText(value)).click();
			break ;
		default :
			System.out.println("Invalid Locator...");
		}
	}
	
	public void type(String locator, String value, String input)
	{
		switch(locator)
		{
		case "id" :
			dr.findElement(By.id(value)).sendKeys(input);
			break ;
		case "xpath" :
			dr.findElement(By.xpath(value)).sendKeys(input);
			break ;
		case "className" :
			dr.findElement(By.className(value)).sendKeys(input);
			break ;
		case "name" :
			dr.findElement(By.name(value)).sendKeys(input);
			break ;
		case "linkText" :
			dr.findElement(By.linkText(value)).sendKeys(input);
			break ;
		case "partialLinkText" :
			dr.findElement(By.partialLinkText(value)).sendKeys(input);
			break ;
		default :
			System.out.println("Invalid Locator...");
		}
	}
	
	public void select(String xpathValue, String input)
	{
		WebElement ele = dr.findElement(By.xpath(xpathValue)) ;
		
		Select se = new Select(ele) ;
		
		List<WebElement> list = se.getOptions() ;
		
		for(WebElement temp : list)
		{
			if (temp.getText().equals(input)) 
			{
				temp.click();
			}
		}
		
	}
	

}
