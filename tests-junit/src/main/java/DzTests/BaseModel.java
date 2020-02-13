package DzTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public abstract class BaseModel  {


    protected WebDriver wd;

    @BeforeClass
    public static void setUpClass() {
      WebDriverManager.chromedriver().setup();
      WebDriverManager.firefoxdriver().setup();

    }

    @After
    public void tearDown() {
      if (wd != null) {
        wd.quit();
      }
    }


}
