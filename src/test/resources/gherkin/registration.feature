Feature: Register in Page

  Scenario: Should register
    Given System display start page
    When User set login as "testtestt@gmail.com" and password as "123456789"
    Then User is registered

  Scenario: Should not register without password
    Given System display start page
    When User set login as "testtestt@gmail.com" and password as ""
    Then User is not registered