/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.test1;

/**
 *
 * @author pate1823
 */
public class PasswordValidator {
    
    public static boolean checkLength(String password)
    {
        boolean result=false;
        if(password.length() >= 8)
        {
            result= true;
        }
        return result;
    }
}
