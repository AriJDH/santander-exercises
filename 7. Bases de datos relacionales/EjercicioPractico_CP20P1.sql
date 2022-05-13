SELECT * FROM movies;

SELECT first_name, last_name, rating FROM actors;

SELECT title as Titulo FROM series;

SELECT first_name as Nombre, last_name as Apellido FROM actors WHERE rating > 7.5;

SELECT title as Titulo, rating as Rating, awards as Premios FROM movies WHERE rating > 7.5 AND awards > 2;

SELECT title as Titulo, rating as Rating FROM movies ORDER BY rating;

SELECT title as Titulo FROM movies LIMIT 3;

SELECT title as Titulo, rating as Rating FROM movies ORDER BY rating DESC LIMIT 5;

SELECT first_name as Nombre, last_name as Apellido FROM actors LIMIT 10;

SELECT title as Titulo, rating as Rating FROM movies WHERE title LIKE "%Toy Story%";

SELECT first_name as Nombre, last_name as Apellido FROM actors WHERE first_name LIKE "SAM%";

SELECT title as Titulo, release_date as FechaLanzamiento FROM movies WHERE YEAR(release_date) BETWEEN '2004' and '2008';

SELECT title as Titulo FROM movies WHERE rating > 3 and awards > 1 and YEAR(release_date) BETWEEN '1988' and '2009' ORDER BY rating DESC;