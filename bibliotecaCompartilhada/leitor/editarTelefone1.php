<?php
	$query1="UPDATE telefone 
		SET 
		telCelular='".$_POST['telCelular']."', 
		telResidencial='".$_POST['telResidencial']."', 
		telComercial='".$_POST['telComercial']."' 
		WHERE 
			codigoTelefone=".$_POST['codigoTelefone'].";";
	$mysqli1 = new mysqli('localhost', 'joao', 'joao', 'biblioteca');
	$result1 = $mysqli1->query($query1);

	echo "<h1> Telefone Editado com Sucesso.</h1>";
	echo "<hr>";
	echo "<button onclick='javascript:history.back(1)'>Voltar</button>";
?>