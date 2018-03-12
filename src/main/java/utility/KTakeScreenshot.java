package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import config.OR;
import reusable.Master;

public class KTakeScreenshot extends Master
{
	FileInputStream fis ;	
	
	public static void capture(String fileName, String folderName)
	{	
		Master.createDir(OR.getProperty("screenshotPath"), folderName) ;
		SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy_hh_mm_ss_aa") ;		
		File dest = new File(Master.file+"\\"+fileName+"_"+format.format(new Date())+".png") ;		
		TakesScreenshot shot = (TakesScreenshot)Master.dr ;		
		File src = shot.getScreenshotAs(OutputType.FILE) ;
		try 
		{
			FileUtils.copyFile(src, dest);
		}
		catch (IOException e) 
		{			
			System.out.println("Invalid Format...");
		}
		
	}

}
