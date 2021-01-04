// Generated by Selenium IDE
package selenium;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestcaseTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testcase() {
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().setSize(new Dimension(1536, 824));
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();
    driver.findElement(By.cssSelector(".inventory_item:nth-child(1) .btn_primary")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".inventory_item:nth-child(1) .btn_primary"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".inventory_item:nth-child(2) .btn_primary")).click();
    driver.findElement(By.cssSelector(".inventory_item:nth-child(3) .btn_primary")).click();
    driver.findElement(By.cssSelector(".inventory_item:nth-child(4) .btn_primary")).click();
    driver.findElement(By.cssSelector(".inventory_item:nth-child(5) .btn_primary")).click();
    driver.findElement(By.cssSelector(".btn_primary")).click();
    driver.findElement(By.cssSelector("path")).click();
    driver.findElement(By.linkText("CHECKOUT")).click();
  }
}