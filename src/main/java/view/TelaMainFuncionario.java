/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author andreLuis
 */
public class TelaMainFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaMainFuncionario
     */
    public TelaMainFuncionario() {
        initComponents();
        lbIcon.setIcon(new javax.swing.ImageIcon("src/main/java/images/ImageBack.jpg"));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscarLivro = new javax.swing.JButton();
        btnCadastrarLivro = new javax.swing.JButton();
        btnRemoverLivro = new javax.swing.JButton();
        btnAlugarLivro = new javax.swing.JButton();
        btnGerarFicha = new javax.swing.JButton();
        btnVisualizarFicha = new javax.swing.JButton();
        btnCadastrarUsuario = new javax.swing.JButton();
        btnRemoverUsuario = new javax.swing.JButton();
        btnCadastrarEvento = new javax.swing.JButton();
        btnRelatorioEvento = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lbIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Morais Library");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        btnBuscarLivro.setText("Buscar Livro");
        btnBuscarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLivroActionPerformed(evt);
            }
        });

        btnCadastrarLivro.setText("Cadastrar Livro");
        btnCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLivroActionPerformed(evt);
            }
        });

        btnRemoverLivro.setText("Remover Livro");
        btnRemoverLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverLivroActionPerformed(evt);
            }
        });

        btnAlugarLivro.setText("Realizar Aluguel");
        btnAlugarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlugarLivroActionPerformed(evt);
            }
        });

        btnGerarFicha.setText("Gerar Ficha");
        btnGerarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarFichaActionPerformed(evt);
            }
        });

        btnVisualizarFicha.setText("Visualizar Ficha");
        btnVisualizarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarFichaActionPerformed(evt);
            }
        });

        btnCadastrarUsuario.setText("Cadastrar Usuário");
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        btnRemoverUsuario.setText("Remover Usuário");
        btnRemoverUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverUsuarioActionPerformed(evt);
            }
        });

        btnCadastrarEvento.setText("Cadastrar Evento");
        btnCadastrarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarEventoActionPerformed(evt);
            }
        });

        btnRelatorioEvento.setText("Gerar Relatorio");
        btnRelatorioEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioEventoActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoverLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlugarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGerarFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisualizarFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoverUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRelatorioEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnBuscarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoverLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlugarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGerarFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVisualizarFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoverUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRelatorioEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        jDesktopPane1.setLayer(lbIcon, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLivroActionPerformed
        
        CadastrarLivro telaCadastroLivro = new CadastrarLivro();
        jDesktopPane1.add(telaCadastroLivro);
        telaCadastroLivro.setVisible(true);
    }//GEN-LAST:event_btnCadastrarLivroActionPerformed

    private void btnGerarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarFichaActionPerformed
        
        GerarFichaCat telaGerarFicha = new GerarFichaCat();
        jDesktopPane1.add(telaGerarFicha);
        telaGerarFicha.setVisible(true);
    }//GEN-LAST:event_btnGerarFichaActionPerformed

    private void btnBuscarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLivroActionPerformed

        BuscaLivro telaBuscaLivro = new BuscaLivro();
        jDesktopPane1.add(telaBuscaLivro);
        telaBuscaLivro.setVisible(true);
    }//GEN-LAST:event_btnBuscarLivroActionPerformed

    private void btnVisualizarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarFichaActionPerformed

        VisualizarFichaCat telaVisualizarFicha = new VisualizarFichaCat();
        jDesktopPane1.add(telaVisualizarFicha);
        telaVisualizarFicha.setVisible(true);
    }//GEN-LAST:event_btnVisualizarFichaActionPerformed

    private void btnAlugarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlugarLivroActionPerformed
        
        AlugarLivro telaAlugarLivro = new AlugarLivro();
        jDesktopPane1.add(telaAlugarLivro);
        telaAlugarLivro.setVisible(true);
    }//GEN-LAST:event_btnAlugarLivroActionPerformed

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        
        CadastrarUsuario telaCadastroUsuario = new CadastrarUsuario();
        jDesktopPane1.add(telaCadastroUsuario);
        telaCadastroUsuario.setVisible(true);
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void btnRemoverUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverUsuarioActionPerformed
        
        RemoverUsuario telaRemoverUsuario = new RemoverUsuario();
        jDesktopPane1.add(telaRemoverUsuario);
        telaRemoverUsuario.setVisible(true);
    }//GEN-LAST:event_btnRemoverUsuarioActionPerformed

    private void btnRemoverLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverLivroActionPerformed
        
        RemoverLivro telaRemoverLivro = new RemoverLivro();
        jDesktopPane1.add(telaRemoverLivro);
        telaRemoverLivro.setVisible(true);
    }//GEN-LAST:event_btnRemoverLivroActionPerformed

    private void btnCadastrarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarEventoActionPerformed
        
        CadastrarEvento telaCadastroEvento = new CadastrarEvento();
        jDesktopPane1.add(telaCadastroEvento);
        telaCadastroEvento.setVisible(true);
    }//GEN-LAST:event_btnCadastrarEventoActionPerformed

    private void btnRelatorioEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioEventoActionPerformed
        
        GerarRelatorio telaGerandoRel = new GerarRelatorio();
        jDesktopPane1.add(telaGerandoRel);
        telaGerandoRel.setVisible(true);
    }//GEN-LAST:event_btnRelatorioEventoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Volte Sempre!");
        TelaLogin telaLogin = new TelaLogin();
        this.setVisible(false);
        telaLogin.setVisible(true);
        
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMainFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMainFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMainFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMainFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMainFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlugarLivro;
    private javax.swing.JButton btnBuscarLivro;
    private javax.swing.JButton btnCadastrarEvento;
    private javax.swing.JButton btnCadastrarLivro;
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JButton btnGerarFicha;
    private javax.swing.JButton btnRelatorioEvento;
    private javax.swing.JButton btnRemoverLivro;
    private javax.swing.JButton btnRemoverUsuario;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVisualizarFicha;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbIcon;
    // End of variables declaration//GEN-END:variables
}
