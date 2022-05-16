USE biblioteca;

SELECT nombre,nacionalidad FROM autor;

SELECT CONCAT(nombre, ' ', apellido) AS 'Estudiante', edad as Edad FROM estudiante;

SELECT CONCAT(nombre, ' ', apellido) AS 'Estudiantes de Informática' FROM estudiante WHERE carrera = "informatica";

SELECT nombre AS 'Autores italianos/as o franceses/as ' FROM autor WHERE nacionalidad LIKE "Franc%" OR nacionalidad LIKE "Italian%";

SELECT titulo AS 'Libros que no son de internet' FROM libro WHERE area NOT LIKE "internet";

SELECT titulo AS 'Libros que no son de editorial Salamandra' FROM libro WHERE editorial LIKE 'Salamandra';

SELECT nombre AS 'Estudiantes que apellido comienza con G' FROM estudiante WHERE apellido LIKE 'G%';

SELECT a.nombre AS 'Autores de "El Universo: Guía de viaje"' FROM libro l
 INNER JOIN libroautor la ON l.titulo = "El Universo: Guía de viaje" AND l.id_libro = la.id_libro
 INNER JOIN autor a ON la.id_autor = a.id_autor;
 
SELECT l.titulo AS 'Libros prestados a "Filippo Galli"' FROM estudiante e
 INNER JOIN prestamo p ON e.nombre = "Filippo" AND e.apellido = "Galli" AND e.id_lector = p.id_lector
 INNER JOIN libro l ON p.id_libro = l.id_libro;
 
SELECT CONCAT(nombre, ' ', apellido) AS 'Estudiante de menor edad', edad AS 'Edad' FROM estudiante WHERE edad = (SELECT MIN(edad) FROM estudiante);

SELECT CONCAT(e.nombre, ' ', e.apellido) AS 'Estudiante con libros de BD', edad AS 'Edad' FROM libro l
 INNER JOIN prestamo p ON l.area = "Base de Datos" AND l.id_libro = p.id_libro
 INNER JOIN estudiante e ON p.id_lector = e.id_lector;

SELECT l.titulo AS 'Libros con fecha de devolución 16/07/2021' FROM libro l 
 INNER JOIN prestamo p ON fecha_devolucion = "2021-07-16" AND l.iid_autorautorautord_libro = p.id_libro;
