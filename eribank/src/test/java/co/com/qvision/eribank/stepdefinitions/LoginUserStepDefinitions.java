package co.com.qvision.eribank.stepdefinitions;

import co.com.qvision.eribank.questions.HomePageQuestion;
import co.com.qvision.eribank.tasks.LoginToTheApp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginUserStepDefinitions {

    private String userName = "company";
    private String userPassword = "company";


    @Before
    public void PrepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that wilson open the app$")
    public void thatWilsonOpenTheApp() {
        OnStage.theActorCalled("wilson");
    }


    @When("^he enters with valid user data$")
    public void heEntersWithValidUserData() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginToTheApp.withUserData(userName, userPassword));

    }

    @Then("^he can see the main menu$")
    public void heCanSeeTheMainMenu() {
        theActorInTheSpotlight().should(seeThat(HomePageQuestion.isClickable()));

    }

}
