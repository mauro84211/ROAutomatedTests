package pages;

import org.openqa.selenium.WebDriver;

public class OptimizePage {
    private WebDriver driver;

    public OptimizePage(WebDriver driver){
        this.driver = driver;
    }

    public  String getUrl (){
        return driver.getCurrentUrl();
    }
}
