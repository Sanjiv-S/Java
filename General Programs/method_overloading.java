import java.util.Scanner;
public class method_overloading {
    static Scanner sc =new Scanner(System.in);
    static void area(int a){
        int area =a*a;
        System.out.print("Area of Square:"+area);
    }
    static void area(int a,int b ){
        int area =a*b;
        System.out.print("Area of Rectangle:"+area);
    }
    static void area(double pi,int a){
        double area =pi*(a*a);
        System.out.print("Area of Circle:"+area);
    }
    public static void main(String args[]){
        System.out.print("Enter the value:");
        int a= sc.nextInt();
        System.out.print("Enter another the value:");
        int b = sc.nextInt();
        double pi =3.14;
        area(a);
        System.out.println();
        area(a,b);
        System.out.println();
        area(pi,a);

    }
}
