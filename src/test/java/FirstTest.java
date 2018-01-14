import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void myFirstTest() throws InterruptedException {
        driver.get("http://localhost/litecart/admin/");
//        driver.get("https://google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(5);
//        driver.findElement(By.name("q")).sendKeys("webdriver", Keys.ENTER);
//        wait.until(titleIs("webdriver - Поиск в Google"));
    }


    @After
    public void stop() {
        driver.quit();
        driver = null;
    }

}