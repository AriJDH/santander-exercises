-- EJERCICIO 1
-- Con la base de datos “movies”, se propone crear una tabla temporal llamada “TWD” y 
-- guardar en la misma los episodios de todas las temporadas de “The Walking Dead”.

USE movies_db;
DROP TEMPORARY TABLE IF EXISTS `TWD`;
CREATE TEMPORARY TABLE TWD(
id_episode int, title varchar(45), season varchar(45));

INSERT INTO TWD (
SELECT episodes.id, episodes.title, seasons.title
FROM episodes 
JOIN seasons ON episodes.season_id = seasons.id
WHERE seasons.serie_id IN (
	SELECT series.id
	FROM series
	WHERE series.title LIKE "The Walking Dead"));
    

-- Realizar una consulta a la tabla temporal para ver los episodios de la primera temporada.
SELECT *
FROM TWD
WHERE TWD.season LIKE "Primer Temporada";


-- EJERCICIO 2
-- En la base de datos “movies”, seleccionar una tabla donde crear un índice y luego chequear la creación del mismo. 
CREATE INDEX nombre ON movies_temporary (title);
SHOW INDEX FROM movies_temporary;

-- Analizar por qué crearía un índice en la tabla indicada y con qué criterio se elige/n el/los campos.
-- Se crea un índice en el título de las películas porque es menos probable que cambie con el tiempo.