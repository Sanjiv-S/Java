public class remove_elements {
    public static void main(String args[]){
        int nums[]={3,2,2,3};
        int val=3;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                nums[i]=-1;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]>=0){
                nums[count]=nums[j];
                count++;
            }
        } 
        System.out.print(count);
    }
}
