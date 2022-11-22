@Login
Feature: Login Test

  Scenario Outline: Login 
  Given Connect to the url "https://canaccord32qa.rc.katipult.com/login"
  And set the value "kajivannist@gmail.com" in the xpath "//*[@id='UserEmail']"
  And set the value "<Nom>" in the xpath "//*[@id='UserPassword']"
  And Click the webElement with xpath "//*[@id='UserLoginForm']/div[4]/input"

| Nom|
| |
   
    
    
  
