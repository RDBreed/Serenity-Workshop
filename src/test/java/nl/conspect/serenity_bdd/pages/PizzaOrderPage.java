package nl.conspect.serenity_bdd.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class PizzaOrderPage {

    /**
     * Door een htmlheader die meegaat met de pagina wanneer je scrollt, kan het zijn dat de button
     * op het moment van klikken precies op de verkeerde plek zit. Daarom verplaatsen we eerst
     * naar de button die onderin zit en daarna naar de container die erboven zit.
     * @param productName naam van product zoals opgevoerd
     * @param productButtonId id van knop waarop geklikt wordt
     */
    private void moveToCorrectLocationOfButton(String productName, String productButtonId){
        moveTo(By.id(productButtonId + productName));
        moveTo(By.id("product-" + productName));
    }
}
