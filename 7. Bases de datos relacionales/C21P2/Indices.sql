SHOW INDEXES FROM movies;

CREATE INDEX rating_index
ON movies (rating);

-- El volumen de consultas ordenado por el rating de las películas. 
