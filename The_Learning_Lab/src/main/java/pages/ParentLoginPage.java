package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParentLoginPage 

/*
 Identify all Webelements by @FindBy annotation
 */
{
  // Admin username
	@FindBy(xpath ="//*[@id='MainContent_TextBoxAdminUsername']") WebElement adminusernamElement;
	//Parent username
	@FindBy(xpath = "//*[@id='MainContent_TextBoxParentUsername']") WebElement parentusernane;
	//Parent password
	@FindBy(xpath = "//*[@id='MainContent_TextBoxPassword']")WebElement parentspassword;
	//Login button
	@FindBy(xpath = "//*[@id='MainContent_btnSignin']")WebElement loginbutton;

	// Defining all the user actions (Methods) 
	// This method is to set adminusername in adminusername text box 
	  public void setadminusername(String stradminusername) 
    {    
		  if (adminusernamElement.isDisplayed())
    {
    	adminusernamElement.sendKeys(stradminusername); 
    }
    else 
    {
    	System.out.println("Admin username field is not displayed");
    }
        } 
    // This method is to set parent username in username text box 
	public void parentusername(String strparentusername) 
    {
		if(parentusernane.isDisplayed()) 
		{
    	parentusernane.sendKeys(strparentusername);
		}
		else 
		{
			System.out.println("Parent username field is not displayed");
		}
    }
	//This method is to set parent password in parent password test box
    public void parentpassword(String strparentpassword) 
    {
    	if(parentspassword.isDisplayed()) 
    	{
    	parentspassword.sendKeys(strparentpassword);
    	}
    	else
    	{
    		System.out.println("Password field is not displayed");
    	}
    }
    //This methoed is to click on Login button
    public void clickonloginbutton() 
    {
    	if(loginbutton.isDisplayed())
    	{
    	loginbutton.click();
    	}
    	else
    	{
    		System.out.println("Login button is not being displayed");
    	}
    }
}


