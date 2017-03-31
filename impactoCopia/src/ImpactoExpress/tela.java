package ImpactoExpress;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author joao
 * @version 1.0
 * @since 8nov2016
 * 
 */
public class tela extends javax.swing.JFrame {
    static String senhaFinal;
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    static ArrayList<Veiculo> veiculos = new ArrayList<>();
    PegaFuncionarios getListaFuncionarios = new PegaFuncionarios();
    PegaClientes getListaClientes = new PegaClientes();
    PegaSenha getSenha = new PegaSenha();
    PegaVeiculos getListaVeiculos = new PegaVeiculos();
    
    public tela() {
        initComponents();
        getListaFuncionarios.getListaFuncionarios();
        getListaClientes.getListaClientes();
        getListaVeiculos.getListaVeiculos();
        getSenha.getSenha();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaDeTrabalho = new javax.swing.JDesktopPane();
        painelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfstatusSenha = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnMenuCadastro = new javax.swing.JMenu();
        btnSubMenuCadastrarCliente = new javax.swing.JMenuItem();
        btnSubMenuCadastrarFuncionario = new javax.swing.JMenuItem();
        btnSubMenuCadastrarVeiculo = new javax.swing.JMenuItem();
        btnMenuRelatorio = new javax.swing.JMenu();
        btnSubMenuRelatorioFuncionarios = new javax.swing.JMenuItem();
        btnSubMenuRelatorioClientes = new javax.swing.JMenuItem();
        btnSubMenuRelatorioVeiculos = new javax.swing.JMenuItem();
        btnMenuSenha = new javax.swing.JMenu();
        btnSubMenuAlterarSenha = new javax.swing.JMenuItem();
        btnSubMenuLogin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Impacto Transportes e Logistica");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setFont(new java.awt.Font("Bitstream Vera Sans", 0, 10)); // NOI18N
        setForeground(java.awt.Color.lightGray);
        setIconImage(getIconImage());

        areaDeTrabalho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        areaDeTrabalho.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        javax.swing.GroupLayout areaDeTrabalhoLayout = new javax.swing.GroupLayout(areaDeTrabalho);
        areaDeTrabalho.setLayout(areaDeTrabalhoLayout);
        areaDeTrabalhoLayout.setHorizontalGroup(
            areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        areaDeTrabalhoLayout.setVerticalGroup(
            areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );

        jLabel1.setText("Digite a senha para ativar:");

        btnLogin.setText("Entrar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfstatusSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addGap(236, 236, 236))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfstatusSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setText("Ultimo Cliente:");

        jTextField1.setEditable(false);
        jTextField1.setRequestFocusEnabled(false);

        jLabel3.setText("Ultimo Funcionario:");

        jTextField2.setEditable(false);
        jTextField2.setFocusable(false);
        jTextField2.setRequestFocusEnabled(false);

        jLabel4.setText("Ultimo Veiculo:");

        jTextField3.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(439, Short.MAX_VALUE))
        );

        btnMenuCadastro.setText("Cadastrar");
        btnMenuCadastro.setEnabled(false);

        btnSubMenuCadastrarCliente.setText("Cliente");
        btnSubMenuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubMenuCadastrarClienteActionPerformed(evt);
            }
        });
        btnMenuCadastro.add(btnSubMenuCadastrarCliente);

        btnSubMenuCadastrarFuncionario.setText("Funcionario");
        btnSubMenuCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubMenuCadastrarFuncionarioActionPerformed(evt);
            }
        });
        btnMenuCadastro.add(btnSubMenuCadastrarFuncionario);

        btnSubMenuCadastrarVeiculo.setText("Veiculo");
        btnSubMenuCadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubMenuCadastrarVeiculoActionPerformed(evt);
            }
        });
        btnMenuCadastro.add(btnSubMenuCadastrarVeiculo);

        jMenuBar1.add(btnMenuCadastro);

        btnMenuRelatorio.setText("Relatorios");
        btnMenuRelatorio.setEnabled(false);

        btnSubMenuRelatorioFuncionarios.setText("Funcionarios");
        btnSubMenuRelatorioFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubMenuRelatorioFuncionariosActionPerformed(evt);
            }
        });
        btnMenuRelatorio.add(btnSubMenuRelatorioFuncionarios);

        btnSubMenuRelatorioClientes.setText("Clientes");
        btnSubMenuRelatorioClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubMenuRelatorioClientesActionPerformed(evt);
            }
        });
        btnMenuRelatorio.add(btnSubMenuRelatorioClientes);

        btnSubMenuRelatorioVeiculos.setText("Veiculos");
        btnSubMenuRelatorioVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubMenuRelatorioVeiculosActionPerformed(evt);
            }
        });
        btnMenuRelatorio.add(btnSubMenuRelatorioVeiculos);

        jMenuBar1.add(btnMenuRelatorio);

        btnMenuSenha.setText("Senha");
        btnMenuSenha.setEnabled(false);

        btnSubMenuAlterarSenha.setText("Alterar");
        btnSubMenuAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubMenuAlterarSenhaActionPerformed(evt);
            }
        });
        btnMenuSenha.add(btnSubMenuAlterarSenha);

        btnSubMenuLogin.setText("Login");
        btnSubMenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubMenuLoginActionPerformed(evt);
            }
        });
        btnMenuSenha.add(btnSubMenuLogin);

        jMenuBar1.add(btnMenuSenha);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(areaDeTrabalho))
            .addComponent(painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areaDeTrabalho)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 108, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void btnSubMenuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubMenuCadastrarClienteActionPerformed
        telaCadastrarCliente telaCadastrarCliente1 = new telaCadastrarCliente();
        areaDeTrabalho.add(telaCadastrarCliente1);
        telaCadastrarCliente1.setVisible(true);
    }//GEN-LAST:event_btnSubMenuCadastrarClienteActionPerformed
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        VerificaSenha();
    }//GEN-LAST:event_btnLoginActionPerformed
    private void btnSubMenuCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubMenuCadastrarFuncionarioActionPerformed
        telaCadastrarFuncionario telaCadastrarFuncionario1 = new telaCadastrarFuncionario();
        areaDeTrabalho.add(telaCadastrarFuncionario1);
        telaCadastrarFuncionario1.setVisible(true);
    }//GEN-LAST:event_btnSubMenuCadastrarFuncionarioActionPerformed
    private void btnSubMenuAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubMenuAlterarSenhaActionPerformed
        telaSenhaAlterar telaAlterarSenha1 = new telaSenhaAlterar();
        areaDeTrabalho.add(telaAlterarSenha1);
        telaAlterarSenha1.setVisible(true);
    }//GEN-LAST:event_btnSubMenuAlterarSenhaActionPerformed
    private void btnSubMenuRelatorioFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubMenuRelatorioFuncionariosActionPerformed
        telaRelatorioFuncionarios telaRelatorioFuncionarios1 = new telaRelatorioFuncionarios();
        areaDeTrabalho.add(telaRelatorioFuncionarios1);
        telaRelatorioFuncionarios1.setVisible(true);
    }//GEN-LAST:event_btnSubMenuRelatorioFuncionariosActionPerformed
    private void btnSubMenuRelatorioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubMenuRelatorioClientesActionPerformed
        telaRelatorioClientes telaRelatorioClientes1 = new telaRelatorioClientes();
        areaDeTrabalho.add(telaRelatorioClientes1);
        telaRelatorioClientes1.setVisible(true);
    }//GEN-LAST:event_btnSubMenuRelatorioClientesActionPerformed
    private void btnSubMenuCadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubMenuCadastrarVeiculoActionPerformed
        telaCadastrarVeiculo telaCadastrarVeiculo1 = new telaCadastrarVeiculo();
        areaDeTrabalho.add(telaCadastrarVeiculo1);
        telaCadastrarVeiculo1.setVisible(true);
    }//GEN-LAST:event_btnSubMenuCadastrarVeiculoActionPerformed
    private void btnSubMenuRelatorioVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubMenuRelatorioVeiculosActionPerformed
        telaRelatorioVeiculos telaRelatorioVeiculos1 = new telaRelatorioVeiculos();
        areaDeTrabalho.add(telaRelatorioVeiculos1);
        telaRelatorioVeiculos1.setVisible(true);
    }//GEN-LAST:event_btnSubMenuRelatorioVeiculosActionPerformed
    private void btnSubMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubMenuLoginActionPerformed
        getListaFuncionarios.getListaFuncionarios();
        getListaClientes.getListaClientes();
        getListaVeiculos.getListaVeiculos();
        
        ultimos();
    }//GEN-LAST:event_btnSubMenuLoginActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }
    public void VerificaSenha(){
        if (senhaFinal.equalsIgnoreCase(tfstatusSenha.getText())==true){
            btnMenuCadastro.setEnabled(true);
            btnMenuSenha.setEnabled(true);
            btnMenuRelatorio.setEnabled(true);
            painelLogin.setVisible(false);
            ultimos();
        }
        else{
            tfstatusSenha.setText(null);
            JOptionPane.showMessageDialog(rootPane, "Senha Incorreta, Impossivel fazer login, tente novamente mais tarde.");
        }
    }
    public void ultimos(){
        //Clientes
        if(clientes.isEmpty())
            jTextField1.setText("Sem Clientes");
        else
            jTextField1.setText(clientes.get(clientes.size()-1).getNomeCliente()+"");
        //Funcionarios
        if(funcionarios.isEmpty())
            jTextField2.setText("Sem Funcionarios");
        else
            jTextField2.setText(funcionarios.get(funcionarios.size()-1).getNomeFuncionario()+"");
        if(veiculos.isEmpty())
            jTextField3.setText("Sem Veiculos");
        else
            jTextField3.setText(veiculos.get(veiculos.size()-1).getModeloVeiculo()+"");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaDeTrabalho;
    private javax.swing.JButton btnLogin;
    private javax.swing.JMenu btnMenuCadastro;
    private javax.swing.JMenu btnMenuRelatorio;
    private javax.swing.JMenu btnMenuSenha;
    private javax.swing.JMenuItem btnSubMenuAlterarSenha;
    private javax.swing.JMenuItem btnSubMenuCadastrarCliente;
    private javax.swing.JMenuItem btnSubMenuCadastrarFuncionario;
    private javax.swing.JMenuItem btnSubMenuCadastrarVeiculo;
    private javax.swing.JMenuItem btnSubMenuLogin;
    private javax.swing.JMenuItem btnSubMenuRelatorioClientes;
    private javax.swing.JMenuItem btnSubMenuRelatorioFuncionarios;
    private javax.swing.JMenuItem btnSubMenuRelatorioVeiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JTextField tfstatusSenha;
    // End of variables declaration//GEN-END:variables
}
