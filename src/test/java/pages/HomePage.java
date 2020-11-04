package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    private By dispatchButton = By.xpath("//span[@title='Optimize']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public DispatchPage clickOptimizeButton() {
        driver.findElement(dispatchButton).click();
        return new DispatchPage(driver);
    }
}
