package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
