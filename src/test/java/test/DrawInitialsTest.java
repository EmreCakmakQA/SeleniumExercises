
package test;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.HomePage;

public class DrawInitialsTest {
	private static RemoteWebDriver driver;
	Actions action = new Actions(driver);

	HomePage nav = PageFactory.initElements(driver, HomePage.class);

	@BeforeClass
	public static void init() {
		System.setProperty("webdriver.gecko.driver", "src/test/resources/resources/geckodriver.exe");
		FirefoxOptions fOptions = new FirefoxOptions();
		fOptions.setHeadless(false);
		driver = new FirefoxDriver(fOptions);
		fOptions.addPreference("profile.default_content_setting_values.cookies", 2);
		fOptions.addPreference("network.cookie.cookieBehavior", 2);
		fOptions.addPreference("profile.block_thirdt_party_cookies", true);
		driver.manage().window().setSize(new Dimension(1366, 768));

	}

	@Before
	public void setup() {
		driver.get(nav.URL);
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

	@Test
	public void drawInitial() throws InterruptedException {
		WebElement canvas = driver.findElement(By.cssSelector("#catch"));
		nav.clickBrush();
		action.moveToElement(canvas).clickAndHold().moveByOffset(100, 100).build().perform();
	}

}
