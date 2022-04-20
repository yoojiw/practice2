/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingpractice;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;


public class TestingPracticeTest {
    
    //
    @Test
    public void testCheckLength() {
        System.out.println("checkLength");
        String password = "";
        TestingPractice instance = new TestingPractice();
        boolean expResult = false;
        boolean result = instance.checkLength(password);
        assertEquals(expResult, result);

    }

    
    //
    @Test
    public void testCheckUpperCase() {
        System.out.println("checkUpperCase");
        String password = "";
        TestingPractice instance = new TestingPractice();
        boolean expResult = false;
        boolean result = instance.checkUpperCase(password);
        assertEquals(expResult, result);

    }

    
    //
    @Test
    public void testCheckSpecialGood() {
        System.out.println("checkSpecial");
        String password = "aasdf123##@@";
        TestingPractice instance = new TestingPractice();
        boolean expResult = true;
        boolean result = instance.checkSpecial(password);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheckSpecialBad() {
        System.out.println("checkSpecial");
        String password = "asdf123";
        TestingPractice instance = new TestingPractice();
        boolean expResult = false;
        boolean result = instance.checkSpecial(password);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheckSpecialBoundry() {
        System.out.println("checkSpecial");
        String password = "1234asdf#";  //only one special character
        TestingPractice instance = new TestingPractice();
        boolean expResult = true;
        boolean result = instance.checkSpecial(password);
        assertEquals(expResult, result);
    }
    
}
