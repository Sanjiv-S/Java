import java.util.Scanner;
public class calculator_method {
    Scanner sc =new Scanner(System.in);
    public void add(){
        System.out.print("Enter value for addition:");
        int a =sc.nextInt();
        System.out.print("Enter another value for addition:");
        int b =sc.nextInt();
        int c =a+b;
        System.out.println(c);
    }
    public int diff(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter value for subtraction:");
        int a =sc.nextInt();
        System.out.print("Enter another value for subtraction:");
        int b =sc.nextInt();
        int c =a-b;
        return c;
    }
    public void mul(int a,int b){
            int c = a*b;
            System.out.println("the value of mul is :"+c);
        }
    public int div(int a,int b){
        int c =a/b;
        return c;
    }        
        
    public static void main(String args[]){
        calculator_method obj =new calculator_method();
        int a =250;
        int b=5;
        obj.add();
        System.out.println("diff is: "+obj.diff());
        obj.mul(a,b);
        System.out.println("div is: "+obj.div(a,b));
    }

}
