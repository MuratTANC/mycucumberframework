@smoke
Feature: US1007_kullanici_data_ekleyebilmeli

  Scenario Outline: TC09_5_farkli_kisi_ile_farkli_kombinasyonlari_calismali

    When kullanici "datatable_url" anasayfaya gider
    Then new butonuna basar
    And first name girer "<firstname>"
    And "1" saniye bekler
    And Last name girer "<lastname>"
    And Position girer "<position>"
    And Office girer "<office>"
    And Extention girer "<extention>"
    And Start date girer "<date>"
    And Salary girer "<salary>"
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu dogrular
    And kullanici sayfayi kapatir

    Examples:
      | firstname | lastname | position | office | extention | date | salary |
      |murat      |tanc      |teacher   |istnbul |Dr.        |2020-12-20    |1000    |
      |mehmet     |bulut     |manager   |ankara  |Master     |2019-01-01    |5000    |
      |yusuf      |evgin     |student   |london  |Expert     |2018-02-02    |500     |
      |mustafa    |kurt      |student   |paris   |Senior     |2017-03-03    |750     |
      |sena       |yaman     |student   |new york|Junior     |2016-04-04    |5000    |
