Feature: Amazon Login and shopping test
  I want to use this this document to write steps for login and shopping

  @amazon @uid 
  Scenario: Userid test
    Given browser "chrome" is open with url "https://www.amazon.in" and initialize reportname "AmazonLogin" and testname "Logintest"
    And i click on signin link
    When I enter valid username "paragguide@yahoo.co.in"
    And click continue button
    Then I validate the userid
   
  @amazon @pwd  
  Scenario: Password test
    Given userid is valid
    When enter the valid password which is "RMinfotech12#&&"  
    Then i should login
  
  @amazon @search
  Scenario Outline: search for products
   Given i am logged in
   When i search for product <productname> in range <price>
   Then search results should come
  
  @amazon @data1 
  Examples:
   | productname | price |
   | Shirt | 2000 |
   | Pant | 3500 |
   | Tie | 500 | 
  
  @amazon @data2 
  Examples:
   | productname | price |
   | Saree | 2000 |
   | Skirt | 3500 |
   | Suite | 500 |  
   
   @amazon @close
   Scenario: close browser session
    When all work complete close session
