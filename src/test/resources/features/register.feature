Feature: Register for Hubcomfy


  @register
    Scenario:to be register
    Given user go to "https://hubcomfy.com/"
    Then user click register button
    |username  |email              |password  |
    |ali       |alican@gmail.com   |12345     |
    |ali       |alican1@gmail.com  |12345     |
    |ali1      |alican@gmail.com   |12345     |
    Then user verify error message
    Then user close driver

