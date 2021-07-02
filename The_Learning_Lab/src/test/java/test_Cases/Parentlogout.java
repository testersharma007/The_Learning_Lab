package test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.ParentLogoutpage;
import tll.generic.BaseLibrary;
public class Parentlogout extends BaseLibrary
{
  @Test(priority =1)
  public void init() throws Exception
  {
	  WebDriver driver = null;
	ParentLogoutpage logout=  PageFactory.initElements(driver,   ParentLogoutpage.class); 
	    
	      
	  logout.clickonsettingicon();
	  logout.clickonlogout();
  }
}
