package realchampionssportsacademysystem;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class AddAdminForm extends javax.swing.JFrame {

    public AddAdminForm() {
        initComponents();
        setVisible(false);
    }

    public void removeText() {
        adminIdTxt.setText("");
        nameTxt.setText("");
        usernameTxt.setText("");
        passwordTxt.setText("");
        phoneTxt.setText("");
        addressTxt.setText("");
        centerCombo.setSelectedItem(null);
        dateJoinedChooser.setCalendar(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        clearBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adminIdTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addCoachBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLable = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jLable1 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        centerCombo = new javax.swing.JComboBox<>();
        dateJoinedChooser = new com.toedter.calendar.JDateChooser();
        backBtn = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        jLabel7.setText("Address");

        jLabel8.setText("Sport Centre ");

        jLabel2.setText("Admin ID");

        jLabel3.setText("Admin Name");

        adminIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminIdTxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Register New Admin");

        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });

        jLabel5.setText("Date Joined");

        addCoachBtn.setText("Add");
        addCoachBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCoachBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Phone");

        jLable.setText("Admin Password");

        jLable1.setText("Username");

        centerCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kuala Lumpur", "Penang", "Malacca", "Sabah" }));

        dateJoinedChooser.setDateFormatString("dd-MM-yyyy");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLable)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLable1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addressTxt)
                        .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordTxt)
                        .addComponent(adminIdTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                        .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                        .addComponent(usernameTxt)
                        .addComponent(centerCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(dateJoinedChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(addCoachBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(adminIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLable1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateJoinedChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(centerCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCoachBtn)
                    .addComponent(clearBtn)
                    .addComponent(backBtn))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        removeText();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void adminIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminIdTxtActionPerformed

    }//GEN-LAST:event_adminIdTxtActionPerformed

    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed

    }//GEN-LAST:event_phoneTxtActionPerformed

    private void addCoachBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoachBtnActionPerformed

            String admin_ID = adminIdTxt.getText();
            
            for (int i = 0; i < MainClass.admin.size(); i++) {
                AdminClass ac = MainClass.admin.get(i);
                if (ac.getUserID().equals(admin_ID)) {
                    MainClass.admin_Info = ac;
                    break;
                }
            }

            if (MainClass.admin_Info == null) {
                String admin_AccName = nameTxt.getText();
                String admin_Username = usernameTxt.getText();
                String admin_Password = passwordTxt.getText();

                Date admindatejoined = dateJoinedChooser.getDate();
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String admin_DateJoined = dateFormat.format(admindatejoined);

                String admin_Contact = phoneTxt.getText();
                String admin_Address = addressTxt.getText();
                String admin_Center = (String) centerCombo.getSelectedItem();

                AdminClass ac = new AdminClass(admin_ID, admin_AccName, admin_Username, admin_Password, admin_DateJoined, admin_Contact, admin_Address, admin_Center);
                MainClass.admin.add(ac);

                try {
                    PrintWriter pAdmin = new PrintWriter("admin.txt");
                    for (int i = 0; i < MainClass.admin.size(); i++) {
                        AdminClass c = MainClass.admin.get(i);
                        pAdmin.println(c.getUserID());
                        pAdmin.println(c.getUserAccName());
                        pAdmin.println(c.getUserName());
                        pAdmin.println(c.getUserPassword());
                        pAdmin.println(c.getUserDateJoined());
                        pAdmin.println(c.getUserContact());
                        pAdmin.println(c.getUserAddress());
                        pAdmin.println(c.getUserCenter());
                        pAdmin.println();
                    }
                    pAdmin.close();
                    JOptionPane.showMessageDialog(this, "Admin has been successfully added!");

                    removeText();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error, Admin cannot be added!");
                }

            } else {
                JOptionPane.showMessageDialog(this, "AdminID is repeated, please enter again!");
                MainClass.admin_Info = null;

                adminIdTxt.setText("");
                adminIdTxt.requestFocus();
            }
        /*} else {
            JOptionPane.showMessageDialog(this, "Please fill in all the details!");
        }*/
    }//GEN-LAST:event_addCoachBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        new AdminMenuForm().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCoachBtn;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField adminIdTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> centerCombo;
    private javax.swing.JButton clearBtn;
    private com.toedter.calendar.JDateChooser dateJoinedChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLable;
    private javax.swing.JLabel jLable1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
