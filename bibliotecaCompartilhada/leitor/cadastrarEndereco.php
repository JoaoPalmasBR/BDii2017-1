<?php
	$query1  = "insert into endereco (rua, numero, complemento, bairro, cidade, estado, cep) values
	 ('".$_POST['rua']."',".$_POST['numero'].",'".$_POST['complemento']."','"
	 .$_POST['bairro']."','".$_POST['cidade']."','".$_POST['estado']."','".$_POST['cep']."');";

	$mysqli1 = new mysqli('localhost', 'joao', 'joao', 'biblioteca');
	$result1 = $mysqli1->query($query1);
?>
<script type="text/javascript">javascript:history.back(1)</script>