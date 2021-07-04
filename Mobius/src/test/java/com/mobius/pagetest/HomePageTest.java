package com.mobius.pagetest;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mobius.base.Baseclass;

import com.mobius.pages.HomePage;
import com.mobius.seleniumutils.TestUtility;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class HomePageTest extends Baseclass {
	
	
	public HomePage hp;	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeClass
	public void callextenreports()
	{
		Baseclass.extentreportdec("HomePageTest");
	}
			
	@BeforeMethod
	public void intialisebrowser()
	{
		Baseclass.initialization();
		 hp = new HomePage();		 
		 TestUtility.launchSite(driver, pr.getProperty("website"));
	}
	
	@Test(priority=1)
	public void findbrlogin()
	{
		
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));			
	}
	
	@Test(priority=2)
      public void abourummypage() throws Exception
	{
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));
		hp.clickonhowtoplay("aboutrummy");
		Thread.sleep(5000);
		int brcount = TestUtility.brokenlink(driver);
		et.log(LogStatus.INFO, "Broken link count is " + brcount  + "  URL is  -----  " +  driver.getCurrentUrl() + "   Title is  ----  " +   driver.getTitle() + et.addScreenCapture(TestUtility.pageScreenshot(driver)));
		if (brcount > 0)
		{
		   Assert.assertEquals(0, brcount);		   		   
		}
	}
	
	@Test(priority=3)
    public void howtoplayrummy() throws Exception
	{
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));
		hp.clickonhowtoplay("howtoplayrummyy");
		Thread.sleep(5000);
		int brcount = TestUtility.brokenlink(driver);
		et.log(LogStatus.INFO, "Broken link count is " + brcount  + "  URL is  -----  " +  driver.getCurrentUrl() + "   Title is  ----  " +   driver.getTitle() + et.addScreenCapture(TestUtility.pageScreenshot(driver)));
		if (brcount > 0)
		{
		   Assert.assertEquals(0, brcount);		   		   
		}
		
	}
	
	
	
	@Test(priority=4)
    public void ReferandEarn() throws Exception
	{
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));
		hp.clickonreferandearn();
		Thread.sleep(5000);
		int brcount = TestUtility.brokenlink(driver);
		et.log(LogStatus.INFO, "Broken link count is " + brcount  + "  URL is  -----  " +  driver.getCurrentUrl() + "   Title is  ----  " +   driver.getTitle() + et.addScreenCapture(TestUtility.pageScreenshot(driver)));
		if (brcount > 0)
		{
		   Assert.assertEquals(0, brcount);		   		   
		}
		
	}
	
	@Test(priority=5)
    public void InstanCashBonus() throws Exception
	{
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));
		hp.clickoninstantcashbonus();
		Thread.sleep(5000);
		int brcount = TestUtility.brokenlink(driver);
		et.log(LogStatus.FAIL, "Broken link count is " + brcount  + "  URL is  -----  " +  driver.getCurrentUrl() + "   Title is  ----  " +   driver.getTitle() + et.addScreenCapture(TestUtility.pageScreenshot(driver)));
		if (brcount > 0)
		{
		   Assert.assertEquals(0, brcount);		   		   
		}
		
	}
	
	
	@Test(priority=6)
    public void Depositsclick() throws Exception
	{
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));
		hp.clickondepositsandwithdrwal("deposit");
		Thread.sleep(5000);
		int brcount = TestUtility.brokenlink(driver);
		et.log(LogStatus.INFO, "Broken link count is " + brcount  + "  URL is  -----  " +  driver.getCurrentUrl() + "   Title is  ----  " +   driver.getTitle() + et.addScreenCapture(TestUtility.pageScreenshot(driver)));
		if (brcount > 0)
		{
		   Assert.assertEquals(0, brcount);		   		   
		}
		
	}
	
	@Test(priority=7)
    public void withdrawlclick() throws Exception
	{
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));
		hp.clickondepositsandwithdrwal("withdrwal");
		Thread.sleep(5000);
		int brcount = TestUtility.brokenlink(driver);
		et.log(LogStatus.INFO, "Broken link count is " + brcount  + "  URL is  -----  " +  driver.getCurrentUrl() + "   Title is  ----  " +   driver.getTitle() + et.addScreenCapture(TestUtility.pageScreenshot(driver)));
		if (brcount > 0)
		{
		   Assert.assertEquals(0, brcount);		   		   
		}
		
	}
	
	@Test(priority=8)
    public void LoyalityProgram() throws Exception
	{
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));
		hp.clickonLoyalityprogram1();
		Thread.sleep(5000);
		int brcount = TestUtility.brokenlink(driver);
		et.log(LogStatus.FAIL, "Broken link count is " + brcount  + "  URL is  -----  " +  driver.getCurrentUrl() + "   Title is  ----  " +   driver.getTitle() + et.addScreenCapture(TestUtility.pageScreenshot(driver)));
		if (brcount > 0)
		{
		   Assert.assertEquals(0, brcount);		   		   
		}
	}
	
	
	@Test(priority=9)
    public void Allofferspage() throws Exception
	{
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));
		hp.clickonalloffer();
		Thread.sleep(5000);
		int brcount = TestUtility.brokenlink(driver);
		et.log(LogStatus.INFO, "Broken link count is " + brcount  + "  URL is  -----  " +  driver.getCurrentUrl() + "   Title is  ----  " +   driver.getTitle() + et.addScreenCapture(TestUtility.pageScreenshot(driver)));
		if (brcount > 0)
		{
		   Assert.assertEquals(0, brcount);		   		   
		}
		
	}
	
	
	@Test(priority=10)
    public void Clubhousepage() throws Exception
	{
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));
		hp.clickonclubbonus();
		Thread.sleep(5000);
		int brcount = TestUtility.brokenlink(driver);
		et.log(LogStatus.INFO, "Broken link count is " + brcount  + "  URL is  -----  " +  driver.getCurrentUrl() + "   Title is  ----  " +   driver.getTitle() + et.addScreenCapture(TestUtility.pageScreenshot(driver)));
		if (brcount > 0)
		{
		   Assert.assertEquals(0, brcount);		   		   
		}
		
	}
	
	@Test(priority=11)
    public void specialOfferspage() throws Exception
	{
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));
		hp.clickonspecialoffers();
		Thread.sleep(5000);	
		int brcount = TestUtility.brokenlink(driver);
		et.log(LogStatus.INFO, "Broken link count is " + brcount  + "  URL is  -----  " +  driver.getCurrentUrl() + "   Title is  ----  " +   driver.getTitle() + et.addScreenCapture(TestUtility.pageScreenshot(driver)));
		if (brcount > 0)
		{
		   Assert.assertEquals(0, brcount);		   		   
		}
	}
	
	@Test(priority=12)
    public void NoDepostbonuspage() throws Exception
	{
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));
		hp.clickonnodepositbonus();
		Thread.sleep(5000);	
		int brcount = TestUtility.brokenlink(driver);
		et.log(LogStatus.INFO, "Broken link count is " + brcount  + "  URL is  -----  " +  driver.getCurrentUrl() + "   Title is  ----  " +   driver.getTitle() + et.addScreenCapture(TestUtility.pageScreenshot(driver)));
		if (brcount > 0)
		{
		   Assert.assertEquals(0, brcount);		   		   
		}
	}
	
	@Test(priority=13)
    public void FirstDepostbonuspage() throws Exception
	{
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));
		hp.clickonfirstdepositbonus();
		Thread.sleep(5000);	
		int brcount = TestUtility.brokenlink(driver);
		et.log(LogStatus.INFO, "Broken link count is " + brcount  + "  URL is  -----  " +  driver.getCurrentUrl() + "   Title is  ----  " +   driver.getTitle() + et.addScreenCapture(TestUtility.pageScreenshot(driver)));
		if (brcount > 0)
		{
		   Assert.assertEquals(0, brcount);		   		   
		}
	}
	
	@Test(priority=17)
    public void SecondDepostbonuspage() throws Exception
	{
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));
		hp.clickonsecondthirddepositbonus();
		Thread.sleep(5000);	
		int brcount = TestUtility.brokenlink(driver);
		et.log(LogStatus.INFO, "Broken link count is " + brcount  + "  URL is  -----  " +  driver.getCurrentUrl() + "   Title is  ----  " +   driver.getTitle() + et.addScreenCapture(TestUtility.pageScreenshot(driver)));
		if (brcount > 0)
		{
		   Assert.assertEquals(0, brcount);		   		   
		}
	}
	
	@Test(priority=14)
    public void Surproseofferpage() throws Exception
	{
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));
		hp.clickonSurpriseOffer();
		Thread.sleep(5000);	
		int brcount = TestUtility.brokenlink(driver);
		et.log(LogStatus.INFO, "Broken link count is " + brcount  + "  URL is  -----  " +  driver.getCurrentUrl() + "   Title is  ----  " +   driver.getTitle() + et.addScreenCapture(TestUtility.pageScreenshot(driver)));
		if (brcount > 0)
		{
		   Assert.assertEquals(0, brcount);		   		   
		}
	}
	
	@Test(priority=15)
    public void HappyHourpage() throws Exception
	{
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));
		hp.clickonHappyHourOffer();
		Thread.sleep(5000);	
		int brcount = TestUtility.brokenlink(driver);
		et.log(LogStatus.INFO, "Broken link count is " + brcount  + "  URL is  -----  " +  driver.getCurrentUrl() + "   Title is  ----  " +   driver.getTitle() + et.addScreenCapture(TestUtility.pageScreenshot(driver)));
		if (brcount > 0)
		{
		   Assert.assertEquals(0, brcount);		   		   
		}
	}
	
	@Test(priority=16)
    public void PowerPlayofferPage() throws Exception
	{
		w.until(ExpectedConditions.elementToBeClickable(hp.mobilenumberentry));
		hp.clickonPowerPlayoffer();
		Thread.sleep(5000);	
		int brcount = TestUtility.brokenlink(driver);
		et.log(LogStatus.INFO, "Broken link count is " + brcount  + "  URL is  -----  " +  driver.getCurrentUrl() + "   Title is  ----  " +   driver.getTitle() + et.addScreenCapture(TestUtility.pageScreenshot(driver)));
		if (brcount > 0)
		{
		   Assert.assertEquals(0, brcount);		   		   
		}
	}
	
	@AfterMethod
	public void closemethod()
	{		
		driver.close();		
	}
	
	@AfterClass
	public void flusextenreports()
	{
		Baseclass.closeextentreportdec("HomePageTest");
	}

}
