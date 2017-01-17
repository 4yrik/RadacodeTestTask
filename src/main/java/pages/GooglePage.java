package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.*;
import java.util.*;

public class GooglePage {

    private WebDriver driver;

    @FindBy(name = "q")
    private WebElement searchInput;

    @FindBy(css = ".rc a")
    private List<WebElement> responseLinks;

    public GooglePage(WebDriver driver){
        this.driver = driver;
        driver.get("https://www.google.com.ua/");
        PageFactory.initElements(driver, this);
    }

    public GooglePage search(String query){
        searchInput.sendKeys(query);
        searchInput.submit();
        return this;
    }

    public HabrahabrPage clickHabrahabrLink(){
        for(WebElement link: responseLinks){
            if(link.getAttribute("href").split("//")[1].startsWith("habrahabr.ru")){
                link.click();
                return new HabrahabrPage(driver);
            }
        }
        throw new NoSuchElementException("There is no habrahabr.ru in search response");
    }
}
