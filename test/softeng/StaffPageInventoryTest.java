/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package softeng;

import java.io.InputStream;
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
public class StaffPageInventoryTest {
    
    public StaffPageInventoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testLoadAllProductInformation() {
        System.out.println("loadAllProductInformation");
        StaffPageInventory instance = new StaffPageInventory(3);
        instance.loadAllProductInformation();
        
    }

    @Test
    public void testSearchByBar() {
        System.out.println("searchByBar");
        StaffPageInventory instance = new StaffPageInventory(3);
        instance.searchByBar();
  
    }

    @Test
    public void testGenerateCode39Barcode() {
        System.out.println("generateCode39Barcode");
        String barcodeText = "";
        StaffPageInventory instance = new StaffPageInventory(3);
        InputStream expResult = null;
        InputStream result = instance.generateCode39Barcode(barcodeText);
        assertEquals(expResult, result);
   
    }

    @Test
    public void testPdfBarcode() {
        System.out.println("pdfBarcode");
        String barcode = "";
        String name = "";
        StaffPageInventory instance = new StaffPageInventory(3);
        instance.pdfBarcode(barcode, name);
       
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StaffPageInventory.main(args);
    
    }
    
}
