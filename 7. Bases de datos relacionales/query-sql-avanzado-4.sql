SELECT * FROM autor;

SELECT nombre,edad FROM estudiante;

SELECT * FROM estudiante WHERE carrera="ing";

SELECT * FROM autor WHERE nacionalidad="arg" OR nacionalidad="brasil";

SELECT * FROM libro WHERE Area<>"internet";

SELECT * FROM  libro WHERE Editorial="papi";

SELECT * FROM  estudiante WHERE edad> (SELECT AVG(edad) FROM estudiante);

SELECT nombre FROM estudiante WHERE apellido LIKE "g%";

SELECT autor.nombre FROM autor INNER JOIN libroautor ON autor.idAutor = libroautor.idAutor INNER JOIN libro ON libro.idLibro = libroautor.idLibro WHERE libro.Titulo="HP1";

SELECT libro.Titulo FROM libro INNER JOIN prestamo ON libro.idLibro = prestamo.idLibro INNER JOIN estudiante ON prestamo.idLector = estudiante.idLector WHERE estudiante.nombre="martin" AND estudiante.apellido="guemes";

SELECT min(edad) as minimaEdad, nombre FROM estudiante;

SELECT distinct estudiante.nombre FROM libro INNER JOIN prestamo ON libro.idLibro = prestamo.idLibro INNER JOIN estudiante ON prestamo.idLector = estudiante.idLector WHERE libro.Area="fantasia";

SELECT libro.* FROM autor INNER JOIN libroautor ON autor.idAutor = libroautor.idAutor INNER JOIN libro ON libro.idLibro = libroautor.idLibro WHERE autor.nombre="juani";

SELECT distinct libro.Titulo FROM libro INNER JOIN prestamo ON libro.idLibro = prestamo.idLibro WHERE prestamo.FechaDevolucion="2020-02-04";

