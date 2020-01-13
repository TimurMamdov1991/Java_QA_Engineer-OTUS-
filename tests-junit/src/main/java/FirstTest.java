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

  public static void main(String[] args) {
    logger.info("test start");
    logger.info("test end");
  }

  @Test
  public void testUntitledTestCase() {
    driver.get("https://otus.ru/");
  }


}
