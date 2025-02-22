import java.util.Scanner;
public class new_inheritance {
    Scanner sc =new Scanner(System.in);
    private int x;
    private int y;
    private int z;
    public void sum(){
        System.out.print("Enter value:");
        x =sc.nextInt();
        System.out.print("Enter next value:");
        y = sc.nextInt();
        z=x+y;
        System.out.println(z);
    }
    public static void main(String args[]){
        third obj =new third();
        obj.sum();
        obj.sum1();
        obj.sum2();

        
     }
}
class second extends new_inheritance{
    protected int a;
    protected int b;
    protected int c;
    public void sum1(){
        System.out.print("Enter value:");
        a=sc.nextInt();
        System.out.print("Enter next value:");
        b=sc.nextInt();
        c=a+b;
        System.out.println(c);

    }
}
class third extends second{
    int c;
    int d;
    int e;
    public void sum2(){
        System.out.print("Enter value:");
        c=sc.nextInt();
        System.out.print("Enter next value:");
        d=sc.nextInt();
        e=c+d;
        System.out.println(e);

    }
    
}
