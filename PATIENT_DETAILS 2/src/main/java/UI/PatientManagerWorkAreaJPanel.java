/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Class.Patient;
import Class.Person;
import Class.PersonDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ram.a
 */
public class PatientManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientManagerWorkAreaJPanel
     */
     private PersonDirectory personDirectory;
     private Person  person;
     private Patient patient;
     private JPanel userProcessContainer;
    
    public PatientManagerWorkAreaJPanel(JPanel userProcessContainer,
        PersonDirectory personDirectory, Person person ) {
        initComponents();
        ArrayList<Person> personList = personDirectory.getPersonHistory();
        populatePatientsTable(personList);
        this.userProcessContainer=userProcessContainer;
        this.personDirectory= personDirectory;
        this.person = person;
        this.patient = patient;
    }
   
    private void populatePatientsTable(ArrayList<Person> personList) {
        DefaultTableModel model = (DefaultTableModel) viewPersonsJTable.getModel();
        model.setRowCount(0);
        if(personList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Persons found. Please add Persons",
                    "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Person person : personList) {
            Object[] row = new Object[4];
            row[0] = person;
            row[1]= person.getAge();
            row[3] = person.getCommunity();
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
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewPersonsJTable = new javax.swing.JTable();
        editPatientJButton = new javax.swing.JButton();
        deletePatientJButton = new javax.swing.JButton();
        searchBoxJTextField = new javax.swing.JTextField();
        searchPatientJButton = new javax.swing.JButton();
        btnvitals = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 0));

        backJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backJButton.setText("BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        refreshJButton.setText("Get data");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        viewPersonsJTable.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        viewPersonsJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(viewPersonsJTable);

        editPatientJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        editPatientJButton.setText("EDIT");
        editPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPatientJButtonActionPerformed(evt);
            }
        });

        deletePatientJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deletePatientJButton.setText("DELETE");
        deletePatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePatientJButtonActionPerformed(evt);
            }
        });

        searchPatientJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        searchPatientJButton.setText("SEARCH");
        searchPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientJButtonActionPerformed(evt);
            }
        });

        btnvitals.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnvitals.setText("Manage vitals");
        btnvitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvitalsActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setText("Create Patient");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editPatientJButton)
                                .addGap(31, 31, 31)
                                .addComponent(deletePatientJButton)
                                .addGap(117, 117, 117)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchPatientJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnvitals)
                                .addGap(44, 44, 44))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchPatientJButton)
                    .addComponent(searchBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnvitals)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPatientJButton)
                    .addComponent(deletePatientJButton)
                    .addComponent(refreshJButton)
                    .addComponent(backJButton))
                .addContainerGap(185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        searchBoxJTextField.setText("");
        populatePatientsTable(personDirectory.getPersonHistory());
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void editPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPatientJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person = (Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        
        Patient patient= person.getPatient();
        if(patient!=null)
        {
            /*ViewUpdatePatientDetailsJPanel vupdJPanel=
            new ViewUpdatePatientDetailsJPanel(userProcessContainer, patient,Boolean.TRUE);
            userProcessContainer.add("vupdJPanel", vupdJPanel);
            CardLayout layout=(CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);*/
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Patient not created, "
                + "Please create Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editPatientJButtonActionPerformed

    private void deletePatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePatientJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        Patient patient=person.getPatient();
        if(patient==null)
        {
            JOptionPane.showMessageDialog(this, "Patient not created. Cannot delete",
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        /*Ask confirmation*/
        int flag= JOptionPane.showConfirmDialog(this, "Are you sure want to remove?",
            "Warning", JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            person.setPatient(null);
            populatePatientsTable(personDirectory.getPersonHistory());
        }
    }//GEN-LAST:event_deletePatientJButtonActionPerformed

    private void searchPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatientJButtonActionPerformed
        // TODO add your handling code here:
        String key= searchBoxJTextField.getText().trim();
        if(key.length()==0)
        {
            JOptionPane.showMessageDialog(this, "Please enter key.", "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList<Person> searchPatients;
        searchPatients=personDirectory.searchPatient(key);
        populatePatientsTable(searchPatients);
    }//GEN-LAST:event_searchPatientJButtonActionPerformed

    private void btnvitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvitalsActionPerformed
        // TODO add your handling code here:
        managevitals cvs= 
                new managevitals(userProcessContainer, patient, personDirectory);
        userProcessContainer.add("mvsJPanel", cvs);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnvitalsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
       int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        if(person.getPatient()!=null)
        {
            JOptionPane.showMessageDialog(this, "Paient already exists.","Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        Createpatient cpJPanel= new Createpatient(userProcessContainer, person);
        userProcessContainer.add("cpJPanel", cpJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnvitals;
    private javax.swing.JButton deletePatientJButton;
    private javax.swing.JButton editPatientJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextField searchBoxJTextField;
    private javax.swing.JButton searchPatientJButton;
    private javax.swing.JTable viewPersonsJTable;
    // End of variables declaration//GEN-END:variables
}