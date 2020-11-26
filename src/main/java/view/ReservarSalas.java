package view;
/**
 *
 * @author eduardoSena
 */

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.entity.SalaEstudo;
import model.service.SalaEstudoService;

public class ReservarSalas extends javax.swing.JInternalFrame {
    SalaEstudoService salaService = new SalaEstudoService();
        
    public ReservarSalas() {
        initComponents();
        
        try { //Importando dados das salas de estudo
            List<SalaEstudo> salasEstudo = salaService.importarArquivo("src/main/java/files/salasEstudo.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (salaService.salasEstudo.get(0).getStatus() == true) {
            txtSala1.setText("Sala Reservada");
        }
        if (salaService.salasEstudo.get(1).getStatus() == true) {
            txtSala2.setText("Sala Reservada");
        }
        if (salaService.salasEstudo.get(2).getStatus() == true) {
            txtSala3.setText("Sala Reservada");
        }
        if (salaService.salasEstudo.get(3).getStatus() == true) {
            txtSala4.setText("Sala Reservada");
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

        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnSala8 = new javax.swing.JButton();
        jpReservarSala = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnSala1R = new javax.swing.JButton();
        btnSala1L = new javax.swing.JButton();
        btnSala3R = new javax.swing.JButton();
        btnSala4R = new javax.swing.JButton();
        txtSala2 = new javax.swing.JLabel();
        txtSala1 = new javax.swing.JLabel();
        txtSala3 = new javax.swing.JLabel();
        txtSala4 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSala2R = new javax.swing.JButton();
        btnSala2L = new javax.swing.JButton();
        btnSala3L = new javax.swing.JButton();
        btnSala4L = new javax.swing.JButton();

        jButton4.setText("jButton4");

        jLabel3.setText("jLabel3");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Sala Livre");

        jButton6.setText("jButton6");

        jButton8.setText("jButton8");

        jButton1.setText("jButton1");

        btnSala8.setText("•");

        setClosable(true);

        jpReservarSala.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Reservar");

        btnSala1R.setText("•");
        btnSala1R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSala1RActionPerformed(evt);
            }
        });

        btnSala1L.setText("•");
        btnSala1L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSala1LActionPerformed(evt);
            }
        });

        btnSala3R.setText("•");
        btnSala3R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSala3RActionPerformed(evt);
            }
        });

        btnSala4R.setText("•");
        btnSala4R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSala4RActionPerformed(evt);
            }
        });

        txtSala2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtSala2.setForeground(new java.awt.Color(0, 0, 0));
        txtSala2.setText("Sala Livre");

        txtSala1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtSala1.setForeground(new java.awt.Color(0, 0, 0));
        txtSala1.setText("Sala Livre");

        txtSala3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtSala3.setForeground(new java.awt.Color(0, 0, 0));
        txtSala3.setText("Sala Livre");

        txtSala4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtSala4.setForeground(new java.awt.Color(0, 0, 0));
        txtSala4.setText("Sala Livre");

        btnVoltar.setText("Voltar");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Liberar");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Salas de Estudo");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Status");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SALA 1");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("SALA 2");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("SALA 3");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("SALA 4");

        btnSala2R.setText("•");
        btnSala2R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSala2RActionPerformed(evt);
            }
        });

        btnSala2L.setText("•");
        btnSala2L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSala2LActionPerformed(evt);
            }
        });

        btnSala3L.setText("•");
        btnSala3L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSala3LActionPerformed(evt);
            }
        });

        btnSala4L.setText("•");
        btnSala4L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSala4LActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpReservarSalaLayout = new javax.swing.GroupLayout(jpReservarSala);
        jpReservarSala.setLayout(jpReservarSalaLayout);
        jpReservarSalaLayout.setHorizontalGroup(
            jpReservarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReservarSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpReservarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpReservarSalaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpReservarSalaLayout.createSequentialGroup()
                        .addGroup(jpReservarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jpReservarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jpReservarSalaLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jpReservarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSala1R)
                                    .addComponent(btnSala3R)
                                    .addComponent(btnSala4R)
                                    .addComponent(btnSala2R))))
                        .addGap(39, 39, 39)
                        .addGroup(jpReservarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSala1L)
                            .addComponent(jLabel4)
                            .addComponent(btnSala2L)
                            .addComponent(btnSala3L)
                            .addComponent(btnSala4L))
                        .addGap(29, 29, 29)
                        .addGroup(jpReservarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpReservarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnVoltar)
                                .addGroup(jpReservarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSala4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSala3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSala2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpReservarSalaLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel7))))
                            .addComponent(txtSala1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jpReservarSalaLayout.setVerticalGroup(
            jpReservarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReservarSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jpReservarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpReservarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpReservarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSala1R)
                    .addComponent(txtSala1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(btnSala1L))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpReservarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSala2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(btnSala2R)
                    .addComponent(btnSala2L))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpReservarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSala3R)
                    .addComponent(txtSala3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(btnSala3L))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpReservarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSala4R)
                    .addComponent(txtSala4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(btnSala4L))
                .addGap(64, 64, 64)
                .addComponent(btnVoltar)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpReservarSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpReservarSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSala1RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSala1RActionPerformed
        // TODO add your handling code here:
        txtSala1.setText("Sala Reservada");
        salaService.salasEstudo.get(0).setStatus(true);
        try {
            salaService.exportarSala(salaService.salasEstudo);
        } catch (IOException ex) {
            Logger.getLogger(ReservarSalas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(salaService.listarSalas());
        
    }//GEN-LAST:event_btnSala1RActionPerformed

    private void btnSala1LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSala1LActionPerformed
        // TODO add your handling code here:
        txtSala1.setText("Sala Livre");
        salaService.salasEstudo.get(0).setStatus(false);
        try {
            salaService.exportarSala(salaService.salasEstudo);
        } catch (IOException ex) {
            Logger.getLogger(ReservarSalas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(salaService.listarSalas());
        
    }//GEN-LAST:event_btnSala1LActionPerformed

    private void btnSala2RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSala2RActionPerformed
        // TODO add your handling code here:
        txtSala2.setText("Sala Reservada");
        salaService.salasEstudo.get(1).setStatus(true);
        try {
            salaService.exportarSala(salaService.salasEstudo);
        } catch (IOException ex) {
            Logger.getLogger(ReservarSalas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(salaService.listarSalas());
    }//GEN-LAST:event_btnSala2RActionPerformed

    private void btnSala2LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSala2LActionPerformed
        // TODO add your handling code here:
        txtSala2.setText("Sala Livre");
        salaService.salasEstudo.get(1).setStatus(false);
        try {
            salaService.exportarSala(salaService.salasEstudo);
        } catch (IOException ex) {
            Logger.getLogger(ReservarSalas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(salaService.listarSalas());
    }//GEN-LAST:event_btnSala2LActionPerformed

    private void btnSala3RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSala3RActionPerformed
        // TODO add your handling code here:
        txtSala3.setText("Sala Reservada");
        salaService.salasEstudo.get(2).setStatus(true);
        try {
            salaService.exportarSala(salaService.salasEstudo);
        } catch (IOException ex) {
            Logger.getLogger(ReservarSalas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(salaService.listarSalas());
    }//GEN-LAST:event_btnSala3RActionPerformed

    private void btnSala3LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSala3LActionPerformed
        // TODO add your handling code here:
        txtSala3.setText("Sala Livre");
        salaService.salasEstudo.get(2).setStatus(false);
        try {
            salaService.exportarSala(salaService.salasEstudo);
        } catch (IOException ex) {
            Logger.getLogger(ReservarSalas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(salaService.listarSalas());
    }//GEN-LAST:event_btnSala3LActionPerformed

    private void btnSala4RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSala4RActionPerformed
        // TODO add your handling code here:
        txtSala4.setText("Sala Reservada");
        salaService.salasEstudo.get(3).setStatus(true);
        try {
            salaService.exportarSala(salaService.salasEstudo);
        } catch (IOException ex) {
            Logger.getLogger(ReservarSalas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(salaService.listarSalas());
    }//GEN-LAST:event_btnSala4RActionPerformed

    private void btnSala4LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSala4LActionPerformed
        // TODO add your handling code here:
        txtSala4.setText("Sala Livre");
        salaService.salasEstudo.get(3).setStatus(false);
        try {
            salaService.exportarSala(salaService.salasEstudo);
        } catch (IOException ex) {
            Logger.getLogger(ReservarSalas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(salaService.listarSalas());
    }//GEN-LAST:event_btnSala4LActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSala1L;
    private javax.swing.JButton btnSala1R;
    private javax.swing.JButton btnSala2L;
    private javax.swing.JButton btnSala2R;
    private javax.swing.JButton btnSala3L;
    private javax.swing.JButton btnSala3R;
    private javax.swing.JButton btnSala4L;
    private javax.swing.JButton btnSala4R;
    private javax.swing.JButton btnSala8;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpReservarSala;
    private javax.swing.JLabel txtSala1;
    private javax.swing.JLabel txtSala2;
    private javax.swing.JLabel txtSala3;
    private javax.swing.JLabel txtSala4;
    // End of variables declaration//GEN-END:variables
}
