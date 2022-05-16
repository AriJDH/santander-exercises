CREATE TEMPORARY TABLE TWD
SELECT *
FROM episodes 
WHERE season_id IN (
	SELECT id
    FROM seasons
    WHERE serie_id = 3
);

SELECT * 
FROM TWD;

SELECT * 
FROM TWD
WHERE season_id = 20;
