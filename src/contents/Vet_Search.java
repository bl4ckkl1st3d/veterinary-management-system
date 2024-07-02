package contents;

import softeng.VetPageEdit;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.krysalis.barcode4j.impl.code39.Code39Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalDate;
import java.time.Period;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import swing.ScrollBar;

/**
 *
 * @author Richard Reynald
 */
public class Vet_Search extends javax.swing.JPanel {

    private int realUserId;
    private String pName;
    private String oName;
    private String contacts;
    private String strCodeText;
    private String barImgPath = "c:/temp/code39.jpg";
    
    public Vet_Search(int realUserId) {
        initComponents();
        this.realUserId = realUserId;
        sp.setVerticalScrollBar(new ScrollBar());
        sp.setHorizontalScrollBar(new ScrollBar());
        patientIdTxtField.requestFocus();
    }

    private static final String DATABASE_NAME = "database";
    private static final String dbUsername = "root";
    private static final String dbPassword = "admin";
    private static final String MYSQL_SERVER_HOSTNAME = "DESKTOP-MVBR3DH"; // Replace with your MySQL server's hostname
    private static final int MYSQL_SERVER_PORT = 3306;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        medicalHistoryTable = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        vaccineHistoryTable = new javax.swing.JTable();
        patientIdTxtField = new swing.TextField();
        patientTxtField = new swing.TextField();
        weightTxt = new swing.TextField();
        typeTxtField = new swing.TextField();
        breedTxtField = new swing.TextField();
        ageTxt = new swing.TextField();
        colorTxtField = new swing.TextField();
        marksTxtField = new swing.TextField();
        sexComboBox = new swing.Combobox();
        nameTxtField = new swing.TextField();
        addressTxtField = new swing.TextField();
        contactTxtField = new swing.TextField();
        vetButton1 = new swing.VetButton();
        vetButton2 = new swing.VetButton();
        vetButton3 = new swing.VetButton();

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("MEDICAL HISTORY");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("OWNER INFORMATION");

        medicalHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Diagnosis", "Treatment", "Medication", "Visit Date", "Attending Doctor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(medicalHistoryTable);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("PATIENT INFORMATION");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("VACCINE HISTORY");

        vaccineHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Vaccination Date", "Next Due Date", "Administered By"
            }
        ));
        jScrollPane4.setViewportView(vaccineHistoryTable);

        patientIdTxtField.setLabelText("Patient ID");

        patientTxtField.setLabelText("Patient Name");

        weightTxt.setLabelText("Weight");

        typeTxtField.setLabelText("Type");

        breedTxtField.setLabelText("Breed");

        ageTxt.setLabelText("Age");

        colorTxtField.setLabelText("Color");

        marksTxtField.setLabelText("Marks");

        sexComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE", " " }));
        sexComboBox.setSelectedIndex(-1);
        sexComboBox.setLabelText("Sex");

        nameTxtField.setLabelText("Name");

        addressTxtField.setLabelText("Address");

        contactTxtField.setLabelText("Contact No.");

        vetButton1.setText("Patient Card");
        vetButton1.setRadius(25);
        vetButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetButton1ActionPerformed(evt);
            }
        });

        vetButton2.setText("Search");
        vetButton2.setRadius(25);
        vetButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetButton2ActionPerformed(evt);
            }
        });

        vetButton3.setText("Clear");
        vetButton3.setRadius(25);
        vetButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addressTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(contactTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20)
                            .addComponent(jLabel25)
                            .addComponent(jLabel17))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(breedTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(weightTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(patientTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(typeTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(131, 131, 131)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sexComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(colorTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(marksTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(vetButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(vetButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(patientIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(vetButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(126, 227, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(patientIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vetButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vetButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vetButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(breedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marksTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(addressTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(contactTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        sp.setViewportView(jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void clearTextFields() {
        patientTxtField.setText("");
        ageTxt.setText("");
        weightTxt.setText("");
        typeTxtField.setText("");
        colorTxtField.setText("");
        breedTxtField.setText("");
        marksTxtField.setText("");
        sexComboBox.setSelectedIndex(-1);

        nameTxtField.setText("");
        addressTxtField.setText("");
        contactTxtField.setText("");
    }


   private void searchPatient() {
        String patientIdText = patientIdTxtField.getText();

        if (patientIdText.isEmpty()) {
            // Clear all text fields if the patient ID is empty
            clearTextFields();
            return;
        }

        String patientId = patientIdText;

        String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;

        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Retrieve patient information
            String patientQuery = "SELECT * FROM patient_information WHERE barcode = ?";
            PreparedStatement patientStmt = connection.prepareStatement(patientQuery);
            patientStmt.setString(1, patientId);
            ResultSet patientResultSet = patientStmt.executeQuery();

            if (patientResultSet.next()) {
                // Set the patient information to text fields
                patientTxtField.setText(patientResultSet.getString("patient_name"));
                strCodeText = patientResultSet.getString("barcode");
                LocalDate pDay = patientResultSet.getDate("bday").toLocalDate();
                LocalDate currentDate = LocalDate.now();
                Period ageCalc = Period.between(pDay, currentDate);
                int years = ageCalc.getYears();
                int months = ageCalc.getMonths();
                String ageText;
                if (years > 0) {
                    ageText = years + " year(s)";
                    if (months > 0) {
                        ageText += " and " + months + " month(s)";
                    }
                } else {
                    ageText = months + " month(s)";
                }
                // Set the text
                ageTxt.setText(ageText);

                weightTxt.setText(String.valueOf(patientResultSet.getFloat("weight")));
                typeTxtField.setText(patientResultSet.getString("type"));
                colorTxtField.setText(patientResultSet.getString("color"));
                breedTxtField.setText(patientResultSet.getString("breed"));
                marksTxtField.setText(patientResultSet.getString("marks"));
                sexComboBox.setSelectedItem(patientResultSet.getString("sex").equals("M") ? "MALE" : "FEMALE");
                pName = patientResultSet.getString("patient_name");

                String clientName = patientResultSet.getString("client_name");

                // Retrieve client information
                String clientQuery = "SELECT * FROM client_information WHERE client_name = ?";
                PreparedStatement clientStmt = connection.prepareStatement(clientQuery);
                clientStmt.setString(1, clientName);
                ResultSet clientResultSet = clientStmt.executeQuery();

                if (clientResultSet.next()) {
                    // Set the client information to text fields
                    nameTxtField.setText(clientResultSet.getString("client_name"));
                    addressTxtField.setText(clientResultSet.getString("address"));
                    contactTxtField.setText(clientResultSet.getString("contact"));
                    oName = (clientResultSet.getString("client_name"));
                    contacts = (clientResultSet.getString("contact"));
                }

                clientStmt.close();
                clientResultSet.close();
            } else {
                // If no patient found, clear all text fields
                JOptionPane.showMessageDialog(null, "Patient not Found");
                clearTextFields();
            }

            patientStmt.close();
            patientResultSet.close();
            connection.close();
        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

   
    public void updateMedicalHistoryTable() {
        // Get the patient ID from the patientIdTxtField
        String patientId = patientIdTxtField.getText();

       String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;

        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Query to fetch medical history information for the specified patient ID
            String query = "SELECT diagnosis, treatment, medications, visit_date, doctor_name FROM medical_history WHERE barcode = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, patientId);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Create a DefaultTableModel to hold the medical history data
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Diagnosis");
            model.addColumn("Treatment");
            model.addColumn("Medication");
            model.addColumn("Visit Date");
            model.addColumn("Attending Doctor");
            // Populate the model with the retrieved data
            while (resultSet.next()) {
                String diagnosis = resultSet.getString("diagnosis");
                String treatment = resultSet.getString("treatment");
                String medications = resultSet.getString("medications");
                String visitDate = resultSet.getString("visit_date");
                String attendingDoctor = resultSet.getString("doctor_name");

                model.addRow(new Object[]{diagnosis, treatment, medications, visitDate, attendingDoctor});
            }

            // Set the model for the medicalHistoryTable
            medicalHistoryTable.setModel(model);

            // Close the result set, statement, and connection
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
        }
    }

    public void updateVaccineHistoryTable() {
        // Get the patient ID from the patientIdTxtField
        String patientId = patientIdTxtField.getText();

        String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;

        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Query to fetch vaccine history information for the specified patient ID
            String query = "SELECT vaccine_name, vaccination_date, next_due_date, administered_by FROM vaccine_history WHERE barcode = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, patientId);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Create a DefaultTableModel to hold the vaccine history data
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Vaccine Name");
            model.addColumn("Vaccination Date");
            model.addColumn("Next Due Date");
            model.addColumn("Administered By");

            // Populate the model with the retrieved data
            while (resultSet.next()) {
                String vaccineName = resultSet.getString("vaccine_name");
                String vaccinationDate = resultSet.getString("vaccination_date");
                String dueDate = resultSet.getString("next_due_date");
                String administeredBy = resultSet.getString("administered_by");

                model.addRow(new Object[]{vaccineName, vaccinationDate, dueDate, administeredBy});
            }

            // Set the model for the vaccineHistoryTable
            vaccineHistoryTable.setModel(model);

            // Close the result set, statement, and connection
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
        }
    }



    private void clearTables() {
        DefaultTableModel dm = (DefaultTableModel) medicalHistoryTable.getModel();
        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }

        DefaultTableModel dm1 = (DefaultTableModel) vaccineHistoryTable.getModel();
        while (dm1.getRowCount() > 0) {
            dm1.removeRow(0);
        }
    }

    private void vetButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetButton1ActionPerformed
        Vet_PatientCard card =  new Vet_PatientCard(pName,oName,contacts,strCodeText);
        System.out.println(strCodeText);
        card.setLocationRelativeTo(null);
        card.setVisible(true);
        card.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_vetButton1ActionPerformed

    private void vetButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetButton2ActionPerformed
        searchPatient();
        updateMedicalHistoryTable();
        updateVaccineHistoryTable();
    }//GEN-LAST:event_vetButton2ActionPerformed

    private void vetButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetButton3ActionPerformed
        clearTextFields();
        clearTables();
        patientIdTxtField.setText("");
        patientIdTxtField.requestFocus();
    }//GEN-LAST:event_vetButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.TextField addressTxtField;
    private swing.TextField ageTxt;
    private swing.TextField breedTxtField;
    private swing.TextField colorTxtField;
    private swing.TextField contactTxtField;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private swing.TextField marksTxtField;
    private javax.swing.JTable medicalHistoryTable;
    private swing.TextField nameTxtField;
    private swing.TextField patientIdTxtField;
    private swing.TextField patientTxtField;
    private swing.Combobox sexComboBox;
    private javax.swing.JScrollPane sp;
    private swing.TextField typeTxtField;
    private javax.swing.JTable vaccineHistoryTable;
    private swing.VetButton vetButton1;
    private swing.VetButton vetButton2;
    private swing.VetButton vetButton3;
    private swing.TextField weightTxt;
    // End of variables declaration//GEN-END:variables
}
