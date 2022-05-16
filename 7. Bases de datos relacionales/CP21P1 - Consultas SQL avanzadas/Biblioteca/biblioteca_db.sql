-- MySQL dump 10.13  Distrib 5.7.18, for Linux (x86_64)
--
-- Host: localhost    Database: laravel-database
-- ------------------------------------------------------
-- Server version	5.7.18-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--

--

DROP DATABASE IF EXISTS biblioteca_db;
CREATE DATABASE biblioteca_db;
USE biblioteca_db;


DROP TABLE IF EXISTS `autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `autor` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `nacionalidad` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--

--

LOCK TABLES `autor` WRITE;
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
INSERT INTO `autor` VALUES (1,'Brian','Argentina'),(2,'Pepe','Brasilera'),(3,'Pepa','Brasilera'),(4,'Lucila','Argentina'),(5,'Aslan','Brasilera'),(6,'Milagros','Brasilera'),(7,'Damian','Francesa'),(8,'Florencia','Italiana'),(9,'Sebastian','Italiana'),(10,'Jonathan','Francesa'),(11,'Agustina','Italiana'),(12,'J.K. Rowling.','Italiana');
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;
UNLOCK TABLES;

--

--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estudiante` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `apellido` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `carrera` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `edad` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--

--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` VALUES (1,'Brian','Contrera','Informatica',NULL),(2,'Lucila','Greco','Informatica',NULL),(3,'Milagros','Contrera','Pedagogia',NULL),(4,'Sebastian','Vera','Sociales',NULL),(5,'Damian','De leo','Fisica',NULL),(6,'Florencia','Carracedo','Abogacia',24),(7,'Lucas','Contrera','Informatica',28),(8,'Luciano','Perez','Informatica',18),(9,'Ernesto','Fraile','Abogacia',33),(10,'Ernesto','Garcia','Informatica',36),(11,'Claudio','Valle','Abogacia',22),(12,'Claudio','Garce','Abogacia',22),(13,'Filippo','Galli','informatica',33);
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--

--

DROP TABLE IF EXISTS `libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `libro` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `titulo` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `editorial` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `area` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=149 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--

--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
INSERT INTO `libro` VALUES (1,'El sapo pepe','pep','Niños'),(2,'Java','edit','Internet'),(3,'C+','Salamandra','Internet'),(4,'SQL','Salamandra','Internet'),(5,'El Universo: Guía de viaje','Otra','Niños'),(6,'WHERE','SALAMANDRA','Base de Datos'),(7,'Diseño de Base de Datos','Planeta','Base de Datos'),(8,'Ricitos de Oro','Planeta','Infantil');
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
UNLOCK TABLES;

--

--

DROP TABLE IF EXISTS `libro_autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `libro_autor` (
  `idAutor` int(10) unsigned NOT NULL,
  `idLibro` int(10) unsigned NOT NULL,
  KEY `libro_autor_idAutor_foreign` (`idAutor`),
  KEY `libro_autor_idLibro_foreign` (`idLibro`),
  CONSTRAINT `libro_autor_idAutor_foreign` FOREIGN KEY (`idAutor`) REFERENCES `autor` (`id`),
  CONSTRAINT `libro_autor_idLibro_foreign` FOREIGN KEY (`idLibro`) REFERENCES `libro` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--

--

LOCK TABLES `libro_autor` WRITE;
/*!40000 ALTER TABLE `libro_autor` DISABLE KEYS */;
INSERT INTO `libro_autor` VALUES (1,5),(2,5),(3,5),(12,6),(12,5),(12,4);
/*!40000 ALTER TABLE `libro_autor` ENABLE KEYS */;
UNLOCK TABLES;

--

--



DROP TABLE IF EXISTS `prestamo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prestamo` (
  `idLector` int(10) unsigned NOT NULL,
  `idLibro` int(10) unsigned NOT NULL,
  `fechaPrestamo` timestamp NULL DEFAULT NULL,
  `fechaDevolucion` timestamp NULL DEFAULT NULL,
  `devuelto` tinyint(1) NOT NULL DEFAULT '1',
  KEY `prestamo_idLector_foreign` (`idLector`),
  KEY `prestamo_idLibro_foreign` (`idLibro`),
  CONSTRAINT `prestamo_idLector_foreign` FOREIGN KEY (`idLector`) REFERENCES `estudiante` (`id`),
  CONSTRAINT `prestamo_idLibro_foreign` FOREIGN KEY (`idLibro`) REFERENCES `libro` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--

--

LOCK TABLES `prestamo` WRITE;
/*!40000 ALTER TABLE `prestamo` DISABLE KEYS */;
INSERT INTO `prestamo` VALUES (13,1,'2021-01-01',NULL,NULL),(8,7,'2022-02-01',NULL,NULL),(10,6,'2022-01-01',NULL,NULL),(13,2,'2021-01-01',NULL,NULL),(13,3,'2021-01-01',NULL,NULL),(12,4,'2021-07-14','2021-07-16',1),(12,5,'2021-07-14','2021-07-16',0),(12,6,'2021-07-14','2021-07-16',0);
/*!40000 ALTER TABLE `prestamo` ENABLE KEYS */;
UNLOCK TABLES;

--

--


