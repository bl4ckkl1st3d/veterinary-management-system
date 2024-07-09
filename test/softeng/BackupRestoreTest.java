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
public class BackupRestoreTest {
    
    public BackupRestoreTest() {
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
     * Test of saveBackup method, of class BackupRestore.
     */
    @Test
    public void testSaveBackup() {
        System.out.println("saveBackup");
        BackupRestore instance = new BackupRestore();
        instance.saveBackup();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of restoreBackup method, of class BackupRestore.
     */
    @Test
    public void testRestoreBackup() {
        System.out.println("restoreBackup");
        BackupRestore instance = new BackupRestore();
        instance.restoreBackup();
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
