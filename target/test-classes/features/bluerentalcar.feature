@bluerentalcar
Feature: Blue Rental Car Login Olma

  @manager_login
  Scenario Outline:manager_login_test
   Given kullanici Blue Rental Car sayfasina gider
   When kullanici login yazisina tiklar
   Then kullanici login sayfasinda oldugunu dogrular
   Then kullanici email address alanina "<emailaddress>" girer
   Then kullanici password alanina "<password>" girer
   Then kullanici login butonuna tiklar
   Then kullanici sag ust kosede ismini gordugunu dogrular
   Then kullanici ismine tiklar
   Then kullanici dropdowndan logout secenegine tiklar
   Then kullanici ok butonuna tiklar
   Then kullanici ana sayfada oldugunu dogrular
   Then kullanici driver kapatir


    Examples:
      |emailaddress                   | password   |
      |sam.walker@bluerentalcars.com  | c!fas_art  |
      |kate.brown@bluerentalcars.com  | tad1$Fas   |
      |raj.khan@bluerentalcars.com    | v7Hg_va^   |
      |pam.raymond@bluerentalcars.com | Nga^g6!    |
