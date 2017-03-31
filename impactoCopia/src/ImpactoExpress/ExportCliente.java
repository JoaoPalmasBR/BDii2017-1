package ImpactoExpress;

//import ImpactoExpress.Cliente;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author joao
 * @version 1.0
 * @since 8nov2016
 * 
 */
public class ExportCliente {
    public void ExportarCliente(Cliente c){
        String idCliente = c.getIdCliente()+"";
        String nomeCliente = c.getNomeCliente();
        String emailCliente = c.getEmailCliente();
        String telefone1Cliente = c.getTelefone1Cliente();
        String telefone2Cliente = c.getTelefone2Cliente();
        String cidadeCliente = c.getCidadeCliente();
        String enderecoCliente = c.getEnderecoCliente();
        
        File dir = new File("/media/joao/TOCHIBA/[2016]Desenvolvimento/00 Java/Impacto/src/ImpactoExpress/export_Clientes/");
        File arq = new File(dir,"cliente_"+idCliente+".txt");
        
        try {
            arq.createNewFile();
            FileWriter fileWriter = new FileWriter(arq, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            //Agora vamos escrever no arquivo com o método  println(),
            // que nos permite escrever linha a linha no arquivo
            //printWriter.println("conteudo");
            printWriter.println("Id Cliente: "+idCliente);
            printWriter.println("Nome Cliente: "+nomeCliente);
            printWriter.println("Email Cliente: "+emailCliente);
            printWriter.println("Telefone 1 Cliente: "+telefone1Cliente);
            printWriter.println("Telefone 2 Cliente: "+telefone2Cliente);
            printWriter.println("Cidade Cliente: "+cidadeCliente);
            printWriter.println("Endereco Cliente: "+enderecoCliente);
            
            //o método flush libera a escrita no arquivo
            printWriter.flush();
            //No final precisamos fechar o arquivo
            printWriter.close();
         }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
