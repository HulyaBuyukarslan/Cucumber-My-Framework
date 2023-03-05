Feature: Hubcomfy Vendor Billing Address Olusturma

  @billing_address @testrunner
Scenario Outline:vendor_billing_address_olusturma
    Given Kullanici Hubcomfy sayfasina gider
    Then Kullanici signin butonuna tiklar
    Then Kullanici email girer
    Then Kullanici password girer
    Then Kullanici login butonuna tiklar
    Then Kullanici anasayfada oldugunu dogrular
    Then Kullanici my account yazisina tiklar
    Then Kullanici address yazisina tiklar
    Then Kullanici edit buton yazisina tiklar
    Then Kullanici var olan onceki bilgileri siler
    Then Kullanici first name alanina "<firstname>" girer
    Then Kullanici last name alanina "<lastname>" girer
    Then Kullanici company name alanina "<companyname>" girer
    Then Kullanici country alanini tiklar
    Then Kullanici dropdown alanini tiklar
    Then Kullanici country alanina Turkey girer
    Then Kullanici street1 alanina "<street1>" girer
    Then Kullanici street2 alanina "<street2>" girer
    Then Kullanici zipcode alanina "<zipcode>" girer
    Then Kullanici town city alanina "<towncity>" girer
    Then Kullanici province alanini tiklar
    Then Kullanici province dropdownu tiklar
    Then Kullanici province alanina Adana girer
    Then Kullanici phone alanina "<phone>" girer
    Then Kullanici save butonuna tiklar
    Then Kullanici driveri kapatir






    Examples: vendor_billing_bilgileri
      | firstname | lastname | companyname    | street1  | street2  | zipcode | towncity | phone         |
      | Ali       | Can      | Techpro        |Sevgi mah |Vefa sok. | 12345   | Ceyhan   |0555 444 33 22 |
      |           | Can      | Techpro        |Sevgi mah |Vefa sok. | 12345   | Ceyhan   |0555 444 33 22 |
      | Ali       |          | Techpro        |Sevgi mah |Vefa sok. | 12345   | Ceyhan   |0555 444 33 22 |
      | Ali       | Can      |                |Sevgi mah |Vefa sok. | 12345   | Ceyhan   |0555 444 33 22 |
      | Ali       | Can      | Techpro        |Sevgi mah |Vefa sok. | 12345   | Ceyhan   |0555 444 33 22 |
      | Ali       | Can      | Techpro        |          |Vefa sok. | 12345   | Ceyhan   |0555 444 33 22 |
      | Ali       | Can      | Techpro        |Sevgi mah |          | 12345   | Ceyhan   |0555 444 33 22 |
      | Ali       | Can      | Techpro        |Sevgi mah |Vefa sok. |         | Ceyhan   |0555 444 33 22 |
      | Ali       | Can      | Techpro        |Sevgi mah |Vefa sok. | 12345   |          |0555 444 33 22 |
      | Ali       | Can      | Techpro        |Sevgi mah |Vefa sok. | 12345   | Ceyhan   |0555 444 33 22 |
      | Ali       | Can      | Techpro        |Sevgi mah |Vefa sok. | 12345   |  Ceyhan  |               |















