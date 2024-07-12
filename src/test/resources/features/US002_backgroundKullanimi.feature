Feature: Background Kullanımı

  Background: Ortak Adimlar
    Given Kullanici amazon sayfasina gider

  @senaryo1
  Scenario: TC01 Kullanici searchbox test eder
    When Kullanici Iphone aratir
    Then Kullanici sonuçlarin Iphone içerdigini test eder

  Scenario: TC02 Kullanici searchbox test eder
    When Kullanici Selenium aratir
    Then Kullanici sonuçlarin Selenium içerdigini test eder

  Scenario: TC03 Kullanici searchbox test eder
    When Kullanici Java aratir
    Then Kullanici sonuçlarin Java içerdigini test eder
    And Kullanici sayfayi kapatir
