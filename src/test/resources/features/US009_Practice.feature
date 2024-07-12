Feature: Herokuapp Delete Testi

  Scenario: TC01 Herokuapp adresinden delete butonu calismali
    Given Kullanici "herokuappURL" anasayfasinda
    And Add Element butonuna basar
    And kullanici 3 sn bekler
    Then Delete butonu gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    Then Delete butonuna basar
    And Delete butonunun gorunur olmadigini test eder
    And sayfayi kapatir