import java.util.Scanner;
public class oddoreven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number:");    
        // int n = sc.nextInt();
        // if((n & 1)==1){
        //     System.out.println("The given number is odd");

        // }
        // else{
        //     System.out.println("The given number is even");

        // }
        int greatest=0;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        boolean flag=false;
        if (a>=b && a>=c && a>=d) {
            if(a==b && a!=c && a!=d){
                System.out.println("a and b are equal");
            }
            else if(a==c && a!=b && a!=d){
                System.out.println("a and c are equal");

            }
            else if(a==d && a!=c && a!=b){
                System.out.println("a and d are equal");

            }
            else if(a==b && a==c){
                System.out.println("a, b and c are equal");
            }
            else if(a==b && a==d){
                System.out.println("a, b and d are equal");

            }
            else if(a==d && a==c){
                System.out.println("a,c and d are equal");

            }
            greatest=a;
        }
        else if(b>=a && b>=c && b>=d){
            if(a==b && a!=c && a!=d){
                System.out.println("a and b are equal");
            }
            else if(b==c && b!=a && b!=d){
                System.out.println("b and c are equal");

            }
            else if(b==d && b!=a && b!=c){
                System.out.println("b and d are equal");

            }
            else if(a==b && b==c){
                System.out.println("a, b and c are equal");
            }
            else if(a==b && b==d){
                System.out.println("a, b and d are equal");

            }
            else if(a==d && a==c){
                System.out.println("a,c and d are equal");

            }
            greatest=b;
        }
        else if(c>=a && c>=b && c>=d){
            if(c==b){
                System.out.println("c and b are equal");
            }
            else if(a==c){
                System.out.println("a and c are equal");

            }
            else if(c==d){
                System.out.println("c and d are equal");

            }
            greatest=c;
        }
        else if(d>=a && d>=c && d>=b){
            if(a==d){
                System.out.println("a and d are equal");
            }
            else if(d==c){
                System.out.println("d and c are equal");

            }
            else if(b==d){
                System.out.println("b and d are equal");

            }
            greatest=d;
        }
        else if(a==b && b==c && c==d && d==a){
            System.out.println("All are equal");
            flag=true;
        }
        if(flag==false){
            System.out.println("Greatest Value:"+greatest);
        }
    }
    
}
