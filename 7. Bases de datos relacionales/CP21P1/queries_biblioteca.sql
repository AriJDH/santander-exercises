
-- 1. Listar los datos de los autores.
SELECT * FROM autor;

-- 2. Listar nombre y edad de los estudiantes.
SELECT * FROM estudiante;

-- Verifico que esten el resto de las tablas bien cargadas

SELECT * FROM libro;

SELECT * FROM libro_autor;

SELECT * FROM prestamo;

-- 3 ¿Qué estudiantes pertenecen a la carrera informática?
SELECT * FROM estudiante
WHERE carrera = "informatica";

-- 4 ¿Qué autores son de nacionalidad francesa o italiana?
SELECT * FROM autor AS a
WHERE a.nacionalidad = "francesa" OR a.nacionalidad = "italiana";

-- 5 ¿Qué libros no son del área de internet?
SELECT * FROM libro
WHERE area != "internet";

-- 6. Listar los libros de la editorial Salamandra
SELECT * FROM libro
WHERE editorial = "salamandra";

-- 7. Listar los datos de los estudiantes cuya edad es mayor al promedio. FEO

SELECT *
FROM estudiante as e
JOIN
	(SELECT AVG(edad) as promedio
	FROM 
		(SELECT 1 as count, edad ,id_lector 
		FROM estudiante
		) as fContar
	) as fPromedio
WHERE e.edad > fPromedio.promedio;

-- 7 v2.0 COPADO
SELECT *
FROM estudiante
WHERE edad > 
	(SELECT AVG(edad)
    FROM estudiante);

-- 8. Listar los nombres de los estudiantes cuyo apellido comience con la letra G
SELECT nombre FROM estudiante
WHERE apellido LIKE "G%";

-- 9. Listar los autores del libro "El Universo: Guía de viaje". (solo los nombres)
SELECT * 
FROM libro_autor as la
JOIN 
	(SELECT * 
	FROM libro 
	WHERE titulo = "El Universo: Guía de viaje"
	) as libro
ON la.id_libro = libro.id_libro
JOIN autor as a 
ON la.id_autor = a.id_autor;

-- 9 v2.0
SELECT nombre
FROM autor as a
JOIN
	(SELECT la.id_libro, id_autor
    FROM libro_autor as la
    JOIN
		(SELECT *
		FROM libro
        WHERE titulo = "El Universo: Guía de viaje"
        ) as l
	ON la.id_libro = l.id_libro
	) as id_autores_libro 
ON a.id_autor = id_autores_libro.id_autor;

-- 10 ¿Qué libros se prestaron al lector “Filippo Galli”?
SELECT l.*, nombre
FROM libro as l
JOIN
	(SELECT p.id_libro, p.id_lector, lector.nombre 
    FROM prestamo as p
    JOIN
		(SELECT * 
        FROM estudiante
        WHERE nombre = "Filippo" AND apellido = "Galli"
        ) as lector
	ON p.id_lector = lector.id_lector
    ) as prestamos_lector
ON l.id_libro = prestamos_lector.id_libro;

-- 11. Listar el nombre del estudiante de menor edad.
SELECT nombre
FROM estudiante
WHERE edad = 
	(SELECT MIN(edad) as edad_minima
	FROM estudiante
	);
    
-- 12. Listar nombres de los estudiantes a los que se prestaron libros de Base de Datos

-- Primero veo si filtra bien por titulo
SELECT * 
FROM libro
WHERE titulo LIKE "%base de datos%";

SELECT nombre, titulo 
FROM estudiante as e
JOIN
	(SELECT p.id_libro, p.id_lector, titulo  
    FROM prestamo as p
    JOIN
		(SELECT * 
        FROM libro
        WHERE titulo LIKE "%base de datos%"
        ) as libros_base_de_datos
	ON p.id_libro = libros_base_de_datos.id_libro
    ) as prestamos_estudiantes
ON e.id_lector = prestamos_estudiantes.id_lector;

-- 12. v2.0 Usando subconsultas en el where
-- Lo malo es que no puedo traer data de las otras tablas
-- Lo bueno es que me ahorro un join

SELECT nombre 
FROM estudiante as e
WHERE e.id_lector IN
	(SELECT p.id_lector 
    FROM prestamo as p
    JOIN
		(SELECT * 
        FROM libro
        WHERE titulo LIKE "%base de datos%"
        ) as libros_base_de_datos
	ON p.id_libro = libros_base_de_datos.id_libro
    );

-- 13. Listar los libros que pertenecen a la autora J.K. Rowling.
SELECT *
FROM libro
WHERE id_libro IN 
	(SELECT la.id_libro
    FROM libro_autor as la
    JOIN
		(SELECT * 
        FROM autor
        WHERE nombre = "J.K. Rowling"
        ) as autor_libros
    ON la.id_autor = autor_libros.id_autor
    );
    
-- 13. v2.0 Usando otro where con subconsulta
SELECT *
FROM libro
WHERE id_libro IN 
	(SELECT id_libro
    FROM libro_autor
    WHERE id_autor IN
		(SELECT id_autor 
        FROM autor
        WHERE nombre = "J.K. Rowling"
        )
    );

-- 14. Listar títulos de los libros que debían devolverse el 16/07/2021.
SELECT titulo
FROM libro
WHERE id_libro IN
	(SELECT id_libro
    FROM prestamo as p
    WHERE p.fecha_devolucion = '2021-07-16')
