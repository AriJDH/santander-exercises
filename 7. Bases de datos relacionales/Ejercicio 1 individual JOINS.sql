-- Se denomina JOIN a la combinacion de tablas de una base de datos bajo una o varias condiciones.

-- JOIN o INNER JOIN: Devuelve unicamente los registros de las tablas que cumplen con las condiciones especificadas

-- LEFT JOIN devuelve los registros de las tablas que cumplen las condiciones sumado a los registros de la tabla de la izquierda

-- RIGHT JOIN hace lo mismo que el left, pero en vez de sumar los registros de la tabla izquierda suma los de la derecha

-- GROUP BY se utiliza para agrupar los resultados de una consulta cuando estos se ven afectados por funciones de agregación
-- pero también hay columnas que no deberían ser afectadas por estas funciones.

-- HAVING se utiliza cuando queremos agregar una condición posterior a la aplicación de las funciones de agregación, esa es
-- su principal diferencia con el WHERE, si queremos aplicar condiciones previas al uso de las funciones de agregación usamos
-- WHERE, pero si queremos aplicar condiciones a los campos resultantes de estas funciones usamos HAVING.

-- CONSULTAS GENERICAS:

-- Devuelve los resultados con coincidencias:

SELECT campoEjemplo
FROM tabla1 JOIN tabla2 
ON condicion;

-- Devuelve los resultados con coincidencias sumados a los de la tabla izquierda:

SELECT campoEjemplo1, CampoEjemplo2
FROM tabla1 LEFT JOIN tabla2
ON condicion;

-- Devuelve los resultados con coincidencias sumados a los de la tabla derecha:

SELECT campoEjemplo1, CampoEjemplo2
FROM tabla1 RIGHT JOIN tabla2
ON condicion;