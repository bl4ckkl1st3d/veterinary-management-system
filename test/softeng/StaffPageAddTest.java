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
public class StaffPageAddTest {
    
    public StaffPageAddTest() {
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

    /**
     * Test of generateCode39Barcode method, of class StaffPageAdd.
     */
    @Test
    public void testGenerateCode39Barcode() {
        System.out.println("generateCode39Barcode");
        String barcodeText = "";
         StaffPageAdd instance = new StaffPageAdd(2);
        InputStream expResult = null;
        InputStream result = instance.generateCode39Barcode(barcodeText);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testConvertToPDF() {
        System.out.println("convertToPDF");
        String barcodeText = "";
         StaffPageAdd instance = new StaffPageAdd(2);
        instance.convertToPDF(barcodeText);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of addProdToDB method, of class StaffPageAdd.
     */
    @Test
    public void testAddProdToDB() {
        System.out.println("addProdToDB");
        StaffPageAdd instance = new StaffPageAdd(2);
        instance.addProdToDB();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of main method, of class StaffPageAdd.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StaffPageAdd.main(args);
        // TODO review the generated test code and remove the default call to fail.
  
    }
    
}
