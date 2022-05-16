-- Ejercicio 1

-- ¿A qué se denomina JOIN en una base de datos y para qué se utiliza?
-- El JOIN es la manera de referenciar registros de una tabla con otra
-- mediante el uso de PK y FK.

-- Explicar dos tipos de JOIN.
-- INNER JOIN es la interseccion entre dos tablas A y B, es decir que solo
-- apareceran solo los registros de A que tienen un registro, relacionado
-- mediante una FK, en la tabla B
-- La diferencia principal con el LEFT JOIN entre las tablas A y B, es que
-- en este ultimo tambien apareceran los registros de A sin "relacion" con
-- B (con los atributos en nulo).

-- ¿Para qué se utiliza el GROUP BY?
-- Para agrupar registros mediante un atributo comun de la tabla. Ejemplo:
-- en una tabla "Examenes" podemos tener las notas de varios alumnos en
-- diferentes asignaturas. Con GROUP BY podriamos agrupar mediante el legajo
-- del alumno para asi sacar un promedio.

-- ¿Para qué se utiliza el HAVING? 
-- El HAVING tiene un proposito similar al WHERE, un filtrado. Su diferencia
-- es que el WHERE filtra registros, mientras que el HAVING filtra grupos.



-- Ejercicio 2

-- Mostrar el título y el nombre del género de todas las series
SELECT series.title, genres.name
FROM series
JOIN genres ON series.genre_id = genres.id;

-- Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan en cada uno de ellos
SELECT episodes.title, actors.first_name, actors.last_name
FROM actor_episode
JOIN actors ON actor_episode.actor_id = actors.id
JOIN episodes ON actor_episode.episode_id = episodes.id;

-- Mostrar el título de todas las series y el total de temporadas que tiene cada una de ellas
SELECT series.title, COUNT(*) AS "temporadas"
FROM seasons
JOIN series ON seasons.serie_id = series.id
GROUP BY series.id;

-- Mostrar el nombre de todos los géneros y la cantidad total de películas por cada uno, siempre que sea mayor o igual a 3
SELECT genres.name, COUNT(*) as "peliculas"
FROM movies
JOIN genres ON movies.genre_id = genres.id
GROUP BY genres.id
HAVING peliculas >= 3;

-- Mostrar sólo el nombre y apellido de los actores que trabajan en todas las películas de la guerra de las galaxias y que estos no se repitan
SELECT DISTINCT actors.first_name, actors.last_name
FROM actor_movie
JOIN movies ON actor_movie.movie_id = movies.id
JOIN actors ON actor_movie.actor_id = actors.id
WHERE movies.title LIKE "%La Guerra de las galaxias%";
