package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class OR 
{
	
	public static String getProperty(String path)
	{	
		FileInputStream fis ;
		Properties prop = new Properties() ;
		String temp = null;
		try 
		{
			fis = new FileInputStream(new File("D:\\Selenium Projects\\Demo\\src\\main\\java\\config\\OR.properties")) ;
			
			prop.load(fis);
			
			temp = prop.getProperty(path) ;
			
		}
		catch (FileNotFoundException e) 
		{			
			System.out.println("File Not Found...");
		}
		catch (IOException e) 
		{			
			System.out.println("File format is not correct...");
		}
		
		return temp ;		
		
	}
	
	

}
