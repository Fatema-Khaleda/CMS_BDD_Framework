package elementPackage;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethodPackage.CommonMethod;

public class LogIn1 {
	
	public LogIn1 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='cms-login-userId']")
	public WebElement UserName;
	@FindBy(xpath = "//input[@id='cms-login-password']")
	public WebElement Password;
	@FindBy(id = "cms-login-submit")
	public WebElement SubmitButton;
	
	public void userName(CommonMethod cm,String userN) {
		cm.entertext(UserName,userN);
	}
	public void passWord( CommonMethod cm,String pass) {
		cm.entertext(Password,pass);
	}
	public void submitButton( CommonMethod cm) {
		cm.toClick(SubmitButton);
	}
	public void screenShot(WebDriver driver) throws IOException {
 File photo=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 FileHandler.copy(photo, new File("/Users/fatemakhaleda/eclipse-workspace/CMSBDDFramework/screenshot/shot.png"));
	}

}
