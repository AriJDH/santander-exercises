-- 1. Con la base de datos “movies”, se propone crear una tabla temporal llamada “TWD”
-- y guardar en la misma los episodios de todas las temporadas de “The Walking Dead”.


USE movies_db;
DROP TABLE IF EXISTS `twd`;
CREATE TEMPORARY TABLE twd(
id_episode int,title varchar(45),season varchar(45));

INSERT INTO twd (
SELECT e.id,e.title,s.title
FROM episodes e INNER JOIN seasons s
ON e.season_id = s.id
WHERE s.serie_id = (
	SELECT series.id
	FROM series
	WHERE series.title = "The Walking Dead"));
    

-- 2. Realizar una consulta a la tabla temporal para ver los episodios de la primera
-- temporada.

SELECT *
FROM twd
WHERE twd.season = "Primer Temporada";
    



