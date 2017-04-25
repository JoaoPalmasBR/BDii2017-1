<?php
	$query1  = "DELETE FROM leitor WHERE codigoLeitor='".$_POST['codigoLeitor']."';";

	$mysqli1 = new mysqli('localhost', 'joao', 'joao', 'biblioteca');
	$result1 = $mysqli1->query($query1);
		echo "<hr>";
		echo "<h1> Endereco Excluido com Sucesso.</h1>";
		echo "<button onclick='javascript:history.back(1)'>Voltar</button>";
		echo "<hr>";
?>