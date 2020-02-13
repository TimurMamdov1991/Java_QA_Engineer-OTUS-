package DzTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class YandexMarket extends BaseModel {


    private static final Logger logger = LogManager.getLogger(YandexMarket.class);



    @Test
    public void testUntitledTestCase(){
      FirefoxOptions options = new FirefoxOptions();
      options.setHeadless(false);
      wd = new FirefoxDriver(options);
      
      logger.info("Start test Yandex!");
      wd.get("https://yandex.ru/");
      wd.findElement(By.linkText("Маркет")).click();
      wd.findElement(By.linkText("Электроника")).click();
      wd.findElement(By.linkText("Мобильные телефоны")).click();
      wd.findElement(By.xpath("//li[9]/div/a/label/div")).click();
      wd.findElement(By.xpath("//li[12]/div/a/label/div")).click();
      wd.findElement(By.linkText("по цене")).click();
      wd.findElement(By.xpath("//div[10]/div/div/div/div/i")).click();
      wd.findElement(By.xpath("//div[21]/div/div/div/div/i")).click();
      wd.findElement(By.xpath("//a[2]/span[2]")).click();
      logger.info("Stop test Yandex!");
    }


  @Test
  public void testUntitledTestCase2(){
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    wd = new ChromeDriver(options);

    logger.info("Start test Yandex!");
    wd.get("https://yandex.ru/");
    wd.findElement(By.linkText("Маркет")).click();
    wd.findElement(By.linkText("Электроника")).click();
    wd.findElement(By.linkText("Мобильные телефоны")).click();
    wd.findElement(By.xpath("//li[9]/div/a/label/div")).click();
    wd.findElement(By.xpath("//li[12]/div/a/label/div")).click();
    wd.findElement(By.linkText("по цене")).click();
    wd.findElement(By.xpath("//div[10]/div/div/div/div/i")).click();
    wd.findElement(By.xpath("//div[21]/div/div/div/div/i")).click();
    wd.findElement(By.xpath("//a[2]/span[2]")).click();
    logger.info("Stop test Yandex!");
  }





}


