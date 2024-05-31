package Test;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Baseclass;
import Base.Utility;
import Pom.Pomclass;


public class Testclass {
	Pomclass login2;
	//KiteHomePage home;
	WebDriver driver;
	Baseclass base;
	Utility util;
	String tcID;
	Pomclass login1;
	
	@BeforeClass
	public void openbrowser() {
		Reporter.log("---Open browser",true);
		base=new Baseclass();
		driver=base.initializeBrowser();
		login1=new Pomclass(driver);
		
	}
	@BeforeMethod
	public void refresh() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
    @Test
    public void tc01() throws EncryptedDocumentException, IOException, InterruptedException {
    	tcID="01";
    	Reporter.log("(\"----TC Name:Login Negative Test - Balnk Password----",true);
    	login1.enteruname("npkale98@gmail.com");
    	login1.clksignup();
        Thread.sleep(2000);
               
    	
    }
    @Test
    public void tc02() throws InterruptedException {
    	tcID="02";
    	Reporter.log("----Tc name:Login negative test-incorrect password");
    	login1.enteruname("npkale98@gmail.com");
    	login1.enterpass("nikhil012");
    	login1.clksignup();
    	Thread.sleep(2000);
    }
    @Test
    public void tc03() throws InterruptedException {
    	tcID="03";
    	Reporter.log("----Tc name:Login negative test-blank email");
    	login1.enterpass("Npkale@98");
    	login1.clksignup();
    	Thread.sleep(2000);
    	
    }
    @Test
    public void tc04() throws InterruptedException {
    	tcID="04";
    	Reporter.log("----Tc name:Login negative test-incorrect email");
    	login1.enteruname("nikhilkale012@gmail.com");
    	login1.enterpass("Npkale@98");
    	login1.clksignup();
    	Thread.sleep(2000);
    }
    @Test
    public void tc05() throws InterruptedException {
    tcID="05";
    Reporter.log("----Tc name:Login negative test-incorrect email and incorect password");
    login1.enteruname("nikhilkale012@gmail.com");
    login1.enterpass("kale@012");
    login1.clksignup();
    Thread.sleep(2000);
    
    }
    @Test
    public void tc06() throws InterruptedException {
    	tcID="06";
    	Reporter.log("----Tc name:Login negative test-blank email and blank password");
    	login1.clksignup();
    	Thread.sleep(2000);
    }
    @Test
    public void tc07() throws InterruptedException {
    	tcID="07";
    	Reporter.log("----Tc name:Login negative test-invalid email and blank password");
    	login1.enteruname("nikhilkale012@gmail.com");
    	login1.clksignup();
    	Thread.sleep(2000);
    }
    @Test
    public void tc08() throws InterruptedException {
    	tcID="08";
    	Reporter.log("----Tc name:Login negative test-blank email and invalid password");
    	login1.enterpass("kale@012");
    	login1.clksignup();
    	Thread.sleep(2000);
    }
   
    	@AfterClass
    	public void closebrowser() {
    		Reporter.log("---Close browser",true);
    		driver.close();
    	}
    	
   
}
