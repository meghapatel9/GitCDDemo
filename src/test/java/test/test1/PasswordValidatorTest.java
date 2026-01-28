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
public class PasswordValidatorTest {
    
   
    /**
     * Test of checkLength method, of class PasswordValidator.
     */
    @Test
    public void testCheckLengthGood() {
        System.out.println("checkLengthGood");
        String password = "mylongpassword";//>8 length
        assertEquals(true, PasswordValidator.checkLength(password));
       
    }
    
     @Test
    public void testCheckLengthBad() {
        System.out.println("checkLengthBad");
        String password = "pass";//<8 length
        assertEquals(false, PasswordValidator.checkLength(password));
       
    }
    
      @Test
    public void testCheckLengthBoundary() {
        System.out.println("checkLengthboundary");
        String password = "password";//=8 length
        assertEquals(true, PasswordValidator.checkLength(password));
       
    }
    
}
