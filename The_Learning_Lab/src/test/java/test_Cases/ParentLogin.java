package test_Cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.ParentLoginPage;
import tll.generic.BaseLibrary;
/* Pragmatic approach*/
public class ParentLogin extends BaseLibrary
{
   static String homepage = null;
  @Test(priority = 0)
  public void init() throws Exception
  {
	  ParentLoginPage loginPage=  PageFactory.initElements(driver,   ParentLoginPage.class); 
	    
	       /* loginpage.setEmail("abc@gmail.com"); 
	        loginpage.clickOnNextButton(); 
	        loginpage.setPassword("23456@qwe"); 
	        loginpage.clickOnNextButton();
	        */
	  loginPage.setadminusername("admin");
	  loginPage.parentusername("gwen.sharma@thelearninglab.com.sg");
	  loginPage.parentpassword("Tll@2020");
	  loginPage.clickonloginbutton();

	  //boolean parentloginsuccess = driver.getPageSource().contains("Welcome to The Learning Lab");
	  //boolean Error = driver.getPageSource().contains("Admin Username and Password Incorrect, Please try again!");
	  // assertEquals(parentloginsuccess , Error, "Login Unsuccessful");
	 // assertEquals(Error, parentloginsuccess, "Login Unsuccessful");
	  String expectedTitleString = "";
	  String ActualTitle = driver.getTitle();
	  System.out.println(ActualTitle);
	  if(expectedTitleString.equals(ActualTitle)) 
	  {
		  System.out.println("Verifaction Successfully : Home Page title is matched");
	  }
	  else 
	  {
		  System.out.println("Verifaction failed : Home Page title is not matched");
	  }
	
	 
	  /*
	    if (Error == true)
	    {
	     System.out.println("Login Unsuccessful");
	    }
	    else
	    {
	     System.out.println("Login Successful");
	    }
	    */
  }
}
