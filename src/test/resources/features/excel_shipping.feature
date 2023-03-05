
@excel_shipping
Feature: excel_shipping_feature
  Scenario: TC01_vendor_shipping_address_testi
    Given Hubcomfy sayfasina gidildi
    Then signin butonuna tiklandi
    Then email girildi
    Then password girildi
    Then login butonuna tiklandi
    Then anasayfada oldugu dogrulandi
    Then my account yazisina tiklandi
    Then address yazisina tiklandi
    Then edit buton yazisina tiklandi
    Then var olan bilgiler silindi
    Then "vendor_info" ile giris yapildi