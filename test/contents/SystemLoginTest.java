/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package contents;

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
public class SystemLoginTest {
    
    public SystemLoginTest() {
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
     * Test of setUp method, of class SystemLogin.
     */
    

    /**
     * Test of testSuccessfulLoginAsCashier method, of class SystemLogin.
     */
  

    /**
     * Test of testUnsuccessfulLogin method, of class SystemLogin.
     */


    /**
     * Test of addLoginAuditLog method, of class SystemLogin.
     */
  


    /**
     * Test of performLogin method, of class SystemLogin.
     */
    @Test
    public void testPerformLogin() {
        System.out.println("performLogin");
        String username = "admiN";
        String password = "kevin";
        SystemLogin instance = new SystemLogin();
        instance.performLogin(username, password);
    }

    /**
     * Test of sha256 method, of class SystemLogin.
     */
    @Test
    public void testSha256() {
        System.out.println("sha256");
        String input = "admin";
        String expResult = "8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918";
        String result = SystemLogin.sha256(input);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    /**
     * Test of main method, of class SystemLogin.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SystemLogin.main(args);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
