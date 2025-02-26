interface first{
    static void fir_method(){
        System.out.println("inside static method of first interface");
    }
    abstract void sec_method();
    default void thir_method(){
        System.out.println("default method");
    }
}
interface second extends first{
    static void fir_method(){
        System.out.println("inside static method of second interface");
    }
    abstract void sec_method();
    default void thir_method(){
        System.out.println("default method in second");
    }
    }

public class interface_practice implements second{
    public void sec_method(){
        System.out.println("inside abstract method");
    }
    public static void main(String args[]){
        interface_practice obj=new interface_practice();
        first.fir_method();
        second.fir_method();
        obj.sec_method();
        obj.thir_method();
    }
}
