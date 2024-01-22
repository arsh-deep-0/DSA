4. Insertion Sort 

// start from index 1 and compare one by one with all previous indexes  , if  it is greater than any of previous elements then
// swap it with it.
// Now do it for index 2 and more....

public static int[] InsertionSort(int [] nums){
        int n = nums.length;
        int temp;
        for(int i=1;i<n;i++){
            int j=i;
            for(int k=i-1;k>=0;k--){
                if(nums[j]<nums[k]){
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] =temp;
                    j--;
                }
            }
        }
        return nums;
    }


5.  Sort Even and Odd Indices Independently (2164)

You are given a 0-indexed integer array nums. Rearrange the values of nums according to the following rules:

Sort the values at odd indices of nums in non-increasing order.
For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after. The values at odd indices 1 and 3 are sorted in non-increasing order.
Sort the values at even indices of nums in non-decreasing order.
For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after. The values at even indices 0 and 2 are sorted in non-decreasing order.
Return the array formed after rearranging the values of nums.

 

Example 1:

Input: nums = [4,1,2,3]
Output: [2,3,4,1]
Explanation: 
First, we sort the values present at odd indices (1 and 3) in non-increasing order.
So, nums changes from [4,1,2,3] to [4,3,2,1].
Next, we sort the values present at even indices (0 and 2) in non-decreasing order.
So, nums changes from [4,1,2,3] to [2,3,4,1].
Thus, the array formed after rearranging the values is [2,3,4,1].
Example 2:

Input: nums = [2,1]
Output: [2,1]
Explanation: 
Since there is exactly one odd index and one even index, no rearrangement of values takes place.
The resultant array formed is [2,1], which is the same as the initial array. 
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100

Answer:-
//Basically i used insertion sort for odd and even indexex separartely

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int temp;
        for(int i=3;i<n;i=i+2){
            int j=i;
            for(int k=i-2;k>=1;k=k-2){
                if(nums[j]>nums[k]){
                    temp = nums[j];
                    nums[j] = nums[j-2];
                    nums[j-2] =temp;
                    j=j-2;
                }
            }
        }
         
        for(int i=2;i<n;i=i+2){
            int j=i;
            for(int k=i-2;k>=0;k=k-2){
                if(nums[j]<nums[k]){
                    temp = nums[j];
                    nums[j] = nums[j-2];
                    nums[j-2] =temp;
                    j=j-2;
                }
            }
        }
        return nums;
    }
}

6.  Question link - https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTabValue=PROBLEM

//Second Order elements
Problem statement
You have been given an array ‘a’ of ‘n’ unique non-negative integers.



Find the second largest and second smallest element from the array.



Return the two elements (second largest and second smallest) as another array of size 2.



Example :
Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
Output: [4, 2]

The second largest element after 5 is 4, and the second smallest element after 1 is 2.

public class Solution {
    public static int[] getSecondOrderElements(int n, int []nums) {
        // Write your code here.
        int greatest= nums[0];
        int smallest= nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]>greatest){
                greatest= nums[i];                
            }else if(nums[i]<smallest){
                smallest=nums[i];
            }
        }
        int second_greatest=smallest;
        int second_smallest=greatest;
        for(int i=0;i<n;i++){
            if(nums[i]>second_greatest&&nums[i]<greatest){
                second_greatest=nums[i];
            }
             if(nums[i]<second_smallest&&nums[i]>smallest){
                second_smallest=nums[i];
            }
        }
       // System.out.println(greatest +""+ smallest+""+ second_greatest +""+ second_smallest);
        int arr[]={second_greatest, second_smallest};
        return arr;
    }
}


7.  Check array is sorted 

public class Solution {
    public static int isSorted(int n, int []nums) {
        // Write your code here.
  
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                return 0;
            }
        }

        return 1;
    }
}


8. Cheeck array is sorted and rotated (1752) 
class Solution {
    public boolean check(int[] nums) {
        int breakpt=0;
        int n= nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                breakpt++;
                if(breakpt==2){
                    return false;
                }               
            }
        }

        if(breakpt==1&&nums[0]<nums[n-1]){
            return false;
        }

        return true;       
    }
}

9. Best Time to buy and sell stocks 

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.


class Solution {
    public int maxProfit(int[] prices) {
        int bb=prices[0];
        int bs;
        int profit=0;
        for(int i=0; i<prices.length;i++){
            if(prices[i]<bb){
                bb=prices[i];
            }         
            bs=prices[i];
            if((bs-bb)>profit){
            profit=bs-bb;
            }
        }
        
        return profit;
    }
}

10. Remove duplicates from sorted array

class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        int index=0;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[index]){
                nums[index+1]=nums[i];
                index++;
            }
        }
        return index+1;
    }
}