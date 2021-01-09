@amazon
Feature: US1004

  Scenario Outline: TC06_coklu_arama

    When kullanici amazon anasayfaya gider
    Then "<arananlar>" icin arama yapar
    And sonucun "<arananlar>" icerdigini test eder
    And kullanici sayfayi kapatir

    Examples:
    |arananlar|
    |murat    |
    |iphone   |
    |samsung  |
    |headphone|
    |pencil   |