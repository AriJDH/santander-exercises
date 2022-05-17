-- EJERCICIO 1
-- Con la base de datos “movies”, se propone crear una tabla temporal llamada “TWD” y guardar en la misma los
-- episodios de todas las temporadas de “The Walking Dead”.
USE movies_db;
CREATE TEMPORARY TABLE TWD
SELECT e.id, e.created_at, e.updated_at, e.title, e.number, e.release_date, e.rating, s.title AS season_title, s.number AS season_number FROM seasons s
	INNER JOIN episodes e ON s.id = e.season_id
    WHERE s.serie_id = (SELECT id FROM series WHERE title LIKE "The Walking Dead");

-- Realizar una consulta a la tabla temporal para ver los episodios de la primera temporada.
SELECT id, created_at, updated_at, title, number, release_date, rating FROM TWD WHERE season_number = 1;



-- EJERCICIO 2
-- En la base de datos “movies”, seleccionar una tabla donde crear un índice y luego chequear la creación del mismo. 
CREATE INDEX actor_lastname ON actors(last_name);
SHOW INDEX FROM actors;

-- Analizar por qué crearía un índice en la tabla indicada y con qué criterio se elige/n el/los campos.

-- R: Lo crearía para optimizar la busqueda por apellido en la tabla de actores --