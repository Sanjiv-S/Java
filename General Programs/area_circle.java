import java.util.Scanner;

abstract class abstract_class {
    protected double area;
    abstract void calc_area();
}
class area_circle extends abstract_class{
    private double r;
    public void Area(){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter a value:");
        r=in.nextDouble();
    }
    protected void calc_area(){
        area =3.14*r*r;
    System.out.println("Area="+area);
    }
    public static void main(String args[]){
        area_circle obj = new area_circle();
        obj.Area();
        obj.calc_area();
    }
}

