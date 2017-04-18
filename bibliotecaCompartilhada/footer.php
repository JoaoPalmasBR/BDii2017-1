<?php 
	include("classes.php");
?>
<div style="width: 100%; bottom: 0; position: fixed; text-align: center; background-color: gray;">
	<p>
		<?php 
			echo "Banco de Dados II - " . date("Y") . " - Ana Clara, Gustavo Siqueira, Joao Antonio, Rodrigo Vasconcelos."; 
		?>
		<?php if ($statusBD=="online") {
			echo "<buttom style='background-color: green; height: 15px; width: 15px;'>Online</buttom>";
		} else {
			echo "<buttom style='background-color: red; height: 15px; width: 15px;'>Offline</buttom>";
		}
		?>
	</p>
</div>