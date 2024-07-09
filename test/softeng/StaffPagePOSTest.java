/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package softeng;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class StaffPagePOSTest {
    
    public StaffPagePOSTest() {
    }
    
    @Before
     public void setUp() {
        // Set the look-and-feel to Nimbus before initializing the components
        try {
            boolean nimbusSet = false;
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    nimbusSet = true;
                    break;
                }
            }
            if (!nimbusSet) {
                // If Nimbus is not available, set the default look-and-feel
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
        } catch (Exception e) {
            // If setting the look-and-feel fails, print the exception
            e.printStackTrace();
        }
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
   
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddToCart() {
        System.out.println("addToCart");
        StaffPagePOS instance = new StaffPagePOS(3);
        instance.addToCart();
    
    }

    @Test
    public void testRemoveToCart() {
        System.out.println("removeToCart");
        StaffPagePOS instance = new StaffPagePOS(3);
        instance.removeToCart();
       
    }

    @Test
    public void testCheckout() {
        System.out.println("checkout");
        StaffPagePOS instance = new StaffPagePOS(3);
        instance.checkout();
        
    }

  

    @Test
    public void testGetCashierName() {
        System.out.println("getCashierName");
        int userId = 0;
       StaffPagePOS instance = new StaffPagePOS(3);
        String expResult = null;
        String result = instance.getCashierName(userId);
        assertEquals(expResult, result);
   
    }

    @Test
    public void testInsertSalesReceipt() {
        System.out.println("insertSalesReceipt");
        double totalPrice = 0.0;
        String cashierName = "";
        double amount = 0.0;
        double change = 0.0;
        StaffPagePOS instance = new StaffPagePOS(3);
        int expResult = 33;
        int result = instance.insertSalesReceipt(totalPrice, cashierName, amount, change);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testInsertSalesDetails() {
        System.out.println("insertSalesDetails");
        int receiptId = 0;
        StaffPagePOS instance = new StaffPagePOS(3);
        boolean expResult = true;
        boolean result = instance.insertSalesDetails(receiptId);
        assertEquals(expResult, result);
      
    }

    @Test
    public void testUpdateReceiptTextArea() {
        System.out.println("updateReceiptTextArea");
        int receiptId = 0;
        String cashierName = "";
        double amountTendered = 0.0;
        double change = 0.0;
      StaffPagePOS instance = new StaffPagePOS(3);
        instance.updateReceiptTextArea(receiptId, cashierName, amountTendered, change);
     
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StaffPagePOS.main(args);
       
    }
    
}
