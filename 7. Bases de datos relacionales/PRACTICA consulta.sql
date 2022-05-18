SELECT * FROM movies;

SELECT actors.first_name, actors.last_name, actors.rating
FROM actors;

SELECT serie.title AS titulo
FROM series AS serie;

SELECT actors.first_name, actors.last_name
FROM actors WHERE actors.rating > 7.5;


SELECT movies.title, movies.rating, movies.awards
FROM movies
WHERE movies.rating > 7.5 AND movies.awards > 2;


SELECT movies.title, movies.rating
FROM movies
ORDER BY movies.rating ASC;


SELECT movies.title
FROM movies
LIMIT 3;


SELECT movies.title
FROM movies
ORDER BY movies.rating DESC
LIMIT 5;


SELECT actors.first_name, actors.last_name
FROM actors
LIMIT 10;


SELECT movies.title, movies.rating FROM movies
WHERE movies.title LIKE "%Toy Story%";


SELECT actors.first_name, actors.last_name
FROM actors
WHERE actors.first_name LIKE "Sam%";


SELECT movies.title, movies.release_date
FROM movies
WHERE movies.release_date BETWEEN '2004-01-01' AND '2008-12-31';


SELECT movies.title
FROM movies
WHERE movies.rating > 3 AND movies.awards > 1 AND (movies.release_date
BETWEEN '1998-01-01' AND '2009-12-31');