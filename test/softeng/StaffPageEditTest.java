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
public class StaffPageEditTest {
    
    public StaffPageEditTest() {
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
     * Test of main method, of class StaffPageEdit.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StaffPageEdit.main(args);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testEditProdToDB() {
        System.out.println("editProdToDB");
        StaffPageEdit instance = new StaffPageEdit(3);
        instance.editProdToDB();
  
    }

    @Test
    public void testSearchProduct() {
        System.out.println("searchProduct");
        StaffPageEdit instance = new StaffPageEdit(3);
        instance.searchProduct();

    }

    @Test
    public void testSearchSupplierDetails() {
        System.out.println("searchSupplierDetails");
        String supplierName = "";
        StaffPageEdit instance = new StaffPageEdit(3);
        instance.searchSupplierDetails(supplierName);

    }

    @Test
    public void testSearchByBarcode() {
        System.out.println("searchByBarcode");
        StaffPageEdit instance = new StaffPageEdit(3);
        boolean expResult = false;
        boolean result = instance.searchByBarcode();
        assertEquals(expResult, result);

    }
    
}
