package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BaseSuite;


public class Login extends BaseSuite
{
	WebDriver driver;	
	WebDriverWait wait;
	ExtentTest test;
	
	@FindBy(css="#login-page")
	WebElement loginHeader;
	
	@FindBy(css="#welcome-page")
	WebElement welcomeHeader;
	
	@FindBy(name="login.username")
	WebElement usernameTxtFld;
	
	@FindBy(name="login.password")
	WebElement passwordTxtFld;
	
	@FindBy(css="button.button-login")
	WebElement loginBtn;
	
	@FindBy(css="button.button-cancel")
	WebElement cancelBtn;
	
	@FindBy(css="#login-error-message")
	WebElement loginPgErrorMsg;
	
	@FindBy(css="#my-notes-page h2")
	WebElement successLogin;
	
	public Login(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
		this.test = test;
		PageFactory.initElements(driver, this);
	}
	
	public void typeUsernameFld(String input) {
		wait.until(ExpectedConditions.visibilityOf(usernameTxtFld));
		usernameTxtFld.click();
		usernameTxtFld.sendKeys(input);
		test.log(LogStatus.INFO, "Username: "+ input +" typed");
	}
	
	public void typePasswordFld(String input) {
		wait.until(ExpectedConditions.elementToBeClickable(passwordTxtFld));
		passwordTxtFld.click();
		passwordTxtFld.sendKeys(input);
		test.log(LogStatus.INFO, "Password: "+ input +"  typed");
	}
	
	public void clickLoginBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		loginBtn.click();
		test.log(LogStatus.INFO, "Login Button Clicked");
	}
	
	public void clickCancelBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelBtn));
		cancelBtn.click();
		test.log(LogStatus.INFO, "Cancel Button Clicked");
	}
	
	public boolean loginHeader() {
		return loginHeader.isDisplayed();
	}
	
	public boolean welcomeHeader() {
		wait.until(ExpectedConditions.elementToBeClickable(welcomeHeader));
		return welcomeHeader.isDisplayed();
	}
	
	public String getLoginErrMsg() {
		wait.until(ExpectedConditions.elementToBeClickable(loginPgErrorMsg));
		test.log(LogStatus.INFO, "Error Message Found");
		return loginPgErrorMsg.getText();
	}
	
	public String getSucessMsg() {
		wait.until(ExpectedConditions.elementToBeClickable(successLogin));
		test.log(LogStatus.INFO, "Sucess Message Found");
		return successLogin.getText();
	}
	
	public void loginToTheApp(String username, String password) {
		clickLoginBtn();
		typeUsernameFld(username);
		typePasswordFld(password);
		clickLoginBtn();
		test.log(LogStatus.INFO, "Login Successful");
	}
}
