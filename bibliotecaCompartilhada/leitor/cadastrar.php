<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" type="text/css" href="../style.css">
		<title>Cadastrar</title>
	</head>
	<body>
		<?php include '../header.php'; ?>
		<div>
			<br>
			<fieldset>
				<fieldset>
					<form action="cadastrarEndereco.php" method="Post">
						Novo Endereco
						<hr>
						<label>Rua:</label>
							<input type="text" name="rua" id="rua">
							<br>
						<label>Numero:</label>
							<input type="text" name="numero" id="numero">
							<br>
						<label>Complemento:</label>
							<input type="text" name="complemento" id="complemento">
							<br>
						<label>Bairro:</label>
							<input type="text" name="bairro" id="bairro">
							<br>
						<label>Cidade:</label>
							<input type="text" name="cidade" id="cidade">
							<br>
						<label>Estado:</label>
							<input type="text" name="estado" id="estado">
							<br>
						<label>CEP:</label>
							<input type="text" name="cep" id="cep">
							<br>
						<input type="submit" value="Cadastrar" id="cadastrarEnd" name="cadastrarEnd">
					</form>
				</fieldset>
				
				<fieldset>
					<form action="cadastrarTelefone.php" method="Post">
						Novo Telefone
						<hr>
						<label>Telefone Celular:</label>
							<input type="text" name="telCelular" id="telCelular">
							<br>
						<label>Telefone Residencial:</label>
							<input type="text" name="telResidencial" id="telResidencial">
							<br>
						<label>Telefone Comercial:</label>
							<input type="text" name="telComercial" id="telComercial">
							<br>
						<input type="submit" value="Cadastrar" id="cadastrarTel" name="cadastrarTel">
					</form>
				</fieldset>

				<fieldset>
					<form action="cadastrarLeitor.php" method="Post">
						Novo Leitor
						<hr>
						<label>Nome:</label>
							<input type="text" name="nomeLeitor" id="nomeLeitor">
							<br>
						<label>CPFLeitor:</label>
							<input type="text" name="CPFLeitor" id="CPFLeitor">
							<br>
						<label>emailLeitor:</label>
							<input type="text" name="emailLeitor" id="emailLeitor">
							<br>
						<label>interesseLeitor:</label>
							<input type="text" name="interesseLeitor" id="interesseLeitor">
							<br>
						<label>enderecoLeitor:</label>
							<select name="enderecoLeitor" id="enderecoLeitor">
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
							<br>
						<label>telefoneLeitor:</label>
							<select name="telefoneLeitor" id="telefoneLeitor">
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
							<br>
						<input type="submit" value="Cadastrar" id="cadastrar" name="cadastrar">
					</form>
				</fieldset>
			</fieldset>
			<br>
			<br>
			<br>
			<br>
			<br>
		<?php include '../footer.php'; ?>
		</div>
	</body>
</html>