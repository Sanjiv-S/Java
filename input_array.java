import java.util.Scanner;

public class input_array {
    Scanner obj =new Scanner(System.in);
    public void int_input(){
        System.out.print("No of value in array:");
        int n =obj.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array values:");
        for(int i=0;i<n;i++){
            arr[i] = obj.nextInt();
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
    public void float_input(){
        System.out.print("Enter the number of values:");
        int m =obj.nextInt();
        float arr1[] =new float[m];
        System.out.println("Enter the Array values:");
        for(int j=0;j<m;j++){
            arr1[j] =obj.nextFloat();
        }
        for(float l:arr1){
            System.out.print(l+" ");
        }
    }
    public void char_input(){
        System.out.print("Enter the number of values:");
        int r=obj.nextInt();
        char char_arr[] = new char[r];
        System.out.println("Enter the Array values:");
        for(int e=0;e<r;e++){
            char_arr[e] =obj.next().charAt(0);
        }
        for(char e:char_arr){
            System.out.print(e+" ");
        }
    }
    public static void main(String args[]){
        input_array object =new input_array();
        object.int_input();
        System.out.println("");
        object.float_input();
        System.out.println("");
        object.char_input();
    }

}
