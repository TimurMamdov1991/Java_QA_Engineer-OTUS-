import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

public class FirstTest {
   WebDriver wd;

  private static final Logger logger = LogManager.getLogger(FirstTest.class);

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
    wd.quit();
  }


  @Test
  public void testFirstTest() {
    logger.info("Start test FirstTest!");
    WebDriverFactory();
    wd.get("https://otus.ru/");
    logger.info("Stop test FirstTest!");

  }

  private void WebDriverFactory() {
    String browser = BrowserType.FIREFOX;
    if (browser.equals(BrowserType.FIREFOX)){
      wd = new FirefoxDriver();
    } else if (browser.equals(BrowserType.CHROME)) {
      wd = new ChromeDriver();
    }
  }


}
