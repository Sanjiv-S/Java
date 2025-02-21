import java.util.Scanner;
public class addition {
    Scanner sc =new Scanner(System.in);
    public int a, b, c;
    private int p,q,r;
    addition(){
        System.out.print("Enter the value:");
        int a =sc.nextInt();
        System.out.print("Enter another value:");
        int b =sc.nextInt();
        int c =a+b;
        System.out.println("Sum is ="+c);
    }
    private void get(){
        Scanner sc =new Scanner(System.in);
        p =sc.nextInt();
        q =sc.nextInt();
    }
    public void display(){
        get();
        r=p+q;
        System.out.print("private sum:"+r);
    }
    public static void main(String args[]){
        addition obj =new addition();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value:");
        obj.a =sc.nextInt();
        System.out.print("Enter another value:");
        obj.b =sc.nextInt();
        obj.c=obj.a+obj.b;
        System.out.print(obj.c);
        System.out.println();
       
     }
   
}


class second{
    public static void main(String args[]){
        addition obj =new addition();
        obj.display();
    }
}
