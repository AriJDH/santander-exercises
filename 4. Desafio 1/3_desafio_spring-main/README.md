# Grupo 3
Integrantes<br>
<br>
-Contrera Brian Andrés<br>
-Leguizamón Agustín Manuel<br>
-Rodriguez Mariana<br>
-Romero Hernán Eduardo<br>
-Salvia Facundo Javier<br>
<br>
<br>
<br>




## US0001 
Retorna un listado con todos los hoteles registrados

`GET http://localhost:8080/api/v1/hotels`

---

## US0002 (Caso exitoso)
Retorna un listado de hoteles disponibles en un determinado rango de fechas y de acuerdo al destino seleccionado

`GET http://localhost:8080/api/v1/hotels?dateFrom=10/01/2022&dateTo=10/03/2022&destination=Puerto Iguazú`


## US0002 (Caso fallido - retorna lista vacía)

`GET http://localhost:8080/api/v1/hotels?dateFrom=10/01/2021&dateTo=10/03/2021&destination=Puerto Iguazú`

---

## US0003 (Caso exitoso)
Realiza la reserva de un hotel, recibiendo cantidad de personas, fecha de entrada, salida y tipo de habitación. 
Retorna los datos de la reserva con el monto inicial, intereses y monto final.

`POST http://localhost:8080/api/v1/booking`

<details>
<summary>Request Body</summary>
<pre>
{
    "nombreUsuario": "juan",
    "booking": {
        "desde": "2022-02-20",
        "hasta": "2022-03-10",
        "codigoHotel": "CH-0003",
        "destino": "Puerto Iguazú",
        "cantidadPersonas": 1,
        "tipoHabitacion": "Doble",
        "personas": [
            {
                "dni": 38998262,
                "nombre": "juan",
                "mail": "juan@juan.com",
                "apellido": "Peréz",
                "nacimiento": "1992-06-18"
            }
        ],
        "metodoPago":{
            "tipo": "CREDIT",
            "numeroTarjeta": "7567",
            "cuotas": 6
        }
    }
}
</pre>
</details>


<details>
<summary>Response</summary>
<pre>
{
    "nombreUsuario": "juan",
    "monto": 8200.0,
    "intereses": 21.0,
    "total": 178596.0,
    "booking": {
        "desde": "20/02/2022",
        "hasta": "10/03/2022",
        "destino": "Puerto Iguazú",
        "codigoHotel": "CH-0003",
        "cantidadPersonas": 1,
        "tipoHabitacion": "Doble",
        "personas": [
            {
                "dni": "38998262",
                "nombre": "juan",
                "mail": "juan@juan.com",
                "apellido": "Peréz",
                "nacimiento": "18/06/1992"
            }
        ]
    },
    "codigoRespuesta": {
        "codigo": 200,
        "msg": "El proceso termino satisfactoriamente"
    }
}
</pre>
</details>


## US0003 (Caso fallido - Hotel no disponible)

`POST http://localhost:8080/api/v1/booking`

<details>
<summary>Request Body</summary>
<pre>
{
    "nombreUsuario": "juan",
    "booking": {
        "desde": "2022-02-09",
        "hasta": "2022-02-10",
        "codigoHotel": "CH-0003",
        "destino": "Puerto Iguazú",
        "tipoHabitacion": "Doble",
        "cantidadPersonas": 1,
        "personas": [
            {
                "dni": 38998262,
                "nombre": "juan",
                "mail": "juan@juan.com",
                "apellido": "Peréz",
                "nacimiento": "1992-06-18"
            }
        ],
        "metodoPago":{
            "tipo": "CREDIT",
            "numeroTarjeta": "7567",
            "cuotas": 6
        }
    }
}
</pre>
</details>


<details>
<summary>Response</summary>
<pre>
{
    "nombre": "Periodo fuera disponibilidad",
    "descripcion": "Exception: Hotel no esta disponible en el periodo indicado"
}
</pre>
</details>



## US0003 (Caso fallido - Hotel inexistente)

`POST http://localhost:8080/api/v1/booking`

<details>
<summary>Request Body</summary>
<pre>
{
    "nombreUsuario": "juan",
    "booking": {
        "desde": "2022-02-20",
        "hasta": "2022-03-10",
        "codigoHotel": "CH-0023",
        "destino": "Puerto Iguazú",
        "tipoHabitacion": "Doble",
        "cantidadPersonas": 1,
        "personas": [
            {
                "dni": 38998262,
                "nombre": "juan",
                "mail": "juan@juan.com",
                "apellido": "Peréz",
                "nacimiento": "1992-06-18"
            }
        ],
        "metodoPago":{
            "tipo": "CREDIT",
            "numeroTarjeta": "7567",
            "cuotas": 6
        }
    }
}
</pre>
</details>

<details>
<summary>Response</summary>
<pre>
{
    "nombre": "Codigo inexistente",
    "descripcion": "Exception: No existe un hotel con ese codigo"
}
</pre>
</details>

---

## US0004 
Retorna un listado con todos los vuelos registrados

`GET http://localhost:8080/api/v1/flights`

---

## US0005 (Caso exitoso)
Retorna un listado con todos los vuelos disponibles en un determinado rango de fechas y según el destino y origen seleccionados

`GET http://localhost:8080/api/v1/flights?fechaDesde=10/02/2022&fechaHasta=21/02/2022&origen=Puerto Iguazú&destino=Bogotá`


## US0005 (Caso fallido - retorna lista vacía)

`GET http://localhost:8080/api/v1/flights?fechaDesde=10/02/2021&fechaHasta=21/02/2021&origen=Puerto Iguazú&destino=Bogotá`

---

## US0006 (Caso exitoso)
Realiza la reserva de un vuelo, recibiendo cantidad de personas, origen, destino y fecha de ida.
Retorna los datos de la reserva con el monto inicial, intereses y monto final.

`POST http://localhost:8080/api/v1/flight-reservation`

<details>
<summary>Request Body</summary>
<pre>
{
    "nombreUsuario": "nosotros",
    "ticket": {
        "desde": "2022-02-10",
        "hasta": "2022-02-20",
        "origen": "Puerto Iguazú",
        "destino": "Bogotá",
        "codigoVuelo": "PIBA-1420",
        "asientos": 2,
        "tipoAsiento": "Economy",
        "personas": [
            {
                "dni": "38059235",
                "nombre": "brai",
                "apellido": "Gonzalez",
                "nacimiento": "1992-06-18",
                "mail": "brian@algo.com"    
            },  {
                "dni": "38059235",
                "nombre": "brai",
                "apellido": "Gonzalez",
                "nacimiento": "1992-06-18",
                "mail": "brian@algo.com" 
            }
        ],
        "metodoPago": {
            "tipo": "CREDIT",
            "numeroTarjeta": "7567",
            "cuotas": 6
        }
    }
}
</pre>
</details>


<details>
<summary>Response</summary>
<pre>
{
    "nombreUsuario": "nosotros",
    "monto": 86400.0,
    "intereses": 21.0,
    "total": 104544.0,
    "ticket": {
        "desde": "10/02/2022",
        "hasta": "20/02/2022",
        "origen": "Puerto Iguazú",
        "destino": "Bogotá",
        "codigoVuelo": "PIBA-1420",
        "asientos": 2,
        "tipoAsiento": "Economy",
        "personas": [
            {
                "dni": "38059235",
                "nombre": "brai",
                "mail": "brian@algo.com",
                "apellido": "Gonzalez",
                "nacimiento": "18/06/1992"
            },
            {
                "dni": "38059235",
                "nombre": "brai",
                "mail": "brian@algo.com",
                "apellido": "Gonzalez",
                "nacimiento": "18/06/1992"
            }
        ]
    },
    "codigoRespuesta": {
        "codigo": 200,
        "msg": "El proceso termino satisfactoriamente"
    }
}
</pre>
</details>


## US0006 (Caso fallido - Vuelo inexistente)

`POST http://localhost:8080/api/v1/flight-reservation`


<details>
<summary>Request Body</summary>
<pre>
{
    "nombreUsuario": "nosotros",
    "ticket": {
        "desde": "2022-02-11",
        "hasta": "2022-02-20",
        "origen": "Puerto Iguazú",
        "destino": "Bogotá",
        "codigoVuelo": "PIBA-1420",
        "asientos": 2,
        "tipoAsiento": "Economy",
        "personas": [
            {
                "dni": "38059235",
                "nombre": "brai",
                "apellido": "Gonzalez",
                "nacimiento": "1992-06-18",
                "mail": "brian@algo.com"
            },  {
                "dni": "38059235",
                "nombre": "brai",
                "apellido": "Gonzalez",
                "nacimiento": "1992-06-18",
                "mail": "brian@algo.com"
            }
        ],
        "metodoPago": {
            "tipo": "CREDIT",
            "numeroTarjeta": "7567",
            "cuotas": 6
        }
    }
}
</pre>
</details>


<details>
<summary>Response</summary>
<pre>
{
    "nombre": "No existe un vuelo con los parametros ingresados",
    "descripcion": "Exception: Vuelo inexistente"
}
</pre>
</details>

## USBonus - Agregar Vuelo (Caso exitoso)

`POST http://localhost:8080/api/v1/flights`

<details>
<summary>Request Body</summary>
<pre>
{
    "nroVuelo" : "NUEVO-1235",
    "origen" : "Buenos Aires",
    "destino" : "Puerto Iguazú",
    "tipoAsiento" : "Economy",
    "precioPersona" : 6500,
    "fechaIda" : "2022-02-10",
    "fechaVuelta" : "2022-02-15"
}
</pre>
</details>


<details>
<summary>Response</summary>
<pre>
{
    "codigo": 200,
    "msg": "agregado vuelo"
}
</pre>
</details>


## USBonus - Agregar Vuelo (Caso fallido - Ya existe un vuelo con ese código)

`POST http://localhost:8080/api/v1/flights`

<details>
<summary>Request Body</summary>
<pre>
  {
    "nroVuelo" : "PIBA-1420",
    "origen" : "Puerto Iguazú",
    "destino" : "Bogotá",
    "tipoAsiento" : "Business",
    "precioPersona" : 43200,
    "fechaIda" : "2022-02-10",
    "fechaVuelta" : "2022-02-20"
  }
</pre>
</details>


<details>
<summary>Response</summary>
<pre>
{
    "nombre": "Ya existe un vuelo con los parametros ingresados",
    "descripcion": "Exception: Alta denegada"
}
</pre>
</details>


## USBonus - Actualizar Vuelo (Caso exitoso)

`PUT http://localhost:8080/api/v1/flights`

<details>
<summary>Request Body</summary>
<pre>
 {
    "nroVuelo" : "NUEVO-1235",
    "origen" : "Buenos Aires",
    "destino" : "Puerto Iguazú",
    "tipoAsiento" : "Economy",
    "precioPersona" : 99999,
    "fechaIda" : "2022-02-10",
    "fechaVuelta" : "2022-02-15"
}
</pre>
</details>


<details>
<summary>Response</summary>
<pre>
{
    "codigo": 200,
    "msg": "vuelo actualizado"
}
</pre>
</details>


## USBonus - Actualizar Vuelo (Caso fallido - No existe vuelo con ese código)

`PUT http://localhost:8080/api/v1/flights`

<details>
<summary>Request Body</summary>
<pre>
{
    "nroVuelo" : "ABCD-1420",
    "origen" : "Buenos Aires",
    "destino" : "Puerto Iguazú",
    "tipoAsiento" : "Economy",
    "precioPersona" : 99999,
    "fechaIda" : "2022-02-10",
    "fechaVuelta" : "2022-02-15"
}
</pre>
</details>


<details>
<summary>Response</summary>
<pre>
{
    "nombre": "No existe un vuelo con los parametros ingresados",
    "descripcion": "Exception: Vuelo inexistente"
}
</pre>
</details>


## USBonus - Agregar Hotel (Caso exitoso)

`POST http://localhost:8080/api/v1/hotels`

<details>
<summary>Request Body</summary>
<pre>
{
	"codigoHotel":"CH-00012",
	"nombre":"Probando",
	"lugarOCiudad":"Puerto Iguazú",
	"habitacionTipo":"Cuadruple",
	"precioNoche":1000.0,
	"disponibleDesde":"2022-02-10",
	"disponibleHasta":"2022-03-20",
	"reservado":"NO"
}
</pre>
</details>


<details>
<summary>Response</summary>
<pre>
{
    "codigo": 200,
    "msg": "Hotel agregado"
}
</pre>
</details>


## USBonus - Agregar Hotel (Caso fallido - Ya existe un hotel con ese código)

`POST http://localhost:8080/api/v1/hotels`

<details>
<summary>Request Body</summary>
<pre>
  {
    "codigoHotel":"CH-0002",
    "nombre":"Cataratas Hotel",
    "lugarOCiudad":"Puerto Iguazú",
    "habitacionTipo":"Doble",
    "precioNoche":6300.0,
    "disponibleDesde":"2022-02-10",
    "disponibleHasta":"2022-03-20",
    "reservado":"NO"
  }
</pre>
</details>


<details>
<summary>Response</summary>
<pre>
{
    "nombre": "Ya existe un hotel con los parametros ingresados",
    "descripcion": "Exception: Alta denegada"
}
</pre>
</details>


## USBonus - Actualizar Hotel (Caso exitoso)

`PUT http://localhost:8080/api/v1/hotels`

<details>
<summary>Request Body</summary>
<pre>
{
	"codigoHotel":"CH-00012",
	"nombre":"Probando",
	"lugarOCiudad":"Puerto Iguazú",
	"habitacionTipo":"Cuadruple",
	"precioNoche":99999.0,
	"disponibleDesde":"2022-02-10",
	"disponibleHasta":"2022-03-20",
	"reservado":"NO"
}
</pre>
</details>


<details>
<summary>Response</summary>
<pre>
{
    "codigo": 200,
    "msg": "hotel actualizado"
}
</pre>
</details>


## USBonus - Actualizar Hotel (Caso fallido - No existe hotel con ese código)

`PUT http://localhost:8080/api/v1/hotels`

<details>
<summary>Request Body</summary>
<pre>
{
	"codigoHotel":"ABCD-00012",
	"nombre":"Probando",
	"lugarOCiudad":"Puerto Iguazú",
	"habitacionTipo":"Cuadruple",
	"precioNoche":99999.0,
	"disponibleDesde":"2022-02-10",
	"disponibleHasta":"2022-03-20",
	"reservado":"NO"
}
</pre>
</details>


<details>
<summary>Response</summary>
<pre>
{
    "nombre": "Codigo inexistente",
    "descripcion": "Exception: No existe un hotel con ese codigo"
}
</pre>
</details>

