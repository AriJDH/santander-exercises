SELECT * FROM movies;

SELECT first_name, last_name, rating FROM actors;

SELECT title AS titulo FROM series;

SELECT first_name AS nombre, last_name AS apellido, rating FROM actors WHERE rating > 7.5; 

SELECT title, rating, awards FROM movies WHERE awards > 2 AND rating > 7.5;

SELECT title, rating FROM movies ORDER BY rating;

SELECT title FROM movies LIMIT 3;

SELECT title, rating FROM movies ORDER BY rating DESC LIMIT 5;

SELECT first_name AS nombre, last_name as apellido FROM actors LIMIT 10;

SELECT title, rating FROM movies WHERE title LIKE 'Toy Story%';

SELECT first_name, last_name FROM actors WHERE first_name LIKE 'Sam%';

SELECT title, release_date FROM movies WHERE EXTRACT(YEAR FROM release_date) BETWEEN 2004 AND 2008;

SELECT title, rating, awards, release_date FROM movies WHERE rating > 3 AND awards > EXTRACT(YEAR FROM release_date) BETWEEN 1988 AND 2009 ORDER BY rating;