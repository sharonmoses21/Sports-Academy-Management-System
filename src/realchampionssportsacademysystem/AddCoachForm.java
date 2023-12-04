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

public class AddCoachForm extends javax.swing.JFrame {

    private static Scanner x;

    public AddCoachForm() {
        initComponents();
        setVisible(false);
    }

    public void removeText() {
        searchIdTxt.setText("");
        idTxt.setText("");
        nameTxt.setText("");
        usernameTxt.setText("");
        passwordTxt.setText("");
        dateJoinedChooser.setCalendar(null);
        phoneTxt.setText("");
        addressTxt.setText("");
        sportCenterCombo.setSelectedItem(null);
        rateCombo.setSelectedItem(null);
        sportsCombo.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        centerCombo = new javax.swing.JComboBox<>();
        backBtn = new javax.swing.JButton();
        idTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        addCoachBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        rateCombo = new javax.swing.JComboBox<>();
        sportsCombo = new javax.swing.JComboBox<>();
        passwordTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sportCenterCombo = new javax.swing.JComboBox<>();
        backBtn1 = new javax.swing.JButton();
        updateCoachBtn = new javax.swing.JButton();
        deleteCoachBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        searchIdTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        dateJoinedChooser = new com.toedter.calendar.JDateChooser();

        jLabel9.setText("Address");

        jLabel11.setText("Sport centre name");

        centerCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kuala Lumpur", "Penang", "Malacca", "Sabah" }));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });

        jLabel5.setText("Date Joined");

        jLabel6.setText("Phone");

        jLabel7.setText("Address");

        jLabel8.setText("Sport centre name");

        jLabel2.setText("Coach ID");

        jLabel10.setText("Sport");

        jLabel3.setText("Coach Name");

        jLabel4.setText("Hourly Rate");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Register New Coach");

        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });

        addCoachBtn.setText("Add");
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

        rateCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100.0", "200.0", "300.0", "400.0", "500.0" }));

        sportsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Swimming", "Tennis", "Badminton", "Football", "Archery", "Gymnastics", "Volleyball", "Basketball", "Cricket", "Table Tennis ", " " }));
        sportsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportsComboActionPerformed(evt);
            }
        });

        jLabel12.setText("Username");

        jLabel13.setText("Password");

        sportCenterCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kuala Lumpur", "Penang", "Malacca", "Sabah" }));

        backBtn1.setText("Back");
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });

        updateCoachBtn.setText("Update");
        updateCoachBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCoachBtnActionPerformed(evt);
            }
        });

        deleteCoachBtn.setText("Delete");
        deleteCoachBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCoachBtnActionPerformed(evt);
            }
        });

        jLabel14.setText("Coach ID");

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

        dateJoinedChooser.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addCoachBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateCoachBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(deleteCoachBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(idTxt)
                                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usernameTxt)
                                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rateCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5))
                            .addComponent(sportCenterCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addressTxt)
                            .addComponent(phoneTxt)
                            .addComponent(sportsCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateJoinedChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(105, 105, 105)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(searchIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(dateJoinedChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(sportCenterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sportsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(rateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateCoachBtn)
                    .addComponent(addCoachBtn)
                    .addComponent(deleteCoachBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn)
                    .addComponent(backBtn1))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTxtActionPerformed

    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed

    private void addCoachBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoachBtnActionPerformed
        String coach_ID = idTxt.getText();

        for (int i = 0; i < MainClass.coach.size(); i++) {
            CoachClass ac = MainClass.coach.get(i);
            if (ac.getUserID().equals(coach_ID)) {
                MainClass.coach_Info = ac;
                break;
            }
        }

        if (MainClass.coach_Info == null) {
            String coach_AccName = nameTxt.getText();
            String coach_Username = usernameTxt.getText();
            String coach_Password = passwordTxt.getText();

            Date coachdatejoined = dateJoinedChooser.getDate();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String coach_DateJoined = dateFormat.format(coachdatejoined);

            String coach_Contact = phoneTxt.getText();
            String coach_Address = addressTxt.getText();
            String coach_Center = (String) centerCombo.getSelectedItem();
            String coach_Sport = (String) sportsCombo.getSelectedItem();
            Double coach_Rate = Double.parseDouble(rateCombo.getSelectedItem().toString());

            CoachClass ac = new CoachClass(coach_ID, coach_AccName, coach_Username, coach_Password, coach_DateJoined, coach_Contact, coach_Address, coach_Center, coach_Sport, coach_Rate);
            MainClass.coach.add(ac);

            try {
                FileWriter fw = new FileWriter("coach.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pCoach = new PrintWriter(bw);
                for (int i = 0; i < MainClass.coach.size(); i++) {
                    CoachClass c = MainClass.coach.get(i);
                    pCoach.println(c.getUserID());
                    pCoach.println(c.getUserAccName());
                    pCoach.println(c.getUserName());
                    pCoach.println(c.getUserPassword());
                    pCoach.println(c.getUserDateJoined());
                    pCoach.println(c.getUserContact());
                    pCoach.println(c.getUserAddress());
                    pCoach.println(c.getUserCenter());
                    pCoach.println(c.getSport());
                    pCoach.println(c.getHourlyRate());
                    pCoach.println();
                }
                pCoach.close();
                JOptionPane.showMessageDialog(this, "Coach has been successfully added!");

                removeText();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error, Coach cannot be added!");
            }

        } else {
            JOptionPane.showMessageDialog(this, "CoachID is repeated, please enter again!");
            MainClass.admin_Info = null;

            idTxt.setText("");
            idTxt.requestFocus();
        }
    }//GEN-LAST:event_addCoachBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtnActionPerformed

    private void sportsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportsComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sportsComboActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

    }//GEN-LAST:event_backBtnActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        this.dispose();
        new AdminMenuForm().setVisible(true);
    }//GEN-LAST:event_backBtn1ActionPerformed

    private void updateCoachBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCoachBtnActionPerformed
        String coachid = idTxt.getText();
        for (int i = 0; i < MainClass.coach.size(); i++) {
            CoachClass lc = MainClass.coach.get(i);
            if (lc.getUserID().equals(coachid)) {
                MainClass.coach_Info = lc;
                break;
            }
        }
        
        if (MainClass.coach_Info != null) {
            try {
                if (nameTxt.getText() != null) {
                    MainClass.coach_Info.setUserName(nameTxt.getText());
                }
                if (usernameTxt.getText() != null) {
                    MainClass.coach_Info.setUserName(usernameTxt.getText());
                }
                if (passwordTxt.getText() != null) {
                    MainClass.coach_Info.setUserPassword(passwordTxt.getText());
                }

                Date coachdatejoined = dateJoinedChooser.getDate();
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String coach_Datejoined = dateFormat.format(coachdatejoined);
                if (dateJoinedChooser.getDate() != null) {
                    MainClass.coach_Info.setUserDateJoined(coach_Datejoined);
                }

                if (!phoneTxt.getText().equals("")) {
                    MainClass.coach_Info.setUserContact(phoneTxt.getText());
                }
                if (!addressTxt.getText().equals("")) {
                    MainClass.coach_Info.setUserAddress(addressTxt.getText());
                }
                if (sportCenterCombo.getSelectedItem() != null) {
                    MainClass.coach_Info.setUserCenter((String)sportCenterCombo.getSelectedItem());
                }
                if (sportsCombo.getSelectedItem() != null) {
                    MainClass.coach_Info.setSport((String)sportsCombo.getSelectedItem());
                }
                if (rateCombo.getSelectedItem()!= null) {
                    MainClass.coach_Info.setHourlyRate(Double.parseDouble((String)rateCombo.getSelectedItem()));
                }

                String tempFile = "coachTemp1.txt";

                File oldFile = new File("coach.txt");
                File newFile = new File(tempFile);
                try {
                    FileWriter fw = new FileWriter(tempFile, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);
                    x = new Scanner(new File("coach.txt"));

                    while (x.hasNextLine()) {
                        String coach_ID = x.nextLine();
                        String coach_AccName = x.nextLine();
                        String coach_Username = x.nextLine();
                        String coach_Password = x.nextLine();
                        String coach_DateJoined = x.nextLine();
                        String coach_Phone = x.nextLine();
                        String coach_Address = x.nextLine();
                        String coach_Center = x.nextLine();
                        String coach_Sport = x.nextLine();
                        double coach_Rate = Double.parseDouble(x.nextLine());
                        x.nextLine();

                        if (coach_ID.equals(MainClass.coach_Info.getUserID())) {
                            pw.println(coach_ID);
                            pw.println(MainClass.coach_Info.getUserAccName());
                            pw.println(MainClass.coach_Info.getUserName());
                            pw.println(MainClass.coach_Info.getUserPassword());
                            pw.println(MainClass.coach_Info.getUserDateJoined());
                            pw.println(MainClass.coach_Info.getUserContact());
                            pw.println(MainClass.coach_Info.getUserAddress());
                            pw.println(MainClass.coach_Info.getUserCenter());
                            pw.println(MainClass.coach_Info.getSport());
                            pw.println(MainClass.coach_Info.getHourlyRate());
                            pw.println();
                        } else {
                            pw.println(coach_ID);
                            pw.println(coach_AccName);
                            pw.println(coach_Username);
                            pw.println(coach_Password);
                            pw.println(coach_DateJoined);
                            pw.println(coach_Phone);
                            pw.println(coach_Address);
                            pw.println(coach_Center);
                            pw.println(coach_Sport);
                            pw.println(coach_Rate);
                            pw.println();
                        }
                    }
                    x.close();
                    pw.flush();
                    pw.close();
                    oldFile.delete();
                    File dump = new File("coach.txt");
                    newFile.renameTo(dump);

                    JOptionPane.showMessageDialog(this, "coach Info have been updated!");
                    MainClass.coach_Info = null;

                    removeText();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error, coach Info cannot be updated!");
                    MainClass.coach_Info = null;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error, coach Info cannot be updated!");
                MainClass.coach_Info = null;
            }
        } else {
            JOptionPane.showMessageDialog(this, "coach ID is invalid, please enter again!");
            MainClass.coach_Info = null;
        }
    }//GEN-LAST:event_updateCoachBtnActionPerformed

    private void deleteCoachBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCoachBtnActionPerformed
        String coachid = idTxt.getText();
        for (int i = 0; i < MainClass.coach.size(); i++) {
            CoachClass ac = MainClass.coach.get(i);
            if (ac.getUserID().equals(coachid)) {
                MainClass.coach_Info = ac;
                MainClass.coach.remove(ac);
                break;
            }
        }

        if (MainClass.coach_Info != null) {
            try {
                String tempFile = "coachTemp2.txt";
                File oldFile = new File("coach.txt");
                File newFile = new File(tempFile);

                try {
                    FileWriter fw = new FileWriter(tempFile, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);
                    x = new Scanner(new File("coach.txt"));

                    while (x.hasNextLine()) {
                        String coach_ID = x.nextLine();
                        String coach_AccName = x.nextLine();
                        String coach_Username = x.nextLine();
                        String coach_Password = x.nextLine();
                        String coach_DateJoined = x.nextLine();
                        String coach_Phone = x.nextLine();
                        String coach_Address = x.nextLine();
                        String coach_Center = x.nextLine();
                        String coach_Sport = x.nextLine();
                        double coach_Rate = Double.parseDouble(x.nextLine());
                        x.nextLine();

                        if (!coach_ID.equals(MainClass.coach_Info.getUserID())) {
                            pw.println(coach_ID);
                            pw.println(coach_AccName);
                            pw.println(coach_Username);
                            pw.println(coach_Password);
                            pw.println(coach_DateJoined);
                            pw.println(coach_Phone);
                            pw.println(coach_Address);
                            pw.println(coach_Center);
                            pw.println(coach_Sport);
                            pw.println(coach_Rate);
                            pw.println();
                        }
                    }
                    x.close();
                    pw.flush();
                    pw.close();
                    oldFile.delete();
                    File dump = new File("coach.txt");
                    newFile.renameTo(dump);

                    JOptionPane.showMessageDialog(this, "Coach Info have been deleted successfully!");
                    MainClass.coach_Info = null;

                    removeText();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error, Coach Info cannot be deleted!");
                    MainClass.coach_Info = null;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error, Coach Info cannot be deleted!");
                MainClass.coach_Info = null;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Coach ID is invalid, please enter again!");

            idTxt.setText("");
            idTxt.requestFocus();
        }
    }//GEN-LAST:event_deleteCoachBtnActionPerformed

    private void searchIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchIdTxtActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String coachid = searchIdTxt.getText();
        for (int i = 0; i < MainClass.coach.size(); i++) {
            CoachClass lc = MainClass.coach.get(i);
            if (lc.getUserID().equals(coachid)) {
                MainClass.coach_Info = lc;
                break;
            }
        }
        if (MainClass.coach_Info != null) {
            try {
                idTxt.setText(MainClass.coach_Info.getUserID());
                nameTxt.setText(MainClass.coach_Info.getUserAccName());
                usernameTxt.setText(MainClass.coach_Info.getUserName());
                passwordTxt.setText(MainClass.coach_Info.getUserPassword());

                String datejoined = MainClass.coach_Info.getUserDateJoined();
                Date Coach_DateJoined = new SimpleDateFormat("yyyy-MM-dd").parse(datejoined);
                dateJoinedChooser.setDate(Coach_DateJoined);

                phoneTxt.setText(MainClass.coach_Info.getUserContact());
                addressTxt.setText(MainClass.coach_Info.getUserAddress());
                sportCenterCombo.setSelectedItem(MainClass.coach_Info.getUserCenter());
                sportsCombo.setSelectedItem(MainClass.coach_Info.getSport());
                rateCombo.setSelectedItem(MainClass.coach_Info.getHourlyRate());

                MainClass.coach_Info = null;

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error, Coach cannot be found!");
                MainClass.coach_Info = null;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Coach ID is invalid, please enter again!");
            MainClass.coach_Info = null;
        }
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCoachBtn;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backBtn1;
    private javax.swing.JComboBox<String> centerCombo;
    private javax.swing.JButton clearBtn;
    private com.toedter.calendar.JDateChooser dateJoinedChooser;
    private javax.swing.JButton deleteCoachBtn;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JComboBox<String> rateCombo;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchIdTxt;
    private javax.swing.JComboBox<String> sportCenterCombo;
    private javax.swing.JComboBox<String> sportsCombo;
    private javax.swing.JButton updateCoachBtn;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
