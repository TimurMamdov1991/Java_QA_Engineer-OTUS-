import org.junit.*;
import org.openqa.selenium.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class FirstTest {
  WebDriver wd;



  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
    wd.quit();
  }


  @Test
  public void testFirstTest() {

    wd.get("https://otus.ru/");


  }

}

