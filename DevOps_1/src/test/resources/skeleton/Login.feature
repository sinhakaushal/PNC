#new Feature
Feature: Login

In order to login to newtours 
As a user
I need to register first
Business Rule:
-	Registered user can only do the transactions

Scenario: user can do the successful login
Given user is on the login page of newtours
When user enters correct credentials in newtours
Then user can do successful login

#Scenario: user cannot do login with incorrect credentials1
#Given user is on the login page of newtours
#When user enters incorrect credentials in newtours
#Then user can do successful login