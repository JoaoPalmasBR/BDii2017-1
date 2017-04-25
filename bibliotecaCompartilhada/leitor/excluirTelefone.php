<?php
	$mysqli = new mysqli('localhost', 'joao', 'joao', 'biblioteca');
	$codTelefone=$_POST['codigoTelefone'];
	$quantTem;

	$query  = "select count(codigoLeitor) from leitor where telefoneLeitor=".$codTelefone.";";
	$result = $mysqli->query($query);
	while($fetch = $result->fetch_assoc()) {
		foreach ($fetch as $field => $value) {
			$quantTem=$value;
		}
	}
	echo "<hr>";
	if ($quantTem==0){
		$query1  = "DELETE FROM telefone WHERE codigoTelefone='".$_POST['codigoTelefone']."';";
		$result1 = $mysqli->query($query1);
		echo "<h1> Telefone Excluido com Sucesso.</h1>";
		echo "<button onclick='javascript:history.back(1)'>Voltar</button>";
		echo "<hr>";
	}
	else {
		echo "<h1> Há um Leitor utilizando este Telefone. <br>Exclua e tente novamente.</h1>";
		echo "<button onclick='javascript:history.back(1)'>Voltar</button>";
		echo "<hr>";
	}
?>