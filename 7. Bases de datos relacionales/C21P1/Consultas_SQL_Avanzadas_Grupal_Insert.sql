USE biblioteca;

INSERT INTO autor (idAutor, Nombre, Nacionalidad) VALUES
(1, "Antoine de Saint-Exupéry", "Francesa"),
(2, "Umberto Eco", "Italiana"),
(3, "Cora Carolina", "Brasilera"),
(4, "Julio Cortázar", "Argentina"),
(5, "J.K. Rowling", "Inglesa");

INSERT INTO libro (idLibro, Titulo, Editorial, Area) VALUES
(1, "The Internet of Things", "Ampersand", "Internet"),
(2, "Harry Potter", "Salamandra", "Ficción"),
(3, "El Universo: Guía de viaje", "De Bolsillo", "Ficción"),
(4, "Database System Concepts", "Ampersand", "Base de Datos"),
(5, "Todos los fuegos, el fuego", "Asunto Impreso", "Ficción");

INSERT INTO estudiante (idLector, Nombre, Apellido, Direccion, Carrera, Edad) VALUES
(1, "Juan", "Fernandez", "Buenos Aires 123", "Informatica", 18),
(2, "Yohana", "Gomez", "Chaco 1030", "Ingenieria", 20),
(3, "Filippo", "Galli", "Corrientes 456", "Idiomas", 24),
(4, "Marcela", "Quiroz", "Salta 789", "Agronomia", 27),
(5, "Belen", "Ledesma", "Pueyrredon 890", "Medicina", 30);

INSERT INTO libroautor (idAutor, idLibro) VALUES
(1, 3),
(2, 4),
(2, 1),
(3, 3),
(4, 5),
(5, 2);

INSERT INTO prestamo (idLector, idLibro, FechaPrestamo, FechaDevolucion, Devuelto) VALUES
(3, 1, "20210516", "20210520", true),
(3, 4, "20210709", "20210716", false),
(1, 4, "20200510", "20200520", true),
(2, 2, "20220415", "20220420", true),
(4, 3, "20220220", "20220301", true),
(5, 5, "20220420", "20220501", true);
