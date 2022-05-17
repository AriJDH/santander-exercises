-- En la base de datos “movies”, seleccionar una tabla donde crear un índice y luego chequear la creación del mismo.

CREATE INDEX actors_idx
ON actors (id, first_name,last_name); 

SHOW INDEX FROM actors;

