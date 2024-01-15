Selection Sort:- ------------------------

Problem Statement:-

class Solution {
    public int[] sortArray(int[] nums) {
        int start_index=0;
        int n =nums.length;
        int end_index=n-1;
        int smallest=nums[0];
        int smallest_index=0;
        while(start_index<end_index){
            for(int i=start_index;i<=end_index;i++){
                if(nums[i]<smallest){
                    smallest=nums[i];
                    smallest_index=i;
                }
            } 
            nums[smallest_index]=nums[start_index];
            nums[start_index]=smallest;  
            start_index++;
            smallest_index=start_index; 
            smallest=nums[start_index];
        }
return nums;
    }
}