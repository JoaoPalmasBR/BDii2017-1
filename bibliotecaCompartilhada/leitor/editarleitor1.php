<?php
	$query1="UPDATE leitor 
		SET 
		nomeLeitor='".$_POST['nomeLeitor']."', 
		CPFLeitor='".$_POST['CPFLeitor']."', 
		emailLeitor='".$_POST['emailLeitor']."',
		interesseLeitor='".$_POST['interesseLeitor']."', 
		enderecoLeitor=".$_POST['enderecoLeitor'].", 
		telefoneLeitor=".$_POST['telefoneLeitor']."
		WHERE codigoLeitor=".$_POST['codigoLeitor'].";";
	$mysqli1 = new mysqli('localhost', 'joao', 'joao', 'biblioteca');
	$result1 = $mysqli1->query($query1);

	echo "<h1> Leitor Editado com Sucesso.</h1>";
	echo "<hr>";
	echo "<button onclick='javascript:history.back(1)'>Voltar</button>";
?>