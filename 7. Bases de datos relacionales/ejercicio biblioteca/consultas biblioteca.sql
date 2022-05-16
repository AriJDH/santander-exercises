#1
SELECT * FROM autor;
#2
SELECT nombre, edad FROM estudiante;
#3
SELECT nombre, apellido FROM estudiante est
WHERE est.carrera = "informatica";
#4
SELECT nombre FROM autor a
WHERE a.nacionalidad LIKE "fance%" OR a.nacionalidad LIKE "italian%" ;
#5
SELECT titulo FROM libro 
WHERE libro.area LIKE "internet%" ;
#6
SELECT titulo FROM libro
WHERE libro.editorial LIKE "Salamandra";
#7
SELECT * FROM estudiante est
WHERE est.edad > (SELECT AVG (edad) FROM estudiante);
#8
SELECT nombre, apellido FROM estudiante est
WHERE est.apellido LIKE "G%";
#9
SELECT nombre 
FROM autor JOIN libroAutor l
ON l.fk_idAutor = autor.idAutor
JOIN libro
ON l.fk_idLibro = libro.idLibro
WHERE  libro.titulo LIKE "El Universo: Guía de viaje%";
#10
SELECT titulo 
FROM libro l JOIN prestamo r
ON l.idLibro = prestamo.idLibro
JOIN estudiante
ON estudiante.nombre LIKE "El Universo: Filippo Galli%";
#11
SELECT nombre FROM estudiante est
ORDER BY est.edad ASC
LIMIT 1;
#12
SELECT e.nombre
FROM estudiante e JOIN libro
ON libro.area LIKE "Base de Datos%"
JOIN prestamo
ON libro.idLibro = prestamo.idLibro;
#13
-- ON autor.nombre LIKE "J.K. Rowling%"
#14
SELECT titulo 
FROM libro JOIN prestamo
ON libro.idLibro = prestamo.idLibro
WHERE prestamo.fechaDevolucion = "2021-07-16";

    



