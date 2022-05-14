SELECT Nombre, Nacionalidad FROM autor;


SELECT 
	Nombre,
    Nacionalidad
FROM autor
WHERE autor.Nacionalidad = 'France' or autor.Nacionalidad = 'Italy';

SELECT
	concat(estudiante.nombre, ' ', estudiante.apellido) as Nombre,
    estudiante.direccion,
    estudiante.carrera,
    estudiante.edad
FROM
	estudiante
WHERE estudiante.edad > (SELECT AVG(estudiante.edad) FROM estudiante);

SELECT 
	concat(estudiante.nombre, ' ', estudiante.apellido) as Nombre
FROM
	estudiante
WHERE estudiante.apellido LIKE 'G%';
