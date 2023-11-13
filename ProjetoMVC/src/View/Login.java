/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.LoginController;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Usuário
 */
public class Login extends javax.swing.JFrame {
    
    private final LoginController controller;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.controller = new LoginController(this);
        this.controller.carregarUsuarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_senha = new javax.swing.JPasswordField();
        jTextField5 = new javax.swing.JTextField();
        usuario = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        btn_Entrar = new javax.swing.JButton();
        btn_Cadastre1 = new javax.swing.JButton();
        btn_EsqueceuSenha = new javax.swing.JButton();
        text_usuario = new javax.swing.JTextField();
        text_senha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        tf_senha.setBackground(new java.awt.Color(255, 255, 255));
        tf_senha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 141, 185)));
        tf_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_senhaActionPerformed(evt);
            }
        });

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        usuario.setForeground(new java.awt.Color(1, 141, 185));
        usuario.setText("Usuário:");
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        senha.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        senha.setForeground(new java.awt.Color(1, 141, 185));
        senha.setText("Senha:");
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        btn_Entrar.setContentAreaFilled(false);
        btn_Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 140, 40));

        btn_Cadastre1.setContentAreaFilled(false);
        btn_Cadastre1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cadastre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cadastre1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Cadastre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 110, 30));

        btn_EsqueceuSenha.setContentAreaFilled(false);
        btn_EsqueceuSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_EsqueceuSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EsqueceuSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_EsqueceuSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 120, 20));

        text_usuario.setBackground(new java.awt.Color(255, 255, 255));
        text_usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(1, 141, 185), 2, true));
        text_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(text_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 240, 40));

        text_senha.setBackground(new java.awt.Color(255, 255, 255));
        text_senha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 141, 185), 2));
        getContentPane().add(text_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 240, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Login.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_senhaActionPerformed

    private void btn_EsqueceuSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EsqueceuSenhaActionPerformed
        this.controller.esqueciSenha();
    }//GEN-LAST:event_btn_EsqueceuSenhaActionPerformed

    private void btn_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntrarActionPerformed
        // Ação após clicar no Botão Entrar
        this.controller.entrarNoSistema();
    }//GEN-LAST:event_btn_EntrarActionPerformed

    private void btn_Cadastre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cadastre1ActionPerformed
         // Ação após clicar no Botão Voltar
        Cadastro novoFrame = new Cadastro();
        novoFrame.setVisible(true);
    }//GEN-LAST:event_btn_Cadastre1ActionPerformed

    private void text_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cadastre1;
    private javax.swing.JButton btn_Entrar;
    private javax.swing.JButton btn_EsqueceuSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel senha;
    private javax.swing.JPasswordField text_senha;
    private javax.swing.JTextField text_usuario;
    private javax.swing.JPasswordField tf_senha;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public JPasswordField getText_senha() {
        return text_senha;
    }

    public void setText_senha(JPasswordField text_senha) {
        this.text_senha = text_senha;
    }

    public JTextField getText_usuario() {
        return text_usuario;
    }

    public void setText_usuario(JTextField text_usuario) {
        this.text_usuario = text_usuario;
    }
    
     
}
