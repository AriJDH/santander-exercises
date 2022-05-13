SELECT genres.name,series.title FROM genres INNER JOIN series ON genres.id  = series.genre_id; 

SELECT episodes.title, actors.first_name, actors.last_name FROM episodes INNER JOIN actor_episode ON episodes.id= actor_episode.episode_id INNER JOIN actors ON actors.id = actor_episode.actor_id;

SELECT series.title, COUNT(*) as cantSeasons FROM series INNER JOIN seasons ON series.id = seasons.serie_id GROUP BY (series.id);

SELECT genres.name, COUNT(*) as cantPelis FROM  genres INNER JOIN movies ON genres.id = movies.genre_id GROUP BY (genre_id) HAVING cantPelis>=3;

SELECT distinct a.first_name, a.last_name
FROM actors a
INNER JOIN actor_movie am
ON am.actor_id = a.id
INNER JOIN movies m
ON m.id = am.movie_id
WHERE m.title LIKE "La Guerra de las galaxias%";


