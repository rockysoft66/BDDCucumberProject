
Feature: Login into my-store 

Scenario: Login page Title

Given User on the Login page
And  User get the title of the page
Then Page title should be "Login - My Store"

Scenario: Login page Log

Given User on the Login page
Then Forgot password Link should be displayed

Scenario:Login with validate creditials

Given User on the Login page
When User enter username "ds.sridhar09@gmail.com"
And User enter password "24202183@d"
And User Clik on Sigin Button
