/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Class.Patient;
import Class.Person;
import Class.PersonDirectory;
import Class.VitalSign;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ram.a
 */
public class managevitals extends javax.swing.JPanel {

    /**
     * Creates new form CreateVitalSignJPanel
     */
    private Patient patient;
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    
    
    public managevitals(JPanel upc, Patient patient, PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer = upc;
        this.patient = patient;
        this.personDirectory = personDirectory;
        ArrayList<Person> personList = personDirectory.getPersonHistory();
        populatePatientsTable(personList);
        populateVitalSignTable(null);
        //addVerifiers();
    }
   
     private void populatePatientsTable(ArrayList<Person> personList) {
        DefaultTableModel model = (DefaultTableModel) viewPatientsJTable.getModel();
        model.setRowCount(0);
        if(personList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Persons found. Please add Persons",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Person person : personList) {
            Object[] row = new Object[3];
            row[0] = person;
            row[1]= person.getAge();
            if(person.getPatient()!=null)
            {
                row[2] = person.getPatient().getPatientID();
            }
            else
            {
                row[2] = "Patient Not Created";
            }
            
            model.addRow(row);
        }
    }
     private String VitalSignStatus(int patientAge, VitalSign vitalSign) {
        String vitalSignStatus = "Normal";
        
        
        int bloodPressure = vitalSign.getBloodPressure();
     
        
        /*Toddler*/
        if (patientAge >= 1 && patientAge <= 5) {
            if 
                    (bloodPressure < 80 || bloodPressure > 110) 
                     {
                vitalSignStatus = "Abnormal";
            }
        }
        
        /*School Age*/
        if (patientAge >= 6 && patientAge <= 12) {
            if (bloodPressure < 80 || bloodPressure >120) {
                vitalSignStatus = "Abnormal";
            }
        }
        /*Adolescent*/
        if (patientAge >= 13) {
            if (bloodPressure < 110 || bloodPressure > 120) {
                vitalSignStatus = "Abnormal";
            }
        }
        return vitalSignStatus;
    }
    
      private void populateVitalSignTable(Person person) {
        
        DefaultTableModel model = (DefaultTableModel) viewVitalSignsJTable.getModel();
        model.setRowCount(0);
        if (person != null) {
            int patientAge = person.getAge();
            ArrayList<VitalSign> vitalSignList = person.getPatient().getVitalSignHistory().getHistory();
            
            if (vitalSignList.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No vital signs found. Please"
                        + " add vital signs", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            for (VitalSign vitalSign : vitalSignList) {
                Object[] row = new Object[2];
                row[0] = vitalSign;
                row[1] = VitalSignStatus(patientAge, vitalSign);
                model.addRow(row);
            }
        }
    }
     private void refreshVialSigns() {
        int selectedRow = viewPatientsJTable.getSelectedRow();
        if (selectedRow < 0) {
            populateVitalSignTable(null);
        } else {
            Person person = (Person) viewPatientsJTable.getValueAt(selectedRow, 0);
            Patient patient= person.getPatient();
            if(patient!=null)
            {
                populateVitalSignTable(person);
            }
            else
            {
                populateVitalSignTable(null);
            }
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

        backJButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewPatientsJTable = new javax.swing.JTable();
        refreshPatientsJButton = new javax.swing.JButton();
        searchPatientJButton = new javax.swing.JButton();
        searchBoxJTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewVitalSignsJTable = new javax.swing.JTable();
        editVitalSignsJButton = new javax.swing.JButton();
        deleteVitalSignJButton = new javax.swing.JButton();
        refreshVitalSignsJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 0));

        backJButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backJButton1.setText("Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        viewPatientsJTable.setBorder(new javax.swing.border.MatteBorder(null));
        viewPatientsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "Patient ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewPatientsJTable.setGridColor(new java.awt.Color(51, 0, 51));
        viewPatientsJTable.setShowGrid(true);
        jScrollPane1.setViewportView(viewPatientsJTable);

        refreshPatientsJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        refreshPatientsJButton.setText("Get Patients");
        refreshPatientsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshPatientsJButtonActionPerformed(evt);
            }
        });

        searchPatientJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        searchPatientJButton.setText("Search Patient");
        searchPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientJButtonActionPerformed(evt);
            }
        });

        viewVitalSignsJTable.setBorder(new javax.swing.border.MatteBorder(null));
        viewVitalSignsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Encounter history", "Patient Status", "Patient ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewVitalSignsJTable.setGridColor(new java.awt.Color(51, 0, 51));
        viewVitalSignsJTable.setShowGrid(true);
        jScrollPane2.setViewportView(viewVitalSignsJTable);

        editVitalSignsJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        editVitalSignsJButton.setText("Edit Vitals");
        editVitalSignsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editVitalSignsJButtonActionPerformed(evt);
            }
        });

        deleteVitalSignJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deleteVitalSignJButton.setText("Delete Vital Sign");
        deleteVitalSignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteVitalSignJButtonActionPerformed(evt);
            }
        });

        refreshVitalSignsJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        refreshVitalSignsJButton.setText("Get Vitals");
        refreshVitalSignsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshVitalSignsJButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setText("Add vitals");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refreshPatientsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchPatientJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(backJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refreshVitalSignsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editVitalSignsJButton)
                            .addComponent(deleteVitalSignJButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(searchPatientJButton)
                    .addComponent(searchBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editVitalSignsJButton)
                    .addComponent(backJButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshVitalSignsJButton)
                    .addComponent(refreshPatientsJButton)
                    .addComponent(deleteVitalSignJButton))
                .addContainerGap(441, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void refreshPatientsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshPatientsJButtonActionPerformed
        // TODO add your handling code here:
        searchBoxJTextField.setText("");
        populatePatientsTable(personDirectory.getPersonHistory());
    }//GEN-LAST:event_refreshPatientsJButtonActionPerformed

    private void searchPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatientJButtonActionPerformed
        // TODO add your handling code here:
        String key = searchBoxJTextField.getText().trim();
        if(key.length()==0)
        {
            JOptionPane.showMessageDialog(this, "Please enter key.","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        /*Storing searched patients in an array to display in table.*/
        ArrayList<Person> searchPatients = personDirectory.searchPatient(key);
        populatePatientsTable(searchPatients);
    }//GEN-LAST:event_searchPatientJButtonActionPerformed

    private void editVitalSignsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editVitalSignsJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewVitalSignsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        VitalSign vitalSign = (VitalSign) viewVitalSignsJTable.getValueAt(selectedRow, 0);
        
        viewvitals vv = new viewvitals(userProcessContainer,
                vitalSign, Boolean.TRUE);
        userProcessContainer.add("vv", vv);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        
    }//GEN-LAST:event_editVitalSignsJButtonActionPerformed

    private void deleteVitalSignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteVitalSignJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewPatientsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.");
            return;
        }
        Person person = (Person) viewPatientsJTable.getValueAt(selectedRow, 0);
        Patient patient= person.getPatient();
        if(patient==null)
        {
            JOptionPane.showMessageDialog(this, "Patient not created, Please create"
                + " Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        selectedRow = viewVitalSignsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        VitalSign vitalSign = (VitalSign) viewVitalSignsJTable.getValueAt(selectedRow, 0);

        int flag= JOptionPane.showConfirmDialog(this, "Are you sure want to remove?",
            "Warning", JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            patient.getVitalSignHistory().deleteVitalSign(vitalSign);
            refreshVialSigns();
        }
    }//GEN-LAST:event_deleteVitalSignJButtonActionPerformed

    private void refreshVitalSignsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshVitalSignsJButtonActionPerformed
        // TODO add your handling code here:
        refreshVialSigns();
    }//GEN-LAST:event_refreshVitalSignsJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int selectedRow = viewPatientsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person = (Person) viewPatientsJTable.getValueAt(selectedRow, 0);
        Patient patient= person.getPatient();
        if(patient!=null)
        {
            createvitals cv = new createvitals(userProcessContainer, patient);
            userProcessContainer.add("cvsJPanel", cv);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Patient not created, Please create"
                    + " Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton deleteVitalSignJButton;
    private javax.swing.JButton editVitalSignsJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshPatientsJButton;
    private javax.swing.JButton refreshVitalSignsJButton;
    private javax.swing.JTextField searchBoxJTextField;
    private javax.swing.JButton searchPatientJButton;
    private javax.swing.JTable viewPatientsJTable;
    private javax.swing.JTable viewVitalSignsJTable;
    // End of variables declaration//GEN-END:variables
}
