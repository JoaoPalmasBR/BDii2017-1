<?php
    $codTelefone=$_POST['codigoTelefone'];
    $mysqli = new mysqli('localhost', 'joao', 'joao', 'biblioteca');
    $query  = "SELECT * FROM telefone where codigoTelefone=".$codTelefone.";";
    $result = $mysqli->query($query);
    echo "<fieldset>";
        echo "<table>";
        while($fetch = $result->fetch_assoc()) {
            echo "<td>";
            foreach ($fetch as $field => $value) {
                echo "<tr>";
                echo "<b>".$field.": </b>";
                echo "</tr>";
                echo "<tr>";
                echo "<a>".$value."</a>";
                echo "<br>";
                echo "</tr>";
            }
            echo "</td>";
        }
        
        echo "</table>";
    echo "</fieldset>";
    ?>
    <fieldset>
    <center><h3>Editar</h3></center>
        <form action='editarTelefone1.php' method='Post'>
            <label>Codigo:</label>
                <input type="text" name="codigoTelefone" id="codigoTelefone" value="<?php echo($_POST['codigoTelefone']) ?>">
                <br>
            <label>Telefone Celular:</label>
                <input type='text' name='telCelular' id='telCelular'>
                <br>
            <label>Telefone Residencial:</label>
                <input type='text' name='telResidencial' id='telResidencial'>
                <br>
            <label>Telefone Comercial:</label>
                <input type='text' name='telComercial' id='telComercial'>
                <br>
            <input type='submit' value='Editar' id='editar' name='editar'>
        </form>
    </fieldset>
    <button onclick=javascript:history.back(1)> Voltar</button>
