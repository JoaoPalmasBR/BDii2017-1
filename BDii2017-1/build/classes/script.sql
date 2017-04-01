/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  joao
 * Created: 31/03/2017
 */
public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://joaoantoniosantos.com.br:3306/joaoa870_impacto1","joaoa870_joao","joaoantonio2012");
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
BDII2017
CREATE SCHEMA `BDII2017` ;

CREATE TABLE `BDII2017`.`Endereco` (
  `codigoEndereco` INT NOT NULL AUTO_INCREMENT,
  `rua` VARCHAR(100) NULL,
  `numero` INT NULL,
  `complemento` VARCHAR(100) NULL,
  `bairro` VARCHAR(100) NULL,
  `cidade` VARCHAR(100) NULL,
  `estado` VARCHAR(100) NULL,
  `cep` VARCHAR(100) NULL,
  PRIMARY KEY (`codigoEndereco`));

CREATE TABLE `BDII2017`.`Telefone` (
  `codigoTelefone` INT NOT NULL AUTO_INCREMENT,
  `telCelular` VARCHAR(45) NULL,
  `telResidencial` VARCHAR(45) NULL,
  `telComercial` VARCHAR(45) NULL,
  PRIMARY KEY (`codigoTelefone`));

CREATE TABLE `BDII2017`.`Leitor` (
  `codigoLeitor` INT NOT NULL AUTO_INCREMENT,
  `nomeLeitor` VARCHAR(45) NULL,
  `CPFLeitor` VARCHAR(45) NULL,
  `emailLeitor` VARCHAR(45) NULL,
  `interesseLeitor` VARCHAR(45) NULL,
  `enderecoLeitor` INT NULL,
  `telefoneLeitor` INT NULL,
  PRIMARY KEY (`codigoLeitor`),
  INDEX `fk_Leitor_1_idx` (`enderecoLeitor` ASC),
  INDEX `fk_Leitor_2_idx` (`telefoneLeitor` ASC),
  CONSTRAINT `fk_Leitor_1`
    FOREIGN KEY (`enderecoLeitor`)
    REFERENCES `BDII2017`.`Endereco` (`codigoEndereco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Leitor_2`
    FOREIGN KEY (`telefoneLeitor`)
    REFERENCES `BDII2017`.`Telefone` (`codigoTelefone`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
