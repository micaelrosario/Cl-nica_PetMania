/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JFrame;

/**
 *
 * @author Usuário
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        carrinho = new javax.swing.JButton();
        menuLateral = new javax.swing.JButton();
        cadastroMenu = new javax.swing.JButton();
        compraMenu = new javax.swing.JButton();
        agendamentoMenu = new javax.swing.JButton();
        clienteMenu = new javax.swing.JButton();
        MenuPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        carrinho.setContentAreaFilled(false);
        carrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        carrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrinhoActionPerformed(evt);
            }
        });
        getContentPane().add(carrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 60, 50));

        menuLateral.setContentAreaFilled(false);
        menuLateral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuLateral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLateralActionPerformed(evt);
            }
        });
        getContentPane().add(menuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 40, 30));

        cadastroMenu.setContentAreaFilled(false);
        cadastroMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastroMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroMenuActionPerformed(evt);
            }
        });
        getContentPane().add(cadastroMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 430, 60));

        compraMenu.setContentAreaFilled(false);
        compraMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compraMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraMenuActionPerformed(evt);
            }
        });
        getContentPane().add(compraMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 430, 60));

        agendamentoMenu.setContentAreaFilled(false);
        agendamentoMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agendamentoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendamentoMenuActionPerformed(evt);
            }
        });
        getContentPane().add(agendamentoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 430, 60));

        clienteMenu.setContentAreaFilled(false);
        clienteMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clienteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteMenuActionPerformed(evt);
            }
        });
        getContentPane().add(clienteMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 430, 60));

        MenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MenuPrincipal.png"))); // NOI18N
        getContentPane().add(MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 790, 597));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agendamentoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendamentoMenuActionPerformed
        // Ação após clicar no Botão Agendamento
        Agendamento novoFrame = new Agendamento();
        novoFrame.setVisible(true);
    }//GEN-LAST:event_agendamentoMenuActionPerformed

    private void cadastroMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroMenuActionPerformed
        // Ação após clicar o botão Cadastro
        SubMenuCadastro novoFrame = new SubMenuCadastro();
        novoFrame.setVisible(true);
    }//GEN-LAST:event_cadastroMenuActionPerformed

    private void clienteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteMenuActionPerformed
        HistoricoCliente novoFrame = new HistoricoCliente();
        novoFrame.setVisible(true);
    }//GEN-LAST:event_clienteMenuActionPerformed

    private void compraMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraMenuActionPerformed
        CarrinhoCompra novoFrame = new CarrinhoCompra();
        novoFrame.setVisible(true);
    }//GEN-LAST:event_compraMenuActionPerformed

    private void menuLateralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLateralActionPerformed
        MenuLateral novoFrame = new MenuLateral();
        novoFrame.setVisible(true);
    }//GEN-LAST:event_menuLateralActionPerformed

    private void carrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrinhoActionPerformed
        CarrinhoCompra novoFrame = new CarrinhoCompra();
        novoFrame.setVisible(true);
    }//GEN-LAST:event_carrinhoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MenuPrincipal;
    private javax.swing.JButton agendamentoMenu;
    private javax.swing.JButton cadastroMenu;
    private javax.swing.JButton carrinho;
    private javax.swing.JButton clienteMenu;
    private javax.swing.JButton compraMenu;
    private javax.swing.JButton menuLateral;
    // End of variables declaration//GEN-END:variables
}
