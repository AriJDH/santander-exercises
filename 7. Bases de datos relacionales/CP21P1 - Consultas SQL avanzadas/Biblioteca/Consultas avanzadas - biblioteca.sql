-- Listar los datos de los autores.

SELECT *
FROM  autor;

-- Listar nombre y edad de los estudiantes.

SELECT e.nombre,e.edad
FROM estudiante e;

-- ¿Qué estudiantes pertenecen a la carrera informática?

SELECT e.nombre,e.apellido
FROM estudiante e
WHERE e.carrera = "Informatica";

-- ¿Qué autores son de nacionalidad francesa o italiana?

SELECT a.nombre
FROM autor a
WHERE a.nacionalidad = "Italiana" OR "Francesa";


-- ¿Qué libros no son del área de internet?

SELECT *
FROM libro l
WHERE l.area = "Internet";

-- Listar los libros de la editorial Salamandra.

SELECT *
FROM libro l
WHERE l.editorial = "Salamandra";


-- Listar los datos de los estudiantes cuya edad es mayor al promedio.

SELECT *
FROM estudiante e
HAVING e.edad >(
SELECT AVG(e2.edad) 
FROM estudiante e2);

-- Listar los nombres de los estudiantes cuyo apellido comience con la letra G.

SELECT e.nombre
FROM estudiante e
WHERE e.apellido LIKE "G%";

-- Listar los autores del libro “El Universo: Guía de viaje”. (Se debe listar solamente los nombres).


SELECT a.nombre
FROM autor a INNER JOIN libro_autor la
ON a.id = la.idAutor AND la.idLibro = (
	SELECT l.id
	FROM libro l
	WHERE l.titulo = "El Universo: Guía de viaje");
    
    
-- ¿Qué libros se prestaron al lector “Filippo Galli”?


SELECT l.id,l.titulo,l.editorial,l.area
FROM libro l INNER JOIN prestamo p
ON l.id = p.idLibro AND p.idLector = (
	SELECT e.id
	FROM estudiante e
	WHERE e.nombre = "Filippo" AND e.apellido = "Galli");
    

-- Listar el nombre del estudiante de menor edad.

SELECT e.nombre
FROM estudiante e
ORDER BY e.edad
LIMIT 1;

-- Listar nombres de los estudiantes a los que se prestaron libros de Base de Datos.

SELECT DISTINCT e.nombre
FROM estudiante e INNER JOIN prestamo p INNER JOIN libro l
ON e.id = p.idLector AND p.idLibro IN (
	SELECT li.id
    FROM libro li
    WHERE li.area = "Base de Datos");
    
    
-- Listar los libros que pertenecen a la autora J.K. Rowling.

SELECT l.id,l.titulo,l.editorial,l.area
FROM libro l INNER JOIN libro_autor
ON l.id = libro_autor.idLibro AND libro_autor.idAutor = (
	SELECT a.id
	FROM autor a
	WHERE a.nombre = "J.K. Rowling.");
    
-- Listar títulos de los libros que debían devolverse el 16/07/2021.

SELECT l.titulo
FROM libro l INNER JOIN prestamo p
ON l.id = p.idLibro
WHERE p.fechaDevolucion = "2021-07-16";












