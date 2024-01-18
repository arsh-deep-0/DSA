1. #Selection Sort

Problem Statement

class Solution {
    public int[] sortArray(int[] nums) {
        int start_index=0;
        int n =nums.length;
        int end_index=n-1;
        int smallest_value=nums[0];
        int smallest_index=0;
        while(start_index<end_index){
            for(int i=start_index;i<=end_index;i++){
                if(nums[i]<smallest_value   &&                                                                                                                                                                                                                                                              ){
                    smallest_value=nums[i];
                    smallest_index=i;
                }
            } 
            nums[smallest_index]=nums[start_index];
            nums[start_index]=smallest_value;  
            start_index++;
            smallest_index=start_index; 
            smallest_value=nums[start_index];
        }
return nums;
    }
}


2. Mising Number

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums. 

Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?

class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int reqSum =(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        return reqSum-sum;
    }
}

