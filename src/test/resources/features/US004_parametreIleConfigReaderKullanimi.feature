Feature: Parametre ile ConfigReader Kullanımı

  @ConfigReader
  Scenario: TC01 Parametre ile ConfigReader Kullanimi
    Given kullanici "faceURL" sayfasina gider
    Then kullanici 2 saniye bekler
    When urlin "facebook" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Parametre ile ConfigReader Kullanimi
    Given kullanici "google" sayfasina gider
    Then kullanici 2 saniye bekler
    When urlin "google" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC03 Parametre ile ConfigReader Kullanimi
    Given kullanici "amazonURL" sayfasina gider
    Then kullanici 2 saniye bekler
    When urlin "amazon" icerdigini test eder
    And sayfayi kapatir