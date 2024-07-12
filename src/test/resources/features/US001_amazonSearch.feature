Feature: Amazon Search Testi

  Scenario: TC01 Kullanici searchbox test eder
    Given Kullanici amazon sayfasina gider
    When Kullanici Iphone aratir
    Then Kullanici sonuçlarin Iphone içerdigini test eder
    And Kullanici sayfayi kapatir

  Scenario: TC02 Kullanici searchbox test eder
    Given Kullanici amazon sayfasina gider
    When Kullanici Selenium aratir
    Then Kullanici sonuçlarin Selenium içerdigini test eder
    And Kullanici sayfayi kapatir

  Scenario: TC03 Kullanici searchbox test eder
    Given Kullanici amazon sayfasina gider
    When Kullanici Java aratir
    Then Kullanici sonuçlarin Java içerdigini test eder
    And Kullanici sayfayi kapatir