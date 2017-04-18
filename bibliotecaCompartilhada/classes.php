<?php
    $statusBD= "online";
	
    class Leitor {
		public $codigoLeitor;
    	public $nomeLeitor;
    	public $CPFLeitor;
    	public $emailLeitor;
    	public $interesseLeitor;
    	public $enderecoLeitor;
    	public $telefoneLeitor;
	}
	class Telefone {
		public $codigoTelefone;
    	public $telCelular;
    	public $telResidencial;
    	public $telComercial;
	}
	class Endereco {
		public $codigoEndereco;
    	public $rua;
    	public $numero;
    	public $complemento;
    	public $bairro;
    	public $cidade;
    	public $estado;
    	public $cep;
	}
?>