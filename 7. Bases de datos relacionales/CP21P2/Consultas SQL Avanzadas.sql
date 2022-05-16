-- 1. Agregar una película a la tabla movies
INSERT INTO movies VALUES (NULL,NULL,NULL,"101 dalmatas", 7.9, 2, '2005-06-17 00:00:00',102,10);

-- 2. Agregar un género a la tabla genres.
INSERT INTO genres VALUES (NULL,'2004-02-19 00:00:00',NULL, "Western",13,1);

-- 3. Agregar un género a la tabla genres.
UPDATE  movies SET genre_id=14  WHERE titles LIKE "101 dalmatas";

-- 4. Modificar la tabla actors para que al menos un actor tenga como favorita la película agregada en el punto 1.
UPDATE actors SET favorite_movie_id = (SELECT movies.id FROM movies WHERE movies.title LIKE "101 dalmatas") LIMIT 1;

-- 5. Crear una tabla temporal copia de la tabla movies.

DROP TABLE IF EXISTS `movies_temporary`;
CREATE TEMPORARY TABLE movies_temporary
SELECT *
FROM movies;

-- 6. Eliminar de esa tabla temporal todas las películas que hayan ganado menos de 5 awards.
DELETE FROM movies_temporary WHERE awards<5;


-- 7. Obtener la lista de todos los géneros que tengan al menos una película.
SELECT *
FROM genres
JOIN movies_temporary ON genres.id= movies_temporary.genre_id;

-- 8. Obtener la lista de actores cuya película favorita haya ganado más de 3 awards.
SELECT *
FROM actors
JOIN movies_temporary ON movies_temporary.id= actors.favorite_movie_id
WHERE awards>3;

-- 9. Crear un índice sobre el nombre en la tabla movies.
CREATE INDEX nombre ON movies_temporary (title);

-- 10. Chequee que el índice fue creado correctamente.
SHOW INDEX FROM movies_temporary;

-- 11. En la base de datos movies ¿Existiría una mejora notable al crear índices? Analizar y justificar la respuesta.
-- Existiria una mejora notable en los casos donde la tabla movies manejara una gran cantidad de registros.

-- 12. ¿En qué otra tabla crearía un índice y por qué? Justificar la respuesta.
-- SI tuviera que elegir crearia un indice en el title de las temporadas en la tabla seasons ya que es una columna que no va a cambiar con el tiempo
-- y cada temporada va a tener un nombre unico y ayudaria a la busqueda rapida de peliculas segun la temporada

SELECT *
FROM movies_temporary;


