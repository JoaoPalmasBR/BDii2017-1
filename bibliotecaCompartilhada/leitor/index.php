<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" type="text/css" href="../style.css">
		<title>Leitores</title>
		<style type="text/css">
			body{
				background-image: url(../img/fundoMobile.png);
				background-repeat: no-repeat;
	    		background-size: cover;
			}
			@media (min-width: 728px) {
				body{
	    			background-image: url(../img/fundoDesktop.png);
	    			background-repeat: no-repeat;
	    			background-size: cover;
				}
			}
		</style>
	</head>
	<body>
		<?php include '../header.php'; ?>
		<?php
			$mysqli = new mysqli('localhost', 'joao', 'joao', 'biblioteca');

			$query  = "SELECT * FROM view1Leitor";
			$result = $mysqli->query($query);
			echo "<p>Leitores</p>";
			echo "<table border='1px' width='100%' bgcolor='#CDC9C9'>";
			echo "<tr>";
				echo "<td>Codigo</td>";
				echo "<td>Nome</td>";
				echo "<td>CPF</td>";
				echo "<td>Email</td>";
				echo "<td>Interesses</td>";
				echo "<td>Endereco</td>";
				echo "<td>Telefone</td>";
			echo "</tr>";
			while($fetch = $result->fetch_assoc()) {
    			echo "<tr bgcolor='#aaa'>";
    				foreach ($fetch as $field => $value) {
        				echo "<td>";
        				echo $value;
        				echo "</td>";
    				}
    			echo "</tr>";
			}
			echo "</table>";
		?>
		<br>
		<?php
			$mysqli = new mysqli('localhost', 'joao', 'joao', 'biblioteca');

			$query  = "SELECT * FROM view1Endereco";
			$result = $mysqli->query($query);
			echo "<p>Enderecos</p>";
			echo "<table border='1px' width='100%' bgcolor='#CDC9C9'>";
			echo "<tr>";
				echo "<td>Codigo</td>";
				echo "<td>Rua</td>";
				echo "<td>Numero</td>";
				echo "<td>Complemento</td>";
				echo "<td>Bairro</td>";
				echo "<td>Cidade</td>";
				echo "<td>Estado</td>";
				echo "<td>CEP</td>";
			echo "</tr>";
			while($fetch = $result->fetch_assoc()) {
    			echo "<tr bgcolor='#aaa'>";
    				foreach ($fetch as $field => $value) {
        				echo "<td>";
        				echo $value;
        				echo "</td>";
    				}
    			echo "</tr>";
			}
			echo "</table>";
		?>
		<br>
		<?php
			$mysqli = new mysqli('localhost', 'joao', 'joao', 'biblioteca');

			$query  = "SELECT * FROM telefone";
			$result = $mysqli->query($query);
			echo "<p>Telefone</p>";
			echo "<table border='1px' width='100%' bgcolor='#CDC9C9'>";
			echo "<tr>";
				echo "<td>Codigo</td>";
				echo "<td>Telefone Celular</td>";
				echo "<td>Telefone Residencial</td>";
				echo "<td>Telefone Comercial</td>";
			echo "</tr>";
			while($fetch = $result->fetch_assoc()) {
    			echo "<tr bgcolor='#aaa'>";
    				foreach ($fetch as $field => $value) {
        				echo "<td>";
        				echo $value;
        				echo "</td>";
    				}
    			echo "</tr>";
			}
			echo "</table>";
		?>
		<br>
		<br>
		<br>
		<br>
		<br>
		<?php include '../footer.php'; ?>
	</body>
</html>