
package selenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrawInitialsTest {
	private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1366, 768));

    }

  @Test
  public void drawInitials() {
    driver.get("https://www.youidraw.com/apps/painter/");
    driver.manage().window().setSize(new Dimension(1536, 824));
    driver.findElement(By.id("brush")).click();
    driver.findElement(By.id("text")).click();
    driver.findElement(By.id("catch")).click();
    driver.findElement(By.id("edText")).sendKeys("EC\\n");
    driver.findElement(By.id("catch")).click();
    driver.findElement(By.id("catch")).click();
  }
  
  @After
  public void tearDown() {
    driver.quit();
  }
}
