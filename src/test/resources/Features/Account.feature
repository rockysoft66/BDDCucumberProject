
Feature: Account page feature
 
 Background:
 Given user ready login into the application
 |username|password|
 |ds.sridhar09@gmail.com|24202183@d|
 
  
  Scenario: Account page Title
    Given user is on Account page
    When  User get the title of the page
    Then Page title should be "My account - My Store"
   

  
  Scenario: Account section count
    Given user is on Account page  
    Then user gets the account section
    |ORDER HISTORY AND DETAILS|
    |MY CREDIT SLIPS|
    |MY ADDRESSES|
    |MY PERSONAL INFORMATION|
    |MY WISHLISTS|
    

   