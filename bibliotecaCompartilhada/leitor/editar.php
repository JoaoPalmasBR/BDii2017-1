<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" type="text/css" href="../style.css">
		<title>Editar</title>
	</head>
	<body>
		<?php include '../header.php'; ?>
		<br>
		<div>
			<fieldset>
				<form action="editarLeitor.php" method="POST">
						<h2><label>Editar Leitor:</label></h2>
							<input type="text" name="codigoLeitor" id="codigoLeitor">
							<br>
							<input type="submit" value="Pesquisar" id="pesquisarLeitor" name="pesquisarLeitor">
				</form>
			</fieldset>
			<br>
			<fieldset>
				<form action="editarTelefone.php" method="POST">
				<h2><label>Editar Telefone:</label></h2>
					<input type="text" name="codigoTelefone" id="codigoTelefone">
					<br>
					<input type="submit" value="Pesquisar" id="pesquisarTelefone" name="pesquisarTelefone">
				</form>
			</fieldset>
			<br>
			<fieldset>
				<form action="editarEndereco.php" method="POST">
				<h2><label>Editar Endereco:</label></h2>
					<input type="text" name="codigoEndereco" id="codigoEndereco">
					<br>
					<input type="submit" value="Pesquisar" id="pesquisarEndereco" name="pesquisarEndereco">
				</form>
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