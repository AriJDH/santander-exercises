-- Con la base de datos “movies”, se propone crear una tabla temporal llamada “TWD”
-- y guardar en la misma los episodios de todas las temporadas de “The Walking Dead”.
CREATE TEMPORARY TABLE TWD
SELECT episodes.title FROM episodes JOIN seasons ON episodes.season_id= seasons.id
JOIN series ON seasons.serie_id = series.id WHERE series.title LIKE "The Walking Dead%" ;

--  Realizar una consulta a la tabla temporal para ver los episodios de la primera temporada.
SELECT * FROM TWD;


