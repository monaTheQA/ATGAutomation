package commonLibs.implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonDriver {
	private WebDriver driver;
	private int pageLoadTimeout;
	private int elementdetectionTimeout;
	private String currentDirectory;
	
	public CommonDriver(String browserType) throws Exception
	{
		pageLoadTimeout = 10;
		elementdetectionTimeout = 10;
		
		currentDirectory = System.getProperty("user.dir");
		if(browserType.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					currentDirectory + "/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.driver",
					currentDirectory + "/drivers/firefox.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			throw new Exception("Invalid browser type" + browserType);
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setPageLoadTimeout(int pageLoadTimeout) {
		this.pageLoadTimeout = pageLoadTimeout;
	}

	public void setElementdetectionTimeout(int elementdetectionTimeout) {
		this.elementdetectionTimeout = elementdetectionTimeout;
	}

	public void navigateToUrl(String url)
	{
		driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(elementdetectionTimeout, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	public void closeAllDriver()
	{
		driver.quit();
	}
	
	public String getTilte()
	{
		return driver.getTitle();
	}


}
