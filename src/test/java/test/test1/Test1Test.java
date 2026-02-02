/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test.test1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pate1823
 */
public class Test1Test {
    
   
    /**
     * Test of greet method, of class Test1.
     */
   /* @Test
    public void testGreet() {
        System.out.println("greet");
        Test1 instance = new Test1();
        String expResult = "hello";
        String result = instance.greet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }*/
      @Test
    public void testaddNumbers() {
        //System.out.println("greet");
        Test1 instance = new Test1();
       // String expResult = "";
      //  String result = instance.greet();
        assertEquals(5, instance.addNumbers(2,3));
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}




