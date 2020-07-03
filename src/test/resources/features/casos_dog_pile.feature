#language: es


Característica: Busquedas en dogpile

  esta feature se trata de hacer una busquda o multiples busquedas en dogpile y revisar
  los resultados obtenidos de esas busquedas.

@smoke
  Escenario: Buscar resultados relevantes
    Dado 	Que el usuario entra en dogpile
    Cuando El usuario realiza una busqueda de: rock nacional
    Entonces El usuario deberia poder ver resultados que contengan la palabra: rock

@Cucumber1
  Esquema del escenario: Verificar que los resultados con texto relevante al titulo
    Dado Que el usuario entra en dogpile
    Cuando El usuario realiza una busqueda de: rock nacional
    Entonces El usuario deberia ver un texto: <texto>  relevante con el titulo: <titulo>

    
      Ejemplos:
      |titulo             									|texto								                            |
      | Argentine rock - Wikipedia     		  | Argentine Rock Nacional is                      |
      | Nacional Rock – Radio Nacional 		  | NACIONAL ROCK. La hora líquida Aguante          |
      | Las 250 Mejores/más Importantes     | Argentina es el país                            |
      | rock nacional 80 90 00 - YouTube    | rock nacional 80 90 00 Maria Angeles            |
      
      