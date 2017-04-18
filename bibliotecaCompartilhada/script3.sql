SELECT 
    *
FROM
    leitor;

insert into leitor (nomeLeitor,CPFLeitor,emailLeitor,interesseLeitor,enderecoLeitor, telefoneLeitor) values 
	('nome1','111.111.111-11','um@email.com','Drama',1,1),
    ('nome2','222.222.222-22','dois@email.com','Acao',2,2),
    ('nome3','333.333.333-33','tres@email.com','Romance',3,3);

SELECT *
FROM
    endereco;
    
insert into endereco (rua, numero, complemento, bairro, cidade, estado, cep) values 
	('rua1',1,'complemento1','bairro1','cidade1','estado1','cep1'),
    ('rua2',2,'complemento2','bairro2','cidade2','estado2','cep2'),
    ('rua3',3,'complemento3','bairro3','cidade3','estado3','cep3');

SELECT 
    *
FROM
    telefone;
insert into telefone (telCelular, telResidencial, telComercial) values 
	('1111-1111','1111-1111','1111-1111'),
    ('2222-2222','2222-2222','2222-2222'),
    ('3333-3333','3333-3333','3333-3333');


CREATE VIEW view1Leitor
AS
    SELECT
        codigoLeitor AS Codigo,
        nomeLeitor AS Nome,
        CPFLeitor As CPF,
        emailLeitor AS Email,
        interesseLeitor AS Interesses,
        enderecoLeitor AS Endereco,
        telefoneLeitor AS Telefone
    FROM
        leitor;

SELECT * FROM view1Leitor;