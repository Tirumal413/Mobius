package com.mobius.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mobius.base.Baseclass;
import com.mobius.seleniumutils.TestUtility;


public class HomePage extends Baseclass {
	
	
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Enter Mobile No.']")
	public WebElement mobilenumberentry;
	
	@FindBy(how=How.XPATH, using="//a[@class='mega-menu-link']")
	public WebElement howtoplay;
	
	@FindBy(how=How.XPATH, using="//a[text()='About Rummy']")
	public WebElement aboutrummy;
	
	@FindBy(how=How.XPATH, using="//a[text()='How to Play Rummy']")
	public WebElement howtoplayrummy;
	
	@FindBy(how=How.XPATH, using="//a[text()='Refer and Earn']")
	public WebElement referandearn;
	
	@FindBy(how=How.XPATH, using="//a[text()='Instant Cash Bonus']")
	public WebElement instantcashbonus;
	
	@FindBy(how=How.XPATH, using="//a[text()='Deposits & Withdrawals']")
	public WebElement depositsandwithdrwal;
	
	@FindBy(how=How.XPATH, using="//a[text()='Deposits']")
	public WebElement depostsel;
	
	@FindBy(how=How.XPATH, using="//a[text()='Withdrawals']")
	public WebElement withdrwalel;
	
	@FindBy(how=How.XPATH, using="//a[text()='Loyalty Program']")
	public WebElement Loyalityprogram;
	
	@FindBy(how=How.XPATH, using="//a[text()='Promotions']")
	public WebElement Promotions;
	
	@FindBy(how=How.XPATH, using="//a[text()='Special Offers']")
	public WebElement specialoffers;
	
	@FindBy(how=How.XPATH, using="//a[text()='All Offers']")
	public WebElement alloffers;
	
	@FindBy(how=How.XPATH, using="//a[text()='Club Bonus']")
	public WebElement clubbonus;
	
	@FindBy(how=How.XPATH, using="//a[text()='Welcome Package']")
	public WebElement welcomepackage;
	
	@FindBy(how=How.XPATH, using="//a[text()='No Deposit Bonus']")
	public WebElement nodepositbonus;
	
	@FindBy(how=How.XPATH, using="//a[text()='First Deposit Bonus']")
	public WebElement firstdepositbonus;
	
	@FindBy(how=How.XPATH, using="//a[text()='2nd & 3rd Deposit Bonus']")
	public WebElement secondthirddepositbonus;
	
	@FindBy(how=How.XPATH, using="//a[text()='Daily Offers']")
	public WebElement DailyOffers;
	
	@FindBy(how=How.XPATH, using="//a[text()='Surprise Offer (noon)']")
	public WebElement SurpriseOffer;
	
	@FindBy(how=How.XPATH, using="//a[text()='Happy Hour Offer (dusk)']")
	public WebElement HappyHourOffer;
	
	@FindBy(how=How.XPATH, using="//a[text()='Power Play offer (T20 night match)']")
	public WebElement PowerPlayoffer;
			
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickonhowtoplay(String x)
	{
		Actions a = new Actions(driver);
		a.moveToElement(howtoplay).build().perform();
		if (x.equals("aboutrummy"))
		{
		Actions a1 = new Actions(driver);		
		a1.click(aboutrummy).build().perform();
		//return new AboutRummyPage();
		}
		else
		{
			Actions a2 = new Actions(driver);		
			a2.click(howtoplayrummy).build().perform();			
		}
	}
	
	public void clickonreferandearn()
	{
		referandearn.click();
	}
	
	public void clickoninstantcashbonus()
	{
		instantcashbonus.click();
	}
	
	public void clickonLoyalityprogram1()
	{
		Loyalityprogram.click();
	}
	
	public void clickondepositsandwithdrwal(String val)
	{
		Actions b1 = new Actions(driver);
		b1.moveToElement(depositsandwithdrwal).build().perform();
		if (val.equals("deposit"))
		{
		Actions b2 = new Actions(driver);		
		b2.click(depostsel).build().perform();
		//return new AboutRummyPage();
		}
		else
		{
			Actions b3 = new Actions(driver);		
			b3.click(withdrwalel).build().perform();			
		}
	}

	public void clickonalloffer()
	{
		//Actions c1 = new Actions(driver);
		//c1.moveToElement(Promotions).build().perform();		
		//Actions c2 = new Actions(driver);		
		//c2.click(alloffers).build().perform();	
		TestUtility.actionmovetoelemnt(driver,Promotions);
		TestUtility.actionclickonlelement(driver,alloffers);
	}
	
	public void clickonspecialoffers()
	{
		//Actions d1 = new Actions(driver);
		//d1.moveToElement(Promotions).build().perform();		
		//Actions d2 = new Actions(driver);		
		//d2.click(specialoffers).build().perform();	
		TestUtility.actionmovetoelemnt(driver,Promotions);
		TestUtility.actionclickonlelement(driver,specialoffers);
	}
	
	public void clickonclubbonus()
	{
		//Actions d1 = new Actions(driver);
		//d1.moveToElement(Promotions).build().perform();		
		//Actions d2 = new Actions(driver);		
		//d2.click(clubbonus).build().perform();
		TestUtility.actionmovetoelemnt(driver,Promotions);
		TestUtility.actionclickonlelement(driver,clubbonus);
	}

	public void clickonnodepositbonus()
	{
		TestUtility.actionmovetoelemnt(driver,Promotions);
		TestUtility.actionmovetoelemnt(driver,welcomepackage);
		TestUtility.actionclickonlelement(driver, nodepositbonus);
	}
	
	public void clickonfirstdepositbonus()
	{
		TestUtility.actionmovetoelemnt(driver,Promotions);
		TestUtility.actionmovetoelemnt(driver,welcomepackage);
		TestUtility.actionclickonlelement(driver, firstdepositbonus);
	}
	
	public void clickonsecondthirddepositbonus()
	{
		TestUtility.actionmovetoelemnt(driver,Promotions);
		TestUtility.actionmovetoelemnt(driver,welcomepackage);
		TestUtility.actionclickonlelement(driver, secondthirddepositbonus);
	}
	
	public void clickonSurpriseOffer()
	{
		TestUtility.actionmovetoelemnt(driver,Promotions);
		TestUtility.actionmovetoelemnt(driver,DailyOffers);
		TestUtility.actionclickonlelement(driver, SurpriseOffer);
	}
	
	public void clickonHappyHourOffer()
	{
		TestUtility.actionmovetoelemnt(driver,Promotions);
		TestUtility.actionmovetoelemnt(driver,DailyOffers);
		TestUtility.actionclickonlelement(driver, HappyHourOffer);
	}
	
	public void clickonPowerPlayoffer()
	{
		TestUtility.actionmovetoelemnt(driver,Promotions);
		TestUtility.actionmovetoelemnt(driver,DailyOffers);
		TestUtility.actionclickonlelement(driver, PowerPlayoffer);
	}

	

}
