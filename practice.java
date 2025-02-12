import java.util.Scanner;
public class practice {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a value:");
        double a=s.nextDouble();
        System.out.println("enter another value:");
        double b=s.nextDouble();
        
        System.out.println("choose the operation you wish to perform");
        System.out.println("1.sum,2.sub,3.div,4.mul");
        int choose=s.nextInt();
        double result;
         switch(choose){
            case 1:result=a+b;
            System.out.print("the sum is:"+result);
                break;
            case 2:result= a-b;
            System.out.print("the sub is :"+result);
                break;
            case 3:result= a/b;
            System.out.print("the mul is :"+result);
                break;
            case 4:result=a*b;
            System.out.print("the div is:"+result);
                break;
            default:
            System.out.print("enter an valied choice");

         }
    }
}
class smallest{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a value:");
        int a=s.nextInt();
        System.out.println("Enter the second value:");
        int b=s.nextInt();
        System.out .println("enter the third value:");
        int c=s.nextInt();
         int result = a<b?(a<c?a:c):(b<c?b:c);
         System.out.print("the smallest number is"+result);
    }
}
class month{
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the month number (1_12):");
    int monthno =s.nextInt();
    switch(monthno){
        case 1:System.out.print("january");
        break;
        case 2:System.out.print("february");
        break;
        default:
        System.out.print("enter a valied no");
    }
}
}
class even{
    public static void main(String[] args){
        System.out.print("even numbers between 50-70:");
        for(int h=0;h <= 30;h++){
            if(h % 2 !=0){
                System.out.println(h);
            }
        }
    }
}
class sum{
    public static void main (String[] args){
        int n=10;
        int sum=0;
        for(int j=1;j<=10;j++){
            sum+=j;
        }
        System.out.print("the sum of the first 10 natural number is:"+sum);
    }
}