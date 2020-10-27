import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    private WebDriver driver;


    @Given("I am in the login page of the RO System")
    public void iAmInTheLoginPageOfTheROSystem() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rosws.generalsoftwareinc.net:8005/login");

    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {
        /*Hay que buscar aqui ahora como locarlizar lejor los campos usuario y contraseñá*/
        //driver.findElement(By.id("username")).sendKeys("rojupiter");
        //driver.findElement(By.id("username")).sendKeys("rojupiter");
        driver.findElement(By.id("company")).sendKeys("rojupiter");

    }

    @Then("I should be taken to the Home page")
    public void iShouldBeTakenToTheHomePage() {
    }
}
