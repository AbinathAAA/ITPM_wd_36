/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpm_time;

/**
 *
 * @author WindowsUser
 */
public class mainMenu extends javax.swing.JFrame {

    /**
     * Creates new form mainMenu
     */
    public mainMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_lec = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_tag = new javax.swing.JButton();
        btn_session = new javax.swing.JButton();
        btn_sub1 = new javax.swing.JButton();
        btn_sub2 = new javax.swing.JButton();
        btn_sub3 = new javax.swing.JButton();
        btn_sub4 = new javax.swing.JButton();
        btn_GnT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Wide Latin", 3, 24)); // NOI18N
        jLabel1.setText("ABC insitute");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("Main Menu");

        btn_lec.setBackground(new java.awt.Color(255, 255, 51));
        btn_lec.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        btn_lec.setText("Lecture");
        btn_lec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lecActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 255, 0));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jButton1.setText("Day&Time");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_tag.setBackground(new java.awt.Color(204, 0, 102));
        btn_tag.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        btn_tag.setText("Tag");
        btn_tag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tagActionPerformed(evt);
            }
        });

        btn_session.setBackground(new java.awt.Color(204, 0, 204));
        btn_session.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        btn_session.setText("Session");
        btn_session.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sessionActionPerformed(evt);
            }
        });

        btn_sub1.setBackground(new java.awt.Color(102, 102, 102));
        btn_sub1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn_sub1.setText("Student");
        btn_sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sub1ActionPerformed(evt);
            }
        });

        btn_sub2.setBackground(new java.awt.Color(204, 0, 102));
        btn_sub2.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        btn_sub2.setText("Location");
        btn_sub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sub2ActionPerformed(evt);
            }
        });

        btn_sub3.setBackground(new java.awt.Color(204, 204, 0));
        btn_sub3.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        btn_sub3.setText("Subject");
        btn_sub3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sub3ActionPerformed(evt);
            }
        });

        btn_sub4.setBackground(new java.awt.Color(255, 153, 153));
        btn_sub4.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        btn_sub4.setText("Graph");
        btn_sub4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sub4ActionPerformed(evt);
            }
        });

        btn_GnT.setBackground(new java.awt.Color(255, 153, 153));
        btn_GnT.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        btn_GnT.setText("Generate Timetable");
        btn_GnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GnTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(btn_lec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_tag, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                .addGap(175, 175, 175)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_sub1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_sub2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_sub3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_sub4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(btn_session, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(235, 235, 235))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(btn_GnT, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_lec)
                    .addComponent(btn_sub1))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btn_sub2))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tag)
                    .addComponent(btn_sub3))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_session)
                    .addComponent(btn_sub4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btn_GnT)
                .addGap(120, 120, 120))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        addWorking ad = new addWorking();
        ad.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_tagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tagActionPerformed
        // TODO add your handling code here:
        addtag  as =new addtag();
        as.show();
        dispose();
        
    }//GEN-LAST:event_btn_tagActionPerformed

    private void btn_sessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sessionActionPerformed
        // TODO add your handling code here:
        AddSession  as =new AddSession();
        as.show();
        dispose();
    }//GEN-LAST:event_btn_sessionActionPerformed

    private void btn_sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sub1ActionPerformed
        // TODO add your handling code here:
        add_student  as =new add_student();
        as.show();
        dispose();
    }//GEN-LAST:event_btn_sub1ActionPerformed

    private void btn_sub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sub2ActionPerformed
        // TODO add your handling code here:
        Addkocation adl = new Addkocation();
        adl.show();
        dispose();
    }//GEN-LAST:event_btn_sub2ActionPerformed

    private void btn_sub3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sub3ActionPerformed
        // TODO add your handling code here:
         Addsubject adl = new  Addsubject();
        adl.show();
        dispose();
    }//GEN-LAST:event_btn_sub3ActionPerformed

    private void btn_sub4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sub4ActionPerformed
        // TODO add your handling code here:
        statistics1 s =new statistics1();
        s.show();
        dispose();
    }//GEN-LAST:event_btn_sub4ActionPerformed

    private void btn_GnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GnTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_GnTActionPerformed

    private void btn_lecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lecActionPerformed
        // TODO add your handling code here:
        Addlecturer al =new Addlecturer();
        al.show();
        dispose();
    }//GEN-LAST:event_btn_lecActionPerformed

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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_GnT;
    private javax.swing.JButton btn_lec;
    private javax.swing.JButton btn_session;
    private javax.swing.JButton btn_sub1;
    private javax.swing.JButton btn_sub2;
    private javax.swing.JButton btn_sub3;
    private javax.swing.JButton btn_sub4;
    private javax.swing.JButton btn_tag;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
