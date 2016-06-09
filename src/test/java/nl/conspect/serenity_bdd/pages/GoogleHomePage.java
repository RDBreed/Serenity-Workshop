package nl.conspect.serenity_bdd.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://google.nl")
public class GoogleHomePage extends PageObject{


    public void typeWordAndEnter(String word) {
        $("#lst-ib").typeAndEnter(word);
    }

    public void waitForResults() {
        $("#ires").waitUntilPresent();
        $("#ires").waitUntilVisible();
    }
}
