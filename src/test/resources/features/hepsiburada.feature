Feature: Hepsi Burada Çoklu Kredi Kartı

 Background: coklu_kredi_karti_sayfasina_git


@TC01
  Scenario: İlgili_panelin_gorunur_olmasi
  Given kullanici "https://www.hepsiburada.com/" adresine gider
  When kullanici Giris Yap yazisinin ustune gelir ve bekler
  Then kullanici cikan dropdowndan giris yap' tiklar
  Then kullanici e-posta alanina e-posta girer
  Then kullanici giris yap butonuna tiklar
  Then kullanici sifre alanina sifre girer
  Then kullanici Giris yap butonuna tiklar
  Then kullanici arama butonuna kitaplik yazar
  Then cikan ilk urun icin sepete ekle tiklar
  Then cikan pop-up ta sepete git tiklar
  Then alis-veris tamamla tiklar
  Then cikan sayfada diger odeme seceneklerine tiklar
  Then coklu kredi kartina tiklar



