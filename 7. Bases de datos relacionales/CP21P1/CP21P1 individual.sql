USE movies_db;
-- Mostrar el título y el nombre del género de todas las series.
SELECT m.title,g.name FROM movies m JOIN genres g on m.id=g.id;

-- Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan
-- en cada uno de ellos.
SELECT e.title,a.first_name,a.last_name FROM actors a
 JOIN actor_episode ae ON a.id = ae.actor_id
 JOIN episodes e ON e.id = ae.episode_id;
 
 -- Mostrar el título de todas las series y el total de temporadas que tiene cada una de
-- ellas.
SELECT ser.title,COUNT(sea.id) FROM  seasons sea JOIN series ser ON sea.serie_id = ser.id GROUP BY ser.title;

-- Mostrar el nombre de todos los géneros y la cantidad total de películas por cada
-- uno, siempre que sea mayor o igual a 3.
SELECT g.name,SUM(g.id) as Cantidad FROM movies m
	JOIN genres g ON m.genre_id = g.id GROUP BY g.name
    HAVING SUM(g.id)>3;

-- Mostrar sólo el nombre y apellido de los actores que trabajan en todas las
-- películas de la guerra de las galaxias y que estos no se repitan.

SELECT DISTINCT a.first_name,a.last_name FROM actors a
 JOIN actor_movie am ON a.id = am.actor_id
 JOIN movies m ON m.id = am.movie_id WHERE m.title LIKE "%galaxias%" ;
 
 