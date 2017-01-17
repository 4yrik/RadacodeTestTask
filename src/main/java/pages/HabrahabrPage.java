package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import java.util.List;

public class HabrahabrPage {

    private WebDriver driver;

    @FindBy(css = "ul.tabs-menu_habrahabr li")
    private List<WebElement> menu;

    public HabrahabrPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AllHabrahabrPage clickAllMenuItem(){
        menu.get(0).click();
        return new AllHabrahabrPage(driver);
    }
}
