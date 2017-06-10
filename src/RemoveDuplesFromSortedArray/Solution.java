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
        if (nums.length ==1) return 1;
        if (nums[0] == nums[nums.length-1]) return 1;
         
        int nonDupPostionIndex = 0;
        int currRangeLowerBound;
        int currRangeUpperBound;
        /*
        // O(log n) complexity
        while( nums[nonDupPostionIndex] != nums[nums.length-1] ){
            // next element is greater than current element
            if( nums[nonDupPostionIndex] < nums[nonDupPostionIndex+1] ){
                nonDupPostionIndex++;
            }
            // Implement a binary search strategy to find the max index of the existing element.
            else{
                currRangeLowerBound = nonDupPostionIndex+1;
                currRangeUpperBound = nums.length-1;

                while( true ){
                    if( nums[nonDupPostionIndex] >= nums[currRangeLowerBound]  
                        && nums[nonDupPostionIndex] < nums[currRangeLowerBound+1] ){
                        nums[++nonDupPostionIndex] = nums[currRangeLowerBound+1];
                        break;
                    }
                    if( nums[nonDupPostionIndex] == nums[ (currRangeLowerBound + currRangeUpperBound)/2 ]  ) {
                        currRangeLowerBound = (currRangeLowerBound + currRangeUpperBound)/2;
                    }
                    else{
                        currRangeUpperBound = (currRangeLowerBound + currRangeUpperBound)/2;
                    }
                } 

            }
        }
        */
        

        // O(n) complexity
        for(int i=1; i< nums.length; i++){
            if( nums[i] > nums[nonDupPostionIndex]){
                nums[++nonDupPostionIndex] = nums[i];
            }
        }
        
        // length is index+1;
        return nonDupPostionIndex+1;
    }
}