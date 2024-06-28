
package component;

import event.EventMenuSelected;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import model.Model_Menu;

/**
 *
 * @author Richard Reynald
 */
public class Vet_Menu extends javax.swing.JPanel {

    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
        listMenu1.addEventMenuSelected(event);
    }
    
    private int userId;
    
    public Vet_Menu() {
        this.userId = userId;
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        init();
    }
    private void init() {
        listMenu1.addItem(new Model_Menu("1", "Search Patient", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu(" ", " ", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("2", "Add New Patient", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu(" ", " ", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("3", "Edit Patient Info", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu(" ", " ", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("4", "Send SMS", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu(" ", " ", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("5", "Help", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu(" ", " ", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("6", "Settings", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu(" ", " ", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("7", "Log Out", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu(" ", " ", Model_Menu.MenuType.EMPTY));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        listMenu1 = new swing.ListMenu<>();
        jLabel2 = new javax.swing.JLabel();

        panelMoving.setOpaque(false);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addComponent(listMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void changeWelcome(int userId) {
        String name = getUsernameByUserId(userId);
        jLabel2.setText("Welcome, " + name);

    }

    public String getUsernameByUserId(int userId) {
        String username = null; // Default value if username is not found

        String url = "jdbc:mysql://127.0.0.1:3306/database";
        String dbUsername = "root";
        String dbPassword = "admin";

        try {
            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

            // Prepare the SQL query to retrieve username by user ID
            String query = "SELECT username FROM users WHERE userid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, userId);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if the result set has any rows
            if (resultSet.next()) {
                // Retrieve the username from the result set
                username = resultSet.getString("username");
            }

            // Close the result set, statement, and connection
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            // Handle any SQL exceptions
            e.printStackTrace();
        }

        return username;
    }
    
    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#34e89e"), 0, getHeight(), Color.decode("#0f3443"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintChildren(grphcs);
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(50, 50, getWidth(), getHeight(), 30, 30);
        g2.fillRect(getWidth() -20, 0, getWidth(), getHeight());
        super.paintComponent (grphcs);
    }
    private int x;
    private int y;
    public void initMoving(JFrame fram) {
        panelMoving.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent me) {
            x = me.getX();
            y = me.getY();
        }
    });
    panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent me) {
            fram.setLocation(me.getXOnScreen() -x, me.getYOnScreen() -y);
        }
    });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private swing.ListMenu<String> listMenu1;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration//GEN-END:variables
}
