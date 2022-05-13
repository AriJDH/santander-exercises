--  Listar los datos de los autores
SELECT * FROM AUTOR;
-- Listar los datos de los autores
SELECT NOMBRE, EDAD FROM ESTUDIANTE;
-- ¿Qué estudiantes pertenecen a la carrera informática?
SELECT * FROM ESTUDIANTE WHERE CARRERA = "INFORMATICA";
-- ¿Qué autores son de nacionalidad francesa o italiana?
SELECT * FROM AUTOR WHERE NACIONALIDAD = "FRANCESA" OR NACIONALIDAD = "ITALIANA";
--  ¿Qué libros no son del área de internet?
SELECT * FROM LIBRO WHERE AREA NOT LIKE "INTERNET";
-- Listar los libros de la editorial Salamandra.
 SELECT * FROM LIBRO WHERE EDITORIAL = "SALAMANDRA";
-- Listar los datos de los estudiantes cuya edad es mayor al promedio
SELECT * FROM ESTUDIANTE WHERE EDAD > AVG(EDAD);
--  Listar los nombres de los estudiantes cuyo apellido comience con la letra G
SELECT * FROM ESTUDIANTE WHERE APELLIDO LIKE "G%";
-- Listar los autores del libro “El Universo: Guía de viaje”. (Se debe listar solamente los nombres).
SELECT NOMBRE FROM AUTOR a JOIN LIBROAUTOR la
	ON a.idAutor = la.idAutor
	JOIN LIBRO l
	ON l.idLibro = la.idLibro
        WHERE titulo = "El Universo: Guía de viaje";

-- Listar el nombre del estudiante de menor edad.

SELECT nombre
FROM estudiante
WHERE edad in (select MIN(edad)
				FROM estudiante);

SELECT nombre
FROM estudiante
ORDER BY edad ASC
LIMIT 1;

-- Listar nombres de los estudiantes a los que se prestaron libros de Base de Datos.
SELECT estudiante.nombre, estudiante.apellido
FROM prestamo
JOIN libro ON prestamo.idLibro = libro.idLibro
JOIN estudiante ON prestamo.idLector = estudiante.idLector
WHERE libro.area LIKE 'Base de Datos';


-- Listar los libros que pertenecen a la autora J.K. Rowling
SELECT libro.titulo
FROM libroautor
JOIN libro ON libroautor.idLibro = libro.idLibro
JOIN autor ON libroautor.idAutor = autor.idAutor
WHERE autor.nombre LIKE 'J.K Rowling';

-- Listar títulos de los libros que debían devolverse el 16/07/2021.
SELECT libro.titulo
FROM prestamo
JOIN libro ON prestamo.idLibro = libro.idLibro
WHERE prestamo.fechaDevolucion = '20210716';