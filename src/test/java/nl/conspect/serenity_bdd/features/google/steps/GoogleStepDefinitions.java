package nl.conspect.serenity_bdd.features.google.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import nl.conspect.serenity_bdd.features.google.steps.step_library.GoogleSteps;

public class GoogleStepDefinitions {

    @Steps
    private GoogleSteps googleSteps;

    @Given("ik open de google hoofdpagina")
    public void openGoogle() {
        googleSteps.openGoogle();
    }

    @When("ik type het woord (.*) in en druk op enter")
    public void typeAWord(String word) {
        googleSteps.typeAWord(word);
    }

    @Then("ik krijg resultaten te zien")
    public void showResults() {
        googleSteps.showResults();
    }
}
