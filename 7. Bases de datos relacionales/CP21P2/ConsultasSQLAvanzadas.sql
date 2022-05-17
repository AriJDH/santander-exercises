USE movies_db;

-- Agregar una película a la tabla movies.
INSERT INTO movies(title, rating, awards, release_date, length) VALUES("SNK", 8.1, 0,"2009-02-16" , 90);

-- Agregar un género a la tabla genres.
INSERT INTO genres(name, ranking) VALUES ("Anime", 13);

-- Asociar a la película del punto 1. con el género creado en el punto 2.
UPDATE movies SET genre_id = 13 WHERE id = 22;

-- Modificar la tabla actors para que al menos un actor tenga como favorita la película agregada en el punto 1.
UPDATE actors SET favorite_movie_id = 22 WHERE id = 3;

-- Crear una tabla temporal copia de la tabla movies.
CREATE TEMPORARY TABLE TMOVIES
	SELECT * FROM movies;

-- Eliminar de esa tabla temporal todas las películas que hayan ganado menos de 5 awards.
DELETE FROM TMOVIES WHERE awards < 5;

-- Obtener la lista de todos los géneros que tengan al menos una película.
SELECT DISTINCT genre_id FROM movies WHERE genre_id NOT LIKE "null";

-- Obtener la lista de actores cuya película favorita haya ganado más de 3 awards.
SELECT a.first_name FROM actors a
	INNER JOIN movies m ON m.id = a.favorite_movie_id WHERE awards > 3;

-- Crear un índice sobre el nombre en la tabla movies.
CREATE INDEX movies_name ON movies(title);

-- Chequee que el índice fue creado correctamente.
SHOW INDEX FROM movies;

-- En la base de datos movies ¿Existiría una mejora notable al crear índices? Analizar y justificar la respuesta.
-- Si existen suficientes registros si se podría notar una mejora, sino sería practicamente lo mismo tenerlos que no tenerlos.

-- ¿En qué otra tabla crearía un índice y por qué? Justificar la respuesta.
-- Podría crear índices en el número y título de temporada en seasons para mejorar la respuesta en la busqueda de una serie en concreto.