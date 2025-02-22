import java.util.Scanner;
public class method_overriding {
    protected int area;
    protected double pi =3.14;
    public void calculate_area(){
    }
    public static void main(String args[]){
        circle obj =new circle();
        obj.calculate_area();
        System.out.println();
        square obj1 =new square();
        obj1.calculate_area();
    }
}
class circle extends method_overriding{
    private double r;
    public void calculate_area(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value:");
        r= sc.nextInt();
        double area =pi*r*r;
        System.out.print(area);
    }
}
class square extends method_overriding{
    public void calculate_area(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value:");
        int s= sc.nextInt();
        double area =s*s;
        System.out.print(area);
    }
}