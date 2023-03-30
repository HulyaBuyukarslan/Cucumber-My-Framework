@oda_olusturma
Feature:Medunna oda olusturma

 Background: TC01_Medunna_Login_Olma
  Given kullanici medunna sayfasina gider
  When kullanici insan ikonuna tiklar
  Then kullanici sign in yazisina tiklar
  *   kullanici username alanina username girer
  *   kullanici password alanina password girer
  *   kullanici Remember me kutusunu tiklar
  *   kullanici Sign in butonuna tiklar
  *   kullanici ikonun yaninda ismini gorur


@medunna_oda_olusturma
Scenario: TC02_Oda_Olusturma
 Given kullanici Items Titles yazisina tiklar
 When kullanici cikan dropdowndan Room secer
 Then kullanici Create a new Room yazisina tiklar
 *  kullanici Room Number alanina room number girer
 *  kullanici Room Type dropdowndan room type secer
 *  kullanici status kutusuna tiklar
 *  kullanici Price alanina price girer
 *  kullanici Description alanina description girer
 *  kullanici Save butonuna tiklar



