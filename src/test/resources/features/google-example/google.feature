Feature: ik wil zoekresultaten krijgen als ik zoek.

  Scenario Outline: ik wil zoekresultaten krijgen als ik woorden intype.
    Given ik open de google hoofdpagina
    When ik type het woord <woord> in en druk op enter
    Then ik krijg resultaten te zien

    Examples:
      | woord    |
      | test     |
      | conspect |




