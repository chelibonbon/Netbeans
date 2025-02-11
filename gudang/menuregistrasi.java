/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gudang;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class menuregistrasi extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();

    /**
     * Creates new form tambahdatabarang
     */
    public menuregistrasi() {
        initComponents();
        k.connect();
        refreshTable();
    }
    
    class user extends menuregistrasi{
        int id_user, level;
        String username, password;
        
        public user() {
            username = textusername.getText();
            password = textpassword.getText();
            level = Integer.parseInt(boxlevel.getSelectedItem().toString());
        }
    }
    
    public void refreshTable(){
        model = new DefaultTableModel();
        model.addColumn("id user");
        model.addColumn("username");
        model.addColumn("password");
        model.addColumn("level");
        tablereg.setModel(model);
        try {
            this.stat = k.getCon().prepareStatement("select * from user");
            this.rs = this.stat.executeQuery();
            while (rs.next()) {
                Object[] data = {
                    rs.getString("id_user"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("level")
                };
                model.addRow(data); 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        textiduser.setText("");
        textusername.setText("");
        textpassword.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        namabm = new javax.swing.JLabel();
        textiduser = new javax.swing.JTextField();
        jenisbm = new javax.swing.JLabel();
        jumlahbm = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablereg = new javax.swing.JTable();
        tombolinputreg = new javax.swing.JButton();
        tombolupdatereg = new javax.swing.JButton();
        tomboldeletereg = new javax.swing.JButton();
        tanggalbm = new javax.swing.JLabel();
        tombolbarang = new javax.swing.JButton();
        tombolbk = new javax.swing.JButton();
        logoutregistrasi = new javax.swing.JButton();
        textusername = new javax.swing.JTextField();
        textpassword = new javax.swing.JTextField();
        tombolbr = new javax.swing.JButton();
        tombolbm = new javax.swing.JButton();
        boxlevel = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("MENU REGISTRASI");

        namabm.setText("id user");

        textiduser.setEnabled(false);
        textiduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textiduserActionPerformed(evt);
            }
        });

        jenisbm.setText("username");

        jumlahbm.setText("password");

        tablereg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablereg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableregMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablereg);

        tombolinputreg.setText("INPUT");
        tombolinputreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolinputregActionPerformed(evt);
            }
        });

        tombolupdatereg.setText("UPDATE");
        tombolupdatereg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolupdateregActionPerformed(evt);
            }
        });

        tomboldeletereg.setText("DELETE");
        tomboldeletereg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomboldeleteregActionPerformed(evt);
            }
        });

        tanggalbm.setText("level");

        tombolbarang.setText("Barang");
        tombolbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolbarangActionPerformed(evt);
            }
        });

        tombolbk.setText("Barang keluar");
        tombolbk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolbkActionPerformed(evt);
            }
        });

        logoutregistrasi.setText("Logout");
        logoutregistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutregistrasiActionPerformed(evt);
            }
        });

        textusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textusernameActionPerformed(evt);
            }
        });

        textpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpasswordActionPerformed(evt);
            }
        });

        tombolbr.setText("Barang rusak");
        tombolbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolbrActionPerformed(evt);
            }
        });

        tombolbm.setText("Barang masuk");
        tombolbm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolbmActionPerformed(evt);
            }
        });

        boxlevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        boxlevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxlevelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(logoutregistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jumlahbm)
                                    .addComponent(jenisbm)
                                    .addComponent(tanggalbm, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textusername, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textiduser, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxlevel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tombolinputreg)
                                .addGap(45, 45, 45)
                                .addComponent(tombolupdatereg)
                                .addGap(31, 31, 31)
                                .addComponent(tomboldeletereg)))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(namabm)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tombolbm, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(tombolbk, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tombolbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tombolbr, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoutregistrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namabm)
                    .addComponent(textiduser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jenisbm)
                    .addComponent(textusername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jumlahbm)
                    .addComponent(textpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tanggalbm)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolinputreg)
                    .addComponent(tombolupdatereg)
                    .addComponent(tomboldeletereg)
                    .addComponent(tombolbarang))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolbk)
                    .addComponent(tombolbr)
                    .addComponent(tombolbm))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textiduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textiduserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textiduserActionPerformed

    private void tombolinputregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolinputregActionPerformed
        // TODO add your handling code here:
        try {
            user u = new user();
            this.stat = k.getCon().prepareStatement("Insert into user values(?,?,?,?)");
            stat.setInt(1, 0);
            stat.setString(2, u.username);
            stat.setString(3, u.password);
            stat.setInt(4, u.level);
            stat.executeUpdate();
            refreshTable();
    } catch (Exception e) {
    JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tombolinputregActionPerformed

    private void tombolupdateregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolupdateregActionPerformed
        // TODO add your handling code here:
        try {
            user u = new user();
            this.stat =  k.getCon().prepareStatement("update user set username=?,"
                    + "password=?,level=? where id_user=?");
            stat.setString(1, u.username);
            stat.setString(2, u.password);
            stat.setInt(3, u.level);
            stat.setString(4, textiduser.getText());
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tombolupdateregActionPerformed

    private void tomboldeleteregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomboldeleteregActionPerformed
        // TODO add your handling code here:
        try {
            user u = new user();
            this.stat = k.getCon().prepareStatement("delete from user where id_user=?");
            stat.setString(1, textiduser.getText());
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tomboldeleteregActionPerformed

    private void textusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textusernameActionPerformed

    private void textpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpasswordActionPerformed

    private void logoutregistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutregistrasiActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutregistrasiActionPerformed

    private void boxlevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxlevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxlevelActionPerformed

    private void tableregMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableregMouseClicked
        // TODO add your handling code here:
        textiduser.setText(model.getValueAt(tablereg.getSelectedRow(), 0).toString());
        textusername.setText(model.getValueAt(tablereg.getSelectedRow(), 1).toString());
        textpassword.setText(model.getValueAt(tablereg.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tableregMouseClicked

    private void tombolbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolbarangActionPerformed
        // TODO add your handling code here:
        tambahdatabarang bar = new tambahdatabarang();
        bar.setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_tombolbarangActionPerformed

    private void tombolbmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolbmActionPerformed
        // TODO add your handling code here:
        tambahdatabm barm = new tambahdatabm();
        barm.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_tombolbmActionPerformed

    private void tombolbkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolbkActionPerformed
        // TODO add your handling code here:
        tambahdatabk bark = new tambahdatabk();
        bark.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_tombolbkActionPerformed

    private void tombolbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolbrActionPerformed
        // TODO add your handling code here:
        tambahdatabr barr = new tambahdatabr();
        barr.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_tombolbrActionPerformed

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
            java.util.logging.Logger.getLogger(menuregistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuregistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuregistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuregistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuregistrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxlevel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jenisbm;
    private javax.swing.JLabel jumlahbm;
    private javax.swing.JButton logoutregistrasi;
    private javax.swing.JLabel namabm;
    private javax.swing.JTable tablereg;
    private javax.swing.JLabel tanggalbm;
    private javax.swing.JTextField textiduser;
    private javax.swing.JTextField textpassword;
    private javax.swing.JTextField textusername;
    private javax.swing.JButton tombolbarang;
    private javax.swing.JButton tombolbk;
    private javax.swing.JButton tombolbm;
    private javax.swing.JButton tombolbr;
    private javax.swing.JButton tomboldeletereg;
    private javax.swing.JButton tombolinputreg;
    private javax.swing.JButton tombolupdatereg;
    // End of variables declaration//GEN-END:variables
}
