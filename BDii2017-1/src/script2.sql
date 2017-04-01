CREATE TABLE `Endereco` (
    `codigoEndereco` INT NOT NULL AUTO_INCREMENT,
    `rua` VARCHAR(100) NULL,
    `numero` INT NULL,
    `complemento` VARCHAR(100) NULL,
    `bairro` VARCHAR(100) NULL,
    `cidade` VARCHAR(100) NULL,
    `estado` VARCHAR(100) NULL,
    `cep` VARCHAR(100) NULL,
    PRIMARY KEY (`codigoEndereco`)
);

CREATE TABLE `Telefone` (
    `codigoTelefone` INT NOT NULL AUTO_INCREMENT,
    `telCelular` VARCHAR(45) NULL,
    `telResidencial` VARCHAR(45) NULL,
    `telComercial` VARCHAR(45) NULL,
    PRIMARY KEY (`codigoTelefone`)
);

CREATE TABLE `Leitor` (
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
    CONSTRAINT `fk_Leitor_1` FOREIGN KEY (`enderecoLeitor`)
        REFERENCES `Endereco` (`codigoEndereco`)
        ON DELETE NO ACTION ON UPDATE NO ACTION,
    CONSTRAINT `fk_Leitor_2` FOREIGN KEY (`telefoneLeitor`)
        REFERENCES `Telefone` (`codigoTelefone`)
        ON DELETE NO ACTION ON UPDATE NO ACTION
);

