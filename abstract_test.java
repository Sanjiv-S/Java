abstract class outer {
    abstract void outer_method();
    void non_abs_outer_method(){
        System.out.println("inside a non-abstract method in outer class");
    }
    abstract class inner{
        abstract void inner_method();
        void non_abs_inner_method(){
        System.out.println("inside a non-abstract method in inner class");
    }
    }
}
public class abstract_test extends outer {
    public void outer_method(){
        System.out.println("inside abstract method in outer class");
    }
    class Innerclass extends inner {
        public void inner_method(){
            System.out.println("inside abstract method in outer class");
    }
}
    public static void main(String args[]){
        abstract_test obj =new abstract_test();
        abstract_test.Innerclass obj1 =obj.new Innerclass();
        obj.outer_method();
        obj1.inner_method();
        obj.non_abs_outer_method();
        obj1.non_abs_inner_method();
    }
}
