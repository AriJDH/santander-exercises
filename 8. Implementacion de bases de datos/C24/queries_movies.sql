SELECT * FROM episodes;
SELECT * FROM actor_episode;
SELECT * FROM actor_movie;
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
	SELECT actor_id
    FROM actor_movie
    WHERE movie_id IN (
		SELECT id 
        FROM movies
        WHERE title = "Avatar"
        )
		
    );
    
-- Listar todas las películas cuyos actores tengan rating 
-- superior a <valor recibido por parámetro>

SELECT * 
FROM movies as m
WHERE m.id IN (
	SELECT movie_id
    FROM actor_movie
    WHERE actor_id IN (
		SELECT id
        FROM actors
        WHERE rating > 7
    )
)