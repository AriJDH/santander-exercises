SELECT id FROM seasons WHERE serie_id =3;

SELECT * FROM series;

SELECT * FROM episodes;
DROP TABLE twd;
CREATE TEMPORARY TABLE twd 
SELECT * FROM episodes WHERE season_id IN (SELECT id FROM seasons WHERE serie_id = 3);

SELECT * FROM twd;

SELECT * FROM twd WHERE season_id = 20; 

-- Ejercicio 2

CREATE INDEX rating_index ON movies(rating); 


SHOW INDEX FROM movies; 

