select * from cliente;
select * from funcionario;
select * from tb_senha;
select * from veiculo;

#insert into veiculo(tipoVeiculo,modeloVeiculo,marcaVeiculo,corVeiculo,placaVeiculo,renavamVeiculo,VencimentoVeiculo,categoriaVeiculo,observacoesVeiculo) values ('','','','','','','','','');
CREATE TABLE veiculo (
    codVeiculo INT AUTO_INCREMENT,
    tipoVeiculo VARCHAR(250),
    modeloVeiculo VARCHAR(250),
    marcaVeiculo VARCHAR(250),
    corVeiculo VARCHAR(250),
    placaVeiculo VARCHAR(250),
    renavamVeiculo VARCHAR(250),
    vencimentoVeiculo VARCHAR(250),
    categoriaVeiculo VARCHAR(250),
    observacoesVeiculo VARCHAR(250),
    PRIMARY KEY (codVeiculo)
);
drop table cliente;
CREATE TABLE cliente (
    idCliente INT AUTO_INCREMENT,
    nomeCliente VARCHAR(250),
    emailCliente VARCHAR(250),
    telefone1Cliente VARCHAR(250),
    telefone2Cliente VARCHAR(250),
    cidadeCliente VARCHAR(250),
    enderecoCliente VARCHAR(250),
    PRIMARY KEY (idCliente)
);
drop table funcionario;
CREATE TABLE funcionario (
    idFuncionario INT AUTO_INCREMENT,
    nomeFuncionario VARCHAR(250),
    emailFuncionario VARCHAR(250),
    telefone1Funcionario VARCHAR(250),
    telefone2Funcionario VARCHAR(250),
    cidadeFuncionario VARCHAR(250),
    enderecoFuncionario VARCHAR(250),
    PRIMARY KEY (idFuncionario)
);
#insert into funcionario(nomeFuncionario,emailFuncionario,telefone1Funcionario,telefone2Funcionario,cidadeFuncionario,enderecoFuncionario) values ('Joao Antonio','joaoantonios74@gmail.com','67991201887','6332254748','Palmas TO','305 sul, Alameda 8, Qi 6, Lote 14');
#insert into funcionario(nomeFuncionario,emailFuncionario,telefone1Funcionario,telefone2Funcionario,cidadeFuncionario,enderecoFuncionario) values ('Marco Antonio','marcoantonioilario@hotmail.com','63984765009','6332254748','Palmas TO','305 sul, Alameda 8, Qi 6, Lote 14');
CREATE TABLE tb_senha (
    id INT AUTO_INCREMENT,
    senha VARCHAR(250),
    PRIMARY KEY (id)
);
#insert into tb_senha(senha) values('joao');
#select senha from tb_senha where id=(select max(id)from tb_senha);
