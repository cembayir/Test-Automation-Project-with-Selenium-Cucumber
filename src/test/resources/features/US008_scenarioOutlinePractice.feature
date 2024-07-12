Feature: Datatables sitesine 5 farklı kullanici girisi yapalim

  Scenario Outline: TC01 Kullanici 5 farkli kayit girisi yapabilmeli
    When kullanici "dataURL" anasayfasina gider
    Then kullanici new butonuna basar
    And kullanici isim bolumune "<firstName>" yazar
    And kullanici 1 saniye bekler
    And kullanici soyisim bolumune "<lastName>" yazar
    And kullanici 1 saniye bekler
    And kullanici position bolumune "<position>" yazar
    And kullanici 1 saniye bekler
    And kullanici office bolumune "<office>" yazar
    And kullanici 1 saniye bekler
    And kullanici extension bolumune "<extension>" yazar
    And kullanici 1 saniye bekler
    And kullanici startDate bolumune "<startDate>" yazar
    And kullanici 1 saniye bekler
    And kullanici salary bolumune "<salary>" yazar
    And kullanici 1 saniye bekler
    And kullanici create butonuna basar
    And kullanici 1 saniye bekler
    When kullanici "<firstName>" ile arama yapar
    And kullanici 2 saniye bekler
    And isim bolumunda "<firstName>" yazdigini test eder
    And sayfayi kapatir
    Examples:
      | firstName | lastName | position    | office | extension | startDate  | salary |
      | Cem       | Bayir    | QA          | TURKEY | UI        | 2023-07-10 | 90000  |
      | Can       | Bayir    | Tester      | TURKEY | API       | 2023-08-03 | 80000  |
      | Erdal     | Ozcan    | Developer   | TURKEY | Backend   | 2023-09-27 | 70000  |
      | Ahmet     | Keskin   | UI Designer | TURKEY | UI        | 2023-10-21 | 60000  |
      | Mehmet    | Demir    | QA          | TURKEY | UI        | 2023-11-19 | 50000  |