package com.mobius.base;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mobius.seleniumutils.TestUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass  {
	
	public static Properties pr;
	public static WebDriver driver;
	public static ExtentReports er;
	public static ExtentTest et;
	public static WebDriverWait w;
	
	public Baseclass() 
  {
		try
		{
	File f = new File("E:\\Selenium\\Mobius\\src\\test\\resources\\configfile.properties");
	FileReader fr = new FileReader(f);
	pr = new Properties();
	pr.load(fr);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
  }
	
	public static void initialization()
	{
			String bn = pr.getProperty("browser");
			
			if(bn.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if(bn.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			else if(bn.equalsIgnoreCase("opera"))
			{
				WebDriverManager.operadriver().setup();
				driver=new OperaDriver();
			}
			else if(bn.equalsIgnoreCase("edge"))
			{
				EdgeOptions eo=new EdgeOptions();
				eo.setBinary("C:\\Program Files (x86)\\microsoft\\Edge Beta\\Application\\msedge.exe");
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver(eo);
			}
			else
			{
				WebDriverManager.iedriver().setup();
				driver=new InternetExplorerDriver();
			}
			driver.manage().window().maximize();			
			TestUtility.launchSite(driver, pr.getProperty("website"));
			w = new WebDriverWait(driver,200);			
	}
	
	public static void extentreportdec(String x)
	{
		er = new ExtentReports("E:\\Selenium\\Mobius\\src\\test\\resources\\com\\mobius\\reports\\extentreports.html",false);
		et = er.startTest(x);
		
	}
	
	public static void closeextentreportdec(String x)
	{
		er.endTest(et);
		er.flush();		
	}
	
  
}
