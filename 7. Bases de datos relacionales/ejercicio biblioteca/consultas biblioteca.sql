SELECT * FROM autor;

SELECT nombre, edad FROM estudiante;

SELECT nombre, apellido FROM estudiante est
WHERE est.carrera = "informatica";

SELECT nombre FROM autor a
WHERE a.nacionalidad LIKE "fance%" OR a.nacionalidad LIKE "italian%" ;

SELECT titulo FROM libro 
WHERE libro.area LIKE "internet%" ;

SELECT titulo FROM libro
WHERE libro.editorial LIKE "Salamandra";

SELECT * FROM estudiante est
WHERE est.edad > (SELECT AVG (edad) FROM estudiante);

SELECT nombre, apellido FROM estudiante est
WHERE est.apellido = "G%";

-- SELECT nombre FROM autor LEFT JOIN autoLibro
-- ON a.titulo LIKE "El Universo: Guía de viaje%";

-- ON a.ESTUDIANTE LIKE "El Universo: Filippo Galli%";

SELECT nombre FROM estudiante est
ORDER BY est.edad ASC
LIMIT 1;

SELECT titulo 
FROM libro JOIN prestamo
ON libro.idLibro = prestamo.idLibro
WHERE prestamo.fechaDevolucion = "2021-07-16";

    



