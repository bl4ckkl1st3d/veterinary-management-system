/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package softeng;

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
public class AdminPageAddTest {
    
    public AdminPageAddTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
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
    
    @After
    public void tearDown() {
    }

    /**
     * Test of updateUserAuditLog method, of class AdminPageAdd.
     */
    @Test
    public void testUpdateUserAuditLog() {
        System.out.println("updateUserAuditLog");
        int userId = 0;
        AdminPageAdd instance = new AdminPageAdd(userId);
        instance.updateUserAuditLog(userId);
        // TODO review the generated test code and remove the default call to fail.
       
    }
   @Test
    public void testSearch() {
        System.out.println("testSearch");
        int userId = 0;
        AdminPageAdd instance = new AdminPageAdd(userId);

        // Call the method under test
        instance.search();
    }

    /**
     * Test of addUserAuditLog method, of class AdminPageAdd.
     */
    @Test
    public void testAddUserAuditLog() {
        System.out.println("addUserAuditLog");
        int userId = 0;
        AdminPageAdd instance = new AdminPageAdd(userId);
        instance.addUserAuditLog(userId);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of main method, of class AdminPageAdd.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AdminPageAdd.main(args);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
