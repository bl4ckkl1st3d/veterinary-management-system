package contents;

import com.itextpdf.text.Chunk;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Calendar;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import swing.ScrollBar;

/**
 *
 * @author Richard Reynald
 */
public class Admin_PatientReports extends javax.swing.JPanel {

    private int realUserId;

    public Admin_PatientReports(int realUserId) {
        initComponents();
        this.realUserId = realUserId;
        sp.setVerticalScrollBar(new ScrollBar());
        sp.setHorizontalScrollBar(new ScrollBar());
        System.out.println(realUserId);
        setWidth();
    }

    private void setWidth() {
        transactionsTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
        transactionsTable1.getColumnModel().getColumn(1).setPreferredWidth(5);
        transactionsTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
        transactionsTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
    }

    private static final String DATABASE_NAME = "database";
    private static final String dbUsername = "root";
    private static final String dbPassword = "admin";
    private static final String MYSQL_SERVER_HOSTNAME = "DESKTOP-MVBR3DH"; // Replace with your MySQL server's hostname
    private static final int MYSQL_SERVER_PORT = 3306;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientReport = new javax.swing.JPanel();
        patientPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        patientReportsTable = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        fromDate = new com.toedter.calendar.JDateChooser();
        toDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        adminButton8 = new swing.AdminButton();
        adminButton9 = new swing.AdminButton();
        adminButton10 = new swing.AdminButton();
        adminButton11 = new swing.AdminButton();
        criticalProduct = new javax.swing.JPanel();
        bestPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        bestProductsTable = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adminButton7 = new swing.AdminButton();
        salesReport = new javax.swing.JPanel();
        salesPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        transactionsTable = new javax.swing.JTable();
        dateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        txtTotalSum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        adminButton4 = new swing.AdminButton();
        adminButton5 = new swing.AdminButton();
        jLabel2 = new javax.swing.JLabel();
        auditLogs = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        dateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        dateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionsTable1 = new javax.swing.JTable();
        adminButton13 = new swing.AdminButton();
        adminButton14 = new swing.AdminButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bestSellingProduct = new javax.swing.JPanel();
        bestPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        bestProductsTable3 = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        dateChooserStartDate = new com.toedter.calendar.JDateChooser();
        dateChooserEndDate = new com.toedter.calendar.JDateChooser();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        adminButton22 = new swing.AdminButton();
        adminButton23 = new swing.AdminButton();
        inventoryReports = new javax.swing.JPanel();
        inventoryPanel = new javax.swing.JPanel();
        expiringBtn = new swing.AdminButton();
        bestsellingBtn = new swing.AdminButton();
        criticalStocksBtn = new swing.AdminButton();
        adminButton24 = new swing.AdminButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        criticalReports = new javax.swing.JPanel();
        criticalPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        criticalTable = new javax.swing.JTable();
        adminButton17 = new swing.AdminButton();
        expiringProducts = new javax.swing.JPanel();
        criticalPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        expirationTable = new javax.swing.JTable();
        adminButton19 = new swing.AdminButton();
        productLlist = new javax.swing.JPanel();
        criticalPanel2 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        adminButton25 = new swing.AdminButton();
        sp = new javax.swing.JScrollPane();
        tryPanel = new javax.swing.JPanel();
        adminButton1 = new swing.AdminButton();
        adminButton3 = new swing.AdminButton();
        adminButton12 = new swing.AdminButton();
        adminButton18 = new swing.AdminButton();

        patientReport.setBackground(new java.awt.Color(255, 255, 255));

        patientPanel.setBackground(new java.awt.Color(255, 255, 255));

        patientReportsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Breed", "Owner Name", "Registration Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(patientReportsTable);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Patient Reports");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("To");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Search by date");

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("From");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        adminButton8.setText("Save As PDF");
        adminButton8.setRadius(25);
        adminButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton8ActionPerformed(evt);
            }
        });

        adminButton9.setText("Search");
        adminButton9.setRadius(25);
        adminButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton9ActionPerformed(evt);
            }
        });

        adminButton10.setText("Clear");
        adminButton10.setRadius(25);
        adminButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton10ActionPerformed(evt);
            }
        });

        adminButton11.setText("Search All Patients");
        adminButton11.setRadius(25);
        adminButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout patientPanelLayout = new javax.swing.GroupLayout(patientPanel);
        patientPanel.setLayout(patientPanelLayout);
        patientPanelLayout.setHorizontalGroup(
            patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientPanelLayout.createSequentialGroup()
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(patientPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(patientPanelLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adminButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adminButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(patientPanelLayout.createSequentialGroup()
                        .addGap(0, 122, Short.MAX_VALUE)
                        .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(patientPanelLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientPanelLayout.createSequentialGroup()
                                        .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel26)
                                        .addGap(15, 15, 15)
                                        .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(160, 160, 160))
                                    .addComponent(adminButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(adminButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        patientPanelLayout.setVerticalGroup(
            patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout patientReportLayout = new javax.swing.GroupLayout(patientReport);
        patientReport.setLayout(patientReportLayout);
        patientReportLayout.setHorizontalGroup(
            patientReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 971, Short.MAX_VALUE)
            .addGroup(patientReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(patientPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        patientReportLayout.setVerticalGroup(
            patientReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
            .addGroup(patientReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientReportLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        criticalProduct.setBackground(new java.awt.Color(255, 255, 255));

        bestPanel.setBackground(new java.awt.Color(255, 255, 255));

        bestProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "BARCODE", "PRODUCT_NAME", "AMOUNT SOLD", "TOTAL AMOUNT"
            }
        ));
        jScrollPane5.setViewportView(bestProductsTable);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Critical Products");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        adminButton7.setText("Save As PDF");
        adminButton7.setRadius(25);
        adminButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bestPanelLayout = new javax.swing.GroupLayout(bestPanel);
        bestPanel.setLayout(bestPanelLayout);
        bestPanelLayout.setHorizontalGroup(
            bestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestPanelLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(bestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bestPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel16)
                        .addGap(382, 382, 382))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 111, Short.MAX_VALUE))
        );
        bestPanelLayout.setVerticalGroup(
            bestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(bestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(adminButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout criticalProductLayout = new javax.swing.GroupLayout(criticalProduct);
        criticalProduct.setLayout(criticalProductLayout);
        criticalProductLayout.setHorizontalGroup(
            criticalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 939, Short.MAX_VALUE)
            .addGroup(criticalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bestPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        criticalProductLayout.setVerticalGroup(
            criticalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
            .addGroup(criticalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(criticalProductLayout.createSequentialGroup()
                    .addComponent(bestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        salesReport.setBackground(new java.awt.Color(255, 255, 255));

        salesPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Sales Report");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Select Date");
        jLabel11.setToolTipText("");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("From");
        jLabel12.setToolTipText("");

        transactionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Reciept ID", "Transaction Date", "Total Amount", "Cashier Name"
            }
        ));
        jScrollPane2.setViewportView(transactionsTable);

        jLabel13.setText("Total");

        txtTotalSum.setEditable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        adminButton4.setText("Generate");
        adminButton4.setRadius(25);
        adminButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton4ActionPerformed(evt);
            }
        });

        adminButton5.setText("Save As PDF");
        adminButton5.setRadius(25);
        adminButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton5ActionPerformed(evt);
            }
        });

        jLabel2.setText("To");

        javax.swing.GroupLayout salesPanelLayout = new javax.swing.GroupLayout(salesPanel);
        salesPanel.setLayout(salesPanelLayout);
        salesPanelLayout.setHorizontalGroup(
            salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesPanelLayout.createSequentialGroup()
                .addGroup(salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salesPanelLayout.createSequentialGroup()
                        .addContainerGap(144, Short.MAX_VALUE)
                        .addGroup(salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, salesPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTotalSum, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adminButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, salesPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adminButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(salesPanelLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        salesPanelLayout.setVerticalGroup(
            salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addGap(28, 28, 28)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesPanelLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(16, 16, 16))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(txtTotalSum, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel13))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout salesReportLayout = new javax.swing.GroupLayout(salesReport);
        salesReport.setLayout(salesReportLayout);
        salesReportLayout.setHorizontalGroup(
            salesReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        salesReportLayout.setVerticalGroup(
            salesReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        auditLogs.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("FROM");
        jLabel6.setToolTipText("");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("TO");
        jLabel17.setToolTipText("");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel18.setText("SELECT DATE");
        jLabel18.setToolTipText("");

        transactionsTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Audit ID", "User ID", "Event", "Action Type"
            }
        ));
        jScrollPane1.setViewportView(transactionsTable1);

        adminButton13.setText("Generate");
        adminButton13.setRadius(25);
        adminButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton13ActionPerformed(evt);
            }
        });

        adminButton14.setText("Save As PDF");
        adminButton14.setRadius(25);
        adminButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton14ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("Audit Logs");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(177, 177, 177)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(dateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel17)))
                            .addGap(18, 18, 18)
                            .addComponent(dateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(adminButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(163, 163, 163)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7))))
                .addGap(108, 108, 108))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChooser4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(497, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout auditLogsLayout = new javax.swing.GroupLayout(auditLogs);
        auditLogs.setLayout(auditLogsLayout);
        auditLogsLayout.setHorizontalGroup(
            auditLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, auditLogsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        auditLogsLayout.setVerticalGroup(
            auditLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bestSellingProduct.setBackground(new java.awt.Color(255, 255, 255));

        bestPanel2.setBackground(new java.awt.Color(255, 255, 255));

        bestProductsTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "BARCODE", "PRODUCT_NAME", "AMOUNT SOLD", "TOTAL AMOUNT"
            }
        ));
        jScrollPane7.setViewportView(bestProductsTable3);

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel29.setText("From");
        jLabel29.setToolTipText("");

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel30.setText("To");
        jLabel30.setToolTipText("");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Best Products Report");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        adminButton22.setText("Generate");
        adminButton22.setRadius(25);
        adminButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton22ActionPerformed(evt);
            }
        });

        adminButton23.setText("Save As PDF");
        adminButton23.setRadius(25);
        adminButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bestPanel2Layout = new javax.swing.GroupLayout(bestPanel2);
        bestPanel2.setLayout(bestPanel2Layout);
        bestPanel2Layout.setHorizontalGroup(
            bestPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestPanel2Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(bestPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bestPanel2Layout.createSequentialGroup()
                        .addGroup(bestPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel29))
                        .addGap(15, 15, 15)
                        .addGroup(bestPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addGroup(bestPanel2Layout.createSequentialGroup()
                                .addComponent(dateChooserStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel30)
                                .addGap(15, 15, 15)
                                .addComponent(dateChooserEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adminButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 111, Short.MAX_VALUE))
        );
        bestPanel2Layout.setVerticalGroup(
            bestPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(bestPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel31))
                .addGap(20, 20, 20)
                .addGroup(bestPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChooserStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminButton22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(dateChooserEndDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bestSellingProductLayout = new javax.swing.GroupLayout(bestSellingProduct);
        bestSellingProduct.setLayout(bestSellingProductLayout);
        bestSellingProductLayout.setHorizontalGroup(
            bestSellingProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 939, Short.MAX_VALUE)
            .addGroup(bestSellingProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bestPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bestSellingProductLayout.setVerticalGroup(
            bestSellingProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
            .addGroup(bestSellingProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bestPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inventoryPanel.setBackground(new java.awt.Color(255, 255, 255));

        expiringBtn.setText("Expiring Products");
        expiringBtn.setRadius(50);
        expiringBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expiringBtnActionPerformed(evt);
            }
        });

        bestsellingBtn.setText("Best Selling Product");
        bestsellingBtn.setRadius(50);
        bestsellingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestsellingBtnActionPerformed(evt);
            }
        });

        criticalStocksBtn.setText("Critical Stocks");
        criticalStocksBtn.setRadius(50);
        criticalStocksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criticalStocksBtnActionPerformed(evt);
            }
        });

        adminButton24.setText("Product List");
        adminButton24.setRadius(50);
        adminButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton24ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setText("Inventory Reports");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout inventoryPanelLayout = new javax.swing.GroupLayout(inventoryPanel);
        inventoryPanel.setLayout(inventoryPanelLayout);
        inventoryPanelLayout.setHorizontalGroup(
            inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventoryPanelLayout.createSequentialGroup()
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inventoryPanelLayout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(expiringBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(criticalStocksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bestsellingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(inventoryPanelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addContainerGap(371, Short.MAX_VALUE))
        );
        inventoryPanelLayout.setVerticalGroup(
            inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventoryPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel8))
                .addGap(57, 57, 57)
                .addComponent(criticalStocksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(expiringBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bestsellingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(619, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout inventoryReportsLayout = new javax.swing.GroupLayout(inventoryReports);
        inventoryReports.setLayout(inventoryReportsLayout);
        inventoryReportsLayout.setHorizontalGroup(
            inventoryReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inventoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inventoryReportsLayout.setVerticalGroup(
            inventoryReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inventoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        criticalPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel19.setText("Critical Products");

        criticalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "BARCODE", "PRODUCT_NAME", "STOCKS", "CRITICAL_LEVEL"
            }
        ));
        jScrollPane6.setViewportView(criticalTable);

        adminButton17.setText("Save As PDF");
        adminButton17.setRadius(25);
        adminButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout criticalPanelLayout = new javax.swing.GroupLayout(criticalPanel);
        criticalPanel.setLayout(criticalPanelLayout);
        criticalPanelLayout.setHorizontalGroup(
            criticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(criticalPanelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, criticalPanelLayout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(criticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        criticalPanelLayout.setVerticalGroup(
            criticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(criticalPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(criticalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel15))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(481, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout criticalReportsLayout = new javax.swing.GroupLayout(criticalReports);
        criticalReports.setLayout(criticalReportsLayout);
        criticalReportsLayout.setHorizontalGroup(
            criticalReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(criticalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        criticalReportsLayout.setVerticalGroup(
            criticalReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(criticalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        criticalPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel25.setText("Expiring Products");

        expirationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "BARCODE", "PRODUCT_NAME", "STOCKS", "EXPIRATION_DATE"
            }
        ));
        jScrollPane8.setViewportView(expirationTable);

        adminButton19.setText("Save As PDF");
        adminButton19.setRadius(25);
        adminButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout criticalPanel1Layout = new javax.swing.GroupLayout(criticalPanel1);
        criticalPanel1.setLayout(criticalPanel1Layout);
        criticalPanel1Layout.setHorizontalGroup(
            criticalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(criticalPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, criticalPanel1Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(criticalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        criticalPanel1Layout.setVerticalGroup(
            criticalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(criticalPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(criticalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel23))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(481, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout expiringProductsLayout = new javax.swing.GroupLayout(expiringProducts);
        expiringProducts.setLayout(expiringProductsLayout);
        expiringProductsLayout.setHorizontalGroup(
            expiringProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(criticalPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        expiringProductsLayout.setVerticalGroup(
            expiringProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(criticalPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        criticalPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel33.setText("Product List");

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(productTable);

        adminButton25.setText("Save As PDF");
        adminButton25.setRadius(25);
        adminButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout criticalPanel2Layout = new javax.swing.GroupLayout(criticalPanel2);
        criticalPanel2.setLayout(criticalPanel2Layout);
        criticalPanel2Layout.setHorizontalGroup(
            criticalPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(criticalPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, criticalPanel2Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(criticalPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        criticalPanel2Layout.setVerticalGroup(
            criticalPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(criticalPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(criticalPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel32))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(481, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout productLlistLayout = new javax.swing.GroupLayout(productLlist);
        productLlist.setLayout(productLlistLayout);
        productLlistLayout.setHorizontalGroup(
            productLlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(criticalPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        productLlistLayout.setVerticalGroup(
            productLlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(criticalPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setLayout(new java.awt.BorderLayout());

        tryPanel.setBackground(new java.awt.Color(255, 255, 255));

        adminButton1.setText("Sales Report");
        adminButton1.setRadius(50);
        adminButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton1ActionPerformed(evt);
            }
        });

        adminButton3.setText("Patient Report");
        adminButton3.setRadius(50);
        adminButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton3ActionPerformed(evt);
            }
        });

        adminButton12.setText("Audit Logs");
        adminButton12.setRadius(50);
        adminButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton12ActionPerformed(evt);
            }
        });

        adminButton18.setText("Inventory Reports");
        adminButton18.setRadius(50);
        adminButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tryPanelLayout = new javax.swing.GroupLayout(tryPanel);
        tryPanel.setLayout(tryPanelLayout);
        tryPanelLayout.setHorizontalGroup(
            tryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tryPanelLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(tryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tryPanelLayout.createSequentialGroup()
                        .addComponent(adminButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(adminButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tryPanelLayout.createSequentialGroup()
                        .addComponent(adminButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        tryPanelLayout.setVerticalGroup(
            tryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tryPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(tryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(314, Short.MAX_VALUE))
        );

        sp.setViewportView(tryPanel);

        add(sp, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    private void backBtn() {
// Remove any existing component in the scroll pane
        sp.setViewportView(null);

        // Add jPanel5 to the scroll pane
        sp.setViewportView(tryPanel);

        // Refresh the scroll pane to ensure it displays the new content
        sp.revalidate();
        sp.repaint();
    }

    private void inventoryBackBtn() {
// Remove any existing component in the scroll pane
        sp.setViewportView(null);

        // Add jPanel5 to the scroll pane
        sp.setViewportView(inventoryReports);

        // Refresh the scroll pane to ensure it displays the new content
        sp.revalidate();
        sp.repaint();
    }

    private String getProductInfo(Connection conn, int productId) throws SQLException {
        String productName = "";
        // Example query, replace with your actual query to retrieve product information
        String sql = "SELECT name FROM product_information WHERE product_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, productId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                productName = rs.getString("name");
            }
        }
        return productName;
    }

    private Map<Integer, Integer> getTop3Products(Connection conn, java.sql.Timestamp startDate, java.sql.Timestamp endDate) throws SQLException {
        // Query to get top 3 products based on quantity sold within the date range
        String sqlTopProducts = "SELECT product_id, SUM(quantity) AS total_quantity "
                + "FROM sales_details "
                + "WHERE receipt_id IN (SELECT receipt_id FROM sales_receipts WHERE transaction_date BETWEEN ? AND ?) "
                + "GROUP BY product_id "
                + "ORDER BY total_quantity DESC "
                + "LIMIT 3";

        PreparedStatement pstmtTopProducts = null;
        ResultSet rsTopProducts = null;
        Map<Integer, Integer> productQuantityMap = new HashMap<>();

        try {
            pstmtTopProducts = conn.prepareStatement(sqlTopProducts);
            pstmtTopProducts.setTimestamp(1, startDate);
            pstmtTopProducts.setTimestamp(2, endDate);
            rsTopProducts = pstmtTopProducts.executeQuery();

            while (rsTopProducts.next()) {
                int productId = rsTopProducts.getInt("product_id");
                int totalQuantity = rsTopProducts.getInt("total_quantity");
                productQuantityMap.put(productId, totalQuantity);
            }
        } finally {
            // Close result set and prepared statement in finally block
            if (rsTopProducts != null) {
                rsTopProducts.close();
            }
            if (pstmtTopProducts != null) {
                pstmtTopProducts.close();
            }
        }

        return productQuantityMap;
    }

    private void clearTables() {
        DefaultTableModel dm = (DefaultTableModel) patientReportsTable.getModel();
        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }
    }

    private void searchFunc() {
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";

        java.util.Date fromD = fromDate.getDate();
        java.util.Date toD = toDate.getDate();

        if (fromD == null || toD == null) {
            JOptionPane.showMessageDialog(this, "Please select both From and To dates.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fromDateString = sdf.format(fromD);
        String toDateString = sdf.format(toD);

        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            String query = "SELECT patient_name, breed, client_name, registration_date FROM patient_information "
                    + "WHERE registration_date BETWEEN ? AND ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, fromDateString);
            preparedStatement.setString(2, toDateString);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Clear the table before adding new rows
            DefaultTableModel dm = (DefaultTableModel) patientReportsTable.getModel();
            while (dm.getRowCount() > 0) {
                dm.removeRow(0);
            }

            // Process the result set and add rows to the table model
            while (resultSet.next()) {
                String patientName = resultSet.getString("patient_name");
                String breed = resultSet.getString("breed");
                String clientName = resultSet.getString("client_name");
                String regDate = resultSet.getString("registration_date");

                dm.addRow(new Object[]{patientName, breed, clientName, regDate});
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select both From and To dates.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void generatePatientReport() {
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";

        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Query to fetch medical history information for the specified patient ID
            String query = "SELECT patient_name, breed, client_name, registration_date FROM patient_information";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Create a DefaultTableModel to hold the medical history data
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Patient Name");
            model.addColumn("Breed");
            model.addColumn("Owner Name");
            model.addColumn("Registration Date");

            // Populate the model with the retrieved data
            while (resultSet.next()) {
                String patientName = resultSet.getString("patient_name");
                String breed = resultSet.getString("breed");
                String clientName = resultSet.getString("client_name");
                String regDate = resultSet.getString("registration_date");

                model.addRow(new Object[]{patientName, breed, clientName, regDate});
            }

            // Set the model for the medicalHistoryTable
            patientReportsTable.setModel(model);

            // Close the result set, statement, and connection
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
        }
    }
    private void adminButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton1ActionPerformed
        sp.setViewportView(null);

        sp.setViewportView(salesReport);

        sp.revalidate();
        sp.repaint();
    }//GEN-LAST:event_adminButton1ActionPerformed

    private void adminButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton3ActionPerformed
        sp.setViewportView(null);

        sp.setViewportView(patientReport);

        sp.revalidate();
        sp.repaint();
    }//GEN-LAST:event_adminButton3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        backBtn();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void adminButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton5ActionPerformed
        // Open a file chooser to select the folder
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = fileChooser.getSelectedFile();

            // Prepare the data to be written to the PDF
            DefaultTableModel model = (DefaultTableModel) transactionsTable.getModel();
            int columnCount = model.getColumnCount();
            int rowCount = model.getRowCount();

            // Get the dates for the sales report header
            java.util.Date startDate = dateChooser1.getDate();
            java.util.Date endDate = dateChooser2.getDate();

            // Validate dates
            if (startDate == null || endDate == null) {
                JOptionPane.showMessageDialog(this, "Please select both start and end dates.");
                return;
            }
            if (startDate.after(endDate)) {
                JOptionPane.showMessageDialog(this, "The start date must not be after the end date.");
                return;
            }

            // Format the dates for the report header and file name
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateRange = dateFormat.format(startDate) + " to " + dateFormat.format(endDate);

            // Define the PDF file path with formatted date range
            String pdfFileName = "sales report (" + dateRange + ").pdf";
            String pdfFilePath = selectedFolder.getAbsolutePath() + "/" + pdfFileName;

            // Replace with the actual userid
            String username = getUsername(realUserId);

            // Create the PDF document
            Document document = new Document();
            try {
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath));
                document.open();

                // Clinic information
                Paragraph clinicTitle = new Paragraph("Sahagun's Veterinary Clinic", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16));
                clinicTitle.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicTitle);

                Paragraph clinicAddress = new Paragraph("6418 Zapote Street Area D., Camarin Rd, Caloocan", FontFactory.getFont(FontFactory.HELVETICA, 12));
                clinicAddress.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicAddress);

                Paragraph clinicContact = new Paragraph("Contact: (0923) 235 8209", FontFactory.getFont(FontFactory.HELVETICA, 12));
                clinicContact.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicContact);

                document.add(Chunk.NEWLINE); // Add a blank line after the contact information

                // Add sales report date range to the document header
                Paragraph reportHeader = new Paragraph("Sales Report from " + dateFormat.format(startDate) + " to " + dateFormat.format(endDate), FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14));
                reportHeader.setAlignment(Element.ALIGN_CENTER);
                document.add(reportHeader);
                document.add(Chunk.NEWLINE); // Add a blank line after the header

                // Add the table header
                PdfPTable table = new PdfPTable(columnCount);
                for (int i = 0; i < columnCount; i++) {
                    PdfPCell headerCell = new PdfPCell(new Phrase(model.getColumnName(i)));
                    table.addCell(headerCell);
                }

                // Add the table rows
                for (int i = 0; i < rowCount; i++) {
                    for (int j = 0; j < columnCount; j++) {
                        PdfPCell cell = new PdfPCell(new Phrase(model.getValueAt(i, j).toString()));
                        table.addCell(cell);
                    }
                }

                // Add the table to the document
                document.add(table);

                // Add the total amount aligned to the 'Total Amount' column (3rd column)
                String totalAmount = txtTotalSum.getText();
                PdfPTable totalTable = new PdfPTable(columnCount);

                // Add empty cells without borders
                PdfPCell emptyCell1 = new PdfPCell(new Phrase(""));
                emptyCell1.setBorder(PdfPCell.NO_BORDER);
                totalTable.addCell(emptyCell1);

                PdfPCell totalTextCell = new PdfPCell(new Phrase("Total Amount:"));
                totalTextCell.setBorder(PdfPCell.NO_BORDER);
                totalTextCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
                totalTable.addCell(totalTextCell);

                PdfPCell totalAmountCell = new PdfPCell(new Phrase("₱" + totalAmount));
                totalAmountCell.setBorder(PdfPCell.NO_BORDER);
                totalAmountCell.setHorizontalAlignment(Element.ALIGN_LEFT);
                totalTable.addCell(totalAmountCell);

                PdfPCell emptyCell4 = new PdfPCell(new Phrase(""));
                emptyCell4.setBorder(PdfPCell.NO_BORDER);
                totalTable.addCell(emptyCell4);

                // Add remaining empty cells without borders
                for (int i = 4; i < columnCount; i++) {
                    PdfPCell emptyCell = new PdfPCell(new Phrase(""));
                    emptyCell.setBorder(PdfPCell.NO_BORDER);
                    totalTable.addCell(emptyCell);
                }

                document.add(totalTable);

                // Add footer with generation date and username
                String generationDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
                PdfContentByte cb = writer.getDirectContent();
                cb.beginText();
                cb.setFontAndSize(BaseFont.createFont(), 10);
                cb.showTextAligned(Element.ALIGN_LEFT, "Generated on: " + generationDate, 30, 30, 0);
                cb.showTextAligned(Element.ALIGN_RIGHT, "Generated by: " + username, document.right() - 30, 30, 0);
                cb.endText();

                // Close the document
                document.close();

                JOptionPane.showMessageDialog(this, "PDF saved successfully as '" + pdfFileName + "'.");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            } catch (DocumentException | IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_adminButton5ActionPerformed

    private String getUsername(int userid) {
        String username = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;

        try {
            // Establish the database connection
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Prepare the SQL query to find the username by userid
            String query = "SELECT username FROM users WHERE userid = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, userid);

            // Execute the query and retrieve the result
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                username = resultSet.getString("username");
            } else {
                JOptionPane.showMessageDialog(this, "User not found for userid: " + userid);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        } finally {
            // Close the resources
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return username != null ? username : "UnknownUser";
    }
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        backBtn();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void adminButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton7ActionPerformed
        // Get the dates for the sales report header
        java.util.Date startDate = dateChooserStartDate.getDate();
        java.util.Date endDate = dateChooserEndDate.getDate();

        // Validate dates
        if (startDate == null || endDate == null) {
            JOptionPane.showMessageDialog(this, "Please select both start and end dates.");
            return;
        }
        if (startDate.after(endDate)) {
            JOptionPane.showMessageDialog(this, "The start date must not be after the end date.");
            return;
        }

        // Format the dates for the report header and file name
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateRange = dateFormat.format(startDate) + " to " + dateFormat.format(endDate);

        // Open a file chooser to select the folder
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = fileChooser.getSelectedFile();

            // Define the PDF file path with formatted date range
            String pdfFileName = "best products (" + dateRange + ").pdf";
            String pdfFilePath = selectedFolder.getAbsolutePath() + "/" + pdfFileName;

            // Create the PDF document
            Document document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath));
                document.open();
                Paragraph clinicTitle = new Paragraph("Sahagun's Veterinary Clinic", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16));
                clinicTitle.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicTitle);
                document.add(Chunk.NEWLINE); //

                // Add sales report date range to the document header
                Paragraph reportHeader = new Paragraph("Top 3 Best Selling Products from " + dateFormat.format(startDate) + " to " + dateFormat.format(endDate), FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16));
                reportHeader.setAlignment(Element.ALIGN_CENTER);
                document.add(reportHeader);
                document.add(Chunk.NEWLINE); // Add a blank line after the header

                // Prepare the data to be written to the PDF from bestProductsTable
                DefaultTableModel model = (DefaultTableModel) bestProductsTable.getModel();
                int columnCount = model.getColumnCount();
                int rowCount = model.getRowCount();

                // Add the table header
                PdfPTable table = new PdfPTable(columnCount);
                for (int i = 0; i < columnCount; i++) {
                    PdfPCell headerCell = new PdfPCell(new Phrase(model.getColumnName(i)));
                    table.addCell(headerCell);
                }

                // Add the table rows
                for (int i = 0; i < rowCount; i++) {
                    for (int j = 0; j < columnCount; j++) {
                        PdfPCell cell = new PdfPCell(new Phrase(model.getValueAt(i, j).toString()));
                        table.addCell(cell);
                    }
                }

                // Add the table to the document
                document.add(table);

                // Close the document
                document.close();

                JOptionPane.showMessageDialog(this, "PDF saved successfully as '" + pdfFileName + "'.");
            } catch (FileNotFoundException | DocumentException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_adminButton7ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        backBtn();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void adminButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton8ActionPerformed
        // Get the dates for the report header
        java.util.Date startDate = fromDate.getDate();
        java.util.Date endDate = toDate.getDate();

        // Validate dates
        if (startDate == null || endDate == null) {
            JOptionPane.showMessageDialog(this, "Please select both start and end dates.");
            return;
        }
        if (startDate.after(endDate)) {
            JOptionPane.showMessageDialog(this, "The start date must not be after the end date.");
            return;
        }

        // Format the dates for the report header and file name
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateRange = dateFormat.format(startDate) + " to " + dateFormat.format(endDate);

        // Open a file chooser to select the folder
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = fileChooser.getSelectedFile();

            // Define the PDF file path with formatted date range
            String pdfFileName = "patient reports (" + dateRange + ").pdf";
            String pdfFilePath = selectedFolder.getAbsolutePath() + "/" + pdfFileName;

            // Replace with the actual userid
            String username = getUsername(realUserId);

            // Create the PDF document
            Document document = new Document();
            try {
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath));
                document.open();

                Paragraph clinicTitle = new Paragraph("Sahagun's Veterinary Clinic", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16));
                clinicTitle.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicTitle);

                Paragraph clinicAddress = new Paragraph("6418 Zapote Street Area D., Camarin Rd, Caloocan", FontFactory.getFont(FontFactory.HELVETICA, 12));
                clinicAddress.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicAddress);

                Paragraph clinicContact = new Paragraph("Contact: (0923) 235 8209", FontFactory.getFont(FontFactory.HELVETICA, 12));
                clinicContact.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicContact);
                document.add(Chunk.NEWLINE); // Add a blank line after the contact information

                // Add report date range to the document header
                Paragraph reportHeader = new Paragraph("Patient Reports from " + dateFormat.format(startDate) + " to " + dateFormat.format(endDate), FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14));
                reportHeader.setAlignment(Element.ALIGN_CENTER);
                document.add(reportHeader);
                document.add(Chunk.NEWLINE); // Add a blank line after the header

                // Prepare the data to be written to the PDF from patientReportsTable
                DefaultTableModel model = (DefaultTableModel) patientReportsTable.getModel();
                int columnCount = model.getColumnCount();
                int rowCount = model.getRowCount();

                // Add the total count of registered patients
                Paragraph totalPatients = new Paragraph("Total Registered Patients: " + rowCount, FontFactory.getFont(FontFactory.HELVETICA, 12));
                totalPatients.setAlignment(Element.ALIGN_LEFT);
                document.add(totalPatients);
                document.add(Chunk.NEWLINE); // Add a blank line after the total count

                // Add the table header
                PdfPTable table = new PdfPTable(columnCount);
                for (int i = 0; i < columnCount; i++) {
                    PdfPCell headerCell = new PdfPCell(new Phrase(model.getColumnName(i)));
                    table.addCell(headerCell);
                }

                // Add the table rows
                for (int i = 0; i < rowCount; i++) {
                    for (int j = 0; j < columnCount; j++) {
                        PdfPCell cell = new PdfPCell(new Phrase(model.getValueAt(i, j).toString()));
                        table.addCell(cell);
                    }
                }

                // Add the table to the document
                document.add(table);

                // Add footer with generation date and username
                String generationDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
                PdfContentByte cb = writer.getDirectContent();
                cb.beginText();
                cb.setFontAndSize(BaseFont.createFont(), 10);
                cb.showTextAligned(Element.ALIGN_LEFT, "Generated on: " + generationDate, 30, 30, 0);
                cb.showTextAligned(Element.ALIGN_RIGHT, "Generated by: " + username, document.right() - 30, 30, 0);
                cb.endText();

                // Close the document
                document.close();

                JOptionPane.showMessageDialog(this, "PDF saved successfully as '" + pdfFileName + "'.");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "File not found: " + e.getMessage());
            } catch (IOException | DocumentException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_adminButton8ActionPerformed

    private void adminButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton9ActionPerformed
        searchFunc();
    }//GEN-LAST:event_adminButton9ActionPerformed

    private void adminButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton10ActionPerformed
        clearTables();
    }//GEN-LAST:event_adminButton10ActionPerformed

    private void adminButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton11ActionPerformed
        generatePatientReport();
    }//GEN-LAST:event_adminButton11ActionPerformed

    private void adminButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton12ActionPerformed
        sp.setViewportView(null);

        sp.setViewportView(auditLogs);

        sp.revalidate();
        sp.repaint();
    }//GEN-LAST:event_adminButton12ActionPerformed

    private void adminButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton13ActionPerformed
        // Get the two dates from the date choosers
        java.util.Date startDate = dateChooser3.getDate();
        java.util.Date endDate = dateChooser4.getDate();

        // Validate dates
        if (startDate == null || endDate == null) {
            JOptionPane.showMessageDialog(this, "Please select both start and end dates.");
            return;
        }
        if (startDate.after(endDate)) {
            JOptionPane.showMessageDialog(this, "The start date must not be after the end date.");
            return;
        }

        // Set the start date's time to the beginning of the day (00:00:00)
        Calendar startCal = Calendar.getInstance();
        startCal.setTime(startDate);
        startCal.set(Calendar.HOUR_OF_DAY, 0);
        startCal.set(Calendar.MINUTE, 0);
        startCal.set(Calendar.SECOND, 0);
        startCal.set(Calendar.MILLISECOND, 0);
        java.sql.Timestamp sqlStartDate = new java.sql.Timestamp(startCal.getTimeInMillis());

        // Set the end date's time to the end of the day (23:59:59)
        Calendar endCal = Calendar.getInstance();
        endCal.setTime(endDate);
        endCal.set(Calendar.HOUR_OF_DAY, 23);
        endCal.set(Calendar.MINUTE, 59);
        endCal.set(Calendar.SECOND, 59);
        endCal.set(Calendar.MILLISECOND, 999);
        java.sql.Timestamp sqlEndDate = new java.sql.Timestamp(endCal.getTimeInMillis());

        // Database connection details
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Establish a connection to the database
            conn = DriverManager.getConnection(url, dbUsername, dbPassword);

            // SQL query to retrieve audit logs between the two dates (inclusive of the last day) and sorted by datetime in descending order
            String sql = "SELECT log_id, userid, event, action_type, datetime FROM audit_logs WHERE datetime BETWEEN ? AND ? ORDER BY datetime DESC";

            // Prepare the statement
            pstmt = conn.prepareStatement(sql);
            pstmt.setTimestamp(1, sqlStartDate);
            pstmt.setTimestamp(2, sqlEndDate);

            // Execute the query
            rs = pstmt.executeQuery();

            // Clear existing data in the table
            DefaultTableModel model = (DefaultTableModel) transactionsTable1.getModel();
            model.setRowCount(0);

            // Populate the table with the retrieved data
            while (rs.next()) {
                int logId = rs.getInt("log_id");
                String userId = rs.getString("userid");
                String event = rs.getString("event");
                String actionType = rs.getString("action_type");
                java.sql.Timestamp dateTime = rs.getTimestamp("datetime");

                // Add the row to the table
                model.addRow(new Object[]{logId, userId, event, actionType, dateTime});
            }

            // Inform user if no audit logs were found
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No audit logs found for the selected date range.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_adminButton13ActionPerformed

    private void adminButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton14ActionPerformed
        // Open a file chooser to select the folder
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = fileChooser.getSelectedFile();

            // Prepare the data to be written to the PDF
            DefaultTableModel model = (DefaultTableModel) transactionsTable1.getModel();
            int columnCount = model.getColumnCount();
            int rowCount = model.getRowCount();

            // Get the dates for the sales report header
            java.util.Date startDate = dateChooser3.getDate();
            java.util.Date endDate = dateChooser4.getDate();

            // Validate dates
            if (startDate == null || endDate == null) {
                JOptionPane.showMessageDialog(this, "Please select both start and end dates.");
                return;
            }
            if (startDate.after(endDate)) {
                JOptionPane.showMessageDialog(this, "The start date must not be after the end date.");
                return;
            }

            // Format the dates for the report header and file name
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateRange = dateFormat.format(startDate) + " to " + dateFormat.format(endDate);

            // Define the PDF file path with formatted date range
            String pdfFileName = "audit log (" + dateRange + ").pdf";
            String pdfFilePath = selectedFolder.getAbsolutePath() + "/" + pdfFileName;

            // Replace with the actual userid
            String username = getUsername(realUserId);

            // Create the PDF document
            Document document = new Document();
            try {
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath));
                document.open();

                // Clinic information
                Paragraph clinicTitle = new Paragraph("Sahagun's Veterinary Clinic", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16));
                clinicTitle.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicTitle);

                Paragraph clinicAddress = new Paragraph("6418 Zapote Street Area D., Camarin Rd, Caloocan", FontFactory.getFont(FontFactory.HELVETICA, 12));
                clinicAddress.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicAddress);

                Paragraph clinicContact = new Paragraph("Contact: (0923) 235 8209", FontFactory.getFont(FontFactory.HELVETICA, 12));
                clinicContact.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicContact);

                // Add sales report date range to the document header
                Paragraph reportHeader = new Paragraph("Audit Logs from " + dateFormat.format(startDate) + " to " + dateFormat.format(endDate), FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14));
                reportHeader.setAlignment(Element.ALIGN_CENTER);
                document.add(reportHeader);
                document.add(Chunk.NEWLINE); // Add a blank line after the header

                // Add the table header
                PdfPTable table = new PdfPTable(columnCount);
                for (int i = 0; i < columnCount; i++) {
                    PdfPCell headerCell = new PdfPCell(new Phrase(model.getColumnName(i)));
                    table.addCell(headerCell);
                }

                // Add the table rows
                for (int i = 0; i < rowCount; i++) {
                    for (int j = 0; j < columnCount; j++) {
                        PdfPCell cell = new PdfPCell(new Phrase(model.getValueAt(i, j).toString()));
                        table.addCell(cell);
                    }
                }

                // Add the table to the document
                document.add(table);

                // Add footer with generation date and username
                String generationDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
                PdfContentByte cb = writer.getDirectContent();
                cb.beginText();
                cb.setFontAndSize(BaseFont.createFont(), 10);
                cb.showTextAligned(Element.ALIGN_LEFT, "Generated on: " + generationDate, 30, 30, 0);
                cb.showTextAligned(Element.ALIGN_RIGHT, "Generated by: " + username, document.right() - 30, 30, 0);
                cb.endText();

                // Close the document
                document.close();

                JOptionPane.showMessageDialog(this, "PDF saved successfully as '" + pdfFileName + "'.");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "File not found: " + e.getMessage());
            } catch (IOException | DocumentException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_adminButton14ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        backBtn();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void adminButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton18ActionPerformed
        sp.setViewportView(null);

        sp.setViewportView(inventoryReports);

        sp.revalidate();
        sp.repaint();
    }//GEN-LAST:event_adminButton18ActionPerformed

    private void adminButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton4ActionPerformed
        //  // Get the two dates from the date choosers
        java.util.Date startDate = dateChooser1.getDate();
        java.util.Date endDate = dateChooser2.getDate();

        // Validate dates
        if (startDate == null || endDate == null) {
            JOptionPane.showMessageDialog(this, "Please select both start and end dates.");
            return;
        }
        if (startDate.after(endDate)) {
            JOptionPane.showMessageDialog(this, "The start date must not be after the end date.");
            return;
        }

        // Set the start date's time to the beginning of the day (00:00:00)
        Calendar startCal = Calendar.getInstance();
        startCal.setTime(startDate);
        startCal.set(Calendar.HOUR_OF_DAY, 0);
        startCal.set(Calendar.MINUTE, 0);
        startCal.set(Calendar.SECOND, 0);
        startCal.set(Calendar.MILLISECOND, 0);
        java.sql.Timestamp sqlStartDate = new java.sql.Timestamp(startCal.getTimeInMillis());

        // Set the end date's time to the end of the day (23:59:59)
        Calendar endCal = Calendar.getInstance();
        endCal.setTime(endDate);
        endCal.set(Calendar.HOUR_OF_DAY, 23);
        endCal.set(Calendar.MINUTE, 59);
        endCal.set(Calendar.SECOND, 59);
        endCal.set(Calendar.MILLISECOND, 999);
        java.sql.Timestamp sqlEndDate = new java.sql.Timestamp(endCal.getTimeInMillis());

        // Database connection details
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Establish a connection to the database
            conn = DriverManager.getConnection(url, dbUsername, dbPassword);

            // SQL query to retrieve transactions between the two dates (inclusive of the last day) and sorted by date in descending order
            String sql = "SELECT receipt_id, transaction_date, total_amount, cashier_name FROM sales_receipts WHERE transaction_date BETWEEN ? AND ? ORDER BY transaction_date DESC";

            // Prepare the statement
            pstmt = conn.prepareStatement(sql);
            pstmt.setTimestamp(1, sqlStartDate);
            pstmt.setTimestamp(2, sqlEndDate);

            // Execute the query
            rs = pstmt.executeQuery();

            // Clear existing data in the table
            DefaultTableModel model = (DefaultTableModel) transactionsTable.getModel();
            model.setRowCount(0);

            // Variable to accumulate the total amount
            BigDecimal totalSum = BigDecimal.ZERO;

            // Populate the table with the retrieved data
            while (rs.next()) {
                int receiptId = rs.getInt("receipt_id");
                java.sql.Timestamp transactionDate = rs.getTimestamp("transaction_date");
                BigDecimal totalAmount = rs.getBigDecimal("total_amount");
                String cashierName = rs.getString("cashier_name");

                // Format the total amount with peso sign
                String formattedTotalAmount = "₱" + totalAmount.toString();

                // Add the row to the table
                model.addRow(new Object[]{receiptId, transactionDate, formattedTotalAmount, cashierName});

                // Accumulate the total amount
                totalSum = totalSum.add(totalAmount);
            }

            // Inform user if no transactions were found
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No transactions found for the selected date range.");
            } else {
                // Display the sum of total_amount in the text box with peso sign
                txtTotalSum.setText("₱" + totalSum.toString());
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_adminButton4ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        inventoryBackBtn();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void adminButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton22ActionPerformed
        // Get the dates for the sales report header
        java.util.Date startDate = dateChooserStartDate.getDate();
        java.util.Date endDate = dateChooserEndDate.getDate();

        // Validate dates
        if (startDate == null || endDate == null) {
            JOptionPane.showMessageDialog(this, "Please select both start and end dates.");
            return;
        }
        if (startDate.after(endDate)) {
            JOptionPane.showMessageDialog(this, "The start date must not be after the end date.");
            return;
        }

        // Set the start date's time to the beginning of the day (00:00:00)
        Calendar startCal = Calendar.getInstance();
        startCal.setTime(startDate);
        startCal.set(Calendar.HOUR_OF_DAY, 0);
        startCal.set(Calendar.MINUTE, 0);
        startCal.set(Calendar.SECOND, 0);
        startCal.set(Calendar.MILLISECOND, 0);
        java.sql.Timestamp sqlStartDate = new java.sql.Timestamp(startCal.getTimeInMillis());

        // Set the end date's time to the end of the day (23:59:59)
        Calendar endCal = Calendar.getInstance();
        endCal.setTime(endDate);
        endCal.set(Calendar.HOUR_OF_DAY, 23);
        endCal.set(Calendar.MINUTE, 59);
        endCal.set(Calendar.SECOND, 59);
        endCal.set(Calendar.MILLISECOND, 999);
        java.sql.Timestamp sqlEndDate = new java.sql.Timestamp(endCal.getTimeInMillis());

        // Database connection details
        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Establish a connection to the database
            conn = DriverManager.getConnection(url, dbUsername, dbPassword);

            // SQL query to retrieve top 3 products sold based on total amount in descending order
            String sql = "SELECT product_id, SUM(quantity) AS total_quantity "
                    + "FROM sales_details "
                    + "WHERE receipt_id IN (SELECT receipt_id FROM sales_receipts WHERE transaction_date BETWEEN ? AND ?) "
                    + "GROUP BY product_id "
                    + "ORDER BY SUM(quantity) DESC "
                    + "LIMIT 3";

            // Prepare the statement
            pstmt = conn.prepareStatement(sql);
            pstmt.setTimestamp(1, sqlStartDate);
            pstmt.setTimestamp(2, sqlEndDate);

            // Execute the query
            rs = pstmt.executeQuery();

            // Clear existing table model data
            DefaultTableModel bestProductsModel = new DefaultTableModel();
            bestProductsTable.setModel(bestProductsModel);

            // Add columns to the table model
            bestProductsModel.addColumn("Product ID");
            bestProductsModel.addColumn("Product Name");
            bestProductsModel.addColumn("Total Quantity Sold");

            // Display the top 3 products in the table
            while (rs.next()) {
                int productId = rs.getInt("product_id");
                int totalQuantity = rs.getInt("total_quantity");

                // Get product information
                String productName = getProductInfo(conn, productId);

                // Add row to the table model
                bestProductsModel.addRow(new Object[]{productId, productName, totalQuantity});
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_adminButton22ActionPerformed

    private void adminButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton23ActionPerformed
        // Get the dates for the sales report header
        java.util.Date startDate = dateChooserStartDate.getDate();
        java.util.Date endDate = dateChooserEndDate.getDate();

        // Validate dates
        if (startDate == null || endDate == null) {
            JOptionPane.showMessageDialog(this, "Please select both start and end dates.");
            return;
        }
        if (startDate.after(endDate)) {
            JOptionPane.showMessageDialog(this, "The start date must not be after the end date.");
            return;
        }

        // Format the dates for the report header and file name
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateRange = dateFormat.format(startDate) + " to " + dateFormat.format(endDate);

        // Open a file chooser to select the folder
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = fileChooser.getSelectedFile();

            // Define the PDF file path with formatted date range
            String pdfFileName = "best products (" + dateRange + ").pdf";
            String pdfFilePath = selectedFolder.getAbsolutePath() + "/" + pdfFileName;

            // Replace with the actual userid
            String username = getUsername(realUserId);

            // Create the PDF document
            Document document = new Document();
            try {
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath));
                document.open();

                // Add clinic title
                Paragraph clinicTitle = new Paragraph("Sahagun's Veterinary Clinic", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16));
                clinicTitle.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicTitle);

                Paragraph clinicAddress = new Paragraph("6418 Zapote Street Area D., Camarin Rd, Caloocan", FontFactory.getFont(FontFactory.HELVETICA, 12));
                clinicAddress.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicAddress);

                Paragraph clinicContact = new Paragraph("Contact: (0923) 235 8209", FontFactory.getFont(FontFactory.HELVETICA, 12));
                clinicContact.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicContact);
                document.add(Chunk.NEWLINE); // Add a blank line after the contact information

                // Add sales report date range to the document header
                Paragraph reportHeader = new Paragraph("Top 3 Best Selling Products from " + dateFormat.format(startDate) + " to " + dateFormat.format(endDate), FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14));
                reportHeader.setAlignment(Element.ALIGN_CENTER);
                document.add(reportHeader);
                document.add(Chunk.NEWLINE); // Add a blank line after the header

                // Prepare the data to be written to the PDF from bestProductsTable
                DefaultTableModel model = (DefaultTableModel) bestProductsTable.getModel();
                int columnCount = model.getColumnCount();
                int rowCount = model.getRowCount();

                // Add the table header
                PdfPTable table = new PdfPTable(columnCount);
                for (int i = 0; i < columnCount; i++) {
                    PdfPCell headerCell = new PdfPCell(new Phrase(model.getColumnName(i)));
                    table.addCell(headerCell);
                }

                // Add the table rows
                for (int i = 0; i < rowCount; i++) {
                    for (int j = 0; j < columnCount; j++) {
                        PdfPCell cell = new PdfPCell(new Phrase(model.getValueAt(i, j).toString()));
                        table.addCell(cell);
                    }
                }

                // Add the table to the document
                document.add(table);

                // Add footer with generation date and username
                String generationDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
                PdfContentByte cb = writer.getDirectContent();
                cb.beginText();
                cb.setFontAndSize(BaseFont.createFont(), 10);
                cb.showTextAligned(Element.ALIGN_LEFT, "Generated on: " + generationDate, 30, 30, 0);
                cb.showTextAligned(Element.ALIGN_RIGHT, "Generated by: " + username, document.right() - 30, 30, 0);
                cb.endText();

                // Close the document
                document.close();

                JOptionPane.showMessageDialog(this, "PDF saved successfully as '" + pdfFileName + "'.");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "File not found: " + e.getMessage());
            } catch (IOException | DocumentException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_adminButton23ActionPerformed

    private void expiringBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expiringBtnActionPerformed
        sp.setViewportView(null);

        sp.setViewportView(expiringProducts);
        loadexpiringProducts();

        sp.revalidate();
        sp.repaint();
    }//GEN-LAST:event_expiringBtnActionPerformed

    private void bestsellingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestsellingBtnActionPerformed
        sp.setViewportView(null);

        sp.setViewportView(bestSellingProduct);

        sp.revalidate();
        sp.repaint();
    }//GEN-LAST:event_bestsellingBtnActionPerformed
    private void criticalProduct() {
        // Database connection details
        String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Establish a connection to the database
            conn = DriverManager.getConnection(url, dbUsername, dbPassword);

            // SQL query to fetch all data from the product_information table
            String sql = "SELECT barcode, name, stocks, critical_level FROM product_information WHERE critical_level > stocks ORDER BY expiration_date IS NULL, expiration_date ASC";

            // Prepare the statement
            pstmt = conn.prepareStatement(sql);

            // Execute the query
            rs = pstmt.executeQuery();

            // Get the table model for criticalTable and set the column names
            DefaultTableModel criticalTableModel = (DefaultTableModel) criticalTable.getModel();
            criticalTableModel.setColumnIdentifiers(new String[]{"Barcode", "Name", "Stocks", "Critical Level"});

            // Clear the existing rows in the criticalTable
            criticalTableModel.setRowCount(0);

            // Process the result set and populate the criticalTable
            while (rs.next()) {
                Object[] rowData = {
                    rs.getString("barcode"),
                    rs.getString("name"),
                    rs.getInt("stocks"),
                    rs.getInt("critical_level")
                };
                criticalTableModel.addRow(rowData);
            }

            // Show popup if any products are on critical level
            if (criticalTableModel.getRowCount() > 0) {
                JOptionPane.showMessageDialog(this, "Some products are on critical level: restock soon.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void criticalStocksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criticalStocksBtnActionPerformed
        sp.setViewportView(null);

        sp.setViewportView(criticalReports);
        criticalProduct();

        sp.revalidate();
        sp.repaint();
    }//GEN-LAST:event_criticalStocksBtnActionPerformed
    private void loadexpiringProducts() {
        // Database connection details
        String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Establish a connection to the database
            conn = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Calculate 7 days before the current date
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_YEAR, -7);
            Date sevenDaysAgo = (Date) calendar.getTime();

            // Format the date as required by MySQL (YYYY-MM-DD)
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(sevenDaysAgo);

            // SQL query to fetch products expiring 7 days before the current date
            String sql = "SELECT barcode, name, stocks, expiration_date FROM product_information WHERE expiration_date <= ? ORDER BY expiration_date ASC";

            // Prepare the statement
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, formattedDate);

            // Execute the query
            rs = pstmt.executeQuery();

            // Get the table model for expirationTable and set the column names
            DefaultTableModel expirationTableModel = (DefaultTableModel) expirationTable.getModel();
            expirationTableModel.setColumnIdentifiers(new String[]{"Barcode", "Name", "Stocks", "Expiration Date"});

            // Clear the existing rows in the expirationTable
            expirationTableModel.setRowCount(0);

            // Process the result set and populate the expirationTable
            while (rs.next()) {
                Object[] rowData = {
                    rs.getString("barcode"),
                    rs.getString("name"),
                    rs.getInt("stocks"),
                    rs.getDate("expiration_date")
                };
                expirationTableModel.addRow(rowData);
            }

            // Show message if no products are expiring within the specified period
            if (expirationTableModel.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No products are expiring within the next 7 days.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    private void adminButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton24ActionPerformed
        sp.setViewportView(null);

        sp.setViewportView(productLlist);
        loadData();

        sp.revalidate();
        sp.repaint();
    }//GEN-LAST:event_adminButton24ActionPerformed
    private void loadData() {
        // Database connection details
        String url = "jdbc:mysql://" + MYSQL_SERVER_HOSTNAME + ":" + MYSQL_SERVER_PORT + "/" + DATABASE_NAME;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Establish a connection to the database
            conn = DriverManager.getConnection(url, dbUsername, dbPassword);

            // SQL query to fetch barcode, name, price, stocks, and expiration date
            String sql = "SELECT barcode, name, price, stocks, expiration_date FROM product_information";

            // Prepare the statement
            pstmt = conn.prepareStatement(sql);

            // Execute the query
            rs = pstmt.executeQuery();

            // Get the table model for productTable and set the column names
            DefaultTableModel productTableModel = (DefaultTableModel) productTable.getModel();
            productTableModel.setColumnIdentifiers(new String[]{
                "Barcode", "Name", "Price", "Stocks", "Expiration Date"
            });

            // Clear the existing rows in the productTable
            productTableModel.setRowCount(0);

            // Process the result set and populate the productTable
            while (rs.next()) {
                Object[] rowData = {
                    rs.getString("barcode"),
                    rs.getString("name"),
                    rs.getDouble("price"),
                    rs.getInt("stocks"),
                    rs.getDate("expiration_date")
                };
                productTableModel.addRow(rowData);
            }

            // Optionally, you can set column widths or other table properties here
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading product data: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        backBtn();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        inventoryBackBtn();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void adminButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton17ActionPerformed
        // Open a file chooser to select the folder
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = fileChooser.getSelectedFile();

            // Define the PDF file path
            String generationDates = new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
            String pdfFileName = "critical products as of " + generationDates + ".pdf";
            String pdfFilePath = selectedFolder.getAbsolutePath() + "/" + pdfFileName;

            // Replace with the actual userid
            String username = getUsername(realUserId);

            // Create the PDF document
            Document document = new Document();
            try {
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath));
                document.open();

                // Clinic information
                Paragraph clinicTitle = new Paragraph("Sahagun's Veterinary Clinic", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16));
                clinicTitle.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicTitle);

                Paragraph clinicAddress = new Paragraph("6418 Zapote Street Area D., Camarin Rd, Caloocan", FontFactory.getFont(FontFactory.HELVETICA, 12));
                clinicAddress.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicAddress);

                Paragraph clinicContact = new Paragraph("Contact: (0923) 235 8209", FontFactory.getFont(FontFactory.HELVETICA, 12));
                clinicContact.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicContact);

                document.add(Chunk.NEWLINE); // Add a blank line after the contact information

                // Add critical products header to the document
                Paragraph reportHeader = new Paragraph("Critical Products", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14));
                reportHeader.setAlignment(Element.ALIGN_CENTER);
                document.add(reportHeader);
                document.add(Chunk.NEWLINE); // Add a blank line after the header

                // Prepare the data to be written to the PDF from criticalTable
                DefaultTableModel model = (DefaultTableModel) criticalTable.getModel();
                int columnCount = model.getColumnCount();
                int rowCount = model.getRowCount();

                // Add the table header
                PdfPTable table = new PdfPTable(columnCount);
                for (int i = 0; i < columnCount; i++) {
                    PdfPCell headerCell = new PdfPCell(new Phrase(model.getColumnName(i)));
                    table.addCell(headerCell);
                }

                // Add the table rows
                for (int i = 0; i < rowCount; i++) {
                    for (int j = 0; j < columnCount; j++) {
                        PdfPCell cell = new PdfPCell(new Phrase(model.getValueAt(i, j).toString()));
                        table.addCell(cell);
                    }
                }

                // Add the table to the document
                document.add(table);

                // Add footer with generation date and username
                String generationDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
                PdfContentByte cb = writer.getDirectContent();
                cb.beginText();
                cb.setFontAndSize(BaseFont.createFont(), 10);
                cb.showTextAligned(Element.ALIGN_LEFT, "Generated on: " + generationDate, 30, 30, 0);
                cb.showTextAligned(Element.ALIGN_RIGHT, "Generated by: " + username, document.right() - 30, 30, 0);
                cb.endText();

                // Close the document
                document.close();

                JOptionPane.showMessageDialog(this, "PDF saved successfully as '" + pdfFileName + "'.");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "File not found: " + e.getMessage());
            } catch (IOException | DocumentException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_adminButton17ActionPerformed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        inventoryBackBtn();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void adminButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton19ActionPerformed
        // Open a file chooser to select the folder
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = fileChooser.getSelectedFile();

            // Define the PDF file path
            String generationDates = new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
            String pdfFileName = "expiring products as of " + generationDates + ".pdf";
            String pdfFilePath = selectedFolder.getAbsolutePath() + "/" + pdfFileName;

            // Replace with the actual userid
            String username = getUsername(realUserId);

            // Create the PDF document
            Document document = new Document();
            try {
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath));
                document.open();

                // Clinic information
                Paragraph clinicTitle = new Paragraph("Sahagun's Veterinary Clinic", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16));
                clinicTitle.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicTitle);

                Paragraph clinicAddress = new Paragraph("6418 Zapote Street Area D., Camarin Rd, Caloocan", FontFactory.getFont(FontFactory.HELVETICA, 12));
                clinicAddress.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicAddress);

                Paragraph clinicContact = new Paragraph("Contact: (0923) 235 8209", FontFactory.getFont(FontFactory.HELVETICA, 12));
                clinicContact.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicContact);

                document.add(Chunk.NEWLINE); // Add a blank line after the contact information

                // Add expiring products header to the document
                Paragraph reportHeader = new Paragraph("Expiring Products", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14));
                reportHeader.setAlignment(Element.ALIGN_CENTER);
                document.add(reportHeader);
                document.add(Chunk.NEWLINE); // Add a blank line after the header

                // Prepare the data to be written to the PDF from expirationTable
                DefaultTableModel model = (DefaultTableModel) expirationTable.getModel();
                int columnCount = model.getColumnCount();
                int rowCount = model.getRowCount();

                // Add the table header
                PdfPTable table = new PdfPTable(columnCount);
                for (int i = 0; i < columnCount; i++) {
                    PdfPCell headerCell = new PdfPCell(new Phrase(model.getColumnName(i)));
                    table.addCell(headerCell);
                }

                // Add the table rows
                for (int i = 0; i < rowCount; i++) {
                    for (int j = 0; j < columnCount; j++) {
                        PdfPCell cell = new PdfPCell(new Phrase(model.getValueAt(i, j).toString()));
                        table.addCell(cell);
                    }
                }

                // Add the table to the document
                document.add(table);

                // Add footer with generation date and username
                String generationDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
                PdfContentByte cb = writer.getDirectContent();
                cb.beginText();
                cb.setFontAndSize(BaseFont.createFont(), 10);
                cb.showTextAligned(Element.ALIGN_LEFT, "Generated on: " + generationDate, 30, 30, 0);
                cb.showTextAligned(Element.ALIGN_RIGHT, "Generated by: " + username, document.right() - 30, 30, 0);
                cb.endText();

                // Close the document
                document.close();

                JOptionPane.showMessageDialog(this, "PDF saved successfully as '" + pdfFileName + "'.");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "File not found: " + e.getMessage());
            } catch (IOException | DocumentException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_adminButton19ActionPerformed

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        inventoryBackBtn();
    }//GEN-LAST:event_jLabel32MouseClicked

    private void adminButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton25ActionPerformed
        // Open a file chooser to select the folder
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = fileChooser.getSelectedFile();

            // Define the PDF file path
            String generationDates = new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
            String pdfFileName = "product_list as of " + generationDates + ".pdf";
            String pdfFilePath = selectedFolder.getAbsolutePath() + "/" + pdfFileName;

            // Replace with the actual userid
            String username = getUsername(realUserId);

            // Create the PDF document
            Document document = new Document();
            try {
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath));
                document.open();

                // Clinic information
                Paragraph clinicTitle = new Paragraph("Sahagun's Veterinary Clinic", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16));
                clinicTitle.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicTitle);

                Paragraph clinicAddress = new Paragraph("6418 Zapote Street Area D., Camarin Rd, Caloocan", FontFactory.getFont(FontFactory.HELVETICA, 12));
                clinicAddress.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicAddress);

                Paragraph clinicContact = new Paragraph("Contact: (0923) 235 8209", FontFactory.getFont(FontFactory.HELVETICA, 12));
                clinicContact.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicContact);

                document.add(Chunk.NEWLINE); // Add a blank line after the contact information

                // Add product list header to the document
                Paragraph reportHeader = new Paragraph("Product List", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14));
                reportHeader.setAlignment(Element.ALIGN_CENTER);
                document.add(reportHeader);
                document.add(Chunk.NEWLINE); // Add a blank line after the header

                // Prepare the data to be written to the PDF from productTable
                DefaultTableModel model = (DefaultTableModel) productTable.getModel();
                int columnCount = model.getColumnCount();
                int rowCount = model.getRowCount();

                // Add the table header
                PdfPTable table = new PdfPTable(columnCount);
                for (int i = 0; i < columnCount; i++) {
                    PdfPCell headerCell = new PdfPCell(new Phrase(model.getColumnName(i)));
                    table.addCell(headerCell);
                }

                // Add the table rows
                for (int i = 0; i < rowCount; i++) {
                    for (int j = 0; j < columnCount; j++) {
                        Object value = model.getValueAt(i, j);
                        String cellValue = (value != null) ? value.toString() : "";
                        PdfPCell cell = new PdfPCell(new Phrase(cellValue));
                        table.addCell(cell);
                    }
                }

                // Add the table to the document
                document.add(table);

                // Add footer with generation date and username
                String generationDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
                PdfContentByte cb = writer.getDirectContent();
                cb.beginText();
                cb.setFontAndSize(BaseFont.createFont(), 10);
                cb.showTextAligned(Element.ALIGN_LEFT, "Generated on: " + generationDate, 30, 30, 0);
                cb.showTextAligned(Element.ALIGN_RIGHT, "Generated by: " + username, document.right() - 30, 30, 0);
                cb.endText();

                // Close the document
                document.close();

                JOptionPane.showMessageDialog(this, "PDF saved successfully as '" + pdfFileName + "'.");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "File not found: " + e.getMessage());
            } catch (IOException | DocumentException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_adminButton25ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.AdminButton adminButton1;
    private swing.AdminButton adminButton10;
    private swing.AdminButton adminButton11;
    private swing.AdminButton adminButton12;
    private swing.AdminButton adminButton13;
    private swing.AdminButton adminButton14;
    private swing.AdminButton adminButton17;
    private swing.AdminButton adminButton18;
    private swing.AdminButton adminButton19;
    private swing.AdminButton adminButton22;
    private swing.AdminButton adminButton23;
    private swing.AdminButton adminButton24;
    private swing.AdminButton adminButton25;
    private swing.AdminButton adminButton3;
    private swing.AdminButton adminButton4;
    private swing.AdminButton adminButton5;
    private swing.AdminButton adminButton7;
    private swing.AdminButton adminButton8;
    private swing.AdminButton adminButton9;
    private javax.swing.JPanel auditLogs;
    private javax.swing.JPanel bestPanel;
    private javax.swing.JPanel bestPanel2;
    private javax.swing.JTable bestProductsTable;
    private javax.swing.JTable bestProductsTable3;
    private javax.swing.JPanel bestSellingProduct;
    private swing.AdminButton bestsellingBtn;
    private javax.swing.JPanel criticalPanel;
    private javax.swing.JPanel criticalPanel1;
    private javax.swing.JPanel criticalPanel2;
    private javax.swing.JPanel criticalProduct;
    private javax.swing.JPanel criticalReports;
    private swing.AdminButton criticalStocksBtn;
    private javax.swing.JTable criticalTable;
    private com.toedter.calendar.JDateChooser dateChooser1;
    private com.toedter.calendar.JDateChooser dateChooser2;
    private com.toedter.calendar.JDateChooser dateChooser3;
    private com.toedter.calendar.JDateChooser dateChooser4;
    private com.toedter.calendar.JDateChooser dateChooserEndDate;
    private com.toedter.calendar.JDateChooser dateChooserStartDate;
    private javax.swing.JTable expirationTable;
    private swing.AdminButton expiringBtn;
    private javax.swing.JPanel expiringProducts;
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JPanel inventoryPanel;
    private javax.swing.JPanel inventoryReports;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel patientPanel;
    private javax.swing.JPanel patientReport;
    private javax.swing.JTable patientReportsTable;
    private javax.swing.JPanel productLlist;
    private javax.swing.JTable productTable;
    private javax.swing.JPanel salesPanel;
    private javax.swing.JPanel salesReport;
    private javax.swing.JScrollPane sp;
    private com.toedter.calendar.JDateChooser toDate;
    private javax.swing.JTable transactionsTable;
    private javax.swing.JTable transactionsTable1;
    private javax.swing.JPanel tryPanel;
    private javax.swing.JTextField txtTotalSum;
    // End of variables declaration//GEN-END:variables
}
