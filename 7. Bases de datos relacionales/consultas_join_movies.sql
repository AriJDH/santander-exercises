SELECT genres.name, series.title FROM genres INNER JOIN series ON genres.id  = series.genre_id; 

SELECT s.title, count(*) as count_seasons 
FROM series s
INNER JOIN seasons ON s.id = seasons.serie_id
GROUP BY seasons.serie_id;

/*Mostrar sólo el nombre y apellido de los actores que trabajan en todas las
películas de la guerra de las galaxias y que estos no se repitan.*/

SELECT a.first_name, a.last_name, m.title 
FROM actors a
INNER JOIN actor_movie am
ON am.actor_id = a.id
INNER JOIN movies m
ON m.id = am.movie_id
WHERE m.title LIKE "La Guerra de las galaxias%";


