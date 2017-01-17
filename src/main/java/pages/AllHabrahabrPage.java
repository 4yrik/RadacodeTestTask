package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import java.util.List;

public class AllHabrahabrPage {

    private WebDriver driver;

    @FindBy(css = "#nav-pages li")
    private List<WebElement> paginatorPages;

    public AllHabrahabrPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AllHabrahabrPage clickPaginatorPage(int pageNumber){
        paginatorPages.get(pageNumber - 1).click();
        return this;
    }
}
