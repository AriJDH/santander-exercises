SELECT * FROM movies;

SELECT first_name, last_name, rating FROM actors;

SELECT title as titulo FROM series;

SELECT first_name, last_name, rating FROM actors
WHERE rating > 7.5;

SELECT title, rating FROM movies
ORDER BY rating ASC;

SELECT title FROM movies
LIMIT 3;

SELECT * FROM movies
ORDER BY rating DESC
LIMIT 3;

SELECT * FROM actors
LIMIT 10;

SELECT title, rating FROM movies
WHERE title LIKE "%Toy Story%";

SELECT * FROM actors
WHERE first_name LIKE "Sam%";

SELECT title FROM movies
WHERE EXTRACT(YEAR FROM release_date) BETWEEN '2004' and '2008';

SELECT title FROM movies
WHERE rating > 3 AND awards > 1 AND release_date BETWEEN '1998-01-01' AND '2009-12-31'
ORDER BY rating; 