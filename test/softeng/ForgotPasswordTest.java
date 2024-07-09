/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package softeng;

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
public class ForgotPasswordTest {
    
    public ForgotPasswordTest() {
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
     * Test of verifySecretQuestion method, of class ForgotPassword.
     */
    @Test
    public void testVerifySecretQuestion() {
        System.out.println("verifySecretQuestion");
        String username = "";
        String answer = "";
        String secretQuestion1 = "";
        ForgotPassword instance = new ForgotPassword();
        instance.verifySecretQuestion(username, answer, secretQuestion1);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testAddPasswordChangeAuditLog() {
        System.out.println("addPasswordChangeAuditLog");
        int userId = 1;
        ForgotPassword instance = new ForgotPassword();
        instance.addPasswordChangeAuditLog(userId);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    @Test
    public void testGetUserIdByUsername() {
        System.out.println("getUserIdByUsername");
        String username = "admiN";
        ForgotPassword instance = new ForgotPassword();
        int expResult = 3;
        int result = instance.getUserIdByUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of sha256 method, of class ForgotPassword.
     */
    @Test
    public void testSha256() {
        System.out.println("sha256");
        String input = "kevin";
        String expResult = "85f5e10431f69bc2a14046a13aabaefc660103b6de7a84f75c4b96181d03f0b5";
        String result = ForgotPassword.sha256(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class ForgotPassword.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ForgotPassword.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
