
SELECT 
	episodes.title as "Episodio",
    CONCAT(first_name, ' ', last_name) AS "Nombre"
FROM
	actor_episode INNER JOIN episodes INNER JOIN actors;
    
SELECT
	series.title,
    count(seasons.serie_id) as 'Cantidad temporadas'
FROM
	series INNER JOIN seasons
WHERE 
	series.id = seasons.serie_id
GROUP BY
	seasons.serie_id;
    
    select * from genres;
    
SELECT
	genres.name "Nombre genero",
    count(movies.genre_id) as Cantidad
FROM
	genres INNER JOIN movies
WHERE
	movies.genre_id = genres.id
GROUP BY
	genres.id
HAVING
	Cantidad > 3;
    
SELECT
	DISTINCT CONCAT(actors.first_name, ' ', actors.last_name) as Nombre
FROM
	actor_movie INNER JOIN actors INNER JOIN movies
WHERE movies.title LIKE "La Guerra de las galaxias%";
