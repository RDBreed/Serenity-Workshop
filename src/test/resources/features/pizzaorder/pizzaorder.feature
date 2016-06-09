#language:nl
  Functionaliteit: als klant wil ik producten kunnen bestellen.

  Abstract Scenario: als klant wil ik één product kunnen bestellen.
    Gegeven  een klant opent de homepagina
    Als een klant kiest een product <productnaam>
    En : een klant gaat verder en vult gegevens in
    Dan : een klant heeft succesvol besteld

    Voorbeelden:
      | productname |
      | Hawai       |
      | Bbq         |

  Abstract Scenario: als klant wil ik meerdere producten kunnen bestellen.
    Gegeven : een klant opent de homepagina
    Als : een klant kiest producten <productnamen>
    En : een klant gaat verder en vult gegevens in
    Dan : een klant heeft succesvol besteld

    Voorbeelden:
      | productname |
      | Hawai,Bbq   |

  Abstract Scenario: als klant wil ik éen product kunnen bestellen met extra toevoeging(en).
    Gegeven : een klant opent de homepagina
    Als : een klant kiest producten <productnamen> met toevoeging(en) <toevoeging>
    En : een klant gaat verder en vult gegevens in
    Dan : een klant heeft succesvol besteld

    Voorbeelden:
      | productname | toevoeging |
      | Hawai       | Salami     |