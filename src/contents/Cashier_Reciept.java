/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contents;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Kevin
 */
public class Cashier_Reciept extends javax.swing.JFrame {
    
    public Cashier_Reciept(int receiptId, String cashierName, double amountTendered, double change, double price) {
        initComponents();
        
        this.recieptId = receiptId;
        this.cashierName = cashierName;
        this.amountTendered = amountTendered;
        this.change = change;
        this.price = price;
        formatTextField();
        format_JTable();
        
        setWidth();
        fill_reciept();
        print();
        
    }
    
    private int recieptId;
    private String cashierName;
    private double amountTendered;
    private double change;
    private double price;
    
    private void format_JTable() {
        JTableHeader header = table_content.getTableHeader();
        header.setVisible(false);
        DefaultTableCellRenderer right = new DefaultTableCellRenderer();
        right.setHorizontalAlignment(JLabel.RIGHT);
        table_content.getColumnModel().getColumn(1).setCellRenderer(right);
        table_content.setShowGrid(false);
        table_pane.getColumnHeader().setVisible(false);
        table_pane.getViewport().setBackground(Color.WHITE);
    }
    
    private void formatTextField() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = new Date();

        // Append cashier name to jTextArea2
        jTextArea2.append("\n");
        jTextArea2.append("Cashier: ");
        jTextArea2.append(cashierName);
        jTextArea2.append("\n");

        // Append date to jTextArea2
        jTextArea2.append("Date: ");
        jTextArea2.append(dateFormat.format(currentDate));
        
        StringBuilder receiptText = new StringBuilder();
        receiptText.append(String.format("%-40s%.2f\n", "Total Amount:", price));
        receiptText.append(String.format("%-40s%.2f\n", "Amount Tendered:", amountTendered));
        receiptText.append(String.format("%-40s%.2f\n", "Change:", change));

        // Set the formatted receipt text to jTextArea6
        jTextArea6.setText(receiptText.toString());
        
    }
    
    private void setWidth() {
        table_content.getColumnModel().getColumn(0).setPreferredWidth(100);
        table_content.getColumnModel().getColumn(1).setPreferredWidth(10);
        table_content.getColumnModel().getColumn(2).setPreferredWidth(20);
        table_content.getColumnModel().getColumn(3).setPreferredWidth(10);
    }
    
    private void print() {
        this.revalidate();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = fileChooser.showSaveDialog(null);
        
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = fileChooser.getSelectedFile();
            try {
                BufferedImage img = new BufferedImage(jPanel1.getWidth(), jPanel1.getHeight(), BufferedImage.TYPE_INT_RGB);
                // Adjust file path based on user's chosen directory and file name
            jPanel1.paint(img.getGraphics());
                File outputFile = new File(selectedFolder.getAbsolutePath() + File.separator + "testttt.png");
                ImageIO.write(img, "png", outputFile);

                // Check if file was successfully written
                if (outputFile.exists()) {
                    // Open the file for printing
                    Desktop.getDesktop().print(outputFile);
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to save the image file.");
                }
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    
    private void fill_reciept() {
        DefaultTableModel modell = (DefaultTableModel) Cashier_PointOfSale.productTable.getModel();
        DefaultTableModel model = (DefaultTableModel) table_content.getModel();
        ArrayList<String> items = new ArrayList<>();
        ArrayList<String> price = new ArrayList<>();
        ArrayList<String> qty = new ArrayList<>();
        ArrayList<String> amount = new ArrayList<>();
        for (int r = 0; r < modell.getRowCount(); r++) {
            items.add(modell.getValueAt(r, 0).toString());
            price.add(modell.getValueAt(r, 1).toString());
            qty.add(modell.getValueAt(r, 2).toString());
            amount.add(modell.getValueAt(r, 3).toString());
        }
        int item_count = items.size();
        for (int i = 0; i < item_count; i++) {
            String particulars = items.get(i);
            double unit_price = Double.parseDouble(price.get(i));
            int quantity = Integer.parseInt(qty.get(i));
            double total = Double.parseDouble(amount.get(i));
            String unit_price2 = String.format("%,.2f", unit_price);
            String quantity2 = String.format("%d", quantity);
            String total2 = String.format("%,.2f", total);
            String[] unit = {particulars, quantity2, unit_price2, total2};
            model.addRow(unit);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        table_pane = new javax.swing.JScrollPane();
        table_content = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Particulars             Qty     Price       Amount");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 380, 20));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("\t      \n             \n             Sahagun's Veterinary Clinic\n  6418 Zapote Street Area D., Camarin Rd, Caloocan\n\t          (0923) 235 8209");
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 110));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("************************************************************************");
        jScrollPane3.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 380, 20));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("************************************************************************");
        jScrollPane4.setViewportView(jTextArea4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 380, 20));

        table_pane.setBorder(null);
        table_pane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        table_pane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        table_content.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_pane.setViewportView(table_content);

        jPanel1.add(table_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 380, 260));

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("************************************************************************");
        jScrollPane6.setViewportView(jTextArea5);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 380, 20));

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jTextArea6.setRows(5);
        jScrollPane7.setViewportView(jTextArea6);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 380, 80));

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.setText("************************************************************************");
        jScrollPane8.setViewportView(jTextArea7);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 380, 20));

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jTextArea8.setRows(5);
        jTextArea8.setText("\t\t     Thank you!\n\t      This is not a valid reciept");
        jScrollPane9.setViewportView(jTextArea8);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 380, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Cashier_Reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashier_Reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashier_Reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashier_Reciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Cashier_Reciept(0, "Kenneth", 0.0, 0.0, 300).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTable table_content;
    private javax.swing.JScrollPane table_pane;
    // End of variables declaration//GEN-END:variables
}
