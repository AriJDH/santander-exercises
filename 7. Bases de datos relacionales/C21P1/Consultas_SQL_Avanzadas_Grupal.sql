-- Listar los datos de los autores
SELECT *
FROM autor;

-- Listar nombre y edad de los estudiantes
SELECT nombre, edad
FROM estudiante;

-- ¿Qué estudiantes pertenecen a la carrera informática?
SELECT *
FROM estudiante 
WHERE carrera LIKE "Informatica";

-- ¿Qué autores son de nacionalidad francesa o italiana?
SELECT * 
FROM autor 
WHERE 
	nacionalidad LIKE "Francesa" OR 
    nacionalidad LIKE "Italiana";

-- ¿Qué libros no son del área de internet?
SELECT *
FROM libro
WHERE area NOT LIKE "Internet";

-- Listar los libros de la editorial Salamandra
SELECT * 
FROM libro 
WHERE editorial LIKE "Salamandra";

-- Listar los datos de los estudiantes cuya edad es mayor al promedio
SELECT * 
FROM estudiante 
WHERE edad > (
	SELECT AVG(edad)
    FROM estudiante
);

-- Listar los nombres de los estudiantes cuyo apellido comience con la letra G
SELECT * 
FROM estudiante 
WHERE apellido LIKE "G%";

-- Listar los autores del libro “El Universo: Guía de viaje”. (Se debe listar solamente los nombres)
SELECT autor.nombre
FROM libroautor
JOIN autor ON autor.idAutor = libroautor.idAutor
JOIN libro ON libroautor.idLibro = libro.idLibro
WHERE libro.titulo LIKE "El Universo: Guía de viaje";

-- ¿Qué libros se prestaron al lector “Filippo Galli”?
SELECT libro.titulo, libro.editorial, libro.area
FROM prestamo
JOIN libro ON prestamo.idlibro = libro.idlibro
JOIN estudiante ON prestamo.idLector = estudiante.idLector
WHERE estudiante.nombre LIKE 'Filippo' AND estudiante.apellido LIKE 'Galli';

-- Listar el nombre del estudiante de menor edad
SELECT nombre
FROM estudiante
ORDER BY edad ASC
LIMIT 1;

SELECT nombre
FROM estudiante
WHERE edad = (
	SELECT MIN(edad)
    FROM estudiante
);

-- Listar nombres de los estudiantes a los que se prestaron libros de Base de Datos
SELECT estudiante.nombre, estudiante.apellido
FROM prestamo
JOIN libro ON prestamo.idlibro = libro.idlibro
JOIN estudiante ON prestamo.idLector = estudiante.idLector
WHERE libro.area LIKE 'Base de Datos';

-- Listar los libros que pertenecen a la autora J.K. Rowling
SELECT libro.titulo
FROM libroautor
JOIN libro ON libroautor.idlibro = libro.idlibro
JOIN autor ON libroautor.idautor = autor.idautor
WHERE autor.nombre LIKE 'J.K. Rowling';

-- Listar títulos de los libros que debían devolverse el 16/07/2021
SELECT libro.titulo
FROM prestamo
JOIN libro ON prestamo.idlibro = libro.idlibro
WHERE prestamo.fechaDevolucion = '20210716';
