package contents;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import softeng.PatientCard;
import softeng.VetPageAdd;
import swing.ScrollBar;

/**
 *
 * @author Richard Reynald
 */
public class Vet_Add extends javax.swing.JPanel {

    private int realUserId;

    public Vet_Add(int realUserId) {
        initComponents();
        String strCodeText = UUID.randomUUID().toString().substring(0, 8).toUpperCase(); // Generate a random 8-character string
        barField.setText(strCodeText);
        this.realUserId = realUserId;
        sp.setVerticalScrollBar(new ScrollBar());
        sp.setHorizontalScrollBar(new ScrollBar());
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
        patientTxtField = new swing.TextField();
        weightTxt = new swing.TextField();
        typeTxtField = new swing.TextField();
        breedTxtField = new swing.TextField();
        marksTxtField = new swing.TextField();
        colorTxtField = new swing.TextField();
        sexComboBox = new swing.Combobox();
        nameTxtField = new swing.TextField();
        addressTxtField = new swing.TextField();
        numberField = new swing.TextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        barField = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        vetButton1 = new swing.VetButton();
        bDay = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("PATIENT INFORMATION");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("OWNER INFORMATION");

        patientTxtField.setLabelText("Patient Name");

        weightTxt.setLabelText("Weight");

        typeTxtField.setLabelText("Type");

        breedTxtField.setLabelText("Breed");

        marksTxtField.setLabelText("Marks");

        colorTxtField.setLabelText("Color");

        sexComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        sexComboBox.setSelectedIndex(-1);
        sexComboBox.setLabelText("Sex");

        nameTxtField.setLabelText("Name");

        addressTxtField.setLabelText("Address");
        addressTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtFieldActionPerformed(evt);
            }
        });

        numberField.setLabelText("Contact No.");

        barField.setEditable(false);
        barField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jScrollPane3.setViewportView(barField);

        jLabel1.setText("Barcode");

        vetButton1.setText("Register");
        vetButton1.setRadius(25);
        vetButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Birthdate");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel17)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(breedTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(weightTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(typeTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(patientTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nameTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addressTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numberField, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                        .addGap(131, 131, 131)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sexComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(colorTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(marksTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vetButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDay, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(patientTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(addressTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vetButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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

    private void addressTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtFieldActionPerformed
    private boolean isValidNumber(String text) {
        // Check if the text matches the pattern "63#########"
        return text.matches("639\\d{9}");

    }

    private void clearTextFields() {
        patientTxtField.setText("");
        bDay.setDate(null);
        weightTxt.setText("");
        typeTxtField.setText("");
        colorTxtField.setText("");
        breedTxtField.setText("");
        marksTxtField.setText("");
        sexComboBox.setSelectedIndex(-1);
        nameTxtField.setText("");
        addressTxtField.setText("");
        numberField.setText("");
    }

    private void vetButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetButton1ActionPerformed
        String text = numberField.getText();
        System.out.println(text);
        String realNo = text.replace("+", "").replace("-", "");
        System.out.println(realNo);

        // Validate the text
        if (isValidNumber(realNo)) {
            addPatient();
            numberField.setText("639");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid number: Must be in the format '639#########'");
        }

    }//GEN-LAST:event_vetButton1ActionPerformed
    private void addPatient() {

        String patientName = patientTxtField.getText();
        java.util.Date bDayVal = bDay.getDate();

        String weight = weightTxt.getText();
        String type = typeTxtField.getText();
        String color = colorTxtField.getText();
        String breed = breedTxtField.getText();
        String marks = marksTxtField.getText();
        String sex = sexComboBox.getSelectedItem().toString().equals("MALE") ? "M" : "F";

        String clientName = nameTxtField.getText();
        String address = addressTxtField.getText();
        String contact = numberField.getText();
        String strCodeText = barField.getText();
        if (patientTxtField.getText().isEmpty() || bDayVal == null || type.isEmpty()
                || color.isEmpty() || breed.isEmpty() || marks.isEmpty() || clientName.isEmpty()
                || address.isEmpty() || contact.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: Complete all text fields");
        } else {
            java.sql.Date sqlbDay = new java.sql.Date(bDayVal.getTime());
            String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;

            try {
                // Establish the database connection
                Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

                // Check if the client exists
                String checkClientQuery = "SELECT * FROM client_information WHERE client_name = ?";
                PreparedStatement checkClientStmt = connection.prepareStatement(checkClientQuery);
                checkClientStmt.setString(1, clientName);
                ResultSet clientResultSet = checkClientStmt.executeQuery();

                // If client does not exist, insert into client_information table
                if (!clientResultSet.next()) {
                    String insertClientQuery = "INSERT INTO client_information (client_name, address, contact) VALUES (?, ?, ?)";
                    PreparedStatement insertClientStmt = connection.prepareStatement(insertClientQuery);
                    insertClientStmt.setString(1, clientName);
                    insertClientStmt.setString(2, address);
                    insertClientStmt.setString(3, contact);
                    insertClientStmt.executeUpdate();
                }

                // Insert into patient_information table
                String insertPatientQuery = "INSERT INTO patient_information (patient_name,barcode, weight, sex, type, color, breed, marks, client_name, registration_date, bday) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement insertPatientStmt = connection.prepareStatement(insertPatientQuery);
                insertPatientStmt.setString(1, patientName);
                insertPatientStmt.setString(2, strCodeText);
                insertPatientStmt.setFloat(3, Float.parseFloat(weight));
                insertPatientStmt.setString(4, sex);
                insertPatientStmt.setString(5, type);
                insertPatientStmt.setString(6, color);
                insertPatientStmt.setString(7, breed);
                insertPatientStmt.setString(8, marks);
                insertPatientStmt.setString(9, clientName);
                insertPatientStmt.setDate(10, new java.sql.Date(System.currentTimeMillis()));
                insertPatientStmt.setDate(11, sqlbDay); // Set the current date
                insertPatientStmt.executeUpdate();

                // Show success message
                int input = JOptionPane.showOptionDialog(
                        null,
                        "Information Added Successfully",
                        "Add User",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        new Object[]{"Yes"},
                        "Yes"
                );
                if (input == JOptionPane.YES_OPTION) {
                    PatientCard card = new PatientCard(patientName, clientName, contact, strCodeText);
                    System.out.println(strCodeText);
                    card.setLocationRelativeTo(null);
                    card.setVisible(true);
                    card.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                }
                clearTextFields();

                // Close the database connection
                connection.close();
            } catch (SQLException e) {
                // Handle any SQL exceptions
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    }

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
            java.util.logging.Logger.getLogger(VetPageAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VetPageAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VetPageAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VetPageAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int sample = 1;
                new VetPageAdd(sample).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.TextField addressTxtField;
    private com.toedter.calendar.JDateChooser bDay;
    private javax.swing.JTextPane barField;
    private swing.TextField breedTxtField;
    private swing.TextField colorTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private swing.TextField marksTxtField;
    private swing.TextField nameTxtField;
    private swing.TextField numberField;
    private swing.TextField patientTxtField;
    private swing.Combobox sexComboBox;
    private javax.swing.JScrollPane sp;
    private swing.TextField typeTxtField;
    private swing.VetButton vetButton1;
    private swing.TextField weightTxt;
    // End of variables declaration//GEN-END:variables
}
