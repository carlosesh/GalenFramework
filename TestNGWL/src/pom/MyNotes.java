package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyNotes {
	
	WebDriver driver;	
	WebDriverWait wait;
	ExtentTest test;
	ExtentReports reports;
	
	@FindBy(css=".btn-primary")
	WebElement addNoteBtn;
	
	@FindBy(css="#ad-note-page h2")
	WebElement addNoteHeader;
	
	@FindBy(name="note.title")
	WebElement tittleTxtField;
	
	@FindBy(name="note.description")
	WebElement descriptionTxtField;
	
	@FindBy(css=".list-group-item-heading")
	List<WebElement> tittleList;
	
	public MyNotes(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
		this.test = test;
		PageFactory.initElements(driver, this);
	}
	
	public void typeATittle(String input) {
		tittleTxtField.click();
		tittleTxtField.sendKeys(input);
		test.log(LogStatus.INFO, "Tittle: "+ input +" typed");
	}
	
	public void typeADesc(String input) {
		descriptionTxtField.click();
		descriptionTxtField.sendKeys(input);
		test.log(LogStatus.INFO, "Description: "+ input +" typed");
	}
	
	public void clickAddBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(addNoteBtn));
		addNoteBtn.click();
		test.log(LogStatus.INFO, "Add button clicked");
	}
	
	public boolean validateTittle(String aTittle) {
		boolean flag = false;
		for(WebElement t : tittleList) {
			if(t.getText().trim().equals(aTittle)) {
				flag=true;
				test.log(LogStatus.INFO, "Tittle: "+ t.getText() + " found"); 
				break;
			}
		}
		return flag;
	}
}
