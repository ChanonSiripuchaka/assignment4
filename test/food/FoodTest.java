/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author choud
 */
public class FoodTest {
    
    public FoodTest() {
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
     * Test of foodN method, of class Food.
     */
    @Test
    public void testFoodN() {
        System.out.println("foodN");
        Food instance = new Food();
        instance.foodN();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of foodD method, of class Food.
     */
    @Test
    public void testFoodD() {
        System.out.println("foodD");
        Food instance = new Food();
        instance.foodD();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of foodP method, of class Food.
     */
    @Test
    public void testFoodP() {
        System.out.println("foodP");
        Food instance = new Food();
        instance.foodP();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of foodC method, of class Food.
     */
    @Test
    public void testFoodC() {
        System.out.println("foodC");
        Food instance = new Food();
        instance.foodC();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFood method, of class Food.
     */
    @Test
    public void testAddFood() throws Exception {
        System.out.println("addFood");
        String foodID = "";
        String foodDescription = "";
        double foodPrice = 0.0;
        int foodCalorie = 0;
        String foodType = "";
        String foodName = "";
        Food.addFood(foodID, foodDescription, foodPrice, foodCalorie, foodType, foodName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateFood method, of class Food.
     */
    @Test
    public void testUpdateFood() throws Exception {
        System.out.println("updateFood");
        boolean expResult = false;
        boolean result = Food.updateFood();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Food.
     */
    @Test
    public void testMain_0args() throws Exception {
        System.out.println("main");
        Food instance = new Food();
        instance.main();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Food.
     */
    @Test
    public void testMain_StringArr() {
        System.out.println("main");
        String[] args = null;
        Food.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
