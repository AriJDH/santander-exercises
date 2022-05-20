SELECT * FROM episodes;
SELECT * FROM actor_episode;
SELECT * FROM actors;
SELECT * FROM movies;

-- Listar todos los actores que tengan rating superior a 
-- <valor recibido por parámetro> 
SELECT * FROM actors WHERE rating >= 7;

-- Listar todos los actores que trabajan en la 
-- <película recibida por parámetro>

SELECT * FROM actors as a
WHERE a.id IN 
	(
	SELECT id
    FROM actor_movie
    WHERE movie_id IN (
		SELECT id 
        FROM movies
        WHERE title = "Avatar"
        )
		
    )