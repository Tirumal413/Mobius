package com.mobius.seleniumutils;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.mobius.base.Baseclass;

public class TestUtility  extends Baseclass
{
	
		
	public static void launchSite(WebDriver driver,String url)
	{
		driver.get(url);		
	}
	public void closeSite(WebDriver driver)
	{
		driver.quit();
	}
	public static String pageScreenshot(WebDriver driver) throws Exception
	{
		SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
		Date dt=new Date();
		String ssname=sf.format(dt)+".png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\"+ssname);
		FileHandler.copy(src,dest);
		return(dest.getAbsolutePath());
	}
	
	public static int brokenlink(WebDriver driver)
	{
		List<WebElement> l=driver.findElements(
				By.xpath("(//link)|(//a)|(//href)|(//area)|(//base)|(//img)"));
		//System.out.println(l.size());
		int blc=0;
		int ccwl=0;
		int cnrl=0;
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).getAttribute("href")!=null)
			{
				String x=l.get(i).getAttribute("href");
				if(!x.contains("javascript:") &&
						!x.contains("tel:") &&
						!x.contains("mailto:"))
				{
					try
					{
					URL u=new URL(x);
					HttpURLConnection con=(HttpURLConnection) u.openConnection();
					con.connect();
					String r=con.getResponseMessage();
					con.disconnect();
					if(!r.equals("OK"))
					{
						System.out.println(x+" is broken link due to "+r);
						blc=blc+1;
					}
					else
					{
						ccwl=ccwl+1;
					}
					}
					catch(Exception ex)
					{
						System.out.println((i+1)+" link is not responding");
						cnrl=cnrl+1;
					}
				}
			}
		}
	
		return blc+cnrl;
	}

	public static void actionmovetoelemnt(WebDriver driver,WebElement x)
	{
		Actions ax = new Actions(driver);
		ax.moveToElement(x).build().perform();
 	}
	
	public static void actionclickonlelement(WebDriver driver,WebElement y)
	{
		Actions ax1 = new Actions(driver);
		ax1.moveToElement(y).click().build().perform();
 	}
}









