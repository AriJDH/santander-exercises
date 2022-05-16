-- EJERCICIO 1

-- 1. Con la base de datos “movies”, se propone crear una tabla temporal llamada “TWD” y guardar en la misma los episodios de todas las temporadas de “The Walking Dead”.
DROP TEMPORARY TABLE TWD;
CREATE TEMPORARY TABLE TWD

SELECT episodes.*
FROM episodes
JOIN seasons ON episodes.season_id=seasons.id
WHERE seasons.serie_id in (
	SELECT series.id
	FROM series
	WHERE series.title = "The Walking Dead");
    


-- 2. Realizar una consulta a la tabla temporal para ver los episodios de la primera temporada.
SELECT *
FROM TWD
JOIN seasons ON TWD.season_id=seasons.id
WHERE seasons.title LIKE "Primer Temporada";

-- EJERCICIO 2 
-- 1. En la base de datos “movies”, seleccionar una tabla donde crear un índice y luego chequear la creación del mismo. 
CREATE INDEX nombre ON movies_temporary (title);
SHOW INDEX FROM movies_temporary;

-- 2. Analizar por qué crearía un índice en la tabla indicada y con qué criterio se elige/n el/los campos.
-- Se crearia un indice en el title de las peliculas en la tabla movies ya que es una columna que no va a cambiar con el tiempo
-- y cada pelicula va a tener un nombre unico y ayudaria a la busqueda rapida de peliculas segun su nombre
