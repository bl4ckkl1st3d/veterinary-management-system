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
public class VetPageEditTest {
    
    public VetPageEditTest() {
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

    @Test
    public void testSearchPatient() {
        System.out.println("searchPatient");
        VetPageEdit instance = new VetPageEdit(1);
        instance.searchPatient();

    }

    @Test
    public void testUpdateMedical() {
        System.out.println("updateMedical");
        VetPageEdit instance = new VetPageEdit(1);
        instance.updateMedical();

    }

    @Test
    public void testUpdateMedicalHistoryTable() {
        System.out.println("updateMedicalHistoryTable");
        VetPageEdit instance = new VetPageEdit(1);
        instance.updateMedicalHistoryTable();

    }

    @Test
    public void testUpdateVaccineHistoryTable() {
        System.out.println("updateVaccineHistoryTable");
        VetPageEdit instance = new VetPageEdit(1);
        instance.updateVaccineHistoryTable();

    }

   

    @Test
    public void testUpdateOwner() {
        System.out.println("updateOwner");
        VetPageEdit instance = new VetPageEdit(1);
        instance.updateOwner();

    }

   

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VetPageEdit.main(args);

    }
    
}
