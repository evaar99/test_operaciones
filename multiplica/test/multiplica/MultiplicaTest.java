/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package multiplica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author evaren
 */
public class MultiplicaTest {
    
    public MultiplicaTest() {
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
     * Test of multiplica method, of class Multiplica.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int num1 = 0;
        int num2 = 0;
        int expResult = 0;
        int result = Multiplica.multiplica(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of multiplica method, of class Multiplica with timeout.
     */
    @Test(timeout=1)
    public void testMultiplicaTimeout() {
        System.out.println("multiplica");
        int num1 = 35000;
        int num2 = 35000;
        int result = Multiplica.multiplica(num1, num2);
     
    }

    /**
     * Test of main method, of class Multiplica.
     */
    @Ignore
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Multiplica.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class Multiplica.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int num = 0;
        int expResult = 0;
        int result = Multiplica.factorial(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
