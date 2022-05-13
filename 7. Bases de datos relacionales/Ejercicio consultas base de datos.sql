SELECT * FROM movies;

SELECT first_name, last_name, rating FROM actors;


SELECT title AS titulo FROM series AS seriesEspanol; -- alias

SELECT first_name, last_name FROM actors
	WHERE rating > 7.5;
    
SELECT title, rating, awards FROM movies
	WHERE rating > 7.5 AND awards > 2;
    
SELECT title, rating FROM movies
	ORDER BY rating ASC;
    
SELECT title FROM movies
	lIMIT 3;
    
SELECT title FROM movies
	ORDER BY rating DESC
	lIMIT 5;

SELECT first_name FROM actors
	LIMIT 10;
    
SELECT title, rating FROM movies
	WHERE title LIKE "Toy Story%";
    
SELECT first_name, last_name FROM actors
	WHERE first_name LIKE "Sam%";
    
SELECT title, release_date FROM movies
	 WHERE release_date BETWEEN "2004-01-01 00:00:00" AND "2008-12-30 00:00:00";
	 -- ORDER BY release_date;
     
SELECT title, rating, awards, release_date FROM movies
	WHERE rating > 3 AND awards > 1 AND release_date BETWEEN "1988-01-01 00:00:00" AND "2009-12-30 00:00:00" 
    ORDER BY rating;