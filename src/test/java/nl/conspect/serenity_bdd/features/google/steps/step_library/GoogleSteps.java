package nl.conspect.serenity_bdd.features.google.steps.step_library;

import net.thucydides.core.annotations.Step;
import nl.conspect.serenity_bdd.pages.GoogleHomePage;
import org.fluentlenium.core.annotation.Page;

public class GoogleSteps {

    @Page
    private GoogleHomePage googleHomePage;

    @Step
    public void openGoogle() {
        googleHomePage.open();
    }

    @Step
    public void typeAWord(String word) {
        googleHomePage.typeWordAndEnter(word);
    }

    @Step
    public void showResults() {
        googleHomePage.waitForResults();
    }
}


