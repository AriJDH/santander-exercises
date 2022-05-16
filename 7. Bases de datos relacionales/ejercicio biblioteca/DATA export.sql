-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: biblioteca_db
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `autor`
--

DROP TABLE IF EXISTS `autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autor` (
  `idAutor` int NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `nacionalidad` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idAutor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autor`
--

LOCK TABLES `autor` WRITE;
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiante` (
  `idLector` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `carrera` varchar(45) DEFAULT NULL,
  `edad` int DEFAULT NULL,
  PRIMARY KEY (`idLector`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libro`
--

DROP TABLE IF EXISTS `libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libro` (
  `idLibro` int NOT NULL,
  `titulo` varchar(45) DEFAULT NULL,
  `editorial` varchar(45) DEFAULT NULL,
  `area` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idLibro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro`
--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libroautor`
--

DROP TABLE IF EXISTS `libroautor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libroautor` (
  `idlibroAutor` int NOT NULL,
  `fk_idLibro` int NOT NULL,
  `fk_idAutor` int NOT NULL,
  KEY `fk_idAutorLibro_idx` (`fk_idAutor`),
  KEY `fk_idLibroAutor_idx` (`fk_idLibro`),
  CONSTRAINT `fk_idAutorLibro` FOREIGN KEY (`fk_idAutor`) REFERENCES `autor` (`idAutor`),
  CONSTRAINT `fk_idLibroAutor` FOREIGN KEY (`fk_idLibro`) REFERENCES `libro` (`idLibro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libroautor`
--

LOCK TABLES `libroautor` WRITE;
/*!40000 ALTER TABLE `libroautor` DISABLE KEYS */;
/*!40000 ALTER TABLE `libroautor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamo`
--

DROP TABLE IF EXISTS `prestamo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamo` (
  `idPrestamo` int NOT NULL,
  `idLector` int DEFAULT NULL,
  `idLibro` int DEFAULT NULL,
  `fechaPrestamo` datetime DEFAULT NULL,
  `fechaDevolucion` datetime DEFAULT NULL,
  `devuelto` tinyint DEFAULT '0',
  PRIMARY KEY (`idPrestamo`),
  KEY `fk_idLectror_idx` (`idLector`),
  KEY `fk_idLibro_idx` (`idLibro`),
  CONSTRAINT `fk_prestamoLector` FOREIGN KEY (`idLector`) REFERENCES `estudiante` (`idLector`),
  CONSTRAINT `fk_prestamoLibro` FOREIGN KEY (`idLibro`) REFERENCES `libro` (`idLibro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamo`
--

LOCK TABLES `prestamo` WRITE;
/*!40000 ALTER TABLE `prestamo` DISABLE KEYS */;
/*!40000 ALTER TABLE `prestamo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-16 15:08:25
