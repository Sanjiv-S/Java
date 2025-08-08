public class method_hidding {
    static void  disp(){
        System.out.println(" in the suoer class");
    }
    public static void main(String args[]){
        method_hidding obj = new sub();
        method_hidding.disp();
    }
}
class sub extends method_hidding{
    static void disp(){
        System.out.println("in the subbclass");
}
}
