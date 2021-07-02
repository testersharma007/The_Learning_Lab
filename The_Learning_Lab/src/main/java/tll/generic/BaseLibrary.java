package tll.generic;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseLibrary 
{

public static WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","baseurl"})
	public static void preCondition(String browserName , String url)
	{
		if (browserName.equalsIgnoreCase("chrome"))
		{
			
			ChromeOptions options= new ChromeOptions();
			options.addArguments("incognito");
			
			System.setProperty("webdriver.chrome.driver" , "./Browser_Exe/chromedriver.exe");
			driver= new ChromeDriver(options);
			Reporter.log("Chrome browser  launched ", true);
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver" , "./Browser_Exe/geckodriver.exe");
			driver= new FirefoxDriver();
			Reporter.log("Firefox browser launched ", true);
		}
		
		else if (browserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.ie.driver" , "./Browser_Exe/msedgedriver.exe");
			driver= new InternetExplorerDriver();
			Reporter.log("IE browser launched ", true);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		//driver.navigate().to(url);
		Reporter.log(url+" Url is navigated " , true);
	}

	
@AfterClass
	public void postCondition()
	{
		driver.close();
		Reporter.log("Browser closed ", true);

		if (driver!=null)
		{
			driver.quit();
			Reporter.log("All session are closed ", true);
		}
	
	}
	
}
