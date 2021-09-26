/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Flow.info;
import java.awt.Color;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;

/**
 *
 * @author ram.a
 */
public class DisplayPanel extends javax.swing.JPanel {
    /**
     * Creates new form DisplayPanel
     */
    info Info;
    public DisplayPanel(info Info) {
        initComponents();
        this.Info=Info;
        viewdisplay();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        lblTitle = new javax.swing.JLabel();
        txtssn = new javax.swing.JTextField();
        txtHealth = new javax.swing.JTextField();
        txtBank = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblName = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblTelephone = new javax.swing.JLabel();
        lblFax = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblssn = new javax.swing.JLabel();
        lblLinkedin = new javax.swing.JLabel();
        lblHealth = new javax.swing.JLabel();
        lblBank = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtdevice = new javax.swing.JTextField();
        txtFax = new javax.swing.JTextField();
        txtmrno = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        lblmrno = new javax.swing.JLabel();
        txtLinkedin = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lbldevice = new javax.swing.JLabel();
        lblip = new javax.swing.JLabel();
        txtip = new javax.swing.JTextField();
        txtlicense = new javax.swing.JTextField();
        lblLicense = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtplate = new javax.swing.JTextField();
        lblphoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));

        lblTitle.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Profile");

        txtssn.setForeground(new java.awt.Color(255, 102, 102));
        txtssn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtssn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtssnActionPerformed(evt);
            }
        });

        txtHealth.setForeground(new java.awt.Color(255, 102, 102));
        txtHealth.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtHealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHealthActionPerformed(evt);
            }
        });

        txtBank.setForeground(new java.awt.Color(255, 102, 102));
        txtBank.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jDateChooser1.setForeground(new java.awt.Color(255, 102, 102));

        lblName.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        lblName.setText("Name");

        lblCountry.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        lblCountry.setText("Country");

        lblDob.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        lblDob.setText("DOB");

        lblTelephone.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        lblTelephone.setText("Telephone");

        lblFax.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        lblFax.setText("FAX");

        lblEmail.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        lblEmail.setText("Email");

        lblssn.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        lblssn.setText("SSN");

        lblLinkedin.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        lblLinkedin.setText("Linkedin");

        lblHealth.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        lblHealth.setText("Health B. No");

        lblBank.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        lblBank.setText("Bank AC");

        txtName.setForeground(new java.awt.Color(255, 102, 102));
        txtName.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtCountry.setForeground(new java.awt.Color(255, 102, 102));
        txtCountry.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtdevice.setForeground(new java.awt.Color(255, 102, 102));
        txtdevice.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtFax.setForeground(new java.awt.Color(255, 102, 102));
        txtFax.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtmrno.setForeground(new java.awt.Color(255, 102, 102));
        txtmrno.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtTelephone.setForeground(new java.awt.Color(255, 102, 102));
        txtTelephone.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelephoneActionPerformed(evt);
            }
        });

        lblmrno.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        lblmrno.setText("Medical Rec No");

        txtLinkedin.setForeground(new java.awt.Color(255, 102, 102));
        txtLinkedin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtEmail.setForeground(new java.awt.Color(255, 102, 102));
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbldevice.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        lbldevice.setText("Device Identifier");

        lblip.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        lblip.setText("IP4 Address");

        txtip.setForeground(new java.awt.Color(255, 102, 102));
        txtip.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtipActionPerformed(evt);
            }
        });

        txtlicense.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtlicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlicenseActionPerformed(evt);
            }
        });
        txtlicense.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtlicenseKeyReleased(evt);
            }
        });

        lblLicense.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        lblLicense.setText("License Number");

        jLabel3.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel3.setText("Vehicle L.Plate");

        txtplate.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplateActionPerformed(evt);
            }
        });
        txtplate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtplateKeyReleased(evt);
            }
        });

        lblphoto.setBackground(new java.awt.Color(153, 153, 153));
        lblphoto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblHealth)
                                        .addComponent(lblBank, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblmrno)))
                                .addComponent(lbldevice, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblip, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLinkedin)
                            .addComponent(txtHealth)
                            .addComponent(txtBank)
                            .addComponent(txtdevice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtmrno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtip)
                            .addComponent(txtplate)
                            .addComponent(txtlicense)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(519, 519, 519))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDob, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelephone)
                            .addComponent(lblFax, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblssn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFax)
                            .addComponent(txtEmail)
                            .addComponent(txtssn)
                            .addComponent(txtCountry)
                            .addComponent(txtTelephone)
                            .addComponent(txtName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 910, Short.MAX_VALUE)))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1221, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCountry))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelephone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFax))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblssn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtplate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicense)
                    .addComponent(txtlicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinkedin)
                    .addComponent(txtLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHealth)
                    .addComponent(txtHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBank))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmrno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmrno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdevice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldevice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblip)
                    .addComponent(txtip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtssnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtssnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtssnActionPerformed

    private void txtHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHealthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHealthActionPerformed

    private void txtTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelephoneActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTelephoneActionPerformed

    private void txtipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtipActionPerformed

    private void txtlicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlicenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlicenseActionPerformed

    private void txtlicenseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlicenseKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[A-Za-z][0-9/\\W/]{2,20}$";
        Pattern p = Pattern.compile(PATTERN);
        Matcher match = p.matcher(txtlicense.getText());
        if(!match.matches()){
            txtlicense.setBackground(Color.red);

        }
        else{
            txtlicense.setBackground(Color.white);
            
        }
    }//GEN-LAST:event_txtlicenseKeyReleased

    private void txtplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplateActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtplateActionPerformed

    private void txtplateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtplateKeyReleased
        // TODO add your handling code here:
        String PATTERN = "[A-HJ-NPR-Z0-9]{17}$";
        Pattern p = Pattern.compile(PATTERN);
        Matcher match = p.matcher(txtplate.getText());
        if(!match.matches()){
            txtplate.setBackground(Color.red);

        }
        else{
            txtplate.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtplateKeyReleased

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBank;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblHealth;
    private javax.swing.JLabel lblLicense;
    private javax.swing.JLabel lblLinkedin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lbldevice;
    private javax.swing.JLabel lblip;
    private javax.swing.JLabel lblmrno;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JLabel lblssn;
    private java.awt.List list1;
    private javax.swing.JTextField txtBank;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtHealth;
    private javax.swing.JTextField txtLinkedin;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtdevice;
    private javax.swing.JTextField txtip;
    private javax.swing.JTextField txtlicense;
    private javax.swing.JTextField txtmrno;
    private javax.swing.JTextField txtplate;
    private javax.swing.JTextField txtssn;
    // End of variables declaration//GEN-END:variables

    private void viewdisplay() {
        
        txtBank.setText(Info.getBankac());
        txtBank.setEditable(false);
        jDateChooser1.setEnabled(false);
        txtCountry.setText(Info.getCountry());txtCountry.setEditable(false);
        txtEmail.setText(Info.getEmail());txtEmail.setEditable(false);
        txtFax.setText(Info.getFax()); txtFax.setEditable(false);
        jDateChooser1.setDate(Info.getDob()); 
        txtmrno.setText(Info.getMrn()); txtmrno.setEditable(false);
        txtName.setText(Info.getName()); txtName.setEditable(false);
        txtLinkedin.setText(Info.getLinkedin()); txtLinkedin.setEditable(false);
        txtssn.setText(Info.getSsn());txtssn.setEditable(false);
        txtip.setText(Info.getIp());txtip.setEditable(false);
        txtTelephone.setText(Info.getPhone());txtTelephone.setEditable(false);
        txtdevice.setText(Info.getDevice());txtdevice.setEditable(false);
        ImageIcon imgicn = new ImageIcon(Info.getImg_src());  
        Image img = imgicn.getImage();
        lblphoto.setIcon(new ImageIcon(img)); 
  }
}