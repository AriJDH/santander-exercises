-- 1) Mostrar el título y el nombre del género de todas las series.
SELECT series.title, genres.name
FROM series
JOIN genres
ON series.genre_id = genres.id;

-- 2) Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan en cada uno de ellos.
SELECT episodes.title, actors.first_name, actors.last_name
FROM episodes, actors
INNER JOIN actor_episode
ON actor_episode.id = actor_episode.id;

-- 3)Mostrar el título de todas las series y el total de temporadas que tiene cada una de ellas.
SELECT series.title, COUNT(1)
FROM series
JOIN seasons
ON serie_id = seasons.serie_id
GROUP BY series.title;

-- 4) Mostrar el nombre de todos los géneros y la cantidad total de películas por cada uno, siempre que sea mayor o igual a 3.
SELECT genres.name, COUNT(3) AS cantidad
FROM genres
JOIN movies
ON genres.id = movies.genre_id
GROUP BY genres.name
HAVING cantidad >= 3;

-- 5) Mostrar sólo el nombre y apellido de los actores que trabajan en todas las películas de la guerra de las galaxias y que estos no se repitan.
SELECT DISTINCT actors.first_name, actors.last_name
FROM actors 
LEFT JOIN movies
ON movies.title LIKE "La guerra de las galaxias%"
RIGHT JOIN actor_movie
ON actors.id = actor_movie.actor_id;