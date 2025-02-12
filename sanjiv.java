import java.util.Scanner;
public class sanjiv {
    public static void main(String a[]){
        System.out.println("hello world");
    }
}
class Red {
    public static void main(String args[]){
    System.out.print("werkrmfkrn");
    }

}
class Blue {
    public static void main(String[] args){
        for(int a = 0;a<=10;a++){
            System.out.println(a);
        }
    }
}
class whileloop{
    public static void main(String[] args){
        int a = 0;
        while(a<=11){
            System.out.println("Sanjiv");
            a++;
        }
    }
}
class input{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("what is your name:");
        String a=s.nextLine();
        if(a =="sanjiv"){
            System.out.print("it's a good name");
        }
        else{
            System.out.print("you could have a better name than this" );
        }
    }
}
class first {
    int salary= 2000;
}
class second extends first{
    int bonus=3000;
    public static void main(String[] args){
        second s=new second();
        System.out.println("your salary is:"+s.salary);
        System.out.println("your bonus is:"+s.bonus);
    }
}