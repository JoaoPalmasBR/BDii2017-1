<?php
	$query1="UPDATE endereco 
		SET 
		rua='".$_POST['rua']."', 
		numero='".$_POST['numero']."', 
		complemento='".$_POST['complemento']."',
		bairro='".$_POST['bairro']."', 
		cidade=".$_POST['cidade'].", 
		estado=".$_POST['estado'].", 
		cep=".$_POST['cep']."
		WHERE codigoEndereco=".$_POST['codigoEndereco'].";";
	$mysqli1 = new mysqli('localhost', 'joao', 'joao', 'biblioteca');
	$result1 = $mysqli1->query($query1);

	echo "<h1> Endereco Editado com Sucesso.</h1>";
	echo "<hr>";
	echo "<button onclick='javascript:history.back(1)'>Voltar</button>";
?>