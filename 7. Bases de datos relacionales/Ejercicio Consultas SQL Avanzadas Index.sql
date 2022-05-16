-- Agregar una película a la tabla movies.

INSERT INTO movies (title, rating, awards, release_date, length, genre_id) VALUES ("Granizo", 7, 3, "2022-04-05", 125, 5); 
-- Agregar un género a la tabla genres.

INSERT INTO genres (created_at, name, ranking) VALUES ("2022-05-16", "Anime", 13);

-- Asociar a la película del punto 1. con el género creado en el punto 2.
UPDATE movies SET genre_id = 14 WHERE id = 22;

-- Modificar la tabla actors para que al menos un actor tenga como favorita la película agregada en el punto 1.

UPDATE actors SET favorite_movie_id = 22 WHERE id = 47; 
-- Crear una tabla temporal copia de la tabla movies.

CREATE TEMPORARY TABLE TempMovies SELECT * FROM movies;
SELECT * FROM TempMovies;

-- Eliminar de esa tabla temporal todas las películas que hayan ganado menos de 5 awards.
set SQL_SAFE_UPDATES=0;
DELETE FROM TempMovies WHERE awards < 5;

-- Obtener la lista de todos los géneros que tengan al menos una película.
SELECT DISTINCT genre_id FROM movies WHERE genre_id NOT LIKE "null";

-- Obtener la lista de actores cuya película favorita haya ganado más de 3 awards.

SELECT a.first_name, a.last_name, m.awards
FROM movies m
INNER JOIN actors a
ON a.favorite_movie_id = m.id 
WHERE m.awards > 3;

-- Crear un índice sobre el nombre en la tabla movies.

CREATE INDEX index_name ON movies(title);
-- Chequee que el índice fue creado correctamente.
SHOW INDEX FROM movies;
-- En la base de datos movies ¿Existiría una mejora notable al crear índices? Analizar y justificar la respuesta.
-- ¿En qué otra tabla crearía un índice y por qué? Justificar la respuesta.
