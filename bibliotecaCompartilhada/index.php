<?php 
	include("classes.php");
?>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" type="text/css" href="style.css">
		<title>Biblioteca Compartilhada</title>
	</head>
	<body>
	
		<?php include 'header.php'; ?>
		<?php
			$servername = "localhost";
			$username = "joao";
			$password = "joao";
			$dbname = "biblioteca";
			
			// Create connection
			$conn = new mysqli($servername, $username, $password,$dbname);

			// Check connection
			if ($conn->connect_error) {
				die("Connection failed: " . $conn->connect_error);
				$statusBD="offline";
			}
			else{
				
				$statusBD="online";
			}
			?>
		<?php include 'footer.php'; ?>
	</body>
</html>