SELECT s.title AS SERIE, g.name AS GENERO
FROM series s JOIN genres g 
ON s.genre_id = g.id;

SELECT e.title AS CAPITULO, ac.first_name AS NOMBRE, ac.last_name AS APELLIDO
FROM episodes e JOIN actor_episode a ON e.id = a.episode_id JOIN actors ac ON a.actor_id = ac.id;

SELECT s.title SERIE, COUNT(1) CANT_TEMPORADAS
FROM series s JOIN seasons se ON s.id = se.serie_id
GROUP BY s.title;

SELECT g.name GENERO, COUNT(1) CANT_PELICULAS
FROM genres g JOIN movies m ON g.id = m.genre_id
GROUP BY g.name HAVING CANT_PELICULAS > 3;

SELECT DISTINCT a.first_name NOMBRE, a.last_name APELLIDO
FROM actors a JOIN actor_movie am ON a.id = am.actor_id JOIN movies m ON m.title LIKE "La guerra de las galaxias%" AND m.id = am.movie_id;