/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package loa;

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
public class AdminTest {
    
    public AdminTest() {
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
     * Test of logoutUserAuditLog method, of class Admin.
     */
    @Test
    public void testLogoutUserAuditLog() {
        System.out.println("logoutUserAuditLog");
        int userId = 1;
        Admin instance = new Admin(userId);
        instance.logoutUserAuditLog(userId);
    }

    @Test
    public void testGetUsernameByUserId() {
        System.out.println("getUsernameByUserId");
        int userId = 3;
        Admin instance = new Admin(userId);
        String expResult = "admiN";
        String result = instance.getUsernameByUserId(userId);
        assertEquals(expResult, result);    
    }
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Admin.main(args);   
    }
    
}
