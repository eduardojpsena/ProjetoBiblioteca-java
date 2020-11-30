
package view;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.entity.Usuario;
import model.service.UsuarioService;

/**
 *
 * @author andreLuis
 */

public class RemoverUsuario extends javax.swing.JInternalFrame {

    UsuarioService usuarioService = new UsuarioService();
    
    public RemoverUsuario() {
        initComponents();
        
        try { //Importando usuarios do arquivo externo usuarios
            List<Usuario> usuarios = usuarioService.importarArquivo("src/main/java/files/usuarios.txt");
           
        } catch (Exception e) {
                e.printStackTrace();
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnRemover = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtList = new javax.swing.JList<>();

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Remover Usúario");

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(736, 515));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Remover Usúario");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuário");

        txtUsuario.setBackground(new java.awt.Color(0, 0, 0));
        txtUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));

        btnRemover.setBackground(new java.awt.Color(0, 0, 0));
        btnRemover.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnRemover.setForeground(new java.awt.Color(255, 255, 255));
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuario.setText("Visualizar");
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        txtList.setBackground(new java.awt.Color(0, 0, 0));
        txtList.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtList.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(txtList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel2)
                .addContainerGap(298, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnUsuario)
                    .addComponent(btnRemover)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(188, 188, 188))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnUsuario)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnRemover)
                .addContainerGap(104, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        List<Usuario> usuarios = usuarioService.listarUsuario();
        String[] removeUser = txtList.getSelectedValue().split(" /");
        
        DefaultListModel dlm = new DefaultListModel();
        
        usuarioService.removerUsuario(removeUser[0]);
        try {
            usuarioService.exportarUsuario(usuarios);
        } catch (IOException ex) {
            Logger.getLogger(RemoverUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Usuário " + removeUser[0] + " removido!");
        
        dlm.clear();
        txtList.setModel(dlm);
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        boolean status = false; //verificação de não encontrar livro
        boolean status2 = false; //verificação de encontrar livro
        
        List<Usuario> usuarios = usuarioService.listarUsuario();
        String user = txtUsuario.getText();
        DefaultListModel dlm = new DefaultListModel();
        
        for (Usuario usuario : usuarios) {
            if (user.equals(usuario.getLogin())) {
                dlm.addElement(usuario.getLogin() + " / Nome: " + usuario.getNome() 
                        + " / Tipo: " + usuario.getTipo());
                status2 = true;
            } else if(user.equals(usuario.getLogin()) == false){
                status = true;
            }
            txtList.setModel(dlm);
        }
        if (status == true && status2 == false) {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado");
        }
        
        txtUsuario.setText("");
    }//GEN-LAST:event_btnUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> txtList;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
