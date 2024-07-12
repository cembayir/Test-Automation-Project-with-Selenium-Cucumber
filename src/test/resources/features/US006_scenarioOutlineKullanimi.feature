Feature: Scenario Outline Kullanımı

  Scenario Outline: TC01 Kullanici istedigi kelimeleri aratir
    Given Kullanici amazon sayfasina gider
    Then kullanici "<istenenKelime>" icin arama yapar
    Then sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | iphone        | iphone               |
      | selenium      | selenium             |
      | SQL           | SQL                  |