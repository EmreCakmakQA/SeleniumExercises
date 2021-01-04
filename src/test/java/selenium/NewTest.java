package selenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewTest {
	 private WebDriver driver;

	    @Before
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().setSize(new Dimension(1366, 768));

	    }
 
  @Test
  public void newtest() {
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();
    driver.findElement(By.cssSelector(".inventory_item:nth-child(1) .btn_primary")).click();
    driver.findElement(By.cssSelector("path")).click();
    driver.findElement(By.linkText("CHECKOUT")).click();
    driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).sendKeys("Eme");
    driver.findElement(By.cssSelector("*[data-test=\"lastName\"]")).sendKeys("Ckmk");
    driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]")).sendKeys("N1 0DK");
    driver.findElement(By.cssSelector(".btn_primary")).click();
    driver.findElement(By.linkText("FINISH")).click();
  }
  
  @After
  public void tearDown() {
    driver.quit();
  }
}
