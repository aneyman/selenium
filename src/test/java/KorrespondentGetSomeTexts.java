import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KorrespondentGetSomeTexts {


    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void korrTest() throws InterruptedException {
        driver.navigate().to("https://korrespondent.net/");
        String searchtext = driver.findElement(By.xpath("//*[@id=\"search_div\"]/a/b")).getText();
        System.out.println("search text = " + searchtext);
        String searchFirstNews = driver.findElement(By.xpath("//*[@id=\"ajNews1055\"]/div[2]/div[2]/div[1]/div[2]/a")).getText();
        System.out.println("First row text = " + searchFirstNews);
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }


}
