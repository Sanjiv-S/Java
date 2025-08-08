public class maxsubarray {
    static void subarray(int nums[]){
        int final_max=0;
        int max;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                max=0;
                for(int k=i;k<=j;k++){
                    max=nums[k]+max;
                    if(max>final_max){
                       final_max=max;
                    }
                }
                
            }
        }
        System.out.println(final_max);   
        
    }
    public static void main(String args[]){
        int nums[]={-1};
        subarray(nums);
    }
}


// class Solution {
//     static int max(int nums[]) {
//         int final_max = nums[0];
//         int current_max = nums[0];
//         for (int i = 1; i < nums.length; i++) {
//             current_max = Math.max(nums[i], current_max + nums[i]);
//             final_max = Math.max(final_max, current_max);
//         }
//         return final_max;
//     }
//     public int maxSubArray(int[] nums) {
//         return max(nums);
//     }
// }


class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= n - 1; i++) {
            int Sum = 0;
            for(int j = i; j <= n - 1; j++) {
            Sum+=nums[j];
            if (Sum>maxSum) {
                maxSum=Sum;
            }
            }
        }

        return maxSum;
    }
}