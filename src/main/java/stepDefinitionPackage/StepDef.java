package stepDefinitionPackage;

import java.io.IOException;

import commonMethodPackage.CommonMethod;
import elementPackage.LogIn;
import elementPackage.LogIn1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	CommonMethod cm=new CommonMethod();
	LogIn logIn=new LogIn(BaseClass.driver);
	LogIn1 logIn1=new LogIn1(BaseClass.driver);
	
	@Given("user is on the cms homepage")
	public void user_is_on_the_cms_homepage() {
	String	homeTitle=logIn.cmsTitle(cm,BaseClass.driver );
	System.out.println("HomePage Title: "+homeTitle);
		}
	@When("user enter username")
	public void user_enter_username() {
		logIn.userName(cm);
	}

	@When("user enter password")
	public void user_enter_password() {
		logIn.passWord(cm);
	   }
	@When("user enter {string}")
	public void user_enter(String username) {
	    logIn1.userName(cm, username);
	}

	@When("user enter {string} pass field")
	public void user_enter_pass_field(String pass) {
	    logIn1.passWord(cm, pass);
	}
	
	@When("user click on login button")
	public void user_click_on_login_button() {
		logIn.submitButton(cm);
	   }

	@Then("displays invalid credentials")
	public void displays_invalid_credentials() {
		String	title=logIn.cmsTitle(cm,BaseClass.driver );
		System.out.println("Title after click submit button: "+title);
	}
	@Then("displays invalid credentials info")
	public void displays_invalid_credentials_info() throws IOException {
	    logIn1.screenShot(BaseClass.driver);
	}
}
