-- Mostrar el título y el nombre del género de todas las series.
SELECT genres.name, series.title FROM genres INNER JOIN series ON genres.id  = series.genre_id; 

-- Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan en cada uno de ellos.

SELECT episodes.title, actors.first_name, actors.last_name FROM episodes INNER JOIN actor_episodes ON episodes.id = actor_episode.epidose.id INNER JOIN actors ON actors.id = actor.episode_id; 

-- Mostrar el título de todas las series y el total de temporadas que tiene cada una de ellas.

SELECT series.title, COUNT() FROM series INNER JOIN seasons ON series.id

-- Mostrar el nombre de todos los géneros y la cantidad total de películas por cada uno, siempre que sea mayor o igual a 3.

SELECT genres.name, COUNT(*) as cantPelis FROM genres INNER JOIN movies ON genres.id = movies.genre_id GROUP BY (genre_id) HAVING cantPelis>=3;

-- Mostrar sólo el nombre y apellido de los actores que trabajan en todas las películas de la guerra de las galaxias y que estos no se repitan.

SELECT distinct a.first_name, a.last_name, m.title FROM actors a INNER JOIN actor_movie am ON am.actor_id = a.id INNER JOIN movies m ON m.id = am.movie_id WHERE m.title LIKE "La Guerra de las galaxias%";

