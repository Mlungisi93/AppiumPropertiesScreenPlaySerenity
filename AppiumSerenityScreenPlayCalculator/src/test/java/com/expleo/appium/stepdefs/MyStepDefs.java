package com.expleo.appium.stepdefs;

import com.expleo.appium.model.Calculator;
import com.expleo.appium.question.factory.OutputScreen;
import com.expleo.appium.tasks.AddNumbers;
import com.expleo.appium.ui.CalculatorPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class MyStepDefs {

    @Managed(driver = "Appium")
    public WebDriver hisMobileDivice;
    private Calculator calculator = new Calculator();
    List<Calculator> calculations = new ArrayList<>();


    /*
    Before a Screenplay actor can interact with a web page, we need to give them a WebDriver instance to work with.
     You do this with the BrowseTheWeb ability. In a JUnit test, this code could look like the following:
@Managed
WebDriver driver;
...
Actor sam = Actor.named("Sam");
sam.can(BrowseTheWeb.with(driver));

    If you are using Cucumber, Serenity will manage the WebDriver instances for you.
     You just need to define a Cast object, whose job it is to provide actors to the scenarios.
     A simple approach is to use the OnlineCast, which returns actors who can all browse the web with the default browser:
@Before
public void setTheStage() {
    OnStage.setTheStage(new OnlineCast());
}
     */

    @Before
    public void set_the_stage()
    {
        OnStage.setTheStage(new OnlineCast());
        this.calculator=new Calculator.CalculatorBuilder().called("1+1").withOutput("2").build();
    }

    /*
Before a Screenplay actor can interact with a web page, we need to give them a WebDriver instance to work with. You do this with the BrowseTheWeb ability. In a JUnit test, this code could look like the following:
@Managed
WebDriver driver;
...
Actor sam = Actor.named("Sam");
sam.can(BrowseTheWeb.with(driver));
 */
    @Given("^That \"([^\"]*)\" opens calculator$")
    public void that_opens_calculator(String actorName){
        theActorCalled(actorName).can(BrowseTheWeb.with(hisMobileDivice));
        System.out.println("Launching the App.........");

    }

    @When("^He add two numbers$")
    public void he_add_two_numbers(){
    theActorInTheSpotlight().attemptsTo(AddNumbers.with(calculator));
    }

    @Then("^The correct results should be displayed$")
    public void the_correct_results_should_be_displayed(){


        theActorInTheSpotlight().should(
                seeThat(OutputScreen.results(), equalTo(calculator.getOutput()))
        );

    }



}
