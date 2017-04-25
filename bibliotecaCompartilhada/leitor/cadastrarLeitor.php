<?php
	$query1  = "insert into leitor (nomeLeitor,CPFLeitor,emailLeitor,interesseLeitor,enderecoLeitor, telefoneLeitor) 
	values ('".$_POST['nomeLeitor']."','".$_POST['CPFLeitor']."','".$_POST['emailLeitor']."','".$_POST['interesseLeitor']."',".$_POST['enderecoLeitor'].",".$_POST['telefoneLeitor'].");";

	$mysqli1 = new mysqli('localhost', 'joao', 'joao', 'biblioteca');
	$result1 = $mysqli1->query($query1);
?>
<script type="text/javascript">javascript:history.back(1)</script>