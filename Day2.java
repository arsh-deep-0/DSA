3. Bubble Sort

class HelloWorld {
    public static int[] BubbleSort(int [] nums){
        int n = nums.length;
        int end_index=n-1;
        while(end_index>0){
            for(int i=0;i<end_index;i++){
                if(nums[i]>nums[i+1]){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
            end_index--;
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] nums={7,6,13,2,5,8};
            nums=BubbleSort(nums);
            for(int i =0;i<nums.length;i++){
                System.out.print(nums[i]+" ");
            }
        }
    }


