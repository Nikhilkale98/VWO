package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass {
   @FindBy(xpath="//input[@id='login-username']")private WebElement uname;
   @FindBy(xpath="//input[@id='login-password']")private WebElement pass;
   @FindBy(xpath="//button[@id='js-login-btn']")private WebElement signup;
   @FindBy(xpath="//div[@id='js-notification-box-msg']")private WebElement errmsg;
   
   public Pomclass(WebDriver driver){
	   PageFactory.initElements(driver, this);
	   
   }
   public void enteruname(String username) {
	   uname.sendKeys(username);
   }
   public void enterpass(String password) {
	   pass.sendKeys(password);
   }
   public void clksignup() {
	   signup.click();
   }
   public String errmsg() {
	   String actmsg = errmsg.getText();
	   return actmsg;
	   
   }
}
