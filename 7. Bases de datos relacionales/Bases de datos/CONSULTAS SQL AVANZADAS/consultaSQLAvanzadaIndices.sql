-- Agregar una pelicula a la tabla movies

INSERT INTO movies (title, rating, awards, release_date, length, genre_id) VALUES ('Marquesino', '1.5',  '2','1978-06-12', '150', '2'); 

-- Agregar un género a la tabla genres 

INSERT INTO genres (name, ranking) VALUES ('Otras', 30);

-- Asociar a la pelicula del punto uno con el genero creado en el punto 2

UPDATE movies SET genre_id = 15 WHERE id = 2;

SELECT * FROM movies WHERE title = "Marquesino";

-- Modificar la tabla actors para que al menos un actor tenga como favorita la pelicula agregada en el punto

UPDATE actors SET favorite_movie_id = 25 WHERE id = 44;

SELECT * FROM actors WHERE id = 44;

-- Crear una tabla temporal copia de la tabla movies 

CREATE TEMPORARY TABLE moviescopy
SELECT * FROM movies;

SELECT * FROM moviescopy;

-- Eliminar de esa tabla temporal todas las peliculas que hayan ganado menos de 5 awards
set SQL_SAFE_UPDATES=0;
DELETE FROM moviescopy WHERE awards < 5;

-- Obtener lista de todos los generos que tengan al menos una pelicula

SELECT DISTINCT name FROM genres INNER JOIN movies WHERE genres.id = movies.genre_id;

-- Obtener la lista de actores cuya película favorita haya ganado más de 3 awards 

SELECT first_name FROM actors INNER JOIN movies ON actors.favorite_movie_id = movies.id WHERE awards > 3;

-- Crear un indice sobre el nombre en la tabla movies 
CREATE INDEX name_index ON movies(title); 

-- chequee que el indice fue creado correctamente 

SHOW INDEX FROM movies; 

-- En la base de datos movies ¿Existiría una mejora notable al crear índices? Analizar y justificar la respuesta.
-- R En teoría sí, para demostrarse en la práctica debe poseer un tamaño considerable 

-- ¿En qué otra tabla crearía un índice y por qué? Justificar la respuesta.
-- R En la tabla de ratings 
