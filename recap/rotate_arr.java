public class rotate_arr {
    static void rotate_1d_array(int arr[],int k){
        int temp[]=new int[arr.length];
        int value=0;
        for(int i=k;i<arr.length;i++){
            temp[value]=arr[i];
            value++;
        }
        for(int j=0;j<k;j++){
            temp[value]=arr[j];
            value++;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=2;
        rotate_1d_array(arr,k);
    }
}
