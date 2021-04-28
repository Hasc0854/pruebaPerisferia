Feature: Prueba de ingreso a Avianca y selecion de viaje

  @seleccionarSegundoVuelo
   Scenario Outline: Seleccionar segundo vuelo disponible en Avianca sin acompañante y equipaje M
    Given hugo ingrese a la pagina de avanca
    When hugo busca <desde> <hacia> <fechaSalida> <fechaRegreso>el segundo vuelo del resultado de busqueda
    And hugo ingresa datos<tarifa><nombre><apellido><correo><celular>    
    Then hugo verifica mensaje<mensaje>
   
    Examples: 
     | desde  | hacia  | fechaSalida | fechaRegreso  | tarifa | nombre  | apellido           | correo     | celular |mensaje|
     | "Bogotá" |"Medellín" | "Sáb, 15 may."| "Sáb, 15 may."  |"M"| "hugo"   | "sanchez" |" hasc0822@gmail.com "| 3133305435 |"Resumen de compras" |

