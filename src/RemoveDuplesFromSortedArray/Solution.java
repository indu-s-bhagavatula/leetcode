/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoveDuplesFromSortedArray;

/**
 *
 * @author indu
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0 ) return 0;
        if (nums.length ==1) return nums.length;
        if(nums.length==2){
            if(nums[0] == nums[1]){
                return 1;
            }
            return 2;
        }
         
        int nonDupPostionIndex = 0;
        
        for(int i=1; i< nums.length; i++){
            if( nums[i] > nums[nonDupPostionIndex]){
                nums[++nonDupPostionIndex] = nums[i];
            }
        }
        // length is index+1;
        return nonDupPostionIndex+1;
    }
}