# AgenciaDeTurismo

## Descripcion

El proyecto consiste en un programa de administrarcion de vuelos y hoteles. 

##  Lista de Requerimientos funcionales 📜
 
 🟢= obligatorio  🟠= deseable 
  
  ### Hotel🏨
  
    🟢 Mostrar hoteles: 
                    El sistema debe permitir que se pueda obtener un listado de hoteles

    🟢 Mostrar hoteles por fecha (de ida y de vuelta) y destino: 
                    El sistema debe permitir que se pueda obtener un listado de hoteles filtrando por un rango de fecha y destino.   

    🟢 Reservar hotel: 
                    El sistema debe permitir la reserva de un hotel en especifico.
                  
                  
  ### Vuelo✈️                
  
    🟢 Mostrar vuelos: 
                    El sistema debe permitir que se pueda obtener un listado de vuelos

    🟢 Mostrar vuelos por fecha (de ida y de vuelta) y destino: 
                    El sistema debe permitir que se pueda obtener un listado de vuelos filtrando por fecha y por origen y destino.   

    🟢 Reservar vuelo: 
                    El sistema debe permitir la reserva de un vuelo en especifico.



## Endpoints


  ### Hotel🏨
```
    /api/v1/hotels

      Descripcion:
        Obtiene todo un listado de hoteles
      Posibles outcomes:
          ✔️obtiene el listado de hoteles

```    
    /api/v1/hotels/?dateFrom=dd/mm/aaaa&dateTo=dd/mm/aaaa&destination=Puerto Iguazu

      Descripcion:
          Obtiene un listado de hoteles en un rango de fecha y destino determinado
      Posibles outcomes:
          ✔️ Obtiene el listado de hoteles 
          ❌ No hay hoteles en el rango de fecha y destino
          ❌ El formato de los date no respeta dd/mm/yyyy
          ❌ La fecha de ida > La fecha de vuelta

``` 
    /api/v1/booking

      Descripcion:
          Reserva un hotel en un rango de fecha y destino determinado
      Posibles outcomes:
          ✔️ Hace la reserva satisfactoriamente
          ❌ La fecha de ida > La fecha de vuelta
          ❌ El hotel ya fue reservado por otra persona
          ❌ El codigo del hotel es incorrecto
```
  ### Vuelo✈️  
```
    /api/v1/flights
      
     Descripcion:
         Obtiene todo un listado de hoteles
     Posibles outcomes:
          ✔️obtiene el listado de hoteles

```
    /api/v1/flights/?dateFrom=dd/MM/yyyy&dateTo=dd/MM/yyyy&origin=Buenos Aires&destination=Puerto Iguazú"
    
      Descripcion:
          Obtiene todo un listado de hoteles filtrando por un rango de fecha y origen y destino determinado
      Posibles outcomes:
          ✔️obtiene el listado de hoteles
          ❌ No hay vuelos en el rango de fecha y destino en el origen y destino determinados
          ❌ El formato de los date no respeta dd/mm/yyyy
          ❌ La fecha de ida > La fecha de vuelta
    
```   
   /api/v1/flight-reservation
    
      Descripcion:
          Obtiene todo un listado de hoteles
      Posibles outcomes:
          ✔️obtiene el listado de hoteles
          ❌ La fecha de ida no coincida con el vuelo enviado
          ❌ El hotel ya fue reservado por otra persona
          ❌ El codigo del vuelo es incorrecto
```
## Diagrama de clases

![laburo drawio](https://user-images.githubusercontent.com/103457610/166325726-054a5195-c743-47c2-83a8-a131b81d9e81.png)


## Swagger

   Para poder acceder a la documentacion de swagger ingresar a `/swagger-ui/index.html`


## Aclaraciones

    RequestHotelFechaDestinoDecoyDTO y RequestVueloDecoyDTO : Esta clase se utiliza para pasar la informacion del controller al service recibiendo como parametro el  lugar destino y las fechas (tanto de ida como de vuelta) en fomato String. De esta forma una vez en el service se hará un LocalDate.parse a las fechas transformandolas en formato LocalDate. En caso de que las fechas sean invalidas, es decir, que no se respete el formato de dd/mm/yyyy, provocara un error del tipo DateTimeException el cual, gracias a estar en el service, lo podremos catchear y mandar una excepcion personalizada (FechaException).


    Tanto /api/v1/hotels/ como /api/v1/flights/ le tuvimos que incluir una / al final para que no se superponga con /api/v1/hotels y /api/v1/flights respectivamente
