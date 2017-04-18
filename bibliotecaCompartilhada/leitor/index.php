<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" type="text/css" href="../style.css">
		<title>Leitor</title>
	</head>
	<body>
		<?php include '../header.php'; ?>

		<br>
		<?php
			$mysqli = new mysqli('localhost', 'joao', 'joao', 'biblioteca');

			$query  = "SELECT * FROM view1Leitor";
			$result = $mysqli->query($query);
			echo "<table border='1px' width='100%' bgcolor='#CDC9C9'>";
			echo "<th >Leitores</th>";
			while($fetch = $result->fetch_assoc()) {
    			echo "<tr>";
    				foreach ($fetch as $field => $value) {
    					echo "<td>";
        				echo $field;
        				echo "</td>";
        				echo "<td>";
        				echo $value;
        				echo "</td>";
    				}
    			echo "</tr>";
			}
			echo "</table>";
		?>
		<br>
		<?php include 'cadastrar.php'; ?>
		<?php include 'editar.php'; ?>
		<?php include 'excluir.php'; ?>
		
		<?php include '../footer.php'; ?>
	</body>
</html>