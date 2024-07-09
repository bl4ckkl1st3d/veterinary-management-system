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
public class Admin_AddTest {
    
    public Admin_AddTest() {
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
    public void testUpdateUserAuditLog() {
        System.out.println("updateUserAuditLog");
        int userId = 3;
        String name = "LOGIN";
        Admin_Add instance = new Admin_Add(userId);
        instance.updateUserAuditLog(userId, name);
        
    }

    @Test
    public void testAddUserAuditLog() {
        System.out.println("addUserAuditLog");
        int userId = 3;
        String name = "AddUser";
        Admin_Add instance = new Admin_Add(userId);

    }
    
}
