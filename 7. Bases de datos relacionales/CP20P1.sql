-- mostrar el todos los registros de la tabla de movies
SELECT id, created_at, updated_at, title, rating, awards, release_date, length, genre_id FROM movies;

-- mostrar nombre, apellido y rating de los actores
SELECT first_name, last_name, rating FROM actors;

-- mostrar el titulo de todas las series y usar alias para que tanto el nombre de la tabla dcomo el campo estén en español
SELECT title AS "titulo" FROM series;

-- motrar el nombre y apellido de los actores cuyo rating sea mayor a 7.5
SELECT first_name, last_name FROM actors
	WHERE rating > 7.5;

-- mostrar el turulo de las peliculas, el rating y los premios de las peliculas con un rating mayor a 7.5 y con mas de dos premios
SELECT title, rating, awards FROM movies
	WHERE rating > 7.5 AND awards > 2;
    
-- mostrar el titulo de las peliculas y el rating ordenadas por el rating en forma ascendente
SELECT title, rating FROM movies
	ORDER BY rating;

-- mostrar los titulos de las primeras tres películas en la base de datos
SELECT title FROM movie LIMIT 3;

-- mostrar el top 5 de peliculas con mayor rating
SELECT title, rating FROM movie 
	ORDER BY rating DESC LIMIT 5;

-- listar los primeros 10 actores
SELECT first_name, last_name FROM actors LIMIT 10;

-- mostrar el titulo y rating de todas las peliculas cuyo titulo sea de toy story
SELECT title, rating FROM movies 
	WHERE title LIKE "%Toy Story%";

-- mostrar a todos los actores cuyos nombres empiezan con Sam
SELECT first_name, last_name FROM actors 
	WHERE first_name LIKE "Sam%";

-- mostrar el titulo de las peliculas que salieron entre el 2004 y el 2008
SELECT title FROM movies 
	WHERE YEAR(release_date) BETWEEN 2004 AND 2008;

-- traer el titulo de las peliculas con el rating mayor a 3 con mas de 1 premio y con fecha de lanzamiento entre el año 1988 al 2009, ordenar por rating
SELECT title, rating FROM movies
	WHERE rating > 3 
    AND awards > 1
    AND YEAR(release_date) BETWEEN 1998 AND 2009
    ORDER BY rating DESC;