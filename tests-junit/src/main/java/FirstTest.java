import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class FirstTest {
  private WebDriver driver;

  private static final Logger logger = LogManager.getLogger(FirstTest.class);

  @Before
  public void setUp() {
    driver = new ChromeDriver();
  }

  @After
  public void tearDown() {
    driver.quit();
  }


  @Test
  public void testFirstTest() {
    logger.info("Start test FirstTest!");
    driver.get("https://otus.ru/");
    logger.info("Stop test FirstTest!");

  }


}
