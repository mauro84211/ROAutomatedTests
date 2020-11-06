package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By dispatchButton = By.xpath("//span[@title='Dispatch']");
    private By optimizeButton = By.xpath("//span[@title='Optimize']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    /*public void clickDispatchMenu(){
        driver.findElement(dispatchButton).click();
    }*/

    public DispatchMenu clickDispatchMenu(){
        driver.findElement(dispatchButton).click();
        return  new DispatchMenu(driver);
    }

    public OptimizePage clickOptimizeButton(){
        driver.findElement(optimizeButton).click();
        return new OptimizePage(driver);
    }
}
