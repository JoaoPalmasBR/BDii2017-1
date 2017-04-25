<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" type="text/css" href="../style.css">
		<title>Excluir</title>
	</head>
	<body>
		<?php include '../header.php'; ?>
		<div>
			<br>
			<fieldset>
				<fieldset>
					<form action="excluirLeitor.php" method="Post">
						<h2><label>Excluir Leitor:</label></h2>
						<br>
						<label>Codigo:</label>
							<select name="codigoLeitor" id="codigoLeitor">
								<?php
									$mysqli = new mysqli('localhost', 'joao', 'joao', 'biblioteca');

									$query  = "SELECT codigoLeitor FROM leitor";
									$result = $mysqli->query($query);
									while($fetch = $result->fetch_assoc()) {
		    							foreach ($fetch as $field => $value) {
		        							echo '<option value="';
	        								echo $value;
	        								echo '">';
	        								echo $value;
	        								echo '</option>';
    									}
									}
								?>
							</select>
						<input type="submit" value="Excluir" id="excluirLeitor" name="excluirLeitor">
					</form>
				</fieldset>
				<fieldset>
					<form action="excluirTelefone.php" method="Post">
						<h2><label>Excluir Telefone:</label></h2>
						<br>
						<label>Codigo:</label>
							<select name="codigoTelefone" id="codigoTelefone">
								<?php
									$mysqli = new mysqli('localhost', 'joao', 'joao', 'biblioteca');

									$query  = "SELECT codigoTelefone FROM telefone";
									$result = $mysqli->query($query);
									while($fetch = $result->fetch_assoc()) {
		    							foreach ($fetch as $field => $value) {
		        							echo '<option value="';
	        								echo $value;
	        								echo '">';
	        								echo $value;
	        								echo '</option>';
    									}
									}
								?>
							</select>
						<input type="submit" value="Excluir" id="excluirTelefone" name="excluirTelefone">
					</form>
				</fieldset>
				<fieldset>
					<form action="excluirEndereco.php" method="Post">
						<h2><label>Excluir Endereco:</label></h2>
						<br>
						<label>Codigo:</label>
							<select name="codigoEndereco" id="codigoEndereco">
								<?php
									$mysqli = new mysqli('localhost', 'joao', 'joao', 'biblioteca');

									$query  = "SELECT codigoEndereco FROM endereco";
									$result = $mysqli->query($query);
									while($fetch = $result->fetch_assoc()) {
		    							foreach ($fetch as $field => $value) {
		        							echo '<option value="';
	        								echo $value;
	        								echo '">';
	        								echo $value;
	        								echo '</option>';
    									}
									}
								?>
							</select>
						<input type="submit" value="Excluir" id="excluirEndereco" name="excluirEndereco">
					</form>
				</fieldset>
			</fieldset>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<?php include '../footer.php'; ?>
		</div>
	</body>
</html>