-- Consultas SQL Avanzadas - Práctica grupal

-- Agregar una película a la tabla movies.
INSERT INTO movies (title, rating, awards, release_date, length, genre_id) VALUES ("Granizo", 7, 3, "2022-04-05", 125, 5); 
SELECT * FROM movies;

-- Agregar un género a la tabla genres.
INSERT INTO genres (created_at, name, ranking) VALUES ("2022-05-16", "Anime", 13);
SELECT * FROM genres;

-- Asociar a la película del punto 1. con el género creado en el punto 2.
UPDATE movies SET genre_id = 13 WHERE id = 28;

-- Modificar la tabla actors para que al menos un actor tenga como favorita la película agregada en el punto 1.
SELECT * FROM actors;
UPDATE actors SET favorite_movie_id = 28 WHERE id = 47; 


-- Crear una tabla temporal copia de la tabla movies.
CREATE TEMPORARY TABLE TempMovies SELECT * FROM movies;
SELECT * FROM TempMovies;

-- Eliminar de esa tabla temporal todas las películas que hayan ganado menos de 5 awards.
set SQL_SAFE_UPDATES=0;
DELETE FROM TempMovies WHERE awards < 5;

-- Obtener la lista de todos los géneros que tengan al menos una película.
SELECT genres.*, COUNT(*) as totalPelis FROM genres INNER JOIN movies ON genres.id = movies.genre_id GROUP BY movies.genre_id HAVING totalPelis>=1;

-- Obtener la lista de actores cuya película favorita haya ganado más de 3 awards.
SELECT a.first_name, a.last_name, m.awards
FROM movies m
INNER JOIN actors a
ON a.favorite_movie_id = m.id 
WHERE m.awards > 3;

-- Crear un índice sobre el nombre en la tabla movies (puede ser unique o no).
CREATE INDEX titleIndex ON movies(title);

-- Chequee que el índice fue creado correctamente.
SHOW INDEX FROM movies;

-- ---------------------------------------------------------------------------

-- Creación de Tablas Temporales e Índices - Práctica individual

-- EJ1
-- Con la base de datos “movies”, se propone crear una tabla temporal llamada “TWD” y guardar en la misma los episodios de todas las temporadas de “The Walking Dead”.
SELECT * FROM series;
SELECT id FROM seasons WHERE serie_id =3;

CREATE TEMPORARY TABLE twd 
SELECT * FROM episodes WHERE season_id IN (SELECT id FROM seasons WHERE serie_id = 3);

SELECT * FROM twd;

-- Realizar una consulta a la tabla temporal para ver los episodios de la primera temporada.
SELECT * FROM twd WHERE season_id = 20; 

-- Ejercicio 2
-- En la base de datos “movies”, seleccionar una tabla donde crear un índice y luego chequear la creación del mismo. 
CREATE INDEX rating_index ON movies(rating); 
SHOW INDEX FROM movies; 