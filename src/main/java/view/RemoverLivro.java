
package view;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.entity.Livro;
import model.service.LivroService;
/**
 *
 * @author andreLuis
 */
public class RemoverLivro extends javax.swing.JInternalFrame {

    LivroService livroService = new LivroService();
    
    public RemoverLivro() {
        initComponents();
        
        try { //Importar livros do arquivo txt
            List<Livro> livros = livroService.importarArquivo("src/main/java/files/livros.txt");
           
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
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        btnTitulo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnCategoria = new javax.swing.JButton();
        btnAutor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtList = new javax.swing.JList<>();
        btnRemovelivro = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(736, 515));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Remover Livro");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Titulo");

        txtTitulo.setBackground(new java.awt.Color(0, 0, 0));
        txtTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));

        btnTitulo.setBackground(new java.awt.Color(0, 0, 0));
        btnTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnTitulo.setForeground(new java.awt.Color(255, 255, 255));
        btnTitulo.setText("Pesquisar");
        btnTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTituloActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Autor");

        txtAutor.setBackground(new java.awt.Color(0, 0, 0));
        txtAutor.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtAutor.setForeground(new java.awt.Color(255, 255, 255));

        txtCategoria.setBackground(new java.awt.Color(0, 0, 0));
        txtCategoria.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Categoria");

        btnCategoria.setBackground(new java.awt.Color(0, 0, 0));
        btnCategoria.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoria.setText("Pesquisar");
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });

        btnAutor.setBackground(new java.awt.Color(0, 0, 0));
        btnAutor.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnAutor.setForeground(new java.awt.Color(255, 255, 255));
        btnAutor.setText("Pesquisar");
        btnAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorActionPerformed(evt);
            }
        });

        txtList.setBackground(new java.awt.Color(0, 0, 0));
        txtList.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtList.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txtList);

        btnRemovelivro.setBackground(new java.awt.Color(0, 0, 0));
        btnRemovelivro.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnRemovelivro.setForeground(new java.awt.Color(255, 255, 255));
        btnRemovelivro.setText("Remover");
        btnRemovelivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovelivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnTitulo)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnAutor)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(btnCategoria, javax.swing.GroupLayout.Alignment.TRAILING))))
                                    .addGap(1, 1, 1))
                                .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRemovelivro))
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCategoria)
                    .addComponent(btnAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemovelivro)
                .addContainerGap(80, Short.MAX_VALUE))
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

    private void btnTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTituloActionPerformed
        boolean status = false; //verificação de não encontrar livro
        boolean status2 = false; //verificação de encontrar livro
        List<Livro> livros = livroService.listarLivro();
        String titulo = livroService.nomeTitle(txtTitulo.getText());
        DefaultListModel dlm = new DefaultListModel();
        
        for (Livro livro : livros) {
            if(titulo.equals(livro.getTitulo())){
                dlm.addElement(livro.getTitulo()+" / Autor: " + livro.getAutor() 
                        + " / Ano: " + livro.getAno());
                
                status2 = true;
                
            }else if(titulo.equals(livro.getTitulo())== false){
                status = true;
            }
            txtList.setModel(dlm);
        }
        if (status == true && status2 == false) {
            JOptionPane.showMessageDialog(null, "Livro não encontrado");
        }
        
        txtTitulo.setText("");
                
    }//GEN-LAST:event_btnTituloActionPerformed

    private void btnAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorActionPerformed
        boolean status = false; //verificação de não encontrar livro
        boolean status2 = false; //verificação de encontrar livro
        List<Livro> livros = livroService.listarLivro();
        String autor = livroService.nomeTitle(txtAutor.getText());
        DefaultListModel dlm = new DefaultListModel();
        
        for (Livro livro : livros) {
            if(autor.equals(livro.getAutor())){
                dlm.addElement(livro.getTitulo()+" / Autor: " + livro.getAutor() 
                        + " / Ano: " + livro.getAno());
                
                status2 = true;
                
            }else if(autor.equals(livro.getAutor())== false){
                status = true;
            }
            txtList.setModel(dlm);
        }
        if (status == true && status2 == false) {
            JOptionPane.showMessageDialog(null, "Livro não encontrado");
        }
        
        txtAutor.setText("");
    }//GEN-LAST:event_btnAutorActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        boolean status = false; //verificação de não encontrar livro
        boolean status2 = false; //verificação de encontrar livro
        List<Livro> livros = livroService.listarLivro();
        String categoria = livroService.nomeTitle(txtCategoria.getText());
        DefaultListModel dlm = new DefaultListModel();
        
        for (Livro livro : livros) {
            if(categoria.equals(livro.getTema())){
                dlm.addElement(livro.getTitulo()+" / Autor: " + livro.getAutor() 
                        + " / Ano: " + livro.getAno());
                
                status2 = true;
                
            }else if(categoria.equals(livro.getTema())== false){
                status = true;
            }
            txtList.setModel(dlm);
        }
        
        if (status == true && status2 == false) {
            JOptionPane.showMessageDialog(null, "Livro não encontrado");
        }
        
        txtCategoria.setText("");
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnRemovelivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovelivroActionPerformed
        List<Livro> livros = livroService.listarLivro();
        String[] removeTitulo = txtList.getSelectedValue().split(" /");
        
        DefaultListModel dlm = new DefaultListModel();
        
        livroService.removerLivro(removeTitulo[0]);
        try {
            livroService.exportarLivro(livros);
        } catch (IOException ex) {
            Logger.getLogger(RemoverLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Livro " + removeTitulo[0] + " removido!");
        
        dlm.clear();
        txtList.setModel(dlm);
        
        
    }//GEN-LAST:event_btnRemovelivroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutor;
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnRemovelivro;
    private javax.swing.JButton btnTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JList<String> txtList;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
