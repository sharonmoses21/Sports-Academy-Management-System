package realchampionssportsacademysystem;

public class AdminMenuForm extends javax.swing.JFrame {
    
    public AdminMenuForm() {
        initComponents();
        setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JButton();
        addAdminBtn = new javax.swing.JButton();
        addCoachBtn = new javax.swing.JButton();
        addSportsBtn = new javax.swing.JButton();
        addSportScheduleBtn = new javax.swing.JButton();
        addCoachBtn3 = new javax.swing.JButton();
        addSportsBtn1 = new javax.swing.JButton();
        addSportScheduleBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("REAL CHAMPIONS SPORT ACADEMY SYSTEM");

        LogoutBtn.setText("Log Out");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        addAdminBtn.setText("Manage Admin");
        addAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdminBtnActionPerformed(evt);
            }
        });

        addCoachBtn.setText("Manage Coach");
        addCoachBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCoachBtnActionPerformed(evt);
            }
        });

        addSportsBtn.setText("Manage Sports");
        addSportsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSportsBtnActionPerformed(evt);
            }
        });

        addSportScheduleBtn.setText("Manage Sports Schedule");
        addSportScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSportScheduleBtnActionPerformed(evt);
            }
        });

        addCoachBtn3.setText("Display Coach");
        addCoachBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCoachBtn3ActionPerformed(evt);
            }
        });

        addSportsBtn1.setText("Display Sports");
        addSportsBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSportsBtn1ActionPerformed(evt);
            }
        });

        addSportScheduleBtn1.setText("Display Sports Schedule");
        addSportScheduleBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSportScheduleBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(addCoachBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(addSportsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addCoachBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addSportsBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LogoutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addSportScheduleBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addSportScheduleBtn1)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCoachBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSportsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSportScheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCoachBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSportScheduleBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSportsBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        this.dispose();
        new LoginForm().setVisible(true);
        MainClass.adminLogin = null;
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void addAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdminBtnActionPerformed
        this.dispose();
        new AddAdminForm().setVisible(true);
    }//GEN-LAST:event_addAdminBtnActionPerformed

    private void addCoachBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoachBtnActionPerformed
        this.dispose();
        new AddCoachForm().setVisible(true);
    }//GEN-LAST:event_addCoachBtnActionPerformed

    private void addSportsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSportsBtnActionPerformed
        this.dispose();
        new AddSportForm().setVisible(true);
    }//GEN-LAST:event_addSportsBtnActionPerformed

    private void addSportScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSportScheduleBtnActionPerformed
        this.dispose();
        new AddSportScheduleForm().setVisible(true);
    }//GEN-LAST:event_addSportScheduleBtnActionPerformed

    private void addCoachBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoachBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCoachBtn3ActionPerformed

    private void addSportsBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSportsBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addSportsBtn1ActionPerformed

    private void addSportScheduleBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSportScheduleBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addSportScheduleBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton addAdminBtn;
    private javax.swing.JButton addCoachBtn;
    private javax.swing.JButton addCoachBtn1;
    private javax.swing.JButton addCoachBtn2;
    private javax.swing.JButton addCoachBtn3;
    private javax.swing.JButton addSportScheduleBtn;
    private javax.swing.JButton addSportScheduleBtn1;
    private javax.swing.JButton addSportsBtn;
    private javax.swing.JButton addSportsBtn1;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
