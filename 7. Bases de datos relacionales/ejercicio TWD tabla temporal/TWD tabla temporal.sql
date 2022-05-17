CREATE TEMPORARY TABLE TWD 
SELECT *, seasons.id AS idSeason FROM seasons  JOIN series 
ON series.id = seasons.serie_id 
WHERE series.title LIKE "The Walking Dea%";

SELECT 
    *
FROM
    TWD;
