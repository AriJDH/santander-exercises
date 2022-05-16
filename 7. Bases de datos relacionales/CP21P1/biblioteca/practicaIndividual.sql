-- Ejercicio 1
-- 1. ¿A qué se denomina JOIN en una base de datos y para qué se utiliza?
-- Se utiliza para obtener datos de tablas relacionadas entre sí

-- 2. Explicar dos tipos de JOIN.
-- *El INNER JOIN sirve para obtener datos de la intersección de varias tablas cuando tienen algún dato en común que las relaciona.
-- *El LEFT JOIN sirve para que a los datos de la tabla de la izquierda (antes del LEFT JOIN) se le sumen los datos de la tabla de la derecha cuando corresponda,
-- cuando tengan algún dato que las relacione.

-- 3. ¿Para qué se utiliza el GROUP BY?
-- Se utiliza para agrupar los resultados en base a una columna y obtenerlos resumidos en un registro.

-- 4. ¿Para qué se utiliza el HAVING?
-- Es para poner condiciones sobre un grupo de registros (se utiliza con el GROUP BY)

-- 5. Escribir una consulta genérica para cada uno de los siguientes diagramas:
-- INNER JOIN: SELECT a.nombre FROM alumnos INNER JOIN nota n ON a.id = n.id_alumno
-- LEFT JOIN: SELECT dni, a.patente FROM personas p LEFT JOIN auto a ON p.id = a.id_persona

-- ------------------------------------------------------------------------------------------------------------------------------------
-- ------------------------------------------------------------------------------------------------------------------------------------

-- Ejercicio 2
USE  movies_db;

-- título y nombre del género de todas las series.
SELECT s.title AS 'Titulo', g.name AS 'Género' FROM series s
	INNER JOIN genres g ON s.genre_id = g.id;
    
-- título de episodios, con el nombre y apellido de los actores
SELECT e.title, a.first_name, a.last_name FROM episodes e
	INNER JOIN actor_episode ae ON e.id = ae.episode_id
    INNER JOIN actors a ON ae.actor_id = a.id;

-- título de todas las series y total de temporadas
SELECT series.title, COUNT(1) FROM series
	INNER JOIN seasons ON series.id = seasons.serie_id
    GROUP BY series.title;

-- nombre de todos los géneros y cantidad total de películas por cada uno, sólo con mós de 3
SELECT g.name FROM genres g WHERE (SELECT COUNT(1) FROM movies m WHERE m.genre_id = g.id) > 2;

-- actores que trabajan en todas las peliculas del a guerra de las galaxias sin que se repitan
SELECT DISTINCT a.first_name, a.last_name FROM movies m 
	INNER JOIN actor_movie am ON m.title LIKE "La Guerra de las galaxias%" AND m.id = movie_id
    INNER JOIN actors a ON am.actor_id = a.id;