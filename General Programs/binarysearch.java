public class binarysearch {
    static int search(int arr[],int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,3,4,5,6,7,8,9,34,56,77,88,99,167,174,877,879};
        int target=56;
        int value='A'-0;
        System.err.println(search(arr,target));
        System.out.print(value);
    }
}
