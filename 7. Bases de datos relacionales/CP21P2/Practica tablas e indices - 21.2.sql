-- EJERCICIO 1:

CREATE TEMPORARY TABLE twd
SELECT * FROM episodes WHERE season_id IN (SELECT id FROM seasons WHERE serie_id = 3);

SELECT * FROM twd;

SELECT * FROM twd WHERE season_id = 20;

-- EJERCICIO 2:

CREATE INDEX rating_index
ON movies (rating);

-- El volumen de consultas ordenado por el rating de las películas. 