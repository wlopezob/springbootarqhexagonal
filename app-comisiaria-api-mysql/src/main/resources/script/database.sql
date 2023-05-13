create database comisaria;

use comisaria;

CREATE TABLE `comisaria`.`departamento` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_dpto` VARCHAR(45) NULL,
  `departamento` VARCHAR(45) NULL,
  `capital` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `comisaria`.`provincia` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_dpto` VARCHAR(45) NULL,
  `id_prov` VARCHAR(45) NULL,
  `provincia` VARCHAR(45) NULL,
  `capital` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `comisaria`.`distrito` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_dist` VARCHAR(45) NULL,
  `id_prov` VARCHAR(45) NULL,
  `id_dpto` VARCHAR(45) NULL,
  `departamento` VARCHAR(45) NULL,
  `provincia` VARCHAR(45) NULL,
  `distrito` VARCHAR(45) NULL,
  `capital` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `comisaria`.`comisaria` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_dpto` VARCHAR(45) NULL,
  `departamento` VARCHAR(45) NULL,
  `id_prov` VARCHAR(45) NULL,
  `provincia` VARCHAR(45) NULL,
  `id_dist` VARCHAR(45) NULL,
  `distrito` VARCHAR(45) NULL,
  `comisaria` VARCHAR(45) NULL,
  `categoria` VARCHAR(45) NULL,
  `zona_utm` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
