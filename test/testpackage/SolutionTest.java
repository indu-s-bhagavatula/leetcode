/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author indu
 */
public class SolutionTest {
    
    /**
     * Test of getSol method, of class Solution.
     */
    @Test
    public void testGetSol() {
        System.out.println("getSol");
        int x = 0;
        Solution instance = new Solution();
        boolean expResult = true;
        boolean result = instance.getSol(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    @Test
    public void test2tGetSol(){
        assertEquals(false, new Solution().getSol(-1));
        
    }
}