-- Agregar una película a la tabla movies

INSERT INTO movies VALUES (22,NULL,NULL,'Toy Story 3',8.5,4,'2012-10-04 00:00:00',120,7);

-- Agregar un género a la tabla genres.

INSERT INTO genres VALUES (13,'2016-07-04 03:00:00',NULL,'Belica',13,1);

-- Asociar a la película del punto 1. con el género creado en el punto 2.

UPDATE movies SET genre_id = 13 WHERE id=22;

-- Modificar la tabla actors para que al menos un actor tenga como favorita la película agregada en el punto 1.

UPDATE actors SET favorite_movie_id = 22 WHERE id=1;

-- Crear una tabla temporal copia de la tabla movies.


DROP TABLE IF EXISTS `copia_movies`;
CREATE TEMPORARY TABLE copia_movies
SELECT *
FROM movies;

SELECT *
from copia_movies;


-- Eliminar de esa tabla temporal todas las películas que hayan ganado menos de 5 awards.

DELETE FROM copia_movies WHERE copia_movies.awards < 5;

SELECT *
from copia_movies;


-- Obtener la lista de todos los géneros que tengan al menos una película.

SELECT DISTINCT g.id,g.name
FROM genres g INNER JOIN movies m
ON g.id = m.genre_id;


-- Obtener la lista de actores cuya película favorita haya ganado más de 3 awards.

SELECT a.id,a.first_name,a.last_name
FROM actors a INNER JOIN movies m
ON a.favorite_movie_id = m.id
WHERE m.awards > 3;


-- Crear un índice sobre el nombre en la tabla movies.
-- Chequee que el índice fue creado correctamente.


SHOW INDEX FROM movies;











