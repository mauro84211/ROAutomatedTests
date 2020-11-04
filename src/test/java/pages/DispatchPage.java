package pages;

import org.openqa.selenium.WebDriver;

public class DispatchPage {
    private final WebDriver driver;

    public DispatchPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
