-- 1. Mostrar el título y el nombre del género de todas las series.

SELECT title, g.name
FROM series as s
JOIN genres as g
ON genre_id;

-- 2. Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan
-- en cada uno de ellos.

SELECT e.title, a.first_name, a.last_name
FROM episodes as e
JOIN actor_episode as ae
ON episode_id
JOIN actors as a
ON actor_id;

-- 3. Mostrar el título de todas las series y el total de temporadas que tiene cada una de
-- ellas.

SELECT ser.title, COUNT(sea.id) as season_count
FROM series as ser
JOIN seasons as sea
ON ser.id = sea.serie_id
GROUP BY sea.serie_id;

-- 4. Mostrar el nombre de todos los gérneros y 
-- la cantidad total de peliculas por cada uno, siempre que sea mayor o igual a 3

SELECT gen.name, COUNT(mov.id) as movie_count
FROM genres as gen
JOIN movies as mov
ON gen.id = mov.genre_id
GROUP BY gen.id
HAVING movie_count >= 3;

-- 5. Mostrar sólo el nombre y apellido de los actores que trabajan en todas las
-- películas de la guerra de las galaxias y que estos no se repitan.
SELECT first_name, last_name
FROM actors as a
WHERE id IN 
	(SELECT actor_id
    FROM actor_movie as am
    WHERE movie_id IN
		(SELECT id
        FROM movies
        WHERE title LIKE "%La guerra de las galaxias%"
        )
    )