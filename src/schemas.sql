CREATE SCHEMA `users` ;

CREATE TABLE `users`.`auth` (
  `Name` VARCHAR(40) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Name`),
  UNIQUE INDEX `Name_UNIQUE` (`Name` ASC) VISIBLE);
  
CREATE TABLE `users`.`leads` (
  `Name` VARCHAR(40) NOT NULL,
  `Count` SMALLINT(255) UNSIGNED NULL,
  PRIMARY KEY (`Name`),
  UNIQUE INDEX `Name_UNIQUE` (`Name` ASC) VISIBLE);


CREATE SCHEMA `lexicon` ;

CREATE TABLE `lexicon`.`words` (
  `Word` VARCHAR(40) NOT NULL,
  UNIQUE INDEX `Word_UNIQUE` (`Word` ASC));
