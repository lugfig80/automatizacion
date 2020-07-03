#Author: Luis f

@tag
Feature: busqueda de vuelo
  

  @flightfinder
  Scenario: usuario desea validar disponibilidad vuelos
  
    Given   ingresa usuario "demo" y clave "demo"
    And   	en la seccion flight finder
    When  	el usuario require vuelo para dos pasajeros
    And  		saliendo de londres
		Then  	arrivando en san francisco consulta disponibilidad

  