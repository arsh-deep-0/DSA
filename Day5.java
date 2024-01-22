12. House Robber 2

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

 

Example 1:

Input: nums = [2,3,2]
Output: 3
Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
Example 2:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 3:

Input: nums = [1,2,3]
Output: 3

class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int last=0;
        int secondlast=0;
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n-1;i++){
            int temp=last;
            last=Math.max(nums[i]+secondlast,last);
            secondlast=temp;
        }
        int n1=last;
        last=0;
        secondlast=0;
        for(int i=1;i<n;i++){
            int temp=last;
            last=Math.max(nums[i]+secondlast,last);
            secondlast=temp;
        }
        int n2=last;
        return Math.max(n1, n2);
    }
}



13. 2177. Find Three Consecutive Integers That Sum to a Given Number

Given an integer num, return three consecutive integers (as a sorted array) that sum to num. If num cannot be expressed as the sum of three consecutive integers, return an empty array.

 

Example 1:

Input: num = 33
Output: [10,11,12]
Explanation: 33 can be expressed as 10 + 11 + 12 = 33.
10, 11, 12 are 3 consecutive integers, so we return [10, 11, 12].
Example 2:

Input: num = 4
Output: []
Explanation: There is no way to express 4 as the sum of 3 consecutive integers.
 

Constraints:

0 <= num <= 1015

