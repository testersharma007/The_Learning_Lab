package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ParentLogoutpage 
{
  /******Find all webelements by @Findby annotation*********/
  
  
	  // setting icon
	  @FindBy(xpath ="//*[@class='fa fa-cog']")WebElement settingiconElement;
	  
	  //Logout button
	  @FindBy(linkText = "Logout") WebElement logoutElement;
	  
	  /***Define all the user action(Method)*******/
	  
	  public void clickonsettingicon()
	  {
		  if(settingiconElement.isDisplayed()) 
		  {
			  settingiconElement.click();
		  }
		  else 
		  {
			  System.out.println("Setting icon is not being displayed");
		  }
	  }
	  public void clickonlogout()
	  {
		  if(logoutElement.isDisplayed()) 
		  {
			  logoutElement.click();
		  }
		  else 
		  {
			  System.out.println("LogoutElement is not being displayed");
		  }
	  }
	  
  
}
