import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

public class Steps extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    @Given("I am in the login page of the RO System")
    public void iAmInTheLoginPageOfTheROSystem() {
        setUp();
        loginPage = new LoginPage(driver);
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
        /*Hay que buscar aqui ahora como locarlizar lejor los campos usuario y contraseñá*/
        loginPage.setUsername("rojupiter");
        loginPage.setPassword("rojupiter");
        loginPage.setCompany("rojupiter");
        homePage = loginPage.clickLoginButton();
    }

    @Then("I should be taken to the Home page")
    public void iShouldBeTakenToTheHomePage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search")));
        Assert.assertEquals(homePage.getUrl(), "https://rosws.generalsoftwareinc.net:8004/setup/locations/pickup", "Not Login");
    }
}
