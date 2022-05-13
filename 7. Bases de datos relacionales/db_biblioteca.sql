-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema biblioteca
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema biblioteca
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `biblioteca` DEFAULT CHARACTER SET utf8 ;
USE `biblioteca` ;

-- -----------------------------------------------------
-- Table `biblioteca`.`libro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `biblioteca`.`libro` (
  `id_libro` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `editorial` VARCHAR(45) NOT NULL,
  `area` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_libro`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `biblioteca`.`autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `biblioteca`.`autor` (
  `id_autor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `nacionalidad` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_autor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `biblioteca`.`libro_autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `biblioteca`.`libro_autor` (
  `id_libro_autor` INT NOT NULL AUTO_INCREMENT,
  `id_libro` VARCHAR(45) NOT NULL,
  `libro_id_libro` INT NOT NULL,
  `autor_id_autor` INT NOT NULL,
  PRIMARY KEY (`id_libro_autor`),
  INDEX `fk_libro_autor_libro_idx` (`libro_id_libro` ASC) VISIBLE,
  INDEX `fk_libro_autor_autor1_idx` (`autor_id_autor` ASC) VISIBLE,
  CONSTRAINT `fk_libro_autor_libro`
    FOREIGN KEY (`libro_id_libro`)
    REFERENCES `biblioteca`.`libro` (`id_libro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_libro_autor_autor1`
    FOREIGN KEY (`autor_id_autor`)
    REFERENCES `biblioteca`.`autor` (`id_autor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `biblioteca`.`estudiante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `biblioteca`.`estudiante` (
  `id_lector` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `carrera` VARCHAR(45) NOT NULL,
  `edad` INT NULL,
  PRIMARY KEY (`id_lector`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `biblioteca`.`prestamo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `biblioteca`.`prestamo` (
  `id_lector` INT NOT NULL,
  `id_libro` INT NOT NULL,
  `fecha_prestamo` DATE NOT NULL,
  `fecha_devolucion` DATE NOT NULL,
  `devolucion` TINYINT NOT NULL,
  `libro_id_libro` INT NOT NULL,
  `estudiante_id_lector` INT NOT NULL,
  INDEX `fk_prestamo_libro1_idx` (`libro_id_libro` ASC) VISIBLE,
  INDEX `fk_prestamo_estudiante1_idx` (`estudiante_id_lector` ASC) VISIBLE,
  CONSTRAINT `fk_prestamo_libro1`
    FOREIGN KEY (`libro_id_libro`)
    REFERENCES `biblioteca`.`libro` (`id_libro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_prestamo_estudiante1`
    FOREIGN KEY (`estudiante_id_lector`)
    REFERENCES `biblioteca`.`estudiante` (`id_lector`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
