import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class findsmallestfactor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.print("Enter the Value: ");
        int N=sc.nextInt();
        if(N<10){
            System.out.print(N);
        }
        else{
            for(int i=9;i>=2;i--){
                if(N%i==0){
                    arr.add(i);
                    N=N/i;
                }
            }
        }
        Collections.sort(arr);
        System.out.print("The Smallest Factor: ");
        for(int digit:arr){
            System.out.print(digit);
        }
    }
}
