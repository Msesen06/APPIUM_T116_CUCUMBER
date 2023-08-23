@deneme
Feature: kullanici kiwiApp fonksiyonlarini kontrol eder

  Scenario: kullanici kiwiApp uzerinden bilet arama islemi gerceklestirir
    Given kullanici kiwi  uygulmasini acar
    Then kullanici bilet al a tiklar
    Then bilet bilgilerini getirir




  Scenario: kullanici kiwiApp uzerinden kullanici bilgileri bolumunu test eder
    Given kullanici kiwiApp uygulamasini acar
    Then  kullanici tarih bolumune tiklar