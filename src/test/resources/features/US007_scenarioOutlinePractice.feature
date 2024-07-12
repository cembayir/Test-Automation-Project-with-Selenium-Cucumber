Feature: Scenario Outline Practice

  Scenario Outline: TC01 ConfigReader ile Scenario Outline Kullanimi
    Given kullanici "<arananURL>" sayfasina gider
    Then kullanici 2 saniye bekler
    When urlin "<istenenURL>" oldugunu tes teder
    And  sayfayi kapatir
    Examples:
      | arananURL | istenenURL |
      | amazonURL | amazon     |
      | faceURL   | facebook   |
      | google    | google     |
      | brcURL    | blue       |