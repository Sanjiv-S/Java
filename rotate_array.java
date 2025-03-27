public class rotate_array {
    static  void rotate(int[] arr) {
        int arr1[] =new int[arr.length];
        int count=0;
        arr1[count]=arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            ++count;
            arr1[count]=arr[i];
        }
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
    static void rotate_k(int arr[]){

    }
    public static void main(String args []){
        int arr[] = {9, 8, 7, 6, 4, 2, 1, 3};
        rotate(arr);
    }
}
