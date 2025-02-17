public class zero_at_last {
    public void zero_at_lasts() {
        int arr[] = {1, 0, 4, 5, 6, 7, 9, 0, 5, 0, 3};
        int count = 0; 
       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
    
    public static void main(String[] args) {
        zero_at_last obj =new zero_at_last();
        obj.zero_at_lasts(); 
    } 
}
