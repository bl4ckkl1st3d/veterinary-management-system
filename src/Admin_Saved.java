import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.toedter.calendar.JDateChooser;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import jnafilechooser.api.JnaFileChooser;

public class Admin_Saved extends JFrame {

    private JTable transactionsTable;
    private JDateChooser dateChooser1, dateChooser2;
    private JTextField txtTotalSum;

    public Admin_Saved() {
        initComponents();
    }

    // This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    private void initComponents() {
        transactionsTable = new JTable(new DefaultTableModel(new Object[]{"Column1", "Column2"}, 0));
        dateChooser1 = new JDateChooser();
        dateChooser2 = new JDateChooser();
        txtTotalSum = new JTextField();

        JButton saveButton = new JButton("Save PDF");
        saveButton.addActionListener(evt -> savePDF());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Window");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(saveButton)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(saveButton)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        pack();
    }

    public void savePDF() {
        // Open a file chooser to select the folder
        JnaFileChooser fileChooser = new JnaFileChooser();
        fileChooser.setMode(JnaFileChooser.Mode.Directories);
        fileChooser.setTitle("Select Folder to Save PDF");

        if (fileChooser.showSaveDialog(this)) { // Pass 'this' as the parent component
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

            // Create the PDF document
            Document document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath));
                document.open();

                Paragraph clinicTitle = new Paragraph("Sahagun's Veterinary Clinic", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16));
                clinicTitle.setAlignment(Element.ALIGN_CENTER);
                document.add(clinicTitle);
                document.add(Chunk.NEWLINE);

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

                // Add the total amount
                String totalAmount = txtTotalSum.getText();
                document.add(new Paragraph("Total Amount: ₱" + totalAmount));

                // Close the document
                document.close();

                JOptionPane.showMessageDialog(this, "PDF saved successfully as '" + pdfFileName + "'.");
            } catch (FileNotFoundException | DocumentException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Admin_Saved().setVisible(true);
        });
    }
}
