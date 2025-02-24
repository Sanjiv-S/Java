import java.util.Scanner;
abstract class area{
    static protected Double area;
    static protected Double circumference;
    static void calc_area(){
        Scanner sc =new Scanner(System.in);
        int r=sc.nextInt();
        area = 3.14*r*r;
        System.out.println(area);
    }
    static void calc_circumference(){
        Scanner sc =new Scanner(System.in);
        int r=sc.nextInt();
        circumference = 2*3.14*r;
        System.out.println(circumference);
    }
    public static void main(String args[]){
        calc_area();
        calc_circumference();
    }

}


