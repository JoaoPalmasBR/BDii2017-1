<?php
    $codLeitor=$_POST['codigoLeitor'];
    $mysqli = new mysqli('localhost', 'joao', 'joao', 'biblioteca');
    $query  = "SELECT * FROM leitor where codigoLeitor=".$codLeitor.";";
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
        <form action='editarLeitor1.php' method='Post'>
            <label>Codigo:</label>
                <input type="text" name="codigoLeitor" id="codigoLeitor" value="<?php echo($codLeitor); ?>">
                <br>
            <label>Nome:</label>
                <input type='text' name='nomeLeitor' id='nomeLeitor'>
                <br>
            <label>CPF:</label>
                <input type='text' name='CPFLeitor' id='CPFLeitor'>
                <br>
            <label>Email:</label>
                <input type='text' name='emailLeitor' id='emailLeitor'>
                <br>
            <label>Interesse:</label>
                    <input type='text' name='interesseLeitor' id='interesseLeitor'>
                <br>
            <label>Endereco:</label>
                <select name='enderecoLeitor' id='enderecoLeitor'>
                    <?php
                        $mysqli = new mysqli('localhost', 'joao', 'joao', 'biblioteca');
                        $query  = 'SELECT codigoEndereco FROM endereco';
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
            <label>Telefone:</label>
                <select name='telefoneLeitor' id='telefoneLeitor'>
                    <?php
                        $mysqli = new mysqli('localhost', 'joao', 'joao', 'biblioteca');
                        $query  = 'SELECT codigoTelefone FROM telefone';
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
            <input type='submit' value='Editar' id='editar' name='editar'>
        </form>
    </fieldset>
    <button onclick=javascript:history.back(1)> Voltar</button>
