Feature: hello service

  Scenario: hello service returns correct answer
    When I call the hello service
    Then I get the answer "Hello RESTEasy"



#Feature: Payment
 # Scenario: Successful Payment
   #// Given a customer with id "cid1"
   #// And a merchant with id "mid1"
   # //When the merchant initiates a payment for 10 kr by the customer
   # // Then the payment is successful
