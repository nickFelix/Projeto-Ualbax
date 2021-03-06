/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ualbax;

/**
 *
 * @author Nicolas
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form CadastroUsuário
     */
    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ualbaxLabel = new javax.swing.JLabel();
        barra = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuItemUsuario = new javax.swing.JMenuItem();
        menuItemProduto = new javax.swing.JMenuItem();
        menuItemFamilia = new javax.swing.JMenuItem();
        menuItemEditar = new javax.swing.JMenuItem();
        menuBuscar = new javax.swing.JMenu();
        menuAjuda = new javax.swing.JMenu();
        menuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ualbaxLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ualbaxLabel.setText("UALBAX");

        menuCadastro.setText("Cadastro");
        menuCadastro.setActionCommand("");

        menuItemUsuario.setText("Usuário");
        menuCadastro.add(menuItemUsuario);

        menuItemProduto.setText("Produto");
        menuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProdutoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemProduto);

        menuItemFamilia.setText("Família");
        menuCadastro.add(menuItemFamilia);

        menuItemEditar.setText("Editar");
        menuCadastro.add(menuItemEditar);

        barra.add(menuCadastro);
        menuCadastro.getAccessibleContext().setAccessibleName("Novo");

        menuBuscar.setText("Buscar");
        barra.add(menuBuscar);

        menuAjuda.setText("Ajuda");

        menuItemSobre.setText("Sobre...");
        menuAjuda.add(menuItemSobre);

        barra.add(menuAjuda);

        setJMenuBar(barra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(ualbaxLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(ualbaxLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemProdutoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barra;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuBuscar;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuItemEditar;
    private javax.swing.JMenuItem menuItemFamilia;
    private javax.swing.JMenuItem menuItemProduto;
    private javax.swing.JMenuItem menuItemSobre;
    private javax.swing.JMenuItem menuItemUsuario;
    private javax.swing.JLabel ualbaxLabel;
    // End of variables declaration//GEN-END:variables
}