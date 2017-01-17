import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GooglePage;
import java.util.concurrent.TimeUnit;

public class MainClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/user/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        new GooglePage(driver).search("habrahabr")
                              .clickHabrahabrLink()
                              .clickAllMenuItem()
                              .clickPaginatorPage(2);
        
        driver.quit();
    }
}
