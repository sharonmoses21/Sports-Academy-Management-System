package realchampionssportsacademysystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AddSportScheduleForm extends javax.swing.JFrame {
    private static Scanner x;
    
    public AddSportScheduleForm() {
        initComponents();
        setVisible(false);
    }

    public void removeText(){
        sportsIdText.setText("");
        sportsCombo.setSelectedItem(null);
        dayCombo.setSelectedItem(null);
        startTimeTxt.setText("");
        endTimeTxt.setText("");
        seachIdTxt.setText("");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sportsIdText = new javax.swing.JTextField();
        startTimeTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        endTimeTxt = new javax.swing.JTextField();
        addScheduleBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        dayCombo = new javax.swing.JComboBox<>();
        backBtn3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        seachIdTxt = new javax.swing.JTextField();
        updateCoachBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        sportsCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Add Sport Schedule");

        jLabel3.setText("Sports Name");

        jLabel2.setText("Sports ID");

        sportsIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportsIdTextActionPerformed(evt);
            }
        });

        jLabel5.setText("Start Time");

        jLabel4.setText("Day");

        jLabel6.setText("End Time");

        endTimeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endTimeTxtActionPerformed(evt);
            }
        });

        addScheduleBtn.setText("Add");
        addScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addScheduleBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        dayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday ", "Wednesday", "Thursday", "Friday" }));

        backBtn3.setText("Back");
        backBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Sports ID");

        seachIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seachIdTxtActionPerformed(evt);
            }
        });

        updateCoachBtn.setText("Update");
        updateCoachBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCoachBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        sportsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Swimming", "Tennis", "Badminton", "Football", "Archery", "Gymnastics", "Volleyball", "Basketball", "Cricket", "Table Tennis ", " " }));
        sportsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportsComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(addScheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateCoachBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(endTimeTxt)
                                    .addComponent(startTimeTxt)
                                    .addComponent(sportsIdText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dayCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sportsCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(seachIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(seachIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sportsIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sportsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(startTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(endTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addScheduleBtn)
                    .addComponent(clearBtn)
                    .addComponent(backBtn3)
                    .addComponent(updateCoachBtn))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sportsIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportsIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sportsIdTextActionPerformed

    private void endTimeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endTimeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endTimeTxtActionPerformed

    private void addScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addScheduleBtnActionPerformed
        String sportid = sportsIdText.getText();

        for (int i = 0; i < MainClass.schedule.size(); i++) {
            SportsScheduleClass ac = MainClass.schedule.get(i);
            if (ac.getSportsId().equals(sportid)) {
                MainClass.schedule_Info = ac;
                break;
            }
        }               

        if (MainClass.schedule_Info == null) {            
            String sport_ID= sportsIdText.getText();
            String sport_Name = sportsCombo.getSelectedItem().toString();            
            String sport_Day = dayCombo.getSelectedItem().toString();
            String sport_StartTime = startTimeTxt.getText();
            String sport_EndTime = endTimeTxt.getText();
            
            SportsScheduleClass ac = new SportsScheduleClass(sport_ID,sport_Name,sport_Day,sport_StartTime,sport_EndTime);
            MainClass.schedule.add(ac);

            try {
                FileWriter fw = new FileWriter("schedule.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pSchedule = new PrintWriter(bw);
                for (int i = 0; i < MainClass.schedule.size(); i++) {
                    SportsScheduleClass c = MainClass.schedule.get(i);
                    pSchedule.println(c.getSportsId());
                    pSchedule.println(c.getSportsName());
                    pSchedule.println(c.getSportsDay());
                    pSchedule.println(c.getStartTime());
                    pSchedule.println(c.getEndTime());
                    pSchedule.println();
                }
                pSchedule.close();
                JOptionPane.showMessageDialog(this, "Schedule has been successfully added!");

                removeText();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error, Schedule cannot be added!");
            }

        } else {
            JOptionPane.showMessageDialog(this, "SportID is repeated, please enter again!");
            MainClass.schedule_Info = null;

            sportsIdText.setText("");
            sportsIdText.requestFocus();
        }
    }//GEN-LAST:event_addScheduleBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
       removeText();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void backBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn3ActionPerformed
        this.dispose();
        new AdminMenuForm().setVisible(true);
    }//GEN-LAST:event_backBtn3ActionPerformed

    private void seachIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seachIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seachIdTxtActionPerformed

    private void updateCoachBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCoachBtnActionPerformed
        String sportid = sportsIdText.getText();
        for (int i = 0; i < MainClass.schedule.size(); i++) {
            SportsScheduleClass lc = MainClass.schedule.get(i);
            if (lc.getSportsId().equals(sportid)) {
                MainClass.schedule_Info = lc;
                break;
            }
        }

        if (MainClass.schedule_Info != null) {
            try {                
                if (sportsCombo.getSelectedItem() != null) {
                    MainClass.schedule_Info.setSportsName((String)sportsCombo.getSelectedItem());
                }
                if (dayCombo.getSelectedItem() != null) {
                    MainClass.schedule_Info.setSportsDay(dayCombo.getSelectedItem().toString());
                }
                if (!startTimeTxt.getText().equals("")) {
                    MainClass.schedule_Info.setStartTime(startTimeTxt.getText());
                }
                if (!endTimeTxt.getText().equals("")) {
                    MainClass.schedule_Info.setEndTime(endTimeTxt.getText());
                }

                String tempFile = "scheduleTemp1.txt";

                File oldFile = new File("schedule.txt");
                File newFile = new File(tempFile);
                try {
                    FileWriter fw = new FileWriter(tempFile, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);
                    x = new Scanner(new File("schedule.txt"));

                    while (x.hasNextLine()) {
                        String sport_ID = x.nextLine();
                        String sport_Name = x.nextLine();
                        String sport_Day = x.nextLine();
                        String sport_StartTime = x.nextLine();
                        String sport_EndTime = x.nextLine();
                        x.nextLine();

                        if (sport_ID.equals(MainClass.schedule_Info.getSportsId())) {
                            pw.println(sport_ID);
                            pw.println(MainClass.schedule_Info.getSportsName());
                            pw.println(MainClass.schedule_Info.getSportsDay());
                            pw.println(MainClass.schedule_Info.getStartTime());
                            pw.println(MainClass.schedule_Info.getEndTime());
                            pw.println();
                        } else {
                            pw.println(sport_ID);
                            pw.println(sport_Name);
                            pw.println(sport_Day);
                            pw.println(sport_StartTime);
                            pw.println(sport_EndTime);
                            pw.println();
                        }
                    }
                     x.close();
                    pw.flush();
                    pw.close();
                    oldFile.delete();
                    File dump = new File("schedule.txt");
                    newFile.renameTo(dump);

                    JOptionPane.showMessageDialog(this, "Schedule Info have been updated!");
                    MainClass.schedule_Info = null;

                    removeText();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error, Schedule Info cannot be updated!");
                    MainClass.schedule_Info = null;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error, Schedule Info cannot be updated!");
                MainClass.schedule_Info = null;
            }
        } else {
            JOptionPane.showMessageDialog(this, "sport ID is invalid, please enter again!");
            MainClass.schedule_Info = null;
        }
    }//GEN-LAST:event_updateCoachBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String coachid = seachIdTxt.getText();
        for (int i = 0; i < MainClass.schedule.size(); i++) {
            SportsScheduleClass lc = MainClass.schedule.get(i);
            if (lc.getSportsId().equals(coachid)) {
                MainClass.schedule_Info = lc;
                break;
            }
        }
        if (MainClass.schedule_Info != null) {
            try {
                sportsIdText.setText(MainClass.schedule_Info.getSportsId());
                sportsCombo.setSelectedItem(MainClass.schedule_Info.getSportsName());
                dayCombo.setSelectedItem(MainClass.schedule_Info.getSportsDay());
                startTimeTxt.setText(MainClass.schedule_Info.getStartTime());
                endTimeTxt.setText(MainClass.schedule_Info.getEndTime());                
                MainClass.schedule_Info = null;

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error, Schedule cannot be found!");
                MainClass.schedule_Info = null;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Sport ID is invalid, please enter again!");
            MainClass.schedule_Info = null;
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void sportsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportsComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sportsComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addScheduleBtn;
    private javax.swing.JButton backBtn3;
    private javax.swing.JButton clearBtn;
    private javax.swing.JComboBox<String> dayCombo;
    private javax.swing.JTextField endTimeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField seachIdTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> sportsCombo;
    private javax.swing.JTextField sportsIdText;
    private javax.swing.JTextField startTimeTxt;
    private javax.swing.JButton updateCoachBtn;
    // End of variables declaration//GEN-END:variables
}
