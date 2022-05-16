-- Creo tabla temporal
DROP TABLE IF EXISTS `TWD`;
CREATE TEMPORARY TABLE TWD
SELECT * FROM episodes
WHERE season_id IN
	(SELECT id 
    FROM seasons
    WHERE serie_id IN
		(SELECT id 
        FROM series
        WHERE title = 'The Walking Dead')
    );

-- Episodios primera temporada
SELECT * 
FROM TWD
WHERE season_id = 20;

-- Creamos un indice
-- Para facilitar las busquedas por fecha de las peliculas
CREATE INDEX release_date_idx
ON movies(release_date);

SHOW INDEX FROM movies;
-- HELP INDEX movie_db.movies;
