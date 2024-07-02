package contents;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author Richard Reynald
 */
public class Admin_Backup extends javax.swing.JPanel {

    private int userId;
    
    public Admin_Backup(int UserId) {
        initComponents();
    }

    private static final String DATABASE_NAME = "database";
    private static final String dbUsername = "root";
    private static final String dbPassword = "admin";
    private static final String MYSQL_SERVER_HOSTNAME = "DESKTOP-MVBR3DH"; // Replace with your MySQL server's hostname
    private static final int MYSQL_SERVER_PORT = 3306;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        adminButton1 = new swing.AdminButton();
        adminButton2 = new swing.AdminButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        adminButton1.setText("Backup");
        adminButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton1ActionPerformed(evt);
            }
        });

        adminButton2.setText("Restore");
        adminButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(330, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(adminButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(adminButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private boolean restoreDatabase(String databaseName, String dbUsername, String dbPassword, String importPath) {
        try {
            String mysqlPath = "C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysql"; // Adjust with your actual path

            // Construct the command and arguments
            String[] command = new String[]{
                    mysqlPath,
                    "-h" + MYSQL_SERVER_HOSTNAME,
                    "-P" + MYSQL_SERVER_PORT,
                    "-u" + dbUsername,
                    "-p" + dbPassword,
                    databaseName
            };

            // Start the process
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            processBuilder.redirectInput(ProcessBuilder.Redirect.from(new File(importPath)));

            Process process = processBuilder.start();
            int exitCode = process.waitFor();

            return exitCode == 0;

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Helper method to print error stream
    private void printErrorStream(Process process) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new Admin_Settings(userId).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void adminButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton1ActionPerformed
        // Create a file chooser dialog
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose Backup Location");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // Only directories

        // Show the file chooser dialog
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedDirectory = fileChooser.getSelectedFile();

            // Generate file name with date
            String date = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String exportPath = selectedDirectory.getAbsolutePath() + File.separator + "backup_" + date + ".sql";

            try {
                String mysqlDumpPath = "C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysqldump"; // Adjust with your actual path

                // Construct the command and arguments
                String[] command = new String[]{
                    mysqlDumpPath,
                    "--single-transaction",
                    "-h" + MYSQL_SERVER_HOSTNAME,
                    "-P" + MYSQL_SERVER_PORT,
                    "-u" + dbUsername,
                    "-p" + dbPassword,
                    DATABASE_NAME
                };

                // Redirect output to selected file
                ProcessBuilder processBuilder = new ProcessBuilder(command);
                processBuilder.redirectOutput(ProcessBuilder.Redirect.to(new File(exportPath)));

                // Start the process
                Process process = processBuilder.start();
                int exitCode = process.waitFor();

                // Check command execution success
                if (exitCode == 0) {
                    JOptionPane.showMessageDialog(null, "Backup created successfully at:\n" + exportPath);
                } else {
                    JOptionPane.showMessageDialog(null, "Error creating backup. Exit code: " + exitCode);
                    printErrorStream(process);
                }

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        } else if (userSelection == JFileChooser.CANCEL_OPTION) {
            System.out.println("Backup operation canceled.");
        } else if (userSelection == JFileChooser.ERROR_OPTION) {
            System.out.println("Error selecting backup location.");
        }
    }//GEN-LAST:event_adminButton1ActionPerformed

    private void adminButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton2ActionPerformed
        String databaseName = "database"; // Replace with your database name
        String dbUsername = "root";
        String dbPassword = "admin";

        // Create a file chooser dialog
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose Restore File");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        // Show the file chooser dialog
        int userSelection = fileChooser.showOpenDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String importPath = selectedFile.getAbsolutePath();
            // Call restoreDatabase method
            boolean restoreSuccess = restoreDatabase(databaseName, dbUsername, dbPassword, importPath);

            if (restoreSuccess) {
                JOptionPane.showMessageDialog(null, "Database restored successfully from:\n" + importPath);
            } else {
                JOptionPane.showMessageDialog(null, "Error restoring database.");
            }
        } else if (userSelection == JFileChooser.CANCEL_OPTION) {
            System.out.println("Restore operation canceled.");
        } else if (userSelection == JFileChooser.ERROR_OPTION) {
            System.out.println("Error selecting restore file.");
        }
    }//GEN-LAST:event_adminButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.AdminButton adminButton1;
    private swing.AdminButton adminButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
