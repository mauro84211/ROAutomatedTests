package pages;

import org.openqa.selenium.WebDriver;

public class DispatchMenu {
    private WebDriver driver;

    public DispatchMenu(WebDriver driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
