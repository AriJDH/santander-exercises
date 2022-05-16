-- Insert

INSERT INTO personas VALUES (1, "Juan", "Lopez", 33);

INSERT INTO personas(id, apellido, edad, nombre) VALUES (1, "Lopez", 33, "Juan");

-- Update

UPDATE personas SET nombre="Julian" WHERE id=1;

-- Delete 

DELETE FROM personas WHERE nombre="Julian";

-- Order By

SELECT nombre, apellido, edad
FROM personas p
ORDER BY p.id; -- (por defecto ascendente, con DESC, descendente)

SELECT * FROM personas ORDEr BY nombre;

-- Limit

SELECT * FROM personas ORDEr BY nombre LIMIT 5, 3; -- 5 datos o registros, pero que empiecen a partir del 3;

-- Distinct 

SELECT DISTINCT nombre FROM personas; -- Evita que se repitan los resultados (datos únicos)

-- Like y Not Like

SELECT nombre, apellido FROM personas WHERE nombre LIKE 'L%'; -- Que comience con L 

SELECT nombre, apellido FROM personas WHERE nombre LIKE 'L%'; -- Todos los registros que no comiencen con L 

-- Between

SELECT * FROM personas WHERE id BETWEEN 1 AND 10; -- Incluye extremos

-- Funciones de agregacion

SELECT COUNT(*) FROM personas WHERE edad = 23; -- Cuenta la cantidad de persoanas que tienen 23 años

SELECT MAX(edad) FROM personas; -- La mayor edad, con MIN es igual

SELECT SUM(edad) FROM personas; -- Suma las edades de las personas

SELECT AVG(edad) FROM personas; -- Saca el promedio de edades


