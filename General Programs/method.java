import java.util.Scanner;
public class method{
    public static int add(int a,int b){
        int c = a+b;
        return c;
    }
    public static void main(String[] args){
        int result = add(234,600);
        System.out.print(result);
    }
}
class secmethod{
    public static float mul(float a,float b){
        float c = a*b;
        return c;
    }
    public static void main(String[] args){
        float result= mul(3,53);
        System.out.print(result);
    }
}
class dec{
     public void ssd(){
        Scanner s= new Scanner(System.in);
        System.out.print("WHO ARE YOU:");
        int  a= s.nextInt();
        if(a==1){
            System.out.print("I AM VENGENCE");
        }
        else if(a==2){
            System.out.print("I AM FAST");
        }
        else if(a==3){
            System.out.print(" I AM IRON MAN");
        }
        else if(a==4){
            System.out.print("GET READY TO FEEL THE THUNDER");
        }
        else{
            System.out.print("CHOOSE SOMEONE WORTHY");
        }
    }
    public static void main (String[] args){
        dec WORTHY= new dec();
        WORTHY.ssd();
    }

}