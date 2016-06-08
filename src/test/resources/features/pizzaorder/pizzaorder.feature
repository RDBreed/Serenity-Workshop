Feature: als klant wil ik producten kunnen bestellen.

  Scenario Outline: als klant wil ik één product kunnen bestellen.
    Given: een klant opent de homepagina
    When: een klant kiest een product <productnaam>
    When: een klant gaat verder en vult gegevens in
    Then: een klant heeft succesvol besteld

    Examples:
      | productname |
      | Hawai       |
      | Bbq         |

  Scenario Outline: als klant wil ik meerdere producten kunnen bestellen.
    Given: een klant opent de homepagina
    When: een klant kiest producten <productnamen>
    When: een klant gaat verder en vult gegevens in
    Then: een klant heeft succesvol besteld

    Examples:
      | productname |
      | Hawai,Bbq   |