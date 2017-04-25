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

CREATE VIEW view1Telefone
AS
	SELECT
		codigoTelefone AS Codigo,
		telCelular AS 'Telefone Celular',
        telResidencial AS 'Telefone Residencial',
        telComercial AS 'Telefone Comercial'
	FROM
		telefone;

CREATE VIEW view1Endereco
AS
	SELECT
		codigoEndereco AS Codigo,
		rua AS Rua,
        numero AS Numero,
        complemento AS Complemento,
        bairro AS Bairro,
        cidade AS Cidade,
        estado AS Estado,
        cep AS CEP
	FROM
		endereco;


SELECT * FROM view1Leitor;
SELECT * FROM view1Telefone;
SELECT * FROM view1Endereco;

Select * from telefone;
select * from leitor;
select * from endereco;

select count(codigoLeitor) from leitor where telefoneLeitor=1;