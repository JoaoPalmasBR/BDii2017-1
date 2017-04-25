<?php
	$query1  = "insert into telefone (telCelular, telResidencial, telComercial) values 
	('".$_POST['telCelular']."','".$_POST['telResidencial']."','".$_POST['telComercial']."');";

	$mysqli1 = new mysqli('localhost', 'joao', 'joao', 'biblioteca');
	$result1 = $mysqli1->query($query1);
?>
<script type="text/javascript">javascript:history.back(1)</script>