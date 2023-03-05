Feature: Hubcomfy Vendor Shipping Address Olusturma


  @shipping_address @regression
  Scenario Outline:vendor_shipping_address_olusturma
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
    Then first name alanina "<firstname>" girildi
    Then last name alanina "<lastname>" girildi
    Then company name alanina "<companyname>" girildi
    Then country alani tiklandi
    Then dropdown alani tiklandi
    Then country alanina Turkey girildi
    Then street alanina "<street1>" girildi
    Then streett alanina "<street2>" girildi
    Then town city alanina "<towncity>" girildi
    Then province alani tiklandi
    Then province dropdownu tiklandi
    Then province alanina Adana girildi
    Then zipcode alanina "<zipcode>" girildi
    Then save butonuna tiklandi
    And driver kapatildi





    Examples: vendor_billing_bilgileri
      | firstname | lastname | companyname    | street1    | street2   | towncity | zipcode  |
      | Roza      | Mona     | Techpro        | Asiyan mah | Murg sok. | Seyhan   | 12345    |
      |           | Mona     | Techpro        | Asiyan mah | Murg sok. | Seyhan   | 12345    |
      | Roza      |          | Techpro        | Asiyan mah | Murg sok. | Seyhan   | 12345    |
      | Roza      | Mona     |                | Asiyan mah | Murg sok. | Seyhan   | 12345    |
      | Roza      | Mona     | Techpro        |            | Murg sok. | Seyhan   | 12345    |
      | Roza      | Mona     | Techpro        | Asiyan mah |           | Seyhan   | 12345    |
      | Roza      | Mona     | Techpro        | Asiyan mah | Murg sok. |          | 12345    |
      | Roza      | Mona     | Techpro        | Asiyan mah | Murg sok. | Seyhan   |          |




