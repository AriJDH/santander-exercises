-- Creo tabla temporal
CREATE TEMPORARY TABLE TWD
SELECT * FROM episodes
WHERE season_id IN
	(SELECT * 
    FROM seasons
    WHERE serie_id IN
		(SELECT id 
        FROM series
        WHERE title = 'The Walking Dead')
    )
;

--
SELECT * FROM TWD