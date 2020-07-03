#Author: Luis figueredo
#Scenario: Business rule to login page



Feature: autenticacion en pagina web
  

  @tag1
  Scenario: usuario se loguea en  seccion Sign in
  
    Given Que el usuario ingresa a web My store 
     And   ingresa sesion women
    When  ordena por precio mas alto
    #And  	ingresa password: <clave>
    #Then  se autentica correctamente 
   
   #Examples:
  #|email						 |clave			|
  #|m80.luis@gmail.com|marian    |
   

