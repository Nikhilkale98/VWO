package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import Configuration.configuration;

public class Baseclass {
	WebDriver driver;
	public WebDriver initializeBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",configuration.chromedriver);
		 ChromeOptions co=new ChromeOptions();
		   co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get(configuration.appurl);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;		
	}
	public void implictiWait(int wait) {
		driver.manage().timeouts().implicitlyWait(wait,TimeUnit.SECONDS);
	}

}
