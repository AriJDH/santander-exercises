SELECT * FROM series;

SELECT series.title, genres.name 
FROM series JOIN genres
ON series.genre_id = genres.id;


SELECT series.title, seasons.title, actors.first_name, actors.last_name
FROM seasons JOIN series
ON seasons.serie_id = series.id
LEFT JOIN  actor_episode
ON seasons.id = actor_episode.episode_id
LEFT JOIN  actors
ON actor_episode.actor_id = actors.id;

SELECT series.title, COUNT(1)
FROM seasons JOIN series
ON seasons.serie_id = series.id
GROUP BY series.title;

SELECT movies.title, movies.genre_id
FROM movies;

SELECT genres.name, COUNT(3) AS valor
FROM genres LEFT JOIN movies
ON movies.genre_id = genres.id
GROUP BY genres.name
HAVING valor >= 3;


SELECT DISTINCT actors.first_name, actors.last_name
FROM actors LEFT JOIN movies
ON movies.title LIKE "La Guerra de las galaxias%"
RIGHT JOIN actor_movie
ON actors.id = actor_movie.actor_id;

