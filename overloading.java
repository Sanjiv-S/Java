import java.util.Scanner;
public class overloading {
    static Scanner sc =new Scanner(System.in);
    static void calculate(int a,int b){
        System.out.print(a+b);
    }
    static void calculate(double c,int b){
        System.out.print(c-b);
    }
    static void calculate(double c,double d){
        System.out.print(c*d);
    }
    static void calculate(int a,double c){
        System.out.print(a/c);
    }
    public static void main(String args[]){
        System.out.print("Enter the value:");
        int a= sc.nextInt();
        System.out.print("Enter another the value:");
        int b = sc.nextInt();
        System.out.print("Enter the next value:");
        double c =sc.nextDouble();
        System.out.print("Enter the next value:");
        double d =sc.nextDouble();
        calculate(a,b);
        System.out.println();
        calculate(c,b);
        System.out.println();
        calculate(c,d);
        System.out.println();
        calculate(a,c);
    }
}
