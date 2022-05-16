-- Mostrar el título y el nombre del género de todas las series.
SELECT series.title, genres.name
FROM series INNER JOIN genres
ON series.genre_id = genres.id;

-- Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan en cada uno de ellos.
SELECT episodes.title, actors.first_name,actors.last_name
FROM actors 
JOIN actor_episode ON actor_episode.actor_id = actors.id
JOIN episodes ON actor_episode.episode_id = episode_id;

-- Mostrar el título de todas las series y el total de temporadas que tiene cada una de ellas.
SELECT series.title, COUNT(seasons.serie_id) AS "Total seassons"
FROM series JOIN seasons ON seasons.serie_id = series.id
GROUP BY series.title;

-- Mostrar el nombre de todos los géneros y la cantidad total de películas por cada uno, siempre que sea mayor o igual a 3.
SELECT genres.name , COUNT(movies.genre_id) as "Total movies"
FROM genres JOIN movies ON genres.id = movies.genre_id
GROUP BY genres.name HAVING COUNT(movies.genre_id) >= 3;

-- Mostrar sólo el nombre y apellido de los actores que trabajan en todas las películas de la guerra de las galaxias y que estos no se repitan.
 SELECT actors.first_name, actors.last_name 
 FROM actors JOIN actor_movie ON actor_movie.actor_id = actors.id
 JOIN movies ON actor_movie.movie_id = movies.id
 WHERE movies.title LIKE "La Guerra de las galaxias%"




