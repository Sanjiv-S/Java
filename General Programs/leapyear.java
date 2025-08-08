import java.util.Scanner;
public class leapyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year :");
        int n= sc.nextInt();
        if(n%400==0){
            if(n%4==0 && n%100!=0){
                System.out.println("Given year is a leap year");

            }
        }
        else{
            System.out.println("The given year is a not leap year.");
        }
    }
}
