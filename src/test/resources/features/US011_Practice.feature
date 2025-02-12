Feature: Class Work

  Scenario Outline: TC01 kullanici sutun basligi ile liste alabilmeli
    Given kullanici "guruURL" anasayfasina gider
    And "<Basliklar>" sutunundaki tum degerleri yazdirir
    Examples:
      | Basliklar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Price (Rs) |
      | % Change           |

  Scenario: kullanici sayfayi kapatir
    Given sayfayi kapatir