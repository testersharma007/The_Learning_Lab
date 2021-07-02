package tll.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class SeleniumLibrary {

	WebDriver driver;
//	SeleniumLib slib;
	/*****************************Constructor******************************************/
/*	public SeleniumLibrary(WebDriver driver)
	{
		this.driver=driver;
	}*/
	

	/************************** hard code wait***************************************/
	
	public void iSleep(int secs)
	{
		try
		{
			Thread.sleep(secs*50);
		}
		catch (InterruptedException e )
		{
			e.printStackTrace();
		}
	}
	
/************************Varify expected and actual Results****************************************/
	
	public void validate(String expected, String actual, String passedMsg)
	{
		Assert.assertEquals(actual, expected, "Passed");
		Reporter.log(passedMsg, true);
	}
	
	/************************************alert *************************************/
	
	public void alertAccept()
	{
		driver.switchTo().alert().accept();
	}

	public void alertDismiss()
	{
		driver.switchTo().alert().dismiss();
	}
	/******************************************Scroll**********************************/
	
	//Scroll Down
	public void scroll()
	{
	 String ucode="window.scrollBy(0,300)";
    JavascriptExecutor je=(JavascriptExecutor) driver;
    je.executeScript(ucode);
	}
	/*******************************************/

	
}
