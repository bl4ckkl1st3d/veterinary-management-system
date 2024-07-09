/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package softeng;

import java.sql.Connection;
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
public class VetPageSMSTest {
    
    public VetPageSMSTest() {
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
    public void testRetrievePatients() {
        System.out.println("retrievePatients");
        VetPageSMS instance = new VetPageSMS (2);
        instance.retrievePatients();
      
    }
    @Test
    public void testCheckArduinoReady() {
        System.out.println("checkArduinoReady");
        VetPageSMS instance = new VetPageSMS (2);
        boolean expResult = false;
        boolean result = instance.checkArduinoReady();
        assertEquals(expResult, result);
    }
    @Test
    public void testSendSms() {
        System.out.println("sendSms");
        String patientName = "";
        String contactNumber = "";
        String vaccineName = "";
        String date = "";
        VetPageSMS instance = new VetPageSMS (2);
        instance.sendSms(patientName, contactNumber, vaccineName, date);
       
    }
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VetPageSMS.main(args);
    
    }
    
}
