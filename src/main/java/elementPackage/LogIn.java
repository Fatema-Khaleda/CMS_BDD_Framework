package elementPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethodPackage.CommonMethod;

public class LogIn {
	
	public LogIn (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='cms-login-userId']")
	public WebElement UserName;
	@FindBy(xpath = "//input[@id='cms-login-password']")
	public WebElement Password;
	@FindBy(id = "cms-login-submit")
	public WebElement SubmitButton;
	
	public void userName(CommonMethod cm) {
		cm.entertext(UserName,"Fatema");
	}
	public void passWord( CommonMethod cm) {
		cm.entertext(Password, "12345");
	}
	public void submitButton( CommonMethod cm) {
		cm.toClick(SubmitButton);
	}
	public String cmsTitle(CommonMethod cm, WebDriver driver) {
	return	cm.title(driver);
	}

}
