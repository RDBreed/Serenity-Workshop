package nl.conspect.serenity_bdd.features;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "classpath:features/google-example/google.feature", glue = "nl.conspect.serenity_bdd.features.google")
public class GoogleSearchTest {

}
