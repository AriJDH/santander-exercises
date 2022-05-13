-- Mostrar todos los registros de la tabla de movies.
SELECT * FROM MOVIES;


-- Mostrar el nombre, apellido y rating de todos los actores.
SELECT first_name, last_name FROM actors;


-- Mostrar el título de todas las series y usar alias para que tanto el nombre de la 
-- tabla como el campo estén en español.
SELECT title as titulo FROM series as series;


-- Mostrar el nombre y apellido de los actores cuyo rating sea mayor a 7.5. 
SELECT first_name, last_name from actors WHERE rating > 7.5;


-- Mostrar el título de las películas, el rating y los premios de las películas con un
-- rating mayor a 7.5 y con más de dos premios.
SELECT title, rating, awards FROM movies WHERE rating > 7.5 and awards > 2;


-- Mostrar el título de las películas y el rating ordenadas por rating en forma
-- ascendente.
SELECT TITLE, RATING from MOVIES ORDER BY rating ASC;


-- Mostrar los títulos de las primeras tres películas en la base de datos.
SELECT TITLE FROM MOVIES LIMIT 3;


-- Mostrar el top 5 de las películas con mayor rating.
SELECT TITLE, RATING FROM MOVIES ORDER BY RATING DESC LIMIT 5;

-- Listar los primeros 10 actores.
SELECT id, first_name, last_name FROM ACTORS LIMIT 10;

-- Mostrar el título y rating de todas las películas cuyo título sea de Toy Story.
SELECT TITLE, RATING FROM MOVIES WHERE TITLE LIKE "%Toy Story%";

-- Mostrar a todos los actores cuyos nombres empiezan con Sam.
SELECT * FROM ACTORS WHERE first_name LIKE "Sam%";


-- Mostrar el título de las películas que salieron entre el 2004 y 2008.
SELECT TITLE, release_Date FROM MOVIES WHERE year(release_date) BETWEEN 2004 AND 2008;

-- Traer el título de las películas con el rating mayor a 3, con más de 1 premio y con
-- fecha de lanzamiento entre el año 1988 al 2009. Ordenar los resultados por rating

SELECT TITLE FROM MOVIES WHERE RATING > 3 AND AWARDS > 1 AND year(RELEASE_DATE) BETWEEN 1988 AND 2009 ORDER BY RATING;

