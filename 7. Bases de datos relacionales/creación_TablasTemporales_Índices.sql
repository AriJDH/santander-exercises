
SELECT id FROM seasons WHERE serie_id =3;

SELECT * FROM series;

SELECT * FROM episodes;
DROP TABLE twd;

/*Con la base de datos “movies”, se propone crear una tabla temporal llamada “TWD” 
y guardar en la misma los episodios de todas las temporadas de “The Walking Dead”.*/
CREATE TEMPORARY TABLE twd 
SELECT * FROM episodes WHERE season_id IN (SELECT id FROM seasons WHERE serie_id = 3);

SELECT * FROM twd;

-- Realizar una consulta a la tabla temporal para ver los episodios de la primera temporada.
SELECT * FROM twd WHERE season_id = 20; 

-- Ejercicio 2
-- En la base de datos “movies”, seleccionar una tabla donde crear un índice y luego chequear la creación del mismo. 
CREATE INDEX rating_index ON movies(rating); 

SHOW INDEX FROM movies; 