<div>
	<fieldset>
		<fieldset>
			<form action="cadastrarEndereco.php" method="Post">
			Novo Endereco
			<hr>
				<label>Nome:</label>
				<input type="text" name="nomeLeitor" id="nomeLeitor">
				<br>
				<input type="submit" value="Cadastrar" id="cadastrar" name="cadastrar">
			</form>
		</fieldset>
		<fieldset>
			<form action="cadastrarTelefone.php" method="Post">
			Novo Telefone
			<hr>
				<label>Nome:</label>
				<input type="text" name="nomeLeitor" id="nomeLeitor">
				<br>
				<input type="submit" value="Cadastrar" id="cadastrar" name="cadastrar">
			</form>
		</fieldset>
		<fieldset id="cadastrar">
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
</div>