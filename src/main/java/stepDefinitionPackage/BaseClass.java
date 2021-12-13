package stepDefinitionPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {

	public static WebDriver driver;

	@Before
	public void cmsHomePage() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/fatemakhaleda/eclipse-workspace/CMSBDDFramework/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://portaldev.cms.gov/portal/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}

}
