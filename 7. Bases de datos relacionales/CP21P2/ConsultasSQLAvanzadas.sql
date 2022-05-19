SELECT * FROM movies;
-- 1) Agregar una película a la tabla movies.
INSERT INTO movies VALUES (22,NULL,NULL,'Hotel Transylvania 2',7.2,1,'2012-10-04 00:00:00',90,10);

SELECT * FROM genres;
-- 2) Agregar un género a la tabla genres.
INSERT INTO genres VALUES (13,'2012-10-04 00:00:00',NULL,'Fantasia',13,1);

-- 3) Asociar a la película del punto 1. con el género creado en el punto 2.
UPDATE movies SET genre_id = 10 WHERE title LIKE "Hotel Transylvania 2";

SELECT * FROM actors;
-- 4) Modificar la tabla actors para que al menos un actor tenga como favorita la película agregada en el punto 1.
UPDATE actors SET favorite_movie_id = (
					SELECT movies.id FROM movies 
                    WHERE movies.title LIKE "Hotel Transylvania 2")
                    LIMIT 1;
                    
-- 5) Crear una tabla temporal copia de la tabla movies.
DROP TEMPORARY TABLE IF EXISTS `COPIA_MOVIES`;
CREATE TEMPORARY TABLE COPIA_MOVIES
SELECT * FROM movies;
SELECT * FROM COPIA_MOVIES;

-- 6) Eliminar de esa tabla temporal todas las películas que hayan ganado menos de 5 awards.
DELETE FROM COPIA_MOVIES WHERE COPIA_MOVIES.awards < 5;
SELECT * FROM COPIA_MOVIES;

-- 7) Obtener la lista de todos los géneros que tengan al menos una película.
SELECT DISTINCT genres.id, genres.name
FROM genres JOIN movies
ON genres.id = movies.genre_id;

-- 8) Obtener la lista de actores cuya película favorita haya ganado más de 3 awards.
SELECT actors.first_name, actors.last_name, actors.favorite_movie_id, movies.awards
FROM actors JOIN movies
ON actors.favorite_movie_id = movies.id
WHERE movies.awards > 3;

-- 9) Crear un índice sobre el nombre en la tabla movies.
CREATE INDEX nombre ON movies_temporary (title);

-- 10) Chequee que el índice fue creado correctamente.
SHOW INDEX FROM movies_temporary;

-- 11) En la base de datos movies ¿Existiría una mejora notable al crear índices? Analizar y justificar la respuesta.
-- 12) ¿En qué otra tabla crearía un índice y por qué? Justificar la respuesta.

