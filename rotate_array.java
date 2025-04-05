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
    static void rotate_right(int arr[],int k){
        int arr1[]=new int[arr.length];
        int count=0;
        for(int i=k;i>0;i--){
            arr1[count]=arr[arr.length-i];
            count++;
        }
        for(int j=0;j<arr.length-k;j++){
            arr1[count]=arr[j];
            count++;
        }
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
    static void rotate_left(int arr[],int k){
        int arr1[]=new int [arr.length];
        int count=0;
        for(int i=k;i<arr.length;i++){
            arr1[count]=arr[i];
            count++;
        }
        for(int j=0;j<k;j++){
            arr1[count]=arr[j];
            count++;
        }
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
    public static void main(String args []){
        int arr[] = {1,2,3,4,5};
        rotate(arr);
        System.out.println();
        rotate_right(arr, 3);
        System.out.println();
        rotate_left(arr, 1);
    }
}
