package ftse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TopRisersTest {
	private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1366, 768));

    }
  
    @Test
    public void getTopRisers() {
     driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");
     driver.manage().window().setSize(new Dimension(1536, 824));
     driver.findElement(By.cssSelector(".one-line:nth-child(2) strong")).click();
    }
  
  @After
  public void tearDown() {
    driver.quit();
  }
}





