USE movies_db;
-- Agregar una película a la tabla movies.
INSERT  INTO  movies  VALUES  (22,"2021-01-02","2022-01-02","pelicula",9.8,2,"2022-01-02",3,5);

-- Agregar un género a la tabla genres
 INSERT INTO genres (created_at,updated_at,name,ranking,active) VALUES ("2020-07-04",null,"Thriler",13,1);
 
 -- Asociar a la película del punto 1. con el género creado en el punto 2
UPDATE movies SET genre_id=14 WHERE title='pelicula';

-- Modificar la tabla actors para que al menos un 
-- actor tenga como favorita la película agregada en el punto 1.
UPDATE actors SET favorite_movie_id=22 WHERE first_name='Sigourney';

-- Crear una tabla temporal copia de la tabla movies.
CREATE TEMPORARY TABLE copia_movies
SELECT * FROM movies;

-- Eliminar de esa tabla temporal todas las películas que hayan ganado menos de 5 awards.
DELETE FROM copia_movies WHERE awards<5; 

-- Obtener la lista de todos los géneros que tengan al menos una película.
SELECT m.genre_id,m.title,g.name FROM movies m  JOIN genres g ON m.genre_id = g.id; 

-- Crear un índice sobre el nombre en la tabla movies.
CREATE INDEX rating_index
ON movies (rating);

-- Chequee que el índice fue creado correctamente.
SELECT rating_index FROM movies ;

-- En la base de datos movies ¿Existiría una mejora notable al crear índices? Analizar y justificar la respuesta.
 -- rating puede ser muy consultada y se puede optimizar tiempo, con los datos que hay actualmente en la base no se nota

-- ¿En qué otra tabla crearía un índice y por qué? Justificar la respuesta.
-- en genres por el mismo motivo de rating
