<?php
    $codEndereco=$_POST['codigoEndereco'];
    $mysqli = new mysqli('localhost', 'joao', 'joao', 'biblioteca');
    $query  = "SELECT * FROM endereco where codigoEndereco=".$codEndereco.";";
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
        <form action='editarEndereco1.php' method='Post'>
            <label>Codigo:</label>
                <input type="text" name="codigoEndereco" id="codigoEndereco" value="<?php echo($_POST['codigoEndereco']) ?>">
                <br>
            <label>Rua:</label>
                <input type='text' name='rua' id='rua'>
                <br>
            <label>numero:</label>
                <input type='text' name='numero' id='numero'>
                <br>
            <label>complemento:</label>
                <input type='text' name='complemento' id='complemento'>
                <br>
            <label>bairro:</label>
                <input type='text' name='bairro' id='bairro'>
                <br>
            <label>cidade:</label>
                <input type='text' name='cidade' id='cidade'>
                <br>
            <label>estado:</label>
                <input type='text' name='estado' id='estado'>
                <br>
            <label>cep:</label>
                <input type='text' name='cep' id='cep'>
                <br>
            <input type='submit' value='Editar' id='editar' name='editar'>
        </form>
    </fieldset>
    <button onclick=javascript:history.back(1)> Voltar</button>
