/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoveDuplesFromSortedArray;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

/**
 *
 * @author indu
 */
public class SolutionTest {
    
    public SolutionTest() {
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
     * Test of removeDuplicates method, of class Solution.
     *   Test scenario - Input Array is null.
     */
    @Test
    public void testRemoveDuplicates_InputArrayIsNull() {
        System.out.println("Test scenario - Input Array is null.");
        int[] nums = null;
        int[] expectedArray = null;
        Solution instance = new Solution();
        int expResult = 0;
        int result = instance.removeDuplicates(nums);
        assertEquals(expResult, result);
        Assert.assertArrayEquals(expectedArray, nums);
    }

    /**
     * Test of removeDuplicates method, of class Solution.
     *   Test scenario - Input Array is blank.
     */
    @Test
    public void testRemoveDuplicates_InputArrayIsBlank() {
        System.out.println("Test scenario - Input Array is blank.");
        int[] nums = {};
        int[] expectedArray = {};
        Solution instance = new Solution();
        int expResult = 0;
        int result = instance.removeDuplicates(nums);
        assertEquals(expResult, result);
        Assert.assertArrayEquals(expectedArray, nums);
    }    
    
    /**
     * Test of removeDuplicates method, of class Solution.
     *   Test scenario - Input Array is one element.
     */
    @Test
    public void testRemoveDuplicates_InputArrayIsOneElement() {
        System.out.println("Test scenario - Input Array is one element.");
        int[] nums = {1};
        int[] expectedArray = {1};
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.removeDuplicates(nums);
        assertEquals(expResult, result);
        Assert.assertArrayEquals(expectedArray, nums);
    }

    /**
     * Test of removeDuplicates method, of class Solution.
     *   Test scenario - Input Array is of length two with duplicates.
     */
    @Test
    public void testRemoveDuplicates_InputArrayIsTwoElementsWithDupes() {
        System.out.println("Test scenario - Input Array is of length two with duplicates.");
        int[] nums = {1,1};
        int[] expectedArray = {1,1};
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.removeDuplicates(nums);
        assertEquals(expResult, result);
        Assert.assertArrayEquals(expectedArray, nums);
    }
    
    /**
     * Test of removeDuplicates method, of class Solution.
     *   Test scenario - Input Array is of length two with no duplicates.
     */
    @Test
    public void testRemoveDuplicates_InputArrayIsTwoElementsWithNonDupes() {
        System.out.println("Test scenario - Input Array is of length two with no duplicates.");
        int[] nums = {1,2};
        int[] expectedArray = {1,2};
        Solution instance = new Solution();
        int expResult = 2;
        int result = instance.removeDuplicates(nums);
        assertEquals(expResult, result);
        Assert.assertArrayEquals(expectedArray, nums);
    }

    /**
     * Test of removeDuplicates method, of class Solution.
     *   Test scenario - Input Array is of length > two with no duplicates.
     */
    @Test
    public void testRemoveDuplicates_InputArrayMoreThanTwoElementsWithNonDupes() {
        System.out.println("Test scenario - Input Array is of length > two with no duplicates.");
        int[] nums = {1,2,3,4,5,7,9};
        int[] expectedArray = {1,2,3,4,5,7,9};
        Solution instance = new Solution();
        int expResult = 7;
        int result = instance.removeDuplicates(nums);
        assertEquals(expResult, result);
        Assert.assertArrayEquals(expectedArray, nums);
    }

    /**
     * Test of removeDuplicates method, of class Solution.
     *   Test scenario - Input Array is of length > two with formed with only two elements.
     */
    @Test
    public void testRemoveDuplicates_InputArrayLengthMoreThanTwoWithTwoElements() {
        System.out.println("Test scenario - Input Array is of length > two with formed with only two elements.");
        Solution instance = new Solution();
        int expResult = -1, result;
        
        // First element is repeated
        int[] numsTestset1 = {1,1,1,1,1,1,2};
        int[] expectedTestSet1 = {1,2,1,1,1,1,2};
        expResult=2;
        result = instance.removeDuplicates(numsTestset1);
        assertEquals(expResult, result);
        Assert.assertArrayEquals(expectedTestSet1, numsTestset1);
        expResult=2;

        // Second element is repeated.
        int[] numsTestset2 = {1,2,2,2,2,2,2};
        int[] expectedTestSet2 = {1,2,2,2,2,2,2};
        expResult=2;
        result = instance.removeDuplicates(numsTestset2);
        assertEquals(expResult, result);
        Assert.assertArrayEquals(expectedTestSet2, numsTestset2);

        // Alternating sequence
        int[] numsTestset3 = {1,2,1,2,1,2,1,2,1,2};
        int[] expectedTestSet3 = {1,2,1,2,1,2,1,2,1,2};
        expResult=2;
        result = instance.removeDuplicates(numsTestset3);
        assertEquals(expResult, result);
        Assert.assertArrayEquals(expectedTestSet3, numsTestset3);
        
        
        // Random input 
        int[] numsTestset4 = {1,1,1,1,1,2,2,2};
        int[] expectedTestSet4 = {1,2,1,1,1,2,2,2};
        expResult=2;
        result = instance.removeDuplicates(numsTestset4);
        assertEquals(expResult, result);
        assertArrayEquals(expectedTestSet4, numsTestset4);

        // Random input 
        int[] numsTestset5 = {1,2,2,2,2,2,2,1};
        int[] expectedTestSet5 = {1,2,2,2,2,2,2,1};
        expResult=2;
        result = instance.removeDuplicates(numsTestset5);        
        assertEquals(expResult, result);
        Assert.assertArrayEquals(expectedTestSet5, numsTestset5);
        
        // Random input 
        int[] numsTestset6 = {1,2,2,1,2,2,1,2,2,1};
        int[] expectedTestSet6 = {1,2,2,1,2,2,1,2,2,1};
        expResult=2;
        result = instance.removeDuplicates(numsTestset6);        
        assertEquals(expResult, result);
        Assert.assertArrayEquals(expectedTestSet6, numsTestset6);  
    }

    /**
     * Test of removeDuplicates method, of class Solution.
     *   Test scenario - Input Array is combination of random ascending elements.
     */
    @Test
    public void testRemoveDuplicates_InputArrayElementsWith() {
        int expResult, result;
        Solution instance = new Solution();
                
        // Test Set 1
        int[] numsTestSet1 = {1,1,1,1,2,2,3,4,5,6,7,100,101,1000};
        int[] expectedTestSet1 = {1,2,3,4,5,6,7,100,101,1000,7,100,101,1000};
        expResult = 10;
        result = instance.removeDuplicates(numsTestSet1);
        assertEquals(expResult, result);
        Assert.assertArrayEquals(expectedTestSet1, numsTestSet1);

        // Test Set 2
        int[] numsTestSet2 = {1,1,1,1,2,2,3,3,3,2,3,4};
        int[] expectedTestSet2 = {1,2,3,4,2,2,3,3,3,2,3,4};
        expResult = 4;
        result = instance.removeDuplicates(numsTestSet2);
        assertEquals(expResult, result);
        Assert.assertArrayEquals(expectedTestSet2, numsTestSet2);
        
        // Test Set 3
        int[] numsTestSet3 = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,5};
        int[] expectedTestSet3 = {1,2,3,4,5,3,4,4,4,4,5,5,5,5,5,5};
        expResult = 5;
        result = instance.removeDuplicates(numsTestSet3);
        assertEquals(expResult, result);
        Assert.assertArrayEquals(expectedTestSet3, numsTestSet3);

        
        
    }    
}
