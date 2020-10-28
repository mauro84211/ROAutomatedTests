import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Steps {
    private WebDriver driver;
    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.setAcceptInsecureCerts(true);
        //options.setHeadless(true); /*Para que no se levante el navegador durante las pruebas*/
        return options;
    }


    @Given("I am in the login page of the RO System")
    public void iAmInTheLoginPageOfTheROSystem() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver(getChromeOptions());
        driver.get("https://rosws.generalsoftwareinc.net:8004/login");

    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {
        /*Hay que buscar aqui ahora como locarlizar lejor los campos usuario y contraseñá*/
        driver.findElement(By.id("username")).sendKeys("rojupiter");
        driver.findElement(By.id("password")).sendKeys("rojupiter");
        driver.findElement(By.id("company")).sendKeys("rojupiter");
        driver.findElement(By.xpath("//button[@class='bp3-button bp3-active bp3-fill bp3-large sc-ePZHVD hbcjPd']") ).click();

    }

    @Then("I should be taken to the Home page")
    public void iShouldBeTakenToTheHomePage() {
        Assert.assertEquals(driver.getTitle(),"Welltrax - Bulk Transportation Management", "Not Login");
    }
}
