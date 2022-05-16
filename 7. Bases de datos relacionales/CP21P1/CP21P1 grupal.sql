use biblioteca;

-- 1. Listar los datos de los autores.
SELECT nombre,nacionalidad FROM autor;

-- 2. Listar nombre y edad de los estudiantes.
SELECT nombre,edad FROM estudiante;

-- 3. ¿Qué estudiantes pertenecen a la carrera informática?
SELECT * FROM estudiante e WHERE e.carrera LIKE "%informatica%";

-- 4.¿Qué autores son de nacionalidad francesa o italiana?
SELECT * FROM autor a WHERE a.nacionalidad LIKE "Francia" or a.nacionalidad LIKE "Italia";

-- 5. ¿Qué libros no son del área de internet?
SELECT l.titulo FROM libros l WHERE l.Area NOT LIKE "Internet";

-- 6. Listar los libros de la editorial Salamandra.
SELECT l.titulo FROM libros l where l.editorial LIKE "Salamandra";

-- 7. Listar los datos de los estudiantes cuya edad es mayor al promedio.
SELECT e.nombre FROM estudiante e WHERE e.edad > (SELECT avg(es.edad) FROM estudiante es);

-- 8. Listar los nombres de los estudiantes cuyo apellido comience con la letra G.
SELECT e.nombre FROM estudiante e WHERE e.apellido LIKE "G%";

-- 9. Listar los autores del libro “El Universo: Guía de viaje”. (Se debe listar
-- solamente los nombres).
SELECT a.nombre FROM autor a 
JOIN libro_autor la on la.idAutor=a.idAutor
JOIN libros l ON l.idLibro = la.idLibro WHERE l.titulo = "El Universo: Guía de viaje";

-- 	10. ¿Qué libros se prestaron al lector “Filippo Galli”?
SELECT l.titulo FROM prestamo p 
JOIN libros l ON l.idLibro=p.idLibro
JOIN estudiante e ON e.idLector = p.idLector WHERE e.apellido LIKE "Filippo Galli";

-- 11. Listar el nombre del estudiante de menor edad.
SELECT e.nombre FROM estudiante e where e.edad IS NOT NULL ORDER BY e.edad LIMIT 1;

-- 12. Listar nombres de los estudiantes a los que se prestaron libros de Base de
-- Datos.
SELECT e.nombre FROM prestamo p 
JOIN libros l ON l.idLibro=p.idLibro
JOIN estudiante e ON e.idLector = p.idLector WHERE l.Area LIKE "Base de%";

-- 13. Listar los libros que pertenecen a la autora J.K. Rowling.
SELECT * FROM libro_autor la
JOIN libros l ON la.idLibro=l.idLibro
JOIN autor a ON a.idAutor = la.idAutor WHERE a.nombre LIKE "J.K. Rowling.";

-- 14. Listar títulos de los libros que debían devolverse el 16/07/2021.
SELECT * FROM libros l 
	JOIN prestamo p ON l.idLibro = P.idLibro
	WHERE p.fechaDevolucion = "2021-07-16";



