package realchampionssportsacademysystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class AddSportForm extends javax.swing.JFrame {
    private static Scanner x;
  
    public AddSportForm() {
        initComponents();
        setVisible(false);
    }

    public void removeText(){
        sportCenterCombo.setSelectedItem(null);
        sportsCombo.setSelectedItem(null);
        sportIDTxt.setText("");
        sportIDTxt.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCoachBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addCoachBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sportIDTxt = new javax.swing.JTextField();
        sportCenterIDTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        searchIdTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        addCoachBtn2 = new javax.swing.JButton();
        sportsCombo = new javax.swing.JComboBox<>();
        sportCenterCombo = new javax.swing.JComboBox<>();

        addCoachBtn1.setText("Add");
        addCoachBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCoachBtn1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sport Name");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Register New Sport");

        addCoachBtn.setText("Update");
        addCoachBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCoachBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Sport ID");

        backBtn.setText("Back");
        backBtn.setToolTipText("");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Sport Center ID");

        jLabel4.setText("Sport Center Location");

        jLabel14.setText("Sport ID");

        searchIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIdTxtActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        addCoachBtn2.setText("Add");
        addCoachBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCoachBtn2ActionPerformed(evt);
            }
        });

        sportsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Swimming", "Tennis", "Badminton", "Football", "Archery", "Gymnastics", "Volleyball", "Basketball", "Cricket", "Table Tennis ", " " }));
        sportsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportsComboActionPerformed(evt);
            }
        });

        sportCenterCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kuala Lumpur", "Penang", "Malacca", "Sabah" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(sportCenterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(55, 55, 55)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sportCenterIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(sportIDTxt)
                                                .addComponent(sportsCombo, 0, 147, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(searchIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addCoachBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addCoachBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(searchIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sportIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sportsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(sportCenterIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sportCenterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCoachBtn)
                    .addComponent(clearBtn)
                    .addComponent(backBtn)
                    .addComponent(addCoachBtn2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addCoachBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoachBtnActionPerformed
        String sportid = sportIDTxt.getText();
        for (int i = 0; i < MainClass.sport.size(); i++) {
            SportsClass lc = MainClass.sport.get(i);
            if (lc.getSportID().equals(sportid)) {
                MainClass.sport_Info = lc;
                break;
            }
        }
        
        if (MainClass.sport_Info != null) {
            try {
                if (sportsCombo.getSelectedItem() != null) {
                    MainClass.sport_Info.setSportName((String)sportsCombo.getSelectedItem());
                }
                if (sportCenterIDTxt.getText() != null) {
                    MainClass.sport_Info.setSportCenterID(sportCenterIDTxt.getText());
                }
                if (sportCenterCombo.getSelectedItem() != null) {
                    MainClass.sport_Info.setSportCenterName((String)sportCenterCombo.getSelectedItem());
                }               

                String tempFile = "sportTemp1.txt";

                File oldFile = new File("sport.txt");
                File newFile = new File(tempFile);
                try {
                    FileWriter fw = new FileWriter(tempFile, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);
                    x = new Scanner(new File("sport.txt"));

                    while (x.hasNextLine()) {
                        String sport_ID = x.nextLine();
                        String sport_Name = x.nextLine();
                        String sport_CenterID = x.nextLine();
                        String sport_CenterName = x.nextLine();
                        x.nextLine();

                        if (sport_ID.equals(MainClass.sport_Info.getSportID())) {
                            pw.println(sport_ID);
                            pw.println(MainClass.sport_Info.getSportName());
                            pw.println(MainClass.sport_Info.getSportCenterID());
                            pw.println(MainClass.sport_Info.getSportCenterName());
                            pw.println();
                        } else {
                            pw.println(sport_ID);
                            pw.println(sport_Name);
                            pw.println(sport_CenterID);
                            pw.println(sport_CenterName);
                            pw.println();
                        }
                    }
                    x.close();
                    pw.flush();
                    pw.close();
                    oldFile.delete();
                    File dump = new File("sport.txt");
                    newFile.renameTo(dump);

                    JOptionPane.showMessageDialog(this, "sport Info have been updated!");
                    MainClass.sport_Info = null;

                    removeText();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error, sport Info cannot be updated!");
                    MainClass.sport_Info = null;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error, sport Info cannot be updated!");
                MainClass.sport_Info = null;
            }
        } else {
            JOptionPane.showMessageDialog(this, "sport ID is invalid, please enter again!");
            MainClass.sport_Info = null;
        }
    }//GEN-LAST:event_addCoachBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
       removeText();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        new AdminMenuForm().setVisible(true);

    }//GEN-LAST:event_backBtnActionPerformed

    private void searchIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchIdTxtActionPerformed

    private void addCoachBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoachBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCoachBtn1ActionPerformed

    private void addCoachBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoachBtn2ActionPerformed
        String sportid = sportIDTxt.getText();

        for (int i = 0; i < MainClass.sport.size(); i++) {
            SportsClass ac = MainClass.sport.get(i);
            if (ac.getSportID().equals(sportid)) {
                MainClass.sport_Info = ac;
                break;
            }
        }

        if (MainClass.sport_Info == null) {            
            String sport_ID= sportIDTxt.getText();
            String sport_Name = sportsCombo.getSelectedItem().toString();
            String sport_CenterID = sportCenterIDTxt.getText();
            String sport_CenterName = sportCenterCombo.getSelectedItem().toString();
            
            SportsClass ac = new SportsClass(sport_ID,sport_Name,sport_CenterID,sport_CenterName);
            MainClass.sport.add(ac);

            try {
                FileWriter fw = new FileWriter("sport.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pSport = new PrintWriter(bw);
                for (int i = 0; i < MainClass.sport.size(); i++) {
                    SportsClass c = MainClass.sport.get(i);
                    pSport.println(c.getSportID());
                    pSport.println(c.getSportName());
                    pSport.println(c.getSportCenterID());
                    pSport.println(c.getSportCenterName());
                    pSport.println();
                }
                pSport.close();
                JOptionPane.showMessageDialog(this, "Sport has been successfully added!");

                removeText();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error, Sport cannot be added!");
            }

        } else {
            JOptionPane.showMessageDialog(this, "SportID is repeated, please enter again!");
            MainClass.admin_Info = null;

            sportIDTxt.setText("");
            sportIDTxt.requestFocus();
        }
    }//GEN-LAST:event_addCoachBtn2ActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String sportid = searchIdTxt.getText();
        for (int i = 0; i < MainClass.sport.size(); i++) {
            SportsClass lc = MainClass.sport.get(i);
            if (lc.getSportID().equals(sportid)) {
                MainClass.sport_Info = lc;
                break;
            }
        }
        if (MainClass.sport_Info != null) {
            try {
                sportIDTxt.setText(MainClass.sport_Info.getSportID());
                sportsCombo.setSelectedItem(MainClass.sport_Info.getSportName());
                sportCenterIDTxt.setText(MainClass.sport_Info.getSportCenterID());
                sportCenterCombo.setSelectedItem(MainClass.sport_Info.getSportCenterName());
                
                MainClass.sport_Info = null;

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error, Sport cannot be found!");
                MainClass.sport_Info = null;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Sport ID is invalid, please enter again!");
            MainClass.sport_Info = null;
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void sportsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportsComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sportsComboActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCoachBtn;
    private javax.swing.JButton addCoachBtn1;
    private javax.swing.JButton addCoachBtn2;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchIdTxt;
    private javax.swing.JComboBox<String> sportCenterCombo;
    private javax.swing.JTextField sportCenterIDTxt;
    private javax.swing.JTextField sportIDTxt;
    private javax.swing.JComboBox<String> sportsCombo;
    // End of variables declaration//GEN-END:variables
}
